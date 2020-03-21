package typingsJapgolly.webPush.mod

import typingsJapgolly.webPush.webPushStrings.aesgcm
import typingsJapgolly.webPush.webPushStrings.aws128gcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "supportedContentEncodings")
@js.native
object supportedContentEncodings extends js.Object {
  val AES_128_GCM: aws128gcm with ContentEncoding = js.native
  val AES_GCM: aesgcm with ContentEncoding = js.native
}

