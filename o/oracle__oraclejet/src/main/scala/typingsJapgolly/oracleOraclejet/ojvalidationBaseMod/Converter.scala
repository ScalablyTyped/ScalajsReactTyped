package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  def format(value: V): String | Null
  def parse(value: String): V | Null
}

object Converter {
  @scala.inline
  def apply[V](
    format: V => CallbackTo[String | Null],
    parse: String => CallbackTo[V | Null],
    getHint: js.UndefOr[CallbackTo[String | Null]] = js.undefined,
    getOptions: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    resolvedOptions: js.UndefOr[CallbackTo[js.Object]] = js.undefined
  ): Converter[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: V) => format(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    getHint.foreach(p => __obj.updateDynamic("getHint")(p.toJsFn))
    getOptions.foreach(p => __obj.updateDynamic("getOptions")(p.toJsFn))
    resolvedOptions.foreach(p => __obj.updateDynamic("resolvedOptions")(p.toJsFn))
    __obj.asInstanceOf[Converter[V]]
  }
}

