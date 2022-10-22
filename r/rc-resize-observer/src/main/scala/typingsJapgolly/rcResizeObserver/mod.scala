package typingsJapgolly.rcResizeObserver

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcResizeObserver.esCollectionMod.CollectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(props: ResizeObserverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-resize-observer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Collection.Collection` */
    inline def Collection(hasChildrenOnBatchResize: CollectionProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collection")(hasChildrenOnBatchResize.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  }
  
  type OnResize = js.Function2[/* size */ SizeInfo, /* element */ HTMLElement, Unit]
  
  trait ResizeObserverProps extends StObject {
    
    var children: Node | (js.Function1[/* ref */ RefHandle[Any], Element])
    
    /** Pass to ResizeObserver.Collection with additional data */
    var data: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Trigger if element resized. Will always trigger when first time render. */
    var onResize: js.UndefOr[OnResize] = js.undefined
  }
  object ResizeObserverProps {
    
    inline def apply(): ResizeObserverProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ResizeObserverProps]
    }
    
    extension [Self <: ResizeObserverProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* ref */ RefHandle[Any], Element])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefHandle[Any] => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnResize(value: (/* size */ SizeInfo, /* element */ HTMLElement) => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction2((t0: /* size */ SizeInfo, t1: /* element */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    }
  }
  
  trait SizeInfo extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object SizeInfo {
    
    inline def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): SizeInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeInfo]
    }
    
    extension [Self <: SizeInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
