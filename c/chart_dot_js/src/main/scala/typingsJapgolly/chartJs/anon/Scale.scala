package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.CoreScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]
}
object Scale {
  
  inline def apply(scale: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setScale(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
