package typingsJapgolly.reactNotificationSystemRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NotificationShow = js.Function1[
    /* opts */ js.UndefOr[typingsJapgolly.reactNotificationSystem.mod.Notification], 
    typingsJapgolly.redux.mod.Action[js.Any]
  ]
  type Notifications = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsProps with js.Object, 
    js.Object
  ]
  type NotificationsReducer[A /* <: typingsJapgolly.redux.mod.Action[_] */] = js.Function2[
    /* state */ typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsState, 
    /* action */ A, 
    typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsState
  ]
  type NotificationsState = js.Array[typingsJapgolly.reactNotificationSystem.mod.Notification]
}
