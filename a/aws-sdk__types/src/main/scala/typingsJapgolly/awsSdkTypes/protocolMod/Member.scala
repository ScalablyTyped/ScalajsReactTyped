package typingsJapgolly.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[MemberLocation] = js.undefined
  var locationName: js.UndefOr[java.lang.String] = js.undefined
  var queryName: js.UndefOr[java.lang.String] = js.undefined
  var resultWrapper: js.UndefOr[java.lang.String] = js.undefined
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var shape: SerializationModel
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var xmlNamespace: js.UndefOr[XmlNamespace] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    shape: SerializationModel,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    location: MemberLocation = null,
    locationName: java.lang.String = null,
    queryName: java.lang.String = null,
    resultWrapper: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    xmlNamespace: XmlNamespace = null
  ): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (queryName != null) __obj.updateDynamic("queryName")(queryName.asInstanceOf[js.Any])
    if (resultWrapper != null) __obj.updateDynamic("resultWrapper")(resultWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute.asInstanceOf[js.Any])
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

