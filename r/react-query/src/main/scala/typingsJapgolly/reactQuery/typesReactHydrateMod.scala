package typingsJapgolly.reactQuery

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactQuery.typesCoreHydrationMod.HydrateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactHydrateMod {
  
  @JSImport("react-query/types/react/Hydrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Hydrate(hasChildrenOptionsState: HydrateProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(hasChildrenOptionsState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HydrateProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var options: js.UndefOr[HydrateOptions] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object HydrateProps {
    
    inline def apply(): HydrateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrateProps]
    }
    
    extension [Self <: HydrateProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOptions(value: HydrateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
