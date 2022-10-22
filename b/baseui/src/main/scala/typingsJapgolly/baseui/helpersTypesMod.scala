package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.baseui.stylesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersTypesMod {
  
  trait BaseProviderOverrides extends StObject {
    
    var AppContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var LayersContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object BaseProviderOverrides {
    
    inline def apply(): BaseProviderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProviderOverrides]
    }
    
    extension [Self <: BaseProviderOverrides](x: Self) {
      
      inline def setAppContainer(value: Override[Any]): Self = StObject.set(x, "AppContainer", value.asInstanceOf[js.Any])
      
      inline def setAppContainerUndefined: Self = StObject.set(x, "AppContainer", js.undefined)
      
      inline def setLayersContainer(value: Override[Any]): Self = StObject.set(x, "LayersContainer", value.asInstanceOf[js.Any])
      
      inline def setLayersContainerUndefined: Self = StObject.set(x, "LayersContainer", js.undefined)
    }
  }
  
  trait BaseProviderProps extends StObject {
    
    /** Children element to be rendered. Normally the BaseProvider
      should be added at the top level of an application. */
    var children: js.UndefOr[Node | Null] = js.undefined
    
    var overrides: js.UndefOr[BaseProviderOverrides] = js.undefined
    
    /** The base theme to be used in the application. */
    var theme: Theme
    
    /** A value of z-index to be set on the layers. */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object BaseProviderProps {
    
    inline def apply(theme: Theme): BaseProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProviderProps]
    }
    
    extension [Self <: BaseProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: BaseProviderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
