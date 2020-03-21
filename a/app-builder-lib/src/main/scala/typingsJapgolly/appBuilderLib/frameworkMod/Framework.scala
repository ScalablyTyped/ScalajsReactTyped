package typingsJapgolly.appBuilderLib.frameworkMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.appBuilderLib.configurationMod.AfterPackContext
import typingsJapgolly.appBuilderLib.mod.Platform
import typingsJapgolly.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework extends js.Object {
  var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[_]]] = js.undefined
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.undefined
  var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.undefined
  val defaultAppIdPrefix: String
  val distMacOsAppName: String
  var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
  var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.undefined
  var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
  val isCopyElevateHelper: Boolean
  val isNpmRebuildRequired: Boolean
  val macOsDefaultTargets: js.Array[String]
  val name: String
  val version: String
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_]
}

object Framework {
  @scala.inline
  def apply(
    defaultAppIdPrefix: String,
    distMacOsAppName: String,
    isCopyElevateHelper: Boolean,
    isNpmRebuildRequired: Boolean,
    macOsDefaultTargets: js.Array[String],
    name: String,
    prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => CallbackTo[js.Promise[js.Any]],
    version: String,
    afterPack: /* context */ AfterPackContext => CallbackTo[js.Promise[js.Any]] = null,
    beforeCopyExtraFiles: /* options */ BeforeCopyExtraFilesOptions => CallbackTo[js.Promise[js.Any]] = null,
    createTransformer: js.UndefOr[CallbackTo[FileTransformer | Null]] = js.undefined,
    getDefaultIcon: /* platform */ Platform => CallbackTo[String | Null] = null,
    getExcludedDependencies: /* platform */ Platform => CallbackTo[js.Array[String] | Null] = null,
    getMainFile: /* platform */ Platform => CallbackTo[String | Null] = null
  ): Framework = {
    val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("prepareApplicationStageDirectory")(js.Any.fromFunction1((t0: typingsJapgolly.appBuilderLib.frameworkMod.PrepareApplicationStageDirectoryOptions) => prepareApplicationStageDirectory(t0).runNow()))
    if (afterPack != null) __obj.updateDynamic("afterPack")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.appBuilderLib.configurationMod.AfterPackContext) => afterPack(t0).runNow()))
    if (beforeCopyExtraFiles != null) __obj.updateDynamic("beforeCopyExtraFiles")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.appBuilderLib.frameworkMod.BeforeCopyExtraFilesOptions) => beforeCopyExtraFiles(t0).runNow()))
    createTransformer.foreach(p => __obj.updateDynamic("createTransformer")(p.toJsFn))
    if (getDefaultIcon != null) __obj.updateDynamic("getDefaultIcon")(js.Any.fromFunction1((t0: /* platform */ typingsJapgolly.appBuilderLib.mod.Platform) => getDefaultIcon(t0).runNow()))
    if (getExcludedDependencies != null) __obj.updateDynamic("getExcludedDependencies")(js.Any.fromFunction1((t0: /* platform */ typingsJapgolly.appBuilderLib.mod.Platform) => getExcludedDependencies(t0).runNow()))
    if (getMainFile != null) __obj.updateDynamic("getMainFile")(js.Any.fromFunction1((t0: /* platform */ typingsJapgolly.appBuilderLib.mod.Platform) => getMainFile(t0).runNow()))
    __obj.asInstanceOf[Framework]
  }
}

