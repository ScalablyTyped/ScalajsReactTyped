package typingsJapgolly.protractor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecName extends StObject {
  
  var specName: js.UndefOr[String] = js.undefined
  
  var stackTrace: js.UndefOr[String] = js.undefined
}
object SpecName {
  
  inline def apply(): SpecName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecName]
  }
  
  extension [Self <: SpecName](x: Self) {
    
    inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
    
    inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
