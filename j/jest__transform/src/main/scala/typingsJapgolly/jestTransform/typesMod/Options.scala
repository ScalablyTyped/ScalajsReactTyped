package typingsJapgolly.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jestTypes.configMod.Glob
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/transform.@jest/transform/build/types.ShouldInstrumentOptions & std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'extraGlobals'> & {  isCoreModule ? :boolean,   isInternalModule ? :boolean} */
trait Options extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var extraGlobals: js.Array[String]
  var isCoreModule: js.UndefOr[Boolean] = js.undefined
  var isInternalModule: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    extraGlobals: js.Array[String],
    changedFiles: Set[Path] = null,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    isCoreModule: js.UndefOr[Boolean] = js.undefined,
    isInternalModule: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any])
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(isCoreModule)) __obj.updateDynamic("isCoreModule")(isCoreModule.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternalModule)) __obj.updateDynamic("isInternalModule")(isInternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

