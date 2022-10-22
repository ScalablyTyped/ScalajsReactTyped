package typingsJapgolly.reactMdDivider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseVerticalDividerHeightMod {
  
  @JSImport("@react-md/divider/types/useVerticalDividerHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVerticalDividerHeight[E /* <: HTMLElement */](hasRefStyleMaxHeight: VerticalDividerHookOptions[E]): VerticalDividerHeight[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useVerticalDividerHeight")(hasRefStyleMaxHeight.asInstanceOf[js.Any]).asInstanceOf[VerticalDividerHeight[E]]
  
  trait VerticalDividerHeight[E /* <: HTMLElement */] extends StObject {
    
    var ref: RefFn[E]
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object VerticalDividerHeight {
    
    inline def apply[E /* <: HTMLElement */](ref: E | Null => Callback): VerticalDividerHeight[E] = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: E | Null) => ref(t0).runNow()))
      __obj.asInstanceOf[VerticalDividerHeight[E]]
    }
    
    extension [Self <: VerticalDividerHeight[?], E /* <: HTMLElement */](x: Self & VerticalDividerHeight[E]) {
      
      inline def setRef(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait VerticalDividerHookOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The max height for the vertical divider. When this is `<= 0`, the hook will
      * be disabled.
      *
      * When the value is between 0 and 1, it will be used as a multiplier with the
      * parent element's height. When the value is greater than 1, it will be used
      * in `Math.min(parentElementHeight, maxHeight)`.
      */
    var maxHeight: Double
    
    /**
      * An optional ref to merge with the returned ref.
      */
    var ref: js.UndefOr[Ref[E]] = js.undefined
    
    /**
      * An optional style object to merge with the divider's height style.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object VerticalDividerHookOptions {
    
    inline def apply[E /* <: HTMLElement */](maxHeight: Double): VerticalDividerHookOptions[E] = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerticalDividerHookOptions[E]]
    }
    
    extension [Self <: VerticalDividerHookOptions[?], E /* <: HTMLElement */](x: Self & VerticalDividerHookOptions[E]) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
