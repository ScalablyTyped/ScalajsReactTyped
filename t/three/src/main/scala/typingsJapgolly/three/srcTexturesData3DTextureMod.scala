package typingsJapgolly.three

import typingsJapgolly.std.BufferSource
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesData3DTextureMod {
  
  @JSImport("three/src/textures/Data3DTexture", "Data3DTexture")
  @js.native
  open class Data3DTexture protected () extends Texture {
    def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()
    
    val isData3DTexture: `true` = js.native
    
    /**
      * @default THREE.ClampToEdgeWrapping
      */
    var wrapR: Boolean = js.native
  }
}
