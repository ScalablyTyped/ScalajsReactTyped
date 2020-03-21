package typingsJapgolly.three

import typingsJapgolly.three.webGLStateMod.WebGLColorBuffer
import typingsJapgolly.three.webGLStateMod.WebGLDepthBuffer
import typingsJapgolly.three.webGLStateMod.WebGLStencilBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStencil extends js.Object {
  var color: WebGLColorBuffer
  var depth: WebGLDepthBuffer
  var stencil: WebGLStencilBuffer
}

object AnonStencil {
  @scala.inline
  def apply(color: WebGLColorBuffer, depth: WebGLDepthBuffer, stencil: WebGLStencilBuffer): AnonStencil = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStencil]
  }
}

