package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
import typingsJapgolly.lodashDecorators.sharedMod.DebounceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  @JSName("Debounce")
  def Debounce_(): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def debounce(): LodashDecorator = js.native
  def debounce(wait: Double): LodashDecorator = js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def default(args: js.Any*): LodashDecorator = js.native
}

