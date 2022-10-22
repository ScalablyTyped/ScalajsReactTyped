package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Color4
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorsLines extends StObject {
  
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  
  var lines: js.Array[js.Array[Vector3]]
}
object ColorsLines {
  
  inline def apply(lines: js.Array[js.Array[Vector3]]): ColorsLines = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsLines]
  }
  
  extension [Self <: ColorsLines](x: Self) {
    
    inline def setColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNull: Self = StObject.set(x, "colors", null)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: js.Array[Color4]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setLines(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
