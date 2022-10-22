package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpriteMap
  extends StObject
     with IDisposable {
  
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  var atlasJSON: ISpriteJSONAtlas
  
  /**
    * String name of the SpriteMap.
    */
  var name: String
  
  /**
    * The parameters to initialize the SpriteMap with.
    */
  var options: ISpriteMapOptions
  
  /**
    * Texture of the SpriteMap.
    */
  var spriteSheet: Texture
}
object ISpriteMap {
  
  inline def apply(
    atlasJSON: ISpriteJSONAtlas,
    dispose: Callback,
    name: String,
    options: ISpriteMapOptions,
    spriteSheet: Texture
  ): ISpriteMap = {
    val __obj = js.Dynamic.literal(atlasJSON = atlasJSON.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], spriteSheet = spriteSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteMap]
  }
  
  extension [Self <: ISpriteMap](x: Self) {
    
    inline def setAtlasJSON(value: ISpriteJSONAtlas): Self = StObject.set(x, "atlasJSON", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ISpriteMapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSpriteSheet(value: Texture): Self = StObject.set(x, "spriteSheet", value.asInstanceOf[js.Any])
  }
}
