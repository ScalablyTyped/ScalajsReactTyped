package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.memberTypeResource
  * @description Loads in data for member types
  **/
trait IMemberTypeResource extends js.Object {
  //return all member types
  def getTypes(): js.Any
}

object IMemberTypeResource {
  @scala.inline
  def apply(getTypes: CallbackTo[js.Any]): IMemberTypeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTypes")(getTypes.toJsFn)
    __obj.asInstanceOf[IMemberTypeResource]
  }
}

