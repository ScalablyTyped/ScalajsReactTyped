package typingsJapgolly.babylonjs

import org.scalajs.dom.WebGLTexture
import typingsJapgolly.std.GLenum
import typingsJapgolly.std.GLint
import typingsJapgolly.std.GLsizei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCULUSMultiview
  extends StObject
     with OVRMultiview2 {
  
  def framebufferTextureMultisampleMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: GLint,
    samples: GLsizei,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
  def framebufferTextureMultisampleMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: Null,
    level: GLint,
    samples: GLsizei,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
}
