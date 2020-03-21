package typingsJapgolly.glFbo

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glTexture2d.mod.GLenum
import typingsJapgolly.glTexture2d.mod.InputType
import typingsJapgolly.glTexture2d.mod.RawObject
import typingsJapgolly.glTexture2d.mod.Texture
import typingsJapgolly.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(gl: WebGLRenderingContext, array: ndarray[Double]): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double]): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum, `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum, `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum, `type`: GLenum): Texture = js.native
}

