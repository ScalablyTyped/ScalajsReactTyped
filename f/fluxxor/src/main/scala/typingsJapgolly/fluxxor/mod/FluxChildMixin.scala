package typingsJapgolly.fluxxor.mod

import typingsJapgolly.fluxxor.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxChildMixin extends js.Object {
  def getFlux(): Flux
}

@JSImport("fluxxor", "FluxChildMixin")
@js.native
object FluxChildMixin extends js.Object {
  def apply(react: TypeofReact): FluxChildMixin = js.native
}

