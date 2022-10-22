package typingsJapgolly.reactQuery

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactQuery.typesCoreHydrationMod.DehydrateOptions
import typingsJapgolly.reactQuery.typesCoreHydrationMod.DehydratedState
import typingsJapgolly.reactQuery.typesCoreHydrationMod.HydrateOptions
import typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient
import typingsJapgolly.reactQuery.typesReactHydrateMod.HydrateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHydrationMod {
  
  @JSImport("react-query/types/hydration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Hydrate_(hasChildrenOptionsState: HydrateProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(hasChildrenOptionsState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def dehydrate(client: QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  inline def hydrate(client: QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(client: QueryClient, dehydratedState: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
