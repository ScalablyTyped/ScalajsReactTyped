package typingsJapgolly.three

import typingsJapgolly.std.BufferSource
import typingsJapgolly.three.srcTexturesData3DTextureMod.Data3DTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDataTexture3DMod {
  
  @JSImport("three/src/textures/DataTexture3D", "DataTexture3D")
  @js.native
  open class DataTexture3D protected () extends Data3DTexture {
    def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()
  }
}
