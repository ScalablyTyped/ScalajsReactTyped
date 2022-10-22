package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CubeMapInfo extends StObject {
  
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[js.typedarray.ArrayBufferView]
  
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[js.typedarray.ArrayBufferView]
  
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: Double
  
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[js.typedarray.ArrayBufferView]
  
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: Boolean
  
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[js.typedarray.ArrayBufferView]
  
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[js.typedarray.ArrayBufferView]
  
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: Double
  
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: Double
  
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[js.typedarray.ArrayBufferView]
}
object CubeMapInfo {
  
  inline def apply(format: Double, gammaSpace: Boolean, size: Double, `type`: Double): CubeMapInfo = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], back = null, down = null, front = null, left = null, right = null, up = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
  
  extension [Self <: CubeMapInfo](x: Self) {
    
    inline def setBack(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackNull: Self = StObject.set(x, "back", null)
    
    inline def setDown(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownNull: Self = StObject.set(x, "down", null)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFront(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontNull: Self = StObject.set(x, "front", null)
    
    inline def setGammaSpace(value: Boolean): Self = StObject.set(x, "gammaSpace", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setRight(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpNull: Self = StObject.set(x, "up", null)
  }
}
