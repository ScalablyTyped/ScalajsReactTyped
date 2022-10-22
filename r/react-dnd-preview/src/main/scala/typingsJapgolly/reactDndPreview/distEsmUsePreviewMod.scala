package typingsJapgolly.reactDndPreview

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDnd.distTypesMonitorsMod.DragLayerMonitor
import typingsJapgolly.reactDndPreview.reactDndPreviewBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmUsePreviewMod {
  
  @JSImport("react-dnd-preview/dist/esm/usePreview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactDndPreview.anon.Display
    - typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewStateFull[T, El]
  */
  trait usePreviewState[T, El /* <: Element */] extends StObject
  object usePreviewState {
    
    inline def Display(): typingsJapgolly.reactDndPreview.anon.Display = {
      val __obj = js.Dynamic.literal(display = false)
      __obj.asInstanceOf[typingsJapgolly.reactDndPreview.anon.Display]
    }
    
    inline def usePreviewStateFull[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: RefFn[El] | RefHandle[El], style: CSSProperties): typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewStateFull[T, El] = {
      val __obj = js.Dynamic.literal(display = true, item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewStateFull[T, El]]
    }
  }
  
  trait usePreviewStateContent[T, El /* <: Element */] extends StObject {
    
    var item: T
    
    var itemType: Identifier | Null
    
    var monitor: DragLayerMonitor[Any]
    
    var ref: RefFn[El] | RefHandle[El]
    
    var style: CSSProperties
  }
  object usePreviewStateContent {
    
    inline def apply[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: RefFn[El] | RefHandle[El], style: CSSProperties): usePreviewStateContent[T, El] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[usePreviewStateContent[T, El]]
    }
    
    extension [Self <: usePreviewStateContent[?, ?], T, El /* <: Element */](x: Self & (usePreviewStateContent[T, El])) {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemType(value: Identifier): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
      
      inline def setMonitor(value: DragLayerMonitor[Any]): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setRef(value: RefFn[El] | RefHandle[El]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: El | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: El | Null) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait usePreviewStateFull[T, El /* <: Element */]
    extends StObject
       with usePreviewStateContent[T, El]
       with usePreviewState[T, El] {
    
    var display: `true`
  }
  object usePreviewStateFull {
    
    inline def apply[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: RefFn[El] | RefHandle[El], style: CSSProperties): usePreviewStateFull[T, El] = {
      val __obj = js.Dynamic.literal(display = true, item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[usePreviewStateFull[T, El]]
    }
    
    extension [Self <: usePreviewStateFull[?, ?], T, El /* <: Element */](x: Self & (usePreviewStateFull[T, El])) {
      
      inline def setDisplay(value: `true`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
}
