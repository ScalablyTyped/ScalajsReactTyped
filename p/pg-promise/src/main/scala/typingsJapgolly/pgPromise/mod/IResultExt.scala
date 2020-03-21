package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.AnonBinary
import typingsJapgolly.pgPromise.pgSubsetMod.IColumn
import typingsJapgolly.pgPromise.pgSubsetMod.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultExt extends IResult {
  // Property 'duration' exists only in the following context:
  //  - for single-query events 'receive'
  //  - for method Database.result
  var duration: js.UndefOr[Double] = js.undefined
}

object IResultExt {
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: AnonBinary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_],
    duration: Int | Double = null
  ): IResultExt = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultExt]
  }
}

