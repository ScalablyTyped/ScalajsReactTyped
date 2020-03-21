package typingsJapgolly.hapiLab.mod.script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  val ext: String
  def transform(content: String, filename: String): String
}

object Transformer {
  @scala.inline
  def apply(ext: String, transform: (String, String) => CallbackTo[String]): Transformer = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => transform(t0, t1).runNow()))
    __obj.asInstanceOf[Transformer]
  }
}

