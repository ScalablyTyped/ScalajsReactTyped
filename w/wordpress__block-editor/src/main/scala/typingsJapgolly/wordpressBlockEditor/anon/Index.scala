package typingsJapgolly.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: Double
  
  var rootClientId: js.UndefOr[String] = js.undefined
}
object Index {
  
  inline def apply(index: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRootClientId(value: String): Self = StObject.set(x, "rootClientId", value.asInstanceOf[js.Any])
    
    inline def setRootClientIdUndefined: Self = StObject.set(x, "rootClientId", js.undefined)
  }
}
