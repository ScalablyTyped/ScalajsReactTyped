package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.typedocStrings.cname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var name: cname
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(name = "cname")
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setName(value: cname): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
