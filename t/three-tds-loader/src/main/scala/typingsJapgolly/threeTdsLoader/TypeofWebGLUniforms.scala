package typingsJapgolly.threeTdsLoader

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.three.mod.WebGLUniforms
import typingsJapgolly.three.webGLProgramMod.WebGLProgram
import typingsJapgolly.three.webGLTexturesMod.WebGLTextures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWebGLUniforms
  extends Instantiable2[/* gl */ js.Any, /* program */ WebGLProgram, WebGLUniforms] {
  def evalDynamic(seq: js.Any, values: js.Array[_], `object`: js.Any, camera: js.Any): js.Array[_] = js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def splitDynamic(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def upload(gl: js.Any, seq: js.Any, values: js.Array[_], textures: WebGLTextures): Unit = js.native
}

