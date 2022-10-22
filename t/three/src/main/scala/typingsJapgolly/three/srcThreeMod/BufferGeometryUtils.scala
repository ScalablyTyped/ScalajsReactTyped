package typingsJapgolly.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BufferGeometryUtils {
  
  @JSImport("three/src/Three", "BufferGeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTangents(geometry: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangents")(geometry.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def mergeBufferAttributes(attributes: js.Array[typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute]): typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute]
  
  inline def mergeBufferGeometries(geometries: js.Array[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry]): typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry]
}
