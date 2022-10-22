package typingsJapgolly.glFbo

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.glTexture2d.mod.GLenum
import typingsJapgolly.glTexture2d.mod.InputType
import typingsJapgolly.glTexture2d.mod.RawObject
import typingsJapgolly.glTexture2d.mod.Texture
import typingsJapgolly.ndarray.mod.Data
import typingsJapgolly.ndarray.mod.NdArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(gl: WebGLRenderingContext, array: NdArray[Data[Double]]): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double]): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: Unit, `type`: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum, `type`: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: InputType): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: InputType, format: Unit, `type`: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum, `type`: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: RawObject): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: RawObject, format: Unit, `type`: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum): Texture = js.native
    def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum, `type`: GLenum): Texture = js.native
  }
}
