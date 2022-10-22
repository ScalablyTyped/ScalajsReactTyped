package typingsJapgolly.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropOptions extends StObject {
  
  var cascade: js.UndefOr[Boolean] = js.undefined
}
object DropOptions {
  
  inline def apply(): DropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOptions]
  }
  
  extension [Self <: DropOptions](x: Self) {
    
    inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
  }
}
