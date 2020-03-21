package typingsJapgolly.loremIpsum.generatorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeneratorOptions extends js.Object {
  var random: js.UndefOr[IPrng] = js.undefined
  var seed: js.UndefOr[String] = js.undefined
  var sentencesPerParagraph: js.UndefOr[IBounds] = js.undefined
  var words: js.UndefOr[js.Array[String]] = js.undefined
  var wordsPerSentence: js.UndefOr[IBounds] = js.undefined
}

object IGeneratorOptions {
  @scala.inline
  def apply(
    random: js.UndefOr[CallbackTo[Double]] = js.undefined,
    seed: String = null,
    sentencesPerParagraph: IBounds = null,
    words: js.Array[String] = null,
    wordsPerSentence: IBounds = null
  ): IGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    random.foreach(p => __obj.updateDynamic("random")(p.toJsFn))
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (sentencesPerParagraph != null) __obj.updateDynamic("sentencesPerParagraph")(sentencesPerParagraph.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    if (wordsPerSentence != null) __obj.updateDynamic("wordsPerSentence")(wordsPerSentence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneratorOptions]
  }
}

