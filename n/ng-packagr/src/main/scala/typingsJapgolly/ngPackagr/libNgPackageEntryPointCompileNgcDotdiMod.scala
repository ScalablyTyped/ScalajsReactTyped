package typingsJapgolly.ngPackagr

import typingsJapgolly.injectionJs.mod.InjectionToken
import typingsJapgolly.injectionJs.providerMod.Provider
import typingsJapgolly.ngPackagr.libGraphTransformDotdiMod.TransformProvider
import typingsJapgolly.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointCompileNgcDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/compile-ngc.di", "COMPILE_NGC_PROVIDERS")
  @js.native
  val COMPILE_NGC_PROVIDERS: js.Array[Provider] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/compile-ngc.di", "COMPILE_NGC_TOKEN")
  @js.native
  val COMPILE_NGC_TOKEN: InjectionToken[Transform] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/compile-ngc.di", "COMPILE_NGC_TRANSFORM")
  @js.native
  val COMPILE_NGC_TRANSFORM: TransformProvider = js.native
}
