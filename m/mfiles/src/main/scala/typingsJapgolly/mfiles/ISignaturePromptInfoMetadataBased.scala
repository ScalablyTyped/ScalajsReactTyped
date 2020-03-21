package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoMetadataBased extends js.Object {
  var IsReferencedBySignatureObject: Boolean
  var MeaningPropertyID: Double
  var PromptInfoLookupPropertyID: Double
  var ReasonPropertyID: Double
  def Clone(): ISignaturePromptInfoMetadataBased
}

object ISignaturePromptInfoMetadataBased {
  @scala.inline
  def apply(
    Clone: CallbackTo[ISignaturePromptInfoMetadataBased],
    IsReferencedBySignatureObject: Boolean,
    MeaningPropertyID: Double,
    PromptInfoLookupPropertyID: Double,
    ReasonPropertyID: Double
  ): ISignaturePromptInfoMetadataBased = {
    val __obj = js.Dynamic.literal(IsReferencedBySignatureObject = IsReferencedBySignatureObject.asInstanceOf[js.Any], MeaningPropertyID = MeaningPropertyID.asInstanceOf[js.Any], PromptInfoLookupPropertyID = PromptInfoLookupPropertyID.asInstanceOf[js.Any], ReasonPropertyID = ReasonPropertyID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
}

