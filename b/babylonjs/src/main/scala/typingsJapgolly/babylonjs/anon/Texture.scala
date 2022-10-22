package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.BaseTexture
import typingsJapgolly.babylonjs.BABYLON.Color4
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  var color: Color4
  
  var texture: Nullable[BaseTexture]
}
object Texture {
  
  inline def apply(color: Color4): Texture = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], texture = null)
    __obj.asInstanceOf[Texture]
  }
  
  extension [Self <: Texture](x: Self) {
    
    inline def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Nullable[BaseTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
