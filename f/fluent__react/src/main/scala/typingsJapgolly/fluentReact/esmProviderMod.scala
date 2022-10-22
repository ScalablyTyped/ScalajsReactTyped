package typingsJapgolly.fluentReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.fluentReact.esmLocalizationMod.ReactLocalization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmProviderMod {
  
  @JSImport("@fluent/react/esm/provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LocalizationProvider(props: LocalizationProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalizationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait LocalizationProviderProps extends StObject {
    
    var children: Node
    
    var l10n: ReactLocalization
  }
  object LocalizationProviderProps {
    
    inline def apply(l10n: ReactLocalization): LocalizationProviderProps = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[LocalizationProviderProps]
    }
    
    extension [Self <: LocalizationProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    }
  }
}
