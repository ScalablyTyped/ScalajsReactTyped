package typingsJapgolly.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritanceOptions extends StObject {
  
  var only: js.UndefOr[Boolean] = js.undefined
}
object InheritanceOptions {
  
  inline def apply(): InheritanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritanceOptions]
  }
  
  extension [Self <: InheritanceOptions](x: Self) {
    
    inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
  }
}
