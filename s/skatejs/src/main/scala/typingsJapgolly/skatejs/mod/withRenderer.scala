package typingsJapgolly.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.skatejs.typesMod.Constructor
import typingsJapgolly.skatejs.typesMod.WithRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withRenderer")
@js.native
object withRenderer extends js.Object {
  def apply[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] with T = js.native
  def apply[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] with T = js.native
}

