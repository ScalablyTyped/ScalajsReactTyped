package typingsJapgolly.babyparse.BabyParse

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
                // default: false
  var comments: js.UndefOr[Boolean] = js.undefined
    // default: undefined
  var complete: js.UndefOr[js.Function1[/* results */ ParseResult, Unit]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
              // default: false
  var download: js.UndefOr[Boolean] = js.undefined
                // default: false
  var dynamicTyping: js.UndefOr[Boolean] = js.undefined
                // default: 0
  var encoding: js.UndefOr[String] = js.undefined
        // default: false
  var fastMode: js.UndefOr[Boolean] = js.undefined
                // default: ""
  var header: js.UndefOr[Boolean] = js.undefined
              // default: ""
  var newline: js.UndefOr[String] = js.undefined
         // default: false
  var preview: js.UndefOr[Double] = js.undefined
              // default: false
  var skipEmptyLines: js.UndefOr[Boolean] = js.undefined
              // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
               // default: ""
  var worker: js.UndefOr[Boolean] = js.undefined
}

object ParseConfig {
  @scala.inline
  def apply(
    comments: js.UndefOr[Boolean] = js.undefined,
    complete: /* results */ ParseResult => Callback = null,
    delimiter: String = null,
    download: js.UndefOr[Boolean] = js.undefined,
    dynamicTyping: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    fastMode: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    newline: String = null,
    preview: Int | Double = null,
    skipEmptyLines: js.UndefOr[Boolean] = js.undefined,
    step: (/* results */ ParseResult, /* parser */ Parser) => Callback = null,
    worker: js.UndefOr[Boolean] = js.undefined
  ): ParseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* results */ typingsJapgolly.babyparse.BabyParse.ParseResult) => complete(t0).runNow()))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicTyping)) __obj.updateDynamic("dynamicTyping")(dynamicTyping.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2((t0: /* results */ typingsJapgolly.babyparse.BabyParse.ParseResult, t1: /* parser */ typingsJapgolly.babyparse.BabyParse.Parser) => step(t0, t1).runNow()))
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseConfig]
  }
}

