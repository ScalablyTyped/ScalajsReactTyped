package typingsJapgolly.ngPackagr

import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.ngPackagr.libGraphTransformMod.Transform
import typingsJapgolly.ngPackagr.libNgPackageOptionsDotdiMod.NgPackagrOptions
import typingsJapgolly.ngPackagr.libStylesStylesheetProcessorMod.CssUrl
import typingsJapgolly.ngPackagr.libStylesStylesheetProcessorMod.StylesheetProcessor
import typingsJapgolly.ngPackagr.ngPackagrBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointCompileNgcDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/compile-ngc.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileNgcTransformFactory_false(
    StylesheetProcessor: Instantiable4[
      /* basePath */ String, 
      /* cssUrl */ js.UndefOr[CssUrl], 
      /* includePaths */ js.UndefOr[js.Array[String]], 
      /* cacheDirectory */ js.UndefOr[String | `false`], 
      StylesheetProcessor
    ],
    options: NgPackagrOptions
  ): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("compileNgcTransformFactory")(StylesheetProcessor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
}
