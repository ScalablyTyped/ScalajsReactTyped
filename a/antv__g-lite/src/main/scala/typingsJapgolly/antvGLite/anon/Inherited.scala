package typingsJapgolly.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherited extends StObject {
  
  var inherited: js.UndefOr[Boolean] = js.undefined
}
object Inherited {
  
  inline def apply(): Inherited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherited]
  }
  
  extension [Self <: Inherited](x: Self) {
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
  }
}
