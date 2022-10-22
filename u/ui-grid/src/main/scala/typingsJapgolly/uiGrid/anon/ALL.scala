package typingsJapgolly.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALL extends StObject {
  
  var ALL: String
  
  var COLUMN: String
  
  var EDIT: String
  
  var OPTIONS: String
  
  var ROW: String
}
object ALL {
  
  inline def apply(ALL: String, COLUMN: String, EDIT: String, OPTIONS: String, ROW: String): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], COLUMN = COLUMN.asInstanceOf[js.Any], EDIT = EDIT.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], ROW = ROW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  
  extension [Self <: ALL](x: Self) {
    
    inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
    
    inline def setCOLUMN(value: String): Self = StObject.set(x, "COLUMN", value.asInstanceOf[js.Any])
    
    inline def setEDIT(value: String): Self = StObject.set(x, "EDIT", value.asInstanceOf[js.Any])
    
    inline def setOPTIONS(value: String): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setROW(value: String): Self = StObject.set(x, "ROW", value.asInstanceOf[js.Any])
  }
}
