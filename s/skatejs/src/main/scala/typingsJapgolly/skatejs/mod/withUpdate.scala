package typingsJapgolly.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.skatejs.typesMod.Constructor
import typingsJapgolly.skatejs.typesMod.WithUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "withUpdate")
@js.native
object withUpdate extends js.Object {
  def apply[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[WithUpdate[P, S]]) with T = js.native
  def apply[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) with T = js.native
}

