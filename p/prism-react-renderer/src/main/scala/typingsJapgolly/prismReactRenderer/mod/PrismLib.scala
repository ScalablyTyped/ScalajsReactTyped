package typingsJapgolly.prismReactRenderer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismLib extends js.Object {
  var languages: LanguageDict
  def highlight(code: String, grammar: PrismGrammar, language: Language): String
  def tokenize(code: String, grammar: PrismGrammar, language: Language): js.Array[PrismToken | String]
}

object PrismLib {
  @scala.inline
  def apply(
    highlight: (String, PrismGrammar, Language) => CallbackTo[String],
    languages: LanguageDict,
    tokenize: (String, PrismGrammar, Language) => CallbackTo[js.Array[PrismToken | String]]
  ): PrismLib = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.updateDynamic("highlight")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.prismReactRenderer.mod.PrismGrammar, t2: typingsJapgolly.prismReactRenderer.mod.Language) => highlight(t0, t1, t2).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.prismReactRenderer.mod.PrismGrammar, t2: typingsJapgolly.prismReactRenderer.mod.Language) => tokenize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PrismLib]
  }
}

