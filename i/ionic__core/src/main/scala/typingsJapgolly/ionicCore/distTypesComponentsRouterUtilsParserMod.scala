package typingsJapgolly.ionicCore

import org.scalajs.dom.Element
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteChain
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteRedirect
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsParserMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenRouterTree(nodes: RouteTree): js.Array[RouteChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenRouterTree")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteChain]]
  
  inline def readRedirects(root: Element): js.Array[RouteRedirect] = ^.asInstanceOf[js.Dynamic].applyDynamic("readRedirects")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteRedirect]]
  
  inline def readRouteNodes(node: Element): RouteTree = ^.asInstanceOf[js.Dynamic].applyDynamic("readRouteNodes")(node.asInstanceOf[js.Any]).asInstanceOf[RouteTree]
  
  inline def readRoutes(root: Element): js.Array[RouteChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("readRoutes")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteChain]]
}
