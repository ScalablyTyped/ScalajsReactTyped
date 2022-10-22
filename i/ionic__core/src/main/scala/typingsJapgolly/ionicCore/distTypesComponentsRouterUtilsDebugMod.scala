package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteChain
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsDebugMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printRedirects(redirects: js.Array[RouteRedirect]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printRedirects")(redirects.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printRoutes(routes: js.Array[RouteChain]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
