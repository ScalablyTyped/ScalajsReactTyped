package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Searchable extends StObject {
  
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object Searchable {
  
  inline def apply(): Searchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchable]
  }
  
  extension [Self <: Searchable](x: Self) {
    
    inline def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setOnChangeText(value: /* text */ String => Callback): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnSearchCloseRequested(value: Callback): Self = StObject.set(x, "onSearchCloseRequested", value.toJsFn)
    
    inline def setOnSearchCloseRequestedUndefined: Self = StObject.set(x, "onSearchCloseRequested", js.undefined)
    
    inline def setOnSearchClosed(value: Callback): Self = StObject.set(x, "onSearchClosed", value.toJsFn)
    
    inline def setOnSearchClosedUndefined: Self = StObject.set(x, "onSearchClosed", js.undefined)
    
    inline def setOnSearchPressed(value: Callback): Self = StObject.set(x, "onSearchPressed", value.toJsFn)
    
    inline def setOnSearchPressedUndefined: Self = StObject.set(x, "onSearchPressed", js.undefined)
    
    inline def setOnSubmitEditing(value: Callback): Self = StObject.set(x, "onSubmitEditing", value.toJsFn)
    
    inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
