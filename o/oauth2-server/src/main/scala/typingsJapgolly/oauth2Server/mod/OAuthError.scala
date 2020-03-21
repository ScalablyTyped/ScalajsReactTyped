package typingsJapgolly.oauth2Server.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-server", "OAuthError")
@js.native
class OAuthError protected () extends Error {
  def this(messageOrError: String) = this()
  def this(messageOrError: js.Error) = this()
  def this(messageOrError: String, properties: js.Object) = this()
  def this(messageOrError: js.Error, properties: js.Object) = this()
  /**
    * The HTTP error code.
    */
  var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

