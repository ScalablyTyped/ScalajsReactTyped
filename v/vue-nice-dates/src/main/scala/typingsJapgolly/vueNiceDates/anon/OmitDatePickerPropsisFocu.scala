package typingsJapgolly.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueNiceDates.sharedMod.DateLocale
import typingsJapgolly.vueNiceDates.sharedMod.Modifiers
import typingsJapgolly.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<vue-nice-dates.vue-nice-dates/shared.DatePickerProps, 'isFocus'> */
trait OmitDatePickerPropsisFocu extends StObject {
  
  var date: String
  
  var enableGridSwitch: Boolean
  
  var format: String
  
  var initialDate: js.UndefOr[js.Date] = js.undefined
  
  var locale: DateLocale
  
  var maximumDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var minimumDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var modifiers: Modifiers
  
  var modifiersClassNames: ModifiersClassNames
  
  var validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
}
object OmitDatePickerPropsisFocu {
  
  inline def apply(
    date: String,
    enableGridSwitch: Boolean,
    format: String,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames,
    validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
  ): OmitDatePickerPropsisFocu = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDatePickerPropsisFocu]
  }
  
  extension [Self <: OmitDatePickerPropsisFocu](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    inline def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
    
    inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
    
    inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    inline def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
    
    inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
    
    inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
