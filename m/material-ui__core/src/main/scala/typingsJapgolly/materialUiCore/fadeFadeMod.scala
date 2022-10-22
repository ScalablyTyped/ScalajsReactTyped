package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeFadeMod {
  
  @JSImport("@material-ui/core/Fade/Fade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FadeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent @material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, 'children'> */
  trait FadeProps extends StObject {
    
    var addEndListener: js.UndefOr[Any] = js.undefined
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A single child content element.
      */
    var children: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.undefined
    
    /**
      * Enable this prop if you encounter 'Function components cannot be given refs',
      * use `unstable_createStrictModeTheme`,
      * and can't forward the ref in the child component.
      */
    var disableStrictModeCompat: js.UndefOr[Boolean] = js.undefined
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component will transition in.
      */
    var in: js.UndefOr[Boolean] = js.undefined
    
    var mountOnEnter: js.UndefOr[Any] = js.undefined
    
    var onEnter: js.UndefOr[Any] = js.undefined
    
    var onEntered: js.UndefOr[Any] = js.undefined
    
    var onEntering: js.UndefOr[Any] = js.undefined
    
    var onExit: js.UndefOr[Any] = js.undefined
    
    var onExited: js.UndefOr[Any] = js.undefined
    
    var onExiting: js.UndefOr[Any] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The duration for the transition, in milliseconds.
      * You may specify a single timeout for all transitions, or individually with an object.
      */
    var timeout: js.UndefOr[Any] = js.undefined
    
    var unmountOnExit: js.UndefOr[Any] = js.undefined
  }
  object FadeProps {
    
    inline def apply(): FadeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeProps]
    }
    
    extension [Self <: FadeProps](x: Self) {
      
      inline def setAddEndListener(value: Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableStrictModeCompat(value: Boolean): Self = StObject.set(x, "disableStrictModeCompat", value.asInstanceOf[js.Any])
      
      inline def setDisableStrictModeCompatUndefined: Self = StObject.set(x, "disableStrictModeCompat", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setMountOnEnter(value: Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnEnter(value: Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUnmountOnExit(value: Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
