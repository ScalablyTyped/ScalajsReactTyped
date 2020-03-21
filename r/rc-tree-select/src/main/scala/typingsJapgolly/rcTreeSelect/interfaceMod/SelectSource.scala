package typingsJapgolly.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.option
  - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.selection
  - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.input
  - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.clear
*/
trait SelectSource extends js.Object

object SelectSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.clear = this.cast("clear")
  @scala.inline
  def input: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.input = this.cast("input")
  @scala.inline
  def option: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.option = this.cast("option")
  @scala.inline
  def selection: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.selection = this.cast("selection")
}

