package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcObjectsLineMod.Line
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLineSegmentsMod {
  
  @JSImport("three/src/objects/LineSegments", "LinePieces")
  @js.native
  val LinePieces: Double = js.native
  
  @JSImport("three/src/objects/LineSegments", "LineSegments")
  @js.native
  open class LineSegments[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Line[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    val isLineSegments: `true` = js.native
    
    /**
      * @default 'LineSegments'
      */
    @JSName("type")
    var type_LineSegments: typingsJapgolly.three.threeStrings.LineSegments | String = js.native
  }
  
  @JSImport("three/src/objects/LineSegments", "LineStrip")
  @js.native
  val LineStrip: Double = js.native
}
