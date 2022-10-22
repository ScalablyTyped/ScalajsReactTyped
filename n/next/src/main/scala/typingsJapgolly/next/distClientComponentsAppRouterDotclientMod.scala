package typingsJapgolly.next

import org.scalajs.dom.URL
import typingsJapgolly.next.anon.Children
import typingsJapgolly.next.distServerAppRenderMod.FlightData
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import typingsJapgolly.next.nextBooleans.`true`
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsAppRouterDotclientMod {
  
  @JSImport("next/dist/client/components/app-router.client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasInitialTreeInitialCanonicalUrlChildrenHotReloader: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasInitialTreeInitialCanonicalUrlChildrenHotReloader.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def fetchServerResponse(url: URL, flightRouterState: FlightRouterState): js.Promise[js.Array[/* FlightData */ FlightData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchServerResponse")(url.asInstanceOf[js.Any], flightRouterState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[/* FlightData */ FlightData]]]
  
  inline def fetchServerResponse_true(url: URL, flightRouterState: FlightRouterState, prefetch: `true`): js.Promise[js.Array[/* FlightData */ FlightData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchServerResponse")(url.asInstanceOf[js.Any], flightRouterState.asInstanceOf[js.Any], prefetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[/* FlightData */ FlightData]]]
}
