package typingsJapgolly.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Layout3D")
@js.native
open class Layout3D protected ()
  extends typingsJapgolly.webcola.distSrcLayout3dMod.Layout3D {
  def this(
    nodes: js.Array[typingsJapgolly.webcola.distSrcLayout3dMod.Node3D],
    links: js.Array[typingsJapgolly.webcola.distSrcLayout3dMod.Link3D]
  ) = this()
  def this(
    nodes: js.Array[typingsJapgolly.webcola.distSrcLayout3dMod.Node3D],
    links: js.Array[typingsJapgolly.webcola.distSrcLayout3dMod.Link3D],
    idealLinkLength: Double
  ) = this()
}
/* static members */
object Layout3D {
  
  @JSImport("webcola", "Layout3D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Layout3D.dims")
  @js.native
  def dims: js.Array[String] = js.native
  inline def dims_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dims")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Layout3D.k")
  @js.native
  def k: Double = js.native
  inline def k_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("k")(x.asInstanceOf[js.Any])
}
