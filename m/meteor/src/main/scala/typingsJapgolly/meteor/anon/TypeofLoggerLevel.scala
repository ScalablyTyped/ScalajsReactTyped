package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.debug
import typingsJapgolly.meteor.meteorStrings.error
import typingsJapgolly.meteor.meteorStrings.info
import typingsJapgolly.meteor.meteorStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLoggerLevel extends StObject {
  
  val DEBUG: typingsJapgolly.meteor.meteorStrings.debug
  
  val ERROR: typingsJapgolly.meteor.meteorStrings.error
  
  val INFO: typingsJapgolly.meteor.meteorStrings.info
  
  val WARN: typingsJapgolly.meteor.meteorStrings.warn
  
  val debug: typingsJapgolly.meteor.meteorStrings.debug
  
  val error: typingsJapgolly.meteor.meteorStrings.error
  
  val info: typingsJapgolly.meteor.meteorStrings.info
  
  val warn: typingsJapgolly.meteor.meteorStrings.warn
}
object TypeofLoggerLevel {
  
  inline def apply(): TypeofLoggerLevel = {
    val __obj = js.Dynamic.literal(DEBUG = "debug", ERROR = "error", INFO = "info", WARN = "warn", debug = "debug", error = "error", info = "info", warn = "warn")
    __obj.asInstanceOf[TypeofLoggerLevel]
  }
  
  extension [Self <: TypeofLoggerLevel](x: Self) {
    
    inline def setDEBUG(value: debug): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: info): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setWARN(value: warn): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
