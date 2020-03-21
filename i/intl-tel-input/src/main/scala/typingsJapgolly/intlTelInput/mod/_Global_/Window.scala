package typingsJapgolly.intlTelInput.mod._Global_

import org.scalajs.dom.raw.Element
import typingsJapgolly.intlTelInput.mod.Options
import typingsJapgolly.intlTelInput.mod.Plugin
import typingsJapgolly.intlTelInput.mod.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var intlTelInputGlobals: Static = js.native
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def intlTelInput(node: Element): Plugin = js.native
  def intlTelInput(node: Element, options: Options): Plugin = js.native
}

