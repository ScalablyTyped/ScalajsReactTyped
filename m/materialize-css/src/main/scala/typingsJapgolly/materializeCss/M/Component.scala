package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Component")
@js.native
abstract class Component[TOptions] protected () extends ComponentBase[TOptions] {
  /**
    * Construct component instance and set everything up
    */
  def this(elem: Element) = this()
  def this(elem: Element, options: Partial[TOptions]) = this()
  /**
    * Destroy plugin instance and teardown
    */
  def destroy(): Unit = js.native
}

