package typingsJapgolly.forgeViewer.anon

import typingsJapgolly.forgeViewer.THREE.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSideWallUV extends StObject {
  
  def generateSideWallUV(
    geometry: typingsJapgolly.forgeViewer.THREE.Geometry,
    indexA: Double,
    indexB: Double,
    indexC: Double,
    indexD: Double
  ): js.Array[Vector2]
  
  def generateTopUV(
    geometry: typingsJapgolly.forgeViewer.THREE.Geometry,
    indexA: Double,
    indexB: Double,
    indexC: Double
  ): js.Array[Vector2]
}
object GenerateSideWallUV {
  
  inline def apply(
    generateSideWallUV: (typingsJapgolly.forgeViewer.THREE.Geometry, Double, Double, Double, Double) => js.Array[Vector2],
    generateTopUV: (typingsJapgolly.forgeViewer.THREE.Geometry, Double, Double, Double) => js.Array[Vector2]
  ): GenerateSideWallUV = {
    val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction5(generateSideWallUV), generateTopUV = js.Any.fromFunction4(generateTopUV))
    __obj.asInstanceOf[GenerateSideWallUV]
  }
  
  extension [Self <: GenerateSideWallUV](x: Self) {
    
    inline def setGenerateSideWallUV(
      value: (typingsJapgolly.forgeViewer.THREE.Geometry, Double, Double, Double, Double) => js.Array[Vector2]
    ): Self = StObject.set(x, "generateSideWallUV", js.Any.fromFunction5(value))
    
    inline def setGenerateTopUV(value: (typingsJapgolly.forgeViewer.THREE.Geometry, Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateTopUV", js.Any.fromFunction4(value))
  }
}
