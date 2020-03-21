package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`d LeftparenthesisDaysRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`h LeftparenthesisHoursRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`m LeftparenthesisMinutesRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`micros LeftparenthesisMicrosecondsRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`ms LeftparenthesisMillisecondsRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`nanos LeftparenthesisNanosecondsRightparenthesis`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`s LeftparenthesisSecondsRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSnapshots extends Generic {
  var format: js.UndefOr[String] = js.undefined
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[String | js.Array[String]] = js.undefined
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  var time: js.UndefOr[
    (`d LeftparenthesisDaysRightparenthesis`) | (`h LeftparenthesisHoursRightparenthesis`) | (`m LeftparenthesisMinutesRightparenthesis`) | (`s LeftparenthesisSecondsRightparenthesis`) | (`ms LeftparenthesisMillisecondsRightparenthesis`) | (`micros LeftparenthesisMicrosecondsRightparenthesis`) | (`nanos LeftparenthesisNanosecondsRightparenthesis`)
  ] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatSnapshots {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    format: String = null,
    h: String | js.Array[String] = null,
    help: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    repository: String | js.Array[String] = null,
    s: String | js.Array[String] = null,
    source: String = null,
    time: (`d LeftparenthesisDaysRightparenthesis`) | (`h LeftparenthesisHoursRightparenthesis`) | (`m LeftparenthesisMinutesRightparenthesis`) | (`s LeftparenthesisSecondsRightparenthesis`) | (`ms LeftparenthesisMillisecondsRightparenthesis`) | (`micros LeftparenthesisMicrosecondsRightparenthesis`) | (`nanos LeftparenthesisNanosecondsRightparenthesis`) = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatSnapshots = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatSnapshots]
  }
}

