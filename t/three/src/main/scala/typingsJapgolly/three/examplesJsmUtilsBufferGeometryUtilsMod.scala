package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.TrianglesDrawModes
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.BufferAttribute
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.InterleavedBufferAttribute
import typingsJapgolly.three.srcThreeMod.Line
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsBufferGeometryUtilsMod {
  
  @JSImport("three/examples/jsm/utils/BufferGeometryUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeMikkTSpaceTangents(geometry: BufferGeometry, MikkTSpace: Any): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMikkTSpaceTangents")(geometry.asInstanceOf[js.Any], MikkTSpace.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
  inline def computeMikkTSpaceTangents(geometry: BufferGeometry, MikkTSpace: Any, negateSign: Boolean): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMikkTSpaceTangents")(geometry.asInstanceOf[js.Any], MikkTSpace.asInstanceOf[js.Any], negateSign.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
  
  inline def computeMorphedAttributes(
    `object`: Line[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def computeMorphedAttributes(
    `object`: Mesh[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def computeMorphedAttributes(
    `object`: Points[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def deinterleaveAttribute(geometry: BufferGeometry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deinterleaveAttribute")(geometry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deinterleaveGeometry(geometry: BufferGeometry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deinterleaveGeometry")(geometry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def estimateBytesUsed(geometry: BufferGeometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateBytesUsed")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def interleaveAttributes(attributes: js.Array[BufferAttribute]): InterleavedBufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("interleaveAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[InterleavedBufferAttribute]
  
  inline def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
  
  inline def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  inline def mergeBufferGeometries(geometries: js.Array[BufferGeometry], useGroups: Boolean): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any], useGroups.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
  
  inline def mergeGroups(geometry: BufferGeometry): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGroups")(geometry.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  
  inline def mergeVertices(geometry: BufferGeometry): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  inline def mergeVertices(geometry: BufferGeometry, tolerance: Double): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeVertices")(geometry.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
  
  inline def toTrianglesDrawMode(geometry: BufferGeometry, drawMode: TrianglesDrawModes): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("toTrianglesDrawMode")(geometry.asInstanceOf[js.Any], drawMode.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
}
