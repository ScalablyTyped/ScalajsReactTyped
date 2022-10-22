package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstituteDateTimeFormatOptions
  extends StObject
     with Object {
  
  /**
    * The date format options for the [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var intlOptions: DateTimeFormatOptions
  
  /**
    * The type of this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var `type`: date
}
object SubstituteDateTimeFormatOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    intlOptions: DateTimeFormatOptions,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SubstituteDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intlOptions = intlOptions.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[SubstituteDateTimeFormatOptions]
  }
  
  extension [Self <: SubstituteDateTimeFormatOptions](x: Self) {
    
    inline def setIntlOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "intlOptions", value.asInstanceOf[js.Any])
    
    inline def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
