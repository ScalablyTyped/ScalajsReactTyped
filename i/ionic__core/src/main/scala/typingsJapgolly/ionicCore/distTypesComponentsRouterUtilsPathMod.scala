package typingsJapgolly.ionicCore

import org.scalajs.dom.History
import org.scalajs.dom.Location
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.ParsedRoute
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteChain
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsPathMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chainToSegments(chain: RouteChain): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("chainToSegments")(chain.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  
  inline def generatePath(segments: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(): ParsedRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[ParsedRoute]
  inline def parsePath(path: String): ParsedRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[ParsedRoute]
  
  inline def readSegments(loc: Location, root: String, useHash: Boolean): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readSegments")(loc.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  inline def writeSegments(
    history: History,
    root: String,
    useHash: Boolean,
    segments: js.Array[String],
    direction: RouterDirection,
    state: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSegments")(history.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeSegments(
    history: History,
    root: String,
    useHash: Boolean,
    segments: js.Array[String],
    direction: RouterDirection,
    state: Double,
    queryString: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSegments")(history.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], state.asInstanceOf[js.Any], queryString.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
