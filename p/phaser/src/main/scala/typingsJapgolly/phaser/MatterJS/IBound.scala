package typingsJapgolly.phaser.MatterJS

import typingsJapgolly.phaser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBound extends StObject {
  
  var max: X
  
  var min: X
}
object IBound {
  
  inline def apply(max: X, min: X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBound]
  }
  
  extension [Self <: IBound](x: Self) {
    
    inline def setMax(value: X): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: X): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
