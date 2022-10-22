package typingsJapgolly.fragmentedStore

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fragmentedStore.mod.StateHook
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: Node
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Provider[Store /* <: StringDictionary[Any] */] extends StObject {
    
    var Provider: ExoticComponent[Children]
    
    var useStore: StateHook[Store]
  }
  object Provider {
    
    inline def apply[Store /* <: StringDictionary[Any] */](
      Provider: ExoticComponent[Children],
      useStore: CallbackTo[js.Tuple2[Store, Dispatch[SetStateAction[Store]]]]
    ): Provider[Store] = {
      val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useStore = useStore.toJsFn)
      __obj.asInstanceOf[Provider[Store]]
    }
    
    extension [Self <: Provider[?], Store /* <: StringDictionary[Any] */](x: Self & Provider[Store]) {
      
      inline def setProvider(value: ExoticComponent[Children]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      
      inline def setUseStore(value: CallbackTo[js.Tuple2[Store, Dispatch[SetStateAction[Store]]]]): Self = StObject.set(x, "useStore", value.toJsFn)
    }
  }
}
