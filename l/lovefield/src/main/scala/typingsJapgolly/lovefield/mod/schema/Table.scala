package typingsJapgolly.lovefield.mod.schema

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lovefield.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined lovefield.lovefield.schema.ITable & {[index: string] : lovefield.lovefield.schema.Column} */
trait Table extends /* index */ StringDictionary[Column] {
  def as(name: String): Table
  def createRow(value: js.Object): Row
  def getName(): String
}

object Table {
  @scala.inline
  def apply(
    as: String => CallbackTo[Table],
    createRow: js.Object => CallbackTo[Row],
    getName: CallbackTo[String],
    StringDictionary: /* index */ StringDictionary[Column] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(js.Any.fromFunction1((t0: java.lang.String) => as(t0).runNow()))
    __obj.updateDynamic("createRow")(js.Any.fromFunction1((t0: js.Object) => createRow(t0).runNow()))
    __obj.updateDynamic("getName")(getName.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

