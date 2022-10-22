package typingsJapgolly.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnoopId extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var snoopId: js.UndefOr[String] = js.undefined
  
  var spy: js.UndefOr[String] = js.undefined
  
  var whisper: js.UndefOr[String] = js.undefined
}
object SnoopId {
  
  inline def apply(app: String): SnoopId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnoopId]
  }
  
  extension [Self <: SnoopId](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    inline def setSnoopId(value: String): Self = StObject.set(x, "snoopId", value.asInstanceOf[js.Any])
    
    inline def setSnoopIdUndefined: Self = StObject.set(x, "snoopId", js.undefined)
    
    inline def setSpy(value: String): Self = StObject.set(x, "spy", value.asInstanceOf[js.Any])
    
    inline def setSpyUndefined: Self = StObject.set(x, "spy", js.undefined)
    
    inline def setWhisper(value: String): Self = StObject.set(x, "whisper", value.asInstanceOf[js.Any])
    
    inline def setWhisperUndefined: Self = StObject.set(x, "whisper", js.undefined)
  }
}
