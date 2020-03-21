package typingsJapgolly.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.skatejs.typesMod.Constructor
import typingsJapgolly.skatejs.typesMod.WithLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withLifecycle")
@js.native
object withLifecycle extends js.Object {
  def apply[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  def apply[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
}

