package typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direct3DUsage extends js.Object

/** A Windows Runtime projection of the D3D11_USAGE enumeration. Identifies expected resource use during rendering. The usage directly reflects whether a resource is accessible by the CPU and/or the graphics processing unit (GPU). */
@JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DUsage")
@js.native
object Direct3DUsage extends js.Object {
  /** A resource that requires read and write access by the GPU. */
  @js.native
  sealed trait default extends Direct3DUsage
  
  /** A resource that is accessible by both the GPU (read only) and the CPU (write only). A dynamic resource is a good choice for a resource that will be updated by the CPU at least once per frame. */
  @js.native
  sealed trait dynamic extends Direct3DUsage
  
  /** A resource that can only be read by the GPU. It cannot be written by the GPU, and cannot be accessed at all by the CPU. This type of resource must be initialized when it is created, since it cannot be changed after creation. */
  @js.native
  sealed trait immutable extends Direct3DUsage
  
  /** A resource that supports data transfer (copy) from the GPU to the CPU. */
  @js.native
  sealed trait staging extends Direct3DUsage
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direct3DUsage with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object dynamic extends TopLevel[dynamic with Double]
  
  /* 1 */ @js.native
  object immutable extends TopLevel[immutable with Double]
  
  /* 3 */ @js.native
  object staging extends TopLevel[staging with Double]
  
}

