package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRippleMod {
  
  @JSImport("react-toolbox/components/ripple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RippleProps): RippledComponentFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[RippledComponentFactory]
  
  inline def Ripple(options: RippleProps): RippledComponentFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(options.asInstanceOf[js.Any]).asInstanceOf[RippledComponentFactory]
  
  inline def rippleFactory(options: RippleProps): RippledComponentFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleFactory")(options.asInstanceOf[js.Any]).asInstanceOf[RippledComponentFactory]
  
  trait RippleProps
    extends StObject
       with /**
    * Additional properties passed to Radio container.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * True in case you want a centered ripple.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that will be called when the ripple animation ends.
      */
    var onRippleEnded: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Factor to indicate how much should the ripple spread under the component.
      * @default 2
      */
    var spread: js.UndefOr[Double] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[RippleTheme] = js.undefined
  }
  object RippleProps {
    
    inline def apply(): RippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RippleProps]
    }
    
    extension [Self <: RippleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnRippleEnded(value: js.Function): Self = StObject.set(x, "onRippleEnded", value.asInstanceOf[js.Any])
      
      inline def setOnRippleEndedUndefined: Self = StObject.set(x, "onRippleEnded", js.undefined)
      
      inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setTheme(value: RippleTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait RippleTheme extends StObject {
    
    /**
      * Root classname for the ripple.
      */
    var ripple: js.UndefOr[String] = js.undefined
    
    /**
      * Applied when the ripple is active.
      */
    var rippleActive: js.UndefOr[String] = js.undefined
    
    /**
      * Applied when the ripple is restarting.
      */
    var rippleRestarting: js.UndefOr[String] = js.undefined
    
    /**
      * Wrapper class to fit to the parent element.
      */
    var rippleWrapper: js.UndefOr[String] = js.undefined
  }
  object RippleTheme {
    
    inline def apply(): RippleTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RippleTheme]
    }
    
    extension [Self <: RippleTheme](x: Self) {
      
      inline def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleActive(value: String): Self = StObject.set(x, "rippleActive", value.asInstanceOf[js.Any])
      
      inline def setRippleActiveUndefined: Self = StObject.set(x, "rippleActive", js.undefined)
      
      inline def setRippleRestarting(value: String): Self = StObject.set(x, "rippleRestarting", value.asInstanceOf[js.Any])
      
      inline def setRippleRestartingUndefined: Self = StObject.set(x, "rippleRestarting", js.undefined)
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setRippleWrapper(value: String): Self = StObject.set(x, "rippleWrapper", value.asInstanceOf[js.Any])
      
      inline def setRippleWrapperUndefined: Self = StObject.set(x, "rippleWrapper", js.undefined)
    }
  }
  
  type RippledComponentFactory = js.Function1[
    /* component */ (ComponentClassP[Any & js.Object]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    (ComponentClassP[Any & js.Object]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any)
  ]
}
