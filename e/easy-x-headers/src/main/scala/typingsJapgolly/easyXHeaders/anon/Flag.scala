package typingsJapgolly.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flag extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
}
object Flag {
  
  inline def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  
  extension [Self <: Flag](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
