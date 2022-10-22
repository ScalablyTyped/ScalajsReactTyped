package typingsJapgolly.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Calendar> */
trait CalendarOptions extends StObject {
  
  var account: js.UndefOr[Account] = js.undefined
  
  var components: js.UndefOr[js.Array[String]] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Any]] = js.undefined
  
  var ctag: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var objects: js.UndefOr[js.Array[CalendarObject]] = js.undefined
  
  var reports: js.UndefOr[js.Array[String]] = js.undefined
  
  var resourcetype: js.UndefOr[String] = js.undefined
  
  var syncToken: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object CalendarOptions {
  
  inline def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  
  extension [Self <: CalendarOptions](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setConstructor(value: /* options */ js.UndefOr[CalendarOptions] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCtag(value: String): Self = StObject.set(x, "ctag", value.asInstanceOf[js.Any])
    
    inline def setCtagUndefined: Self = StObject.set(x, "ctag", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setObjects(value: js.Array[CalendarObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setObjectsVarargs(value: CalendarObject*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setReports(value: js.Array[String]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: String*): Self = StObject.set(x, "reports", js.Array(value*))
    
    inline def setResourcetype(value: String): Self = StObject.set(x, "resourcetype", value.asInstanceOf[js.Any])
    
    inline def setResourcetypeUndefined: Self = StObject.set(x, "resourcetype", js.undefined)
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
