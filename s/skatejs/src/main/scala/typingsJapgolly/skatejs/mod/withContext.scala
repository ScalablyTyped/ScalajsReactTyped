package typingsJapgolly.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.skatejs.typesMod.Constructor
import typingsJapgolly.skatejs.typesMod.WithContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withContext")
@js.native
object withContext extends js.Object {
  def apply[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  def apply[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
}

