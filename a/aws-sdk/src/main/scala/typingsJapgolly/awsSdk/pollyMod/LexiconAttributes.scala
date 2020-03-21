package typingsJapgolly.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexiconAttributes extends js.Object {
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.Alphabet] = js.native
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.LexemesCount] = js.native
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.LexiconArn] = js.native
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.Size] = js.native
}

object LexiconAttributes {
  @scala.inline
  def apply(
    Alphabet: Alphabet = null,
    LanguageCode: LanguageCode = null,
    LastModified: js.Date = null,
    LexemesCount: Int | Double = null,
    LexiconArn: LexiconArn = null,
    Size: Int | Double = null
  ): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    if (Alphabet != null) __obj.updateDynamic("Alphabet")(Alphabet.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LexemesCount != null) __obj.updateDynamic("LexemesCount")(LexemesCount.asInstanceOf[js.Any])
    if (LexiconArn != null) __obj.updateDynamic("LexiconArn")(LexiconArn.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexiconAttributes]
  }
}

