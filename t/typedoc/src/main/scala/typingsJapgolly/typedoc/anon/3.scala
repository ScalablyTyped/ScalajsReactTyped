package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.typedocStrings.logLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var name: logLevel
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(name = "logLevel")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setName(value: logLevel): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
