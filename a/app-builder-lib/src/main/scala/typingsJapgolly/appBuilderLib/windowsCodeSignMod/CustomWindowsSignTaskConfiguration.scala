package typingsJapgolly.appBuilderLib.windowsCodeSignMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomWindowsSignTaskConfiguration extends WindowsSignTaskConfiguration {
  def computeSignToolArgs(isWin: Boolean): js.Array[String]
}

object CustomWindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    computeSignToolArgs: Boolean => CallbackTo[js.Array[String]],
    hash: String,
    isNest: Boolean,
    options: WindowsConfiguration,
    path: String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: String = null,
    resultOutputPath: String = null,
    site: String = null
  ): CustomWindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("computeSignToolArgs")(js.Any.fromFunction1((t0: scala.Boolean) => computeSignToolArgs(t0).runNow()))
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
  }
}

