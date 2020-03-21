package typingsJapgolly.parchment

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.Text
import typingsJapgolly.parchment.registryMod.Scope
import typingsJapgolly.parchment.textMod.default
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTextBlot extends Instantiable1[/* node */ Node, default] {
  var blotName: String = js.native
  var scope: Scope = js.native
  def create(value: String): Text = js.native
  def value(domNode: Text): String = js.native
}

