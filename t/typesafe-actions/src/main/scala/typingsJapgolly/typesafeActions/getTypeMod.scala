package typingsJapgolly.typesafeActions

import typingsJapgolly.typesafeActions.typeHelpersMod.ActionCreator
import typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant
import typingsJapgolly.typesafeActions.typeHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/get-type", JSImport.Namespace)
@js.native
object getTypeMod extends js.Object {
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
}

