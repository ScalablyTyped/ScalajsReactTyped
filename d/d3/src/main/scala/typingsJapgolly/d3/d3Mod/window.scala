package typingsJapgolly.d3.d3Mod

import org.scalajs.dom.raw.Window
import typingsJapgolly.std.Document
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "window")
@js.native
object window extends js.Object {
  def apply(DOMNode: Document): Window = js.native
  def apply(DOMNode: Element): Window = js.native
  def apply(DOMNode: typingsJapgolly.std.Window): Window = js.native
}

