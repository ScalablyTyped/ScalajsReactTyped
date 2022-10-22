package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClassificationType extends StObject
@JSImport("cesium", "ClassificationType")
@js.native
object ClassificationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassificationType & Double] = js.native
  
  /**
    * Both terrain and 3D Tiles will be classified.
    */
  @js.native
  sealed trait BOTH
    extends StObject
       with ClassificationType
  /* 2 */ val BOTH: typingsJapgolly.cesium.mod.ClassificationType.BOTH & Double = js.native
  
  /**
    * Only 3D Tiles will be classified.
    */
  @js.native
  sealed trait CESIUM_3D_TILE
    extends StObject
       with ClassificationType
  /* 1 */ val CESIUM_3D_TILE: typingsJapgolly.cesium.mod.ClassificationType.CESIUM_3D_TILE & Double = js.native
  
  /**
    * Only terrain will be classified.
    */
  @js.native
  sealed trait TERRAIN
    extends StObject
       with ClassificationType
  /* 0 */ val TERRAIN: typingsJapgolly.cesium.mod.ClassificationType.TERRAIN & Double = js.native
}
