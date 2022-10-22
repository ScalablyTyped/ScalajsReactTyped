package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.libGraphTransformMod.Transform
import typingsJapgolly.ngPackagr.libNgPackageOptionsDotdiMod.NgPackagrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointWriteBundlesDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/write-bundles.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBundlesTransform(options: NgPackagrOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBundlesTransform")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
