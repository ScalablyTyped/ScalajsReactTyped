package typingsJapgolly.polymerTs

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.polymerTs.polymer.Base
import typingsJapgolly.polymerTs.polymer.Element
import typingsJapgolly.polymerTs.polymer.dom
import typingsJapgolly.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Polymer")
@js.native
object Polymer_ extends js.Object {
  var Base: js.Any = js.native
  @JSName("dom")
  var dom_Original: dom = js.native
  def apply(prototype: Element): FunctionConstructor = js.native
  def Class(prototype: Element): js.Function = js.native
  def appendChild(node: HTMLElement): HTMLElement = js.native
  def dom(node: Base): HTMLElement = js.native
  def dom(node: typingsJapgolly.std.HTMLElement): HTMLElement = js.native
  def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = js.native
  def removeChild(node: HTMLElement): HTMLElement = js.native
  def updateStyles(): Unit = js.native
}

