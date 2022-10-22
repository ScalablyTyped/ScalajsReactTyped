package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceState extends StObject {
  
  /**
    * The status code for the instance.
    */
  var code: js.UndefOr[integer] = js.undefined
  
  /**
    * The state of the instance (e.g., running or pending).
    */
  var name: js.UndefOr[String] = js.undefined
}
object InstanceState {
  
  inline def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  
  extension [Self <: InstanceState](x: Self) {
    
    inline def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
