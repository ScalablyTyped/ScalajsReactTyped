package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestType extends StObject
@JSImport("cesium", "RequestType")
@js.native
object RequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestType & Double] = js.native
  
  /**
    * Imagery request.
    */
  @js.native
  sealed trait IMAGERY
    extends StObject
       with RequestType
  /* 1 */ val IMAGERY: typingsJapgolly.cesium.mod.RequestType.IMAGERY & Double = js.native
  
  /**
    * Other request.
    */
  @js.native
  sealed trait OTHER
    extends StObject
       with RequestType
  /* 3 */ val OTHER: typingsJapgolly.cesium.mod.RequestType.OTHER & Double = js.native
  
  /**
    * Terrain request.
    */
  @js.native
  sealed trait TERRAIN
    extends StObject
       with RequestType
  /* 0 */ val TERRAIN: typingsJapgolly.cesium.mod.RequestType.TERRAIN & Double = js.native
  
  /**
    * 3D Tiles request.
    */
  @js.native
  sealed trait TILES3D
    extends StObject
       with RequestType
  /* 2 */ val TILES3D: typingsJapgolly.cesium.mod.RequestType.TILES3D & Double = js.native
}
