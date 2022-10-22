package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRadioBaseMod {
  
  trait RadioProps
    extends StObject
       with /**
    * Additional properties passed to Radio container.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * If true, the input element will be selected by default. Transferred from the parent.
      * @default false
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Callback invoked on mouse down.
      */
    var onMouseDown: js.UndefOr[js.Function] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnMouseDown(value: js.Function): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    }
  }
  
  trait RadioTheme extends StObject {
    
    /**
      * Used to for the radio element.
      */
    var radio: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the radio element when it's checked.
      */
    var radioChecked: js.UndefOr[String] = js.undefined
    
    /**
      * To provide styles for the ripple.
      */
    var ripple: js.UndefOr[String] = js.undefined
  }
  object RadioTheme {
    
    inline def apply(): RadioTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioTheme]
    }
    
    extension [Self <: RadioTheme](x: Self) {
      
      inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioChecked(value: String): Self = StObject.set(x, "radioChecked", value.asInstanceOf[js.Any])
      
      inline def setRadioCheckedUndefined: Self = StObject.set(x, "radioChecked", js.undefined)
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    }
  }
}
