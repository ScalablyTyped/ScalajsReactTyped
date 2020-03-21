package typingsJapgolly.winjs.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.winjs.WinJS.IXHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "xhr")
@js.native
object xhr extends js.Object {
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  def apply(options: IXHROptions): typingsJapgolly.winjs.WinJS.Promise[XMLHttpRequest] = js.native
}

