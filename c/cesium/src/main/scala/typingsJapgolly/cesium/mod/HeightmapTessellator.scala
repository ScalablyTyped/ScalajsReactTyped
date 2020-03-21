package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.cesium.AnonHeightmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightmapTessellator extends js.Object

@JSImport("cesium", "HeightmapTessellator")
@js.native
object HeightmapTessellator extends js.Object {
  @js.native
  sealed trait DEFAULT_STRUCTURE extends HeightmapTessellator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightmapTessellator with Double] = js.native
  def computeVertices(options: AnonHeightmap): js.UndefOr[scala.Nothing] = js.native
  /* 0 */ @js.native
  object DEFAULT_STRUCTURE extends TopLevel[DEFAULT_STRUCTURE with Double]
  
}

