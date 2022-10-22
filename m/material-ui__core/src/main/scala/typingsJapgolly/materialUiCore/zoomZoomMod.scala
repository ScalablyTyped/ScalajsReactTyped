package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.materialUiCore.transitionsTransitionMod.TransitionProps
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod {
  
  @JSImport("@material-ui/core/Zoom/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ZoomProps
    extends StObject
       with TransitionProps {
    
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
    
    /**
      * If `true`, the component will transition in.
      */
    @JSName("in")
    var in_ZoomProps: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ZoomProps {
    
    inline def apply(): ZoomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomProps]
    }
    
    extension [Self <: ZoomProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableStrictModeCompat(value: Boolean): Self = StObject.set(x, "disableStrictModeCompat", value.asInstanceOf[js.Any])
      
      inline def setDisableStrictModeCompatUndefined: Self = StObject.set(x, "disableStrictModeCompat", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
