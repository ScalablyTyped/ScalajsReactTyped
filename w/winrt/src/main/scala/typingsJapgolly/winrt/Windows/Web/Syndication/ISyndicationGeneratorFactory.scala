package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationGeneratorFactory extends js.Object {
  def createSyndicationGenerator(text: String): SyndicationGenerator
}

object ISyndicationGeneratorFactory {
  @scala.inline
  def apply(createSyndicationGenerator: String => CallbackTo[SyndicationGenerator]): ISyndicationGeneratorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationGenerator")(js.Any.fromFunction1((t0: java.lang.String) => createSyndicationGenerator(t0).runNow()))
    __obj.asInstanceOf[ISyndicationGeneratorFactory]
  }
}

