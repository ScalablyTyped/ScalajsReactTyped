package typingsJapgolly.reactMdStates

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStatesConfigMod {
  
  @JSImport("@react-md/states/types/StatesConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StatesConfig(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatesConfig")(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/states/types/StatesConfig", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  inline def useStatesConfigContext(): StatesConfigContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStatesConfigContext")().asInstanceOf[StatesConfigContextType]
  
  trait StatesConfigContextType extends StObject {
    
    /**
      * Boolean if the ripple component should not be triggered after a
      * "programmatic" ripple effect. This would be if  the `.click()` function is
      * called on an element through javascript or some other means.
      */
    var disableProgrammaticRipple: Boolean
    
    /**
      * Boolean if the ripple effect should be disabled for all child components
      * that use the Ripple states.
      */
    var disableRipple: Boolean
    
    /**
      * The class names to apply during the different stages for the ripple
      * animation.  You probably don't want to use this.
      */
    var rippleClassNames: CSSTransitionClassNames
    
    /**
      * The amount of time before a ripple finishes its animation. You probably
      * don't want to change this value unless you updated the duration in scss or
      * changed the different class names for the ripple animation.
      */
    var rippleTimeout: TransitionTimeout
  }
  object StatesConfigContextType {
    
    inline def apply(
      disableProgrammaticRipple: Boolean,
      disableRipple: Boolean,
      rippleClassNames: CSSTransitionClassNames,
      rippleTimeout: TransitionTimeout
    ): StatesConfigContextType = {
      val __obj = js.Dynamic.literal(disableProgrammaticRipple = disableProgrammaticRipple.asInstanceOf[js.Any], disableRipple = disableRipple.asInstanceOf[js.Any], rippleClassNames = rippleClassNames.asInstanceOf[js.Any], rippleTimeout = rippleTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatesConfigContextType]
    }
    
    extension [Self <: StatesConfigContextType](x: Self) {
      
      inline def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
  trait StatesConfigProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object StatesConfigProps {
    
    inline def apply(): StatesConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatesConfigProps]
    }
    
    extension [Self <: StatesConfigProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      inline def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      inline def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
}
