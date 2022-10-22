package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds stencil test settings.
  *
  * @property {number} func Sets stencil test function. See {@link GraphicsDevice#setStencilFunc}.
  * @property {number} ref Sets stencil test reference value. See
  * {@link GraphicsDevice#setStencilFunc}.
  * @property {number} fail Sets operation to perform if stencil test is failed. See
  * {@link GraphicsDevice#setStencilOperation}.
  * @property {number} zfail Sets operation to perform if depth test is failed. See
  * {@link GraphicsDevice#setStencilOperation}.
  * @property {number} zpass Sets operation to perform if both stencil and depth test are passed.
  * See {@link GraphicsDevice#setStencilOperation}.
  * @property {number} readMask Sets stencil test reading mask. See
  * {@link GraphicsDevice#setStencilFunc}.
  * @property {number} writeMask Sets stencil test writing mask. See
  * {@link GraphicsDevice#setStencilOperation}.
  */
@JSGlobal("pc.StencilParameters")
@js.native
open class StencilParameters protected ()
  extends typingsJapgolly.playcanvas.mod.StencilParameters {
  /**
    * Create a new StencilParameters instance.
    *
    * @param {object} options - Options object to configure the stencil parameters.
    */
  def this(options: js.Object) = this()
}
