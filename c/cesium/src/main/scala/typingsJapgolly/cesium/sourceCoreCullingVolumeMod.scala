package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.BoundingSphere
import typingsJapgolly.cesium.mod.Cartesian4
import typingsJapgolly.cesium.mod.CullingVolume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCullingVolumeMod {
  
  @JSImport("cesium/Source/Core/CullingVolume", JSImport.Default)
  @js.native
  open class default () extends CullingVolume {
    def this(planes: js.Array[Cartesian4]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CullingVolume", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a culling volume from a bounding sphere. Creates six planes that create a box containing the sphere.
      * The planes are aligned to the x, y, and z axes in world coordinates.
      * @param boundingSphere - The bounding sphere used to create the culling volume.
      * @param [result] - The object onto which to store the result.
      * @returns The culling volume created from the bounding sphere.
      */
    inline def fromBoundingSphere(boundingSphere: BoundingSphere): CullingVolume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(boundingSphere.asInstanceOf[js.Any]).asInstanceOf[CullingVolume]
    inline def fromBoundingSphere(boundingSphere: BoundingSphere, result: CullingVolume): CullingVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(boundingSphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CullingVolume]
  }
}
