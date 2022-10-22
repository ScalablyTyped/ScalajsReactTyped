package typingsJapgolly.reactQuery

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactQuery.typesCoreMod.QueryClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactQueryClientProviderMod {
  
  @JSImport("react-query/types/react/QueryClientProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def QueryClientProvider(hasClientContextSharingChildren: QueryClientProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryClientProvider")(hasClientContextSharingChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useQueryClient(): QueryClient = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryClient")().asInstanceOf[QueryClient]
  
  trait QueryClientProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var client: QueryClient
    
    var contextSharing: js.UndefOr[Boolean] = js.undefined
  }
  object QueryClientProviderProps {
    
    inline def apply(client: QueryClient): QueryClientProviderProps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryClientProviderProps]
    }
    
    extension [Self <: QueryClientProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClient(value: QueryClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setContextSharing(value: Boolean): Self = StObject.set(x, "contextSharing", value.asInstanceOf[js.Any])
      
      inline def setContextSharingUndefined: Self = StObject.set(x, "contextSharing", js.undefined)
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var ReactQueryClientContext: js.UndefOr[Context[js.UndefOr[QueryClient]]] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setReactQueryClientContext(value: Context[js.UndefOr[QueryClient]]): Self = StObject.set(x, "ReactQueryClientContext", value.asInstanceOf[js.Any])
        
        inline def setReactQueryClientContextUndefined: Self = StObject.set(x, "ReactQueryClientContext", js.undefined)
      }
    }
  }
}
