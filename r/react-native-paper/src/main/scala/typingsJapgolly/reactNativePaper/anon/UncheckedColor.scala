package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.checked
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncheckedColor extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* param */ js.UndefOr[Any], Unit]] = js.undefined
  
  var status: js.UndefOr[checked | unchecked] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  var uncheckedColor: js.UndefOr[String] = js.undefined
  
  var value: String
}
object UncheckedColor {
  
  inline def apply(
    theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme,
    value: String
  ): UncheckedColor = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncheckedColor]
  }
  
  extension [Self <: UncheckedColor](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnPress(value: /* param */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* param */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStatus(value: checked | unchecked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
