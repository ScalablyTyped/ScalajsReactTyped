package typingsJapgolly.ngPackagr

import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointInitTsconfigDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initTsConfigTransformFactory(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")().asInstanceOf[Transform]
  inline def initTsConfigTransformFactory(defaultTsConfig: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")(defaultTsConfig.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def initTsConfigTransformFactory(defaultTsConfig: ParsedConfiguration): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")(defaultTsConfig.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
