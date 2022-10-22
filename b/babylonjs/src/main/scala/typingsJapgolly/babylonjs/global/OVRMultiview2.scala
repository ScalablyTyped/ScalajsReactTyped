package typingsJapgolly.babylonjs.global

import org.scalajs.dom.WebGLRenderbuffer
import org.scalajs.dom.WebGLTexture
import typingsJapgolly.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("OVR_multiview2")
@js.native
open class OVRMultiview2 ()
  extends StObject
     with typingsJapgolly.babylonjs.OVRMultiview2 {
  
  /* CompleteClass */
  override val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Double = js.native
  
  /* CompleteClass */
  override val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Double = js.native
  
  /* CompleteClass */
  override val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: Double = js.native
  
  /* CompleteClass */
  override val MAX_VIEWS_OVR: Double = js.native
  
  /* CompleteClass */
  override def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: Double,
    baseViewIndex: Double,
    numViews: Double
  ): WebGLRenderbuffer = js.native
}
