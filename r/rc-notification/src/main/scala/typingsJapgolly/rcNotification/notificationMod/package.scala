package typingsJapgolly.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notificationMod {
  type HolderReadyCallback = js.Function2[
    /* div */ org.scalajs.dom.raw.HTMLDivElement, 
    /* noticeProps */ typingsJapgolly.rcNotification.NoticePropskeyKey, 
    scala.Unit
  ]
  type NoticeFunc = js.Function1[
    /* noticeProps */ typingsJapgolly.rcNotification.notificationMod.NoticeContent, 
    scala.Unit
  ]
}
