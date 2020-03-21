package typingsJapgolly.fastCsv.headerTransformerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.fastCsv.parserTypesMod.RowArray
import typingsJapgolly.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransformer extends js.Object {
  var headers: js.Any
  var headersLength: js.Any
  val headersTransform: js.UndefOr[js.Any] = js.undefined
  var mapHeaders: js.Any
  val parserOptions: js.Any
  var processRow: js.Any
  var processedFirstRow: js.Any
  var receivedHeaders: js.Any
  var setHeaders: js.Any
  var shouldMapRow: js.Any
  val shouldUseFirstRow: js.Any
  def transform(row: RowArray, cb: RowValidatorCallback): Unit
}

object HeaderTransformer {
  @scala.inline
  def apply(
    headers: js.Any,
    headersLength: js.Any,
    mapHeaders: js.Any,
    parserOptions: js.Any,
    processRow: js.Any,
    processedFirstRow: js.Any,
    receivedHeaders: js.Any,
    setHeaders: js.Any,
    shouldMapRow: js.Any,
    shouldUseFirstRow: js.Any,
    transform: (RowArray, RowValidatorCallback) => Callback,
    headersTransform: js.Any = null
  ): HeaderTransformer = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], headersLength = headersLength.asInstanceOf[js.Any], mapHeaders = mapHeaders.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], processRow = processRow.asInstanceOf[js.Any], processedFirstRow = processedFirstRow.asInstanceOf[js.Any], receivedHeaders = receivedHeaders.asInstanceOf[js.Any], setHeaders = setHeaders.asInstanceOf[js.Any], shouldMapRow = shouldMapRow.asInstanceOf[js.Any], shouldUseFirstRow = shouldUseFirstRow.asInstanceOf[js.Any])
    __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: typingsJapgolly.fastCsv.parserTypesMod.RowArray, t1: typingsJapgolly.fastCsv.parserTypesMod.RowValidatorCallback) => transform(t0, t1).runNow()))
    if (headersTransform != null) __obj.updateDynamic("headersTransform")(headersTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderTransformer]
  }
}

