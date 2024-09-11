
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationAccomodationManager from "./components/listers/ReservationAccomodationCards"
import ReservationAccomodationDetail from "./components/listers/ReservationAccomodationDetail"

import HousekeepingHousekeepingManager from "./components/listers/HousekeepingHousekeepingCards"
import HousekeepingHousekeepingDetail from "./components/listers/HousekeepingHousekeepingDetail"

import RoomRoomManager from "./components/listers/RoomRoomCards"
import RoomRoomDetail from "./components/listers/RoomRoomDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations/accomodations',
                name: 'ReservationAccomodationManager',
                component: ReservationAccomodationManager
            },
            {
                path: '/reservations/accomodations/:id',
                name: 'ReservationAccomodationDetail',
                component: ReservationAccomodationDetail
            },

            {
                path: '/housekeepings/housekeepings',
                name: 'HousekeepingHousekeepingManager',
                component: HousekeepingHousekeepingManager
            },
            {
                path: '/housekeepings/housekeepings/:id',
                name: 'HousekeepingHousekeepingDetail',
                component: HousekeepingHousekeepingDetail
            },

            {
                path: '/rooms/rooms',
                name: 'RoomRoomManager',
                component: RoomRoomManager
            },
            {
                path: '/rooms/rooms/:id',
                name: 'RoomRoomDetail',
                component: RoomRoomDetail
            },



    ]
})
