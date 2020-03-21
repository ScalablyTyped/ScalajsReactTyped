package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.AnonSrcString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBodyDefinition extends PropertyBaseDefinition {
  var file: js.UndefOr[String | AnonSrcString] = js.undefined
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.undefined
  var mode: String
  var raw: js.UndefOr[String] = js.undefined
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.undefined
}

object RequestBodyDefinition {
  @scala.inline
  def apply(
    mode: String,
    description: String | DescriptionDefinition = null,
    file: String | AnonSrcString = null,
    formdata: js.Array[FormParamDefinition] | PropertyList[FormParam] = null,
    raw: String = null,
    urlencoded: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String = null
  ): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (formdata != null) __obj.updateDynamic("formdata")(formdata.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
}

