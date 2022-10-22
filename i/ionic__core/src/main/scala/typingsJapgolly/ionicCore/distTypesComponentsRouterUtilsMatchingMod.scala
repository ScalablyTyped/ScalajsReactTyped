package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionicCore.anon.PickRouteIDidparams
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteChain
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteID
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsMatchingMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "RouterSegments")
  @js.native
  open class RouterSegments protected () extends StObject {
    def this(segments: js.Array[String]) = this()
    
    def next(): String = js.native
    
    /* private */ var segments: Any = js.native
  }
  
  inline def computePriority(chain: RouteChain): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computePriority")(chain.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def findChainForIDs(ids: js.Array[RouteID], chains: js.Array[RouteChain]): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findChainForIDs")(ids.asInstanceOf[js.Any], chains.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
  
  inline def findChainForSegments(segments: js.Array[String], chains: js.Array[RouteChain]): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findChainForSegments")(segments.asInstanceOf[js.Any], chains.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
  
  inline def findRouteRedirect(segments: js.Array[String], redirects: js.Array[RouteRedirect]): js.UndefOr[RouteRedirect] = (^.asInstanceOf[js.Dynamic].applyDynamic("findRouteRedirect")(segments.asInstanceOf[js.Any], redirects.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RouteRedirect]]
  
  inline def matchesIDs(ids: js.Array[PickRouteIDidparams], chain: RouteChain): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesIDs")(ids.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def matchesRedirect(segments: js.Array[String], redirect: RouteRedirect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesRedirect")(segments.asInstanceOf[js.Any], redirect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchesSegments(segments: js.Array[String], chain: RouteChain): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesSegments")(segments.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
  
  inline def mergeParams(): js.UndefOr[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")().asInstanceOf[js.UndefOr[StringDictionary[Any]]]
  inline def mergeParams(a: StringDictionary[Any]): js.UndefOr[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StringDictionary[Any]]]
  inline def mergeParams(a: StringDictionary[Any], b: StringDictionary[Any]): js.UndefOr[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StringDictionary[Any]]]
  inline def mergeParams(a: Unit, b: StringDictionary[Any]): js.UndefOr[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StringDictionary[Any]]]
}
