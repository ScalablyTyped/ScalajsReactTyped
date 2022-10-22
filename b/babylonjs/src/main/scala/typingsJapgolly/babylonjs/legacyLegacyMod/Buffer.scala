package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Buffer")
@js.native
open class Buffer protected ()
  extends typingsJapgolly.babylonjs.indexMod.Buffer {
  /**
    * Constructor
    * @param engine the engine
    * @param data the data to use for this buffer
    * @param updatable whether the data is updatable
    * @param stride the stride (optional)
    * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
    * @param instanced whether the buffer is instanced (optional)
    * @param useBytes set to true if the stride in in bytes (optional)
    * @param divisor sets an optional divisor for instances (1 by default)
    */
  def this(
    engine: Any,
    data: DataArray | typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer,
    updatable: Boolean,
    stride: js.UndefOr[Double],
    postponeInternalCreation: js.UndefOr[Boolean],
    instanced: js.UndefOr[Boolean],
    useBytes: js.UndefOr[Boolean],
    divisor: js.UndefOr[Double]
  ) = this()
}
