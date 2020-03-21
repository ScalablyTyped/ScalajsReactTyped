package typingsJapgolly.samlp.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileMapper extends js.Object {
  var metadata: js.Array[MetadataItem]
  def getClaims(): js.Any
  def getNameIdentifier(): js.Any
}

object ProfileMapper {
  @scala.inline
  def apply(
    getClaims: CallbackTo[js.Any],
    getNameIdentifier: CallbackTo[js.Any],
    metadata: js.Array[MetadataItem]
  ): ProfileMapper = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("getClaims")(getClaims.toJsFn)
    __obj.updateDynamic("getNameIdentifier")(getNameIdentifier.toJsFn)
    __obj.asInstanceOf[ProfileMapper]
  }
}

