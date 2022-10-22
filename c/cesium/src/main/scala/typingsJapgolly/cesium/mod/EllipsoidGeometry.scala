package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.InnerRadii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGeometry")
@js.native
open class EllipsoidGeometry () extends StObject {
  def this(options: InnerRadii) = this()
}
/* static members */
object EllipsoidGeometry {
  
  @JSImport("cesium", "EllipsoidGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the geometric representation of an ellipsoid, including its vertices, indices, and a bounding sphere.
    * @param ellipsoidGeometry - A description of the ellipsoid.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(ellipsoidGeometry: EllipsoidGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipsoidGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: EllipsoidGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: EllipsoidGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "EllipsoidGeometry.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new EllipsoidGeometry instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): EllipsoidGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidGeometry): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipsoidGeometry): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
}
