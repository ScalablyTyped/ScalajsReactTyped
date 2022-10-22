package typingsJapgolly.reactNativePermissions

import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.limited
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptResultsMod {
  
  /* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
  object RESULTS {
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.BLOCKED")
    @js.native
    val BLOCKED: blocked = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.DENIED")
    @js.native
    val DENIED: denied = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.GRANTED")
    @js.native
    val GRANTED: granted = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.LIMITED")
    @js.native
    val LIMITED: limited = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.UNAVAILABLE")
    @js.native
    val UNAVAILABLE: unavailable = js.native
  }
  
  /* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
  trait ResultMap extends StObject {
    
    val BLOCKED: blocked
    
    val DENIED: denied
    
    val GRANTED: granted
    
    val LIMITED: limited
    
    val UNAVAILABLE: unavailable
  }
  object ResultMap {
    
    inline def apply(): ResultMap = {
      val __obj = js.Dynamic.literal(BLOCKED = "blocked", DENIED = "denied", GRANTED = "granted", LIMITED = "limited", UNAVAILABLE = "unavailable")
      __obj.asInstanceOf[ResultMap]
    }
    
    extension [Self <: ResultMap](x: Self) {
      
      inline def setBLOCKED(value: blocked): Self = StObject.set(x, "BLOCKED", value.asInstanceOf[js.Any])
      
      inline def setDENIED(value: denied): Self = StObject.set(x, "DENIED", value.asInstanceOf[js.Any])
      
      inline def setGRANTED(value: granted): Self = StObject.set(x, "GRANTED", value.asInstanceOf[js.Any])
      
      inline def setLIMITED(value: limited): Self = StObject.set(x, "LIMITED", value.asInstanceOf[js.Any])
      
      inline def setUNAVAILABLE(value: unavailable): Self = StObject.set(x, "UNAVAILABLE", value.asInstanceOf[js.Any])
    }
  }
}
