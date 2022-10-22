package typingsJapgolly.summernote.mod.global.Summernote

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.summernote.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummernoteCallbacks extends StObject {
  
  var onBeforeCommand: js.UndefOr[js.Function1[/* contents */ String, Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onBlurCodeview: js.UndefOr[js.Function2[/* code */ String, /* ev */ Event, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function2[/* contents */ String, /* $editable */ JQuery, Unit]] = js.undefined
  
  var onChangeCodeview: js.UndefOr[js.Function2[/* code */ String, /* $editor */ JQuery, Unit]] = js.undefined
  
  var onDialogShown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEnter: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onImageLinkInsert: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  
  var onImageUpload: js.UndefOr[js.Function1[/* files */ js.Array[Blob], Unit]] = js.undefined
  
  var onImageUploadError: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onKeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  
  var onKeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  var onMouseUp: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
}
object SummernoteCallbacks {
  
  inline def apply(): SummernoteCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummernoteCallbacks]
  }
  
  extension [Self <: SummernoteCallbacks](x: Self) {
    
    inline def setOnBeforeCommand(value: /* contents */ String => Callback): Self = StObject.set(x, "onBeforeCommand", js.Any.fromFunction1((t0: /* contents */ String) => value(t0).runNow()))
    
    inline def setOnBeforeCommandUndefined: Self = StObject.set(x, "onBeforeCommand", js.undefined)
    
    inline def setOnBlur(value: /* ev */ Event => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* ev */ Event) => value(t0).runNow()))
    
    inline def setOnBlurCodeview(value: (/* code */ String, /* ev */ Event) => Callback): Self = StObject.set(x, "onBlurCodeview", js.Any.fromFunction2((t0: /* code */ String, t1: /* ev */ Event) => (value(t0, t1)).runNow()))
    
    inline def setOnBlurCodeviewUndefined: Self = StObject.set(x, "onBlurCodeview", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (/* contents */ String, /* $editable */ JQuery) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* contents */ String, t1: /* $editable */ JQuery) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeCodeview(value: (/* code */ String, /* $editor */ JQuery) => Callback): Self = StObject.set(x, "onChangeCodeview", js.Any.fromFunction2((t0: /* code */ String, t1: /* $editor */ JQuery) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeCodeviewUndefined: Self = StObject.set(x, "onChangeCodeview", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDialogShown(value: Callback): Self = StObject.set(x, "onDialogShown", value.toJsFn)
    
    inline def setOnDialogShownUndefined: Self = StObject.set(x, "onDialogShown", js.undefined)
    
    inline def setOnEnter(value: /* ev */ Event => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* ev */ Event) => value(t0).runNow()))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnFocus(value: /* ev */ Event => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* ev */ Event) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnImageLinkInsert(value: /* url */ String => Callback): Self = StObject.set(x, "onImageLinkInsert", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
    
    inline def setOnImageLinkInsertUndefined: Self = StObject.set(x, "onImageLinkInsert", js.undefined)
    
    inline def setOnImageUpload(value: /* files */ js.Array[Blob] => Callback): Self = StObject.set(x, "onImageUpload", js.Any.fromFunction1((t0: /* files */ js.Array[Blob]) => value(t0).runNow()))
    
    inline def setOnImageUploadError(value: /* err */ Any => Callback): Self = StObject.set(x, "onImageUploadError", js.Any.fromFunction1((t0: /* err */ Any) => value(t0).runNow()))
    
    inline def setOnImageUploadErrorUndefined: Self = StObject.set(x, "onImageUploadError", js.undefined)
    
    inline def setOnImageUploadUndefined: Self = StObject.set(x, "onImageUpload", js.undefined)
    
    inline def setOnInit(value: Callback): Self = StObject.set(x, "onInit", value.toJsFn)
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnKeydown(value: /* ev */ KeyboardEvent => Callback): Self = StObject.set(x, "onKeydown", js.Any.fromFunction1((t0: /* ev */ KeyboardEvent) => value(t0).runNow()))
    
    inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    inline def setOnKeyup(value: /* ev */ KeyboardEvent => Callback): Self = StObject.set(x, "onKeyup", js.Any.fromFunction1((t0: /* ev */ KeyboardEvent) => value(t0).runNow()))
    
    inline def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
    
    inline def setOnMouseDown(value: /* ev */ MouseEvent => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: /* ev */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseUp(value: /* ev */ MouseEvent => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: /* ev */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: /* e */ Event => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnScroll(value: /* e */ Event => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
  }
}
