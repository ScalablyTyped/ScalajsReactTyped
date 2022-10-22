package typingsJapgolly.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportBinding extends StObject {
  
  var imported: String
  
  var isFromSetup: Boolean
  
  var isType: Boolean
  
  var isUsedInTemplate: Boolean
  
  var source: String
}
object ImportBinding {
  
  inline def apply(imported: String, isFromSetup: Boolean, isType: Boolean, isUsedInTemplate: Boolean, source: String): ImportBinding = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], isFromSetup = isFromSetup.asInstanceOf[js.Any], isType = isType.asInstanceOf[js.Any], isUsedInTemplate = isUsedInTemplate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportBinding]
  }
  
  extension [Self <: ImportBinding](x: Self) {
    
    inline def setImported(value: String): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setIsFromSetup(value: Boolean): Self = StObject.set(x, "isFromSetup", value.asInstanceOf[js.Any])
    
    inline def setIsType(value: Boolean): Self = StObject.set(x, "isType", value.asInstanceOf[js.Any])
    
    inline def setIsUsedInTemplate(value: Boolean): Self = StObject.set(x, "isUsedInTemplate", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
