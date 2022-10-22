package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OVRMultiview2 extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: GLenum = js.native
  
  /* standard dom */
  val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: GLenum = js.native
  
  /* standard dom */
  val MAX_VIEWS_OVR: GLenum = js.native
  
  /* standard dom */
  def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: org.scalajs.dom.WebGLTexture,
    level: GLint,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
  def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: Null,
    level: GLint,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
}
