package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "begin")
@js.native
object begin extends js.Object {
  def apply[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
}

