package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdUtils.typesUseEnsuredRefMod.EnsuredRefs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingUseResizeObserverMod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  
  type OnResizeObserverChange[E /* <: HTMLElement */] = js.Function1[/* resizeData */ ResizeObserverElementData[E], Unit]
  
  trait ResizeObserverElementData[E /* <: HTMLElement */]
    extends StObject
       with ResizeObserverElementSize {
    
    /**
      * The element that changed due to the resize observer.
      */
    var element: E
  }
  object ResizeObserverElementData {
    
    inline def apply[E /* <: HTMLElement */](element: E, height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementData[E] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverElementData[E]]
    }
    
    extension [Self <: ResizeObserverElementData[?], E /* <: HTMLElement */](x: Self & ResizeObserverElementData[E]) {
      
      inline def setElement(value: E): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeObserverElementSize extends StObject {
    
    /**
      * The height for the element that was changed.
      */
    var height: Double
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollHeight: Double
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollWidth: Double
    
    /**
      * The width for the element that was changed.
      */
    var width: Double
  }
  object ResizeObserverElementSize {
    
    inline def apply(height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverElementSize]
    }
    
    extension [Self <: ResizeObserverElementSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseResizeObserverOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the `onResize` callback should not be triggered if only the
      * height has changed for the watched element.
      */
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the `onResize` callback should not be triggered if only the
      * width has changed for the watched element.
      */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional ref to merge with the returned ref handler function
      */
    var ref: js.UndefOr[Ref[E | Null]] = js.undefined
  }
  object UseResizeObserverOptions {
    
    inline def apply[E /* <: HTMLElement */](): UseResizeObserverOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseResizeObserverOptions[E]]
    }
    
    extension [Self <: UseResizeObserverOptions[?], E /* <: HTMLElement */](x: Self & UseResizeObserverOptions[E]) {
      
      inline def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      inline def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      inline def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      inline def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      inline def setRef(value: Ref[E | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: (E | Null) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (E | Null) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
