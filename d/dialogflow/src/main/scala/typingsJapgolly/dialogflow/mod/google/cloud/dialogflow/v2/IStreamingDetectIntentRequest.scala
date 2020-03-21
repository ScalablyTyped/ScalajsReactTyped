package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentRequest. */
trait IStreamingDetectIntentRequest extends js.Object {
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
  /** StreamingDetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** StreamingDetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.undefined
  /** StreamingDetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.undefined
  /** StreamingDetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  /** StreamingDetectIntentRequest singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
}

object IStreamingDetectIntentRequest {
  @scala.inline
  def apply(
    inputAudio: scala.scalajs.js.typedarray.Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryInput: IQueryInput = null,
    queryParams: IQueryParameters = null,
    session: String = null,
    singleUtterance: js.UndefOr[Boolean] = js.undefined
  ): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (inputAudio != null) __obj.updateDynamic("inputAudio")(inputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryInput != null) __obj.updateDynamic("queryInput")(queryInput.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
}

