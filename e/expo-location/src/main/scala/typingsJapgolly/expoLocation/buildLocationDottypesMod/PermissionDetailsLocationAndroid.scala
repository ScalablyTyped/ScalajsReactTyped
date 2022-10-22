package typingsJapgolly.expoLocation.buildLocationDottypesMod

import typingsJapgolly.expoLocation.expoLocationStrings.coarse
import typingsJapgolly.expoLocation.expoLocationStrings.fine
import typingsJapgolly.expoLocation.expoLocationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDetailsLocationAndroid extends StObject {
  
  /**
    * Indicates the type of location provider.
    */
  var accuracy: fine | coarse | none
  
  /**
    * @deprecated Use `accuracy` field instead.
    */
  var scope: fine | coarse | none
}
object PermissionDetailsLocationAndroid {
  
  inline def apply(accuracy: fine | coarse | none, scope: fine | coarse | none): PermissionDetailsLocationAndroid = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationAndroid]
  }
  
  extension [Self <: PermissionDetailsLocationAndroid](x: Self) {
    
    inline def setAccuracy(value: fine | coarse | none): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setScope(value: fine | coarse | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
