package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.typedocStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var name: json
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(name = "json")
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setName(value: json): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
