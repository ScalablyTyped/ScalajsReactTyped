package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.mod._Selectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherit
  extends StObject
     with _Selectable[Any] {
  
  var inherit: Boolean
}
object Inherit {
  
  inline def apply(inherit: Boolean): Inherit = {
    val __obj = js.Dynamic.literal(inherit = inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherit]
  }
  
  extension [Self <: Inherit](x: Self) {
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
  }
}
