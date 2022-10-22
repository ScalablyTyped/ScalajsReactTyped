package typingsJapgolly.awsSdkNodeConfigProvider

import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromEnvMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist-types/fromEnv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEnv[T](envVarSelector: GetterFromEnv[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")(envVarSelector.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  
  type GetterFromEnv[T] = js.Function1[/* env */ ProcessEnv, js.UndefOr[T]]
}
