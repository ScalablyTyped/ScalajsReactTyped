package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedInstanceVersion extends StObject {
  
  /** [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }. */
  var instanceTemplate: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Name of the version. */
  var name: js.UndefOr[String] = js.undefined
}
object ManagedInstanceVersion {
  
  inline def apply(): ManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceVersion]
  }
  
  extension [Self <: ManagedInstanceVersion](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
