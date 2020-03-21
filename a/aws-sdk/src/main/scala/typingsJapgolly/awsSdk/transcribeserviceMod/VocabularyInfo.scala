package typingsJapgolly.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VocabularyInfo extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary. If the state is READY you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object VocabularyInfo {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: js.Date = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): VocabularyInfo = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VocabularyInfo]
  }
}

