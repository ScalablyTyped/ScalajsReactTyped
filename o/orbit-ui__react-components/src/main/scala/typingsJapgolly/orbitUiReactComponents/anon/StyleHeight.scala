package typingsJapgolly.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleHeight extends StObject {
  
  var style: Height
}
object StyleHeight {
  
  inline def apply(style: Height): StyleHeight = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleHeight]
  }
  
  extension [Self <: StyleHeight](x: Self) {
    
    inline def setStyle(value: Height): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
