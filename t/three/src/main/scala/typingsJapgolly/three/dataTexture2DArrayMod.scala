package typingsJapgolly.three

import typingsJapgolly.three.polyfillsMod.TypedArray
import typingsJapgolly.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture2DArray", JSImport.Namespace)
@js.native
object dataTexture2DArrayMod extends js.Object {
  @js.native
  class DataTexture2DArray protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
  }
  
}

