package typingsJapgolly.elasticsearch.mod

import typingsJapgolly.elasticsearch.elasticsearchStrings._empty
import typingsJapgolly.elasticsearch.elasticsearchStrings.g
import typingsJapgolly.elasticsearch.elasticsearchStrings.k
import typingsJapgolly.elasticsearch.elasticsearchStrings.m
import typingsJapgolly.elasticsearch.elasticsearchStrings.p
import typingsJapgolly.elasticsearch.elasticsearchStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatThreadPoolParams extends CatCommonParams {
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.undefined
  var threadPoolPatterns: js.UndefOr[NameList] = js.undefined
}

object CatThreadPoolParams {
  @scala.inline
  def apply(
    format: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    h: NameList = null,
    help: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    local: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    size: _empty | k | m | g | t | p = null,
    threadPoolPatterns: NameList = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatThreadPoolParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (threadPoolPatterns != null) __obj.updateDynamic("threadPoolPatterns")(threadPoolPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatThreadPoolParams]
  }
}

