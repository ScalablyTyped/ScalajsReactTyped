package typingsJapgolly.antvG2plot.anon

import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var fields: js.Array[String]
  
  def formatter(datum: Datum): Value
  
  def showContent(items: Any): Boolean
  
  var showMarkers: Boolean
  
  var showTitle: Boolean
}
object Fields {
  
  inline def apply(
    fields: js.Array[String],
    formatter: Datum => Value,
    showContent: Any => Boolean,
    showMarkers: Boolean,
    showTitle: Boolean
  ): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], formatter = js.Any.fromFunction1(formatter), showContent = js.Any.fromFunction1(showContent), showMarkers = showMarkers.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFormatter(value: Datum => Value): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setShowContent(value: Any => Boolean): Self = StObject.set(x, "showContent", js.Any.fromFunction1(value))
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
  }
}
