package typingsJapgolly.ngPackagr

import typingsJapgolly.injectionJs.mod.InjectionToken
import typingsJapgolly.injectionJs.providerMod.Provider
import typingsJapgolly.ngPackagr.libGraphTransformDotdiMod.TransformProvider
import typingsJapgolly.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackagePackageDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_PROVIDERS")
  @js.native
  val PACKAGE_PROVIDERS: js.Array[Provider] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_TRANSFORM")
  @js.native
  val PACKAGE_TRANSFORM: TransformProvider = js.native
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_TRANSFORM_TOKEN")
  @js.native
  val PACKAGE_TRANSFORM_TOKEN: InjectionToken[Transform] = js.native
}
