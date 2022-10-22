package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStyle extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var contentStyle: js.UndefOr[Any] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onInfiniteScroll: js.UndefOr[js.Function1[/* doneCallback */ js.Function0[Unit], Unit]] = js.undefined
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ContentStyle {
  
  inline def apply(): ContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentStyle]
  }
  
  extension [Self <: ContentStyle](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContentStyle(value: Any): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnInfiniteScroll(value: /* doneCallback */ js.Function0[Unit] => Callback): Self = StObject.set(x, "onInfiniteScroll", js.Any.fromFunction1((t0: /* doneCallback */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnInfiniteScrollUndefined: Self = StObject.set(x, "onInfiniteScroll", js.undefined)
    
    inline def setOnInit(value: Callback): Self = StObject.set(x, "onInit", value.toJsFn)
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setRenderBottomToolbar(value: Callback): Self = StObject.set(x, "renderBottomToolbar", value.toJsFn)
    
    inline def setRenderBottomToolbarUndefined: Self = StObject.set(x, "renderBottomToolbar", js.undefined)
    
    inline def setRenderFixed(value: Callback): Self = StObject.set(x, "renderFixed", value.toJsFn)
    
    inline def setRenderFixedUndefined: Self = StObject.set(x, "renderFixed", js.undefined)
    
    inline def setRenderModal(value: Callback): Self = StObject.set(x, "renderModal", value.toJsFn)
    
    inline def setRenderModalUndefined: Self = StObject.set(x, "renderModal", js.undefined)
    
    inline def setRenderToolbar(value: Callback): Self = StObject.set(x, "renderToolbar", value.toJsFn)
    
    inline def setRenderToolbarUndefined: Self = StObject.set(x, "renderToolbar", js.undefined)
  }
}
