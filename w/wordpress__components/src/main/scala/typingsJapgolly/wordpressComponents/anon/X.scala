package typingsJapgolly.wordpressComponents.anon

import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bottom
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.left
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.right
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: left | right
  
  var y: top | bottom
}
object X {
  
  inline def apply(x: left | right, y: top | bottom): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: left | right): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: top | bottom): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
