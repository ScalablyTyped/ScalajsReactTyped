package typingsJapgolly.broccoliNodeApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureSet
  extends /* feature */ StringDictionary[js.UndefOr[Boolean]] {
  var needsCacheFlag: js.UndefOr[Boolean] = js.undefined
  var persistentOutputFlag: js.UndefOr[Boolean] = js.undefined
  var sourceDirectories: js.UndefOr[Boolean] = js.undefined
}

object FeatureSet {
  @scala.inline
  def apply(
    StringDictionary: /* feature */ StringDictionary[js.UndefOr[Boolean]] = null,
    needsCacheFlag: js.UndefOr[Boolean] = js.undefined,
    persistentOutputFlag: js.UndefOr[Boolean] = js.undefined,
    sourceDirectories: js.UndefOr[Boolean] = js.undefined
  ): FeatureSet = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(needsCacheFlag)) __obj.updateDynamic("needsCacheFlag")(needsCacheFlag.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentOutputFlag)) __obj.updateDynamic("persistentOutputFlag")(persistentOutputFlag.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceDirectories)) __obj.updateDynamic("sourceDirectories")(sourceDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
}

