package typingsJapgolly.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notificationMod {
  type DeleteNotificationCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* notification */ js.UndefOr[typingsJapgolly.googleCloudStorage.notificationMod.Notification | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsJapgolly.googleCloudCommon.utilMod.ResponseBody], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationMetadataResponse = js.Tuple2[
    typingsJapgolly.googleCloudCommon.utilMod.ResponseBody, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetNotificationResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.notificationMod.Notification, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
