package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightmapEncoding extends StObject
@JSImport("cesium", "HeightmapEncoding")
@js.native
object HeightmapEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightmapEncoding & Double] = js.native
  
  /**
    * LERC encoding
    */
  @js.native
  sealed trait LERC
    extends StObject
       with HeightmapEncoding
  /* 1 */ val LERC: typingsJapgolly.cesium.mod.HeightmapEncoding.LERC & Double = js.native
  
  /**
    * No encoding
    */
  @js.native
  sealed trait NONE
    extends StObject
       with HeightmapEncoding
  /* 0 */ val NONE: typingsJapgolly.cesium.mod.HeightmapEncoding.NONE & Double = js.native
}
