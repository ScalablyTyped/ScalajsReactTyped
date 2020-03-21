package typingsJapgolly.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyParamsAndroid extends js.Object {
  var manifestPath: js.UndefOr[String] = js.undefined
  var packageImportPath: js.UndefOr[String] = js.undefined
  var packageInstance: js.UndefOr[String] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
}

object DependencyParamsAndroid {
  @scala.inline
  def apply(
    manifestPath: String = null,
    packageImportPath: String = null,
    packageInstance: String = null,
    sourceDir: String = null
  ): DependencyParamsAndroid = {
    val __obj = js.Dynamic.literal()
    if (manifestPath != null) __obj.updateDynamic("manifestPath")(manifestPath.asInstanceOf[js.Any])
    if (packageImportPath != null) __obj.updateDynamic("packageImportPath")(packageImportPath.asInstanceOf[js.Any])
    if (packageInstance != null) __obj.updateDynamic("packageInstance")(packageInstance.asInstanceOf[js.Any])
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyParamsAndroid]
  }
}

