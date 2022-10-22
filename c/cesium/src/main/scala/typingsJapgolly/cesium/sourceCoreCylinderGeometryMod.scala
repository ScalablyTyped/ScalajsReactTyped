package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.BottomRadius
import typingsJapgolly.cesium.mod.CylinderGeometry
import typingsJapgolly.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCylinderGeometryMod {
  
  @JSImport("cesium/Source/Core/CylinderGeometry", JSImport.Default)
  @js.native
  open class default protected () extends CylinderGeometry {
    def this(options: BottomRadius) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CylinderGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a cylinder, including its vertices, indices, and a bounding sphere.
      * @param cylinderGeometry - A description of the cylinder.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(cylinderGeometry: CylinderGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(cylinderGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: CylinderGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: CylinderGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/CylinderGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new CylinderGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CylinderGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderGeometry): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CylinderGeometry): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
  }
}
