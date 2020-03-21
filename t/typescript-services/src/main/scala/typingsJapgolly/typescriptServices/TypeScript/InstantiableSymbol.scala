package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  def getIsSpecialized(): Boolean
  def getTypeParameterArgumentMap(): TypeArgumentMap
}

object InstantiableSymbol {
  @scala.inline
  def apply(
    getAllowedToReferenceTypeParameters: CallbackTo[js.Array[PullTypeParameterSymbol]],
    getIsSpecialized: CallbackTo[Boolean],
    getTypeParameterArgumentMap: CallbackTo[TypeArgumentMap]
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllowedToReferenceTypeParameters")(getAllowedToReferenceTypeParameters.toJsFn)
    __obj.updateDynamic("getIsSpecialized")(getIsSpecialized.toJsFn)
    __obj.updateDynamic("getTypeParameterArgumentMap")(getTypeParameterArgumentMap.toJsFn)
    __obj.asInstanceOf[InstantiableSymbol]
  }
}

