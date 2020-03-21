package typingsJapgolly.got.mod

import typingsJapgolly.got.gotStrings.connect
import typingsJapgolly.got.gotStrings.lookup
import typingsJapgolly.got.gotStrings.request
import typingsJapgolly.got.gotStrings.response
import typingsJapgolly.got.gotStrings.secureConnect
import typingsJapgolly.got.gotStrings.send
import typingsJapgolly.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", "TimeoutError")
@js.native
class TimeoutErrorCls () extends TimeoutError {
  /* CompleteClass */
  override var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_TimeoutError: typingsJapgolly.got.gotStrings.TimeoutError = js.native
}

