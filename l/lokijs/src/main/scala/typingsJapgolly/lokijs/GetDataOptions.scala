package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsStrings.`jquery-extend-deep`
import typingsJapgolly.lokijs.lokijsStrings.`parse-stringify`
import typingsJapgolly.lokijs.lokijsStrings.`shallow-assign`
import typingsJapgolly.lokijs.lokijsStrings.`shallow-recurse-objects`
import typingsJapgolly.lokijs.lokijsStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataOptions extends StObject {
  
  var forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  
  var forceClones: Boolean
  
  var removeMeta: Boolean
}
object GetDataOptions {
  
  inline def apply(forceClones: Boolean, removeMeta: Boolean): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones.asInstanceOf[js.Any], removeMeta = removeMeta.asInstanceOf[js.Any], forceCloneMethod = null)
    __obj.asInstanceOf[GetDataOptions]
  }
  
  extension [Self <: GetDataOptions](x: Self) {
    
    inline def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = StObject.set(x, "forceCloneMethod", value.asInstanceOf[js.Any])
    
    inline def setForceCloneMethodNull: Self = StObject.set(x, "forceCloneMethod", null)
    
    inline def setForceClones(value: Boolean): Self = StObject.set(x, "forceClones", value.asInstanceOf[js.Any])
    
    inline def setRemoveMeta(value: Boolean): Self = StObject.set(x, "removeMeta", value.asInstanceOf[js.Any])
  }
}
