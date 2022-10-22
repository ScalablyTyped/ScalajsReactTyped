package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.SupportedProjectTypes
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersShowMultiScanTipMod {
  
  @JSImport("snyk/dist/lib/formatters/show-multi-scan-tip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def showMultiScanTip(projectType: SupportedPackageManagers | SupportedProjectTypes, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("showMultiScanTip")(projectType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def showMultiScanTip(
    projectType: SupportedPackageManagers | SupportedProjectTypes,
    options: Options & TestOptions,
    foundProjectCount: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("showMultiScanTip")(projectType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
}
