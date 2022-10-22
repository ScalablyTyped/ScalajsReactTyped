package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxProps
  extends StObject
     with CommonWidgetProps {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultRefinement: js.UndefOr[String] = js.undefined
  
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputId: js.UndefOr[String] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  var loadingIndicator: js.UndefOr[Element] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Any]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLInputElement], Any]] = js.undefined
  
  var onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], Any]] = js.undefined
  
  var onSubmit: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], Any]] = js.undefined
  
  var reset: js.UndefOr[Element] = js.undefined
  
  var searchAsYouType: js.UndefOr[Boolean] = js.undefined
  
  var showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  
  var submit: js.UndefOr[Element] = js.undefined
}
object SearchBoxProps {
  
  inline def apply(): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxProps]
  }
  
  extension [Self <: SearchBoxProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    inline def setFocusShortcuts(value: js.Array[String]): Self = StObject.set(x, "focusShortcuts", value.asInstanceOf[js.Any])
    
    inline def setFocusShortcutsUndefined: Self = StObject.set(x, "focusShortcuts", js.undefined)
    
    inline def setFocusShortcutsVarargs(value: String*): Self = StObject.set(x, "focusShortcuts", js.Array(value*))
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setLoadingIndicator(value: VdomElement): Self = StObject.set(x, "loadingIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setOnChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnReset(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnSubmit(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setReset(value: VdomElement): Self = StObject.set(x, "reset", value.rawElement.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSearchAsYouType(value: Boolean): Self = StObject.set(x, "searchAsYouType", value.asInstanceOf[js.Any])
    
    inline def setSearchAsYouTypeUndefined: Self = StObject.set(x, "searchAsYouType", js.undefined)
    
    inline def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
    
    inline def setSubmit(value: VdomElement): Self = StObject.set(x, "submit", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
