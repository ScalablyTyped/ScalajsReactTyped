package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.created
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.deleted
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var path: String
  
  var time: js.UndefOr[Double] = js.undefined
  
  var `type`: created | modified | deleted
}
object Time {
  
  inline def apply(path: String, `type`: created | modified | deleted): Time = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: created | modified | deleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
