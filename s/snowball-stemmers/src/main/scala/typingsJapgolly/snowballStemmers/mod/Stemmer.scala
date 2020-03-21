package typingsJapgolly.snowballStemmers.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemmer extends js.Object {
  def stem(term: String): String
}

object Stemmer {
  @scala.inline
  def apply(stem: String => CallbackTo[String]): Stemmer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stem")(js.Any.fromFunction1((t0: java.lang.String) => stem(t0).runNow()))
    __obj.asInstanceOf[Stemmer]
  }
}

