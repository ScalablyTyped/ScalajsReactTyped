package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import typingsJapgolly.three.lineMod.Line
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineSegments", JSImport.Namespace)
@js.native
object lineSegmentsMod extends js.Object {
  @js.native
  class LineSegments () extends Line {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: BufferGeometry, material: Material, mode: Double) = this()
    def this(geometry: Geometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: Geometry, material: Material, mode: Double) = this()
    var isLineSegments: `true` = js.native
    @JSName("type")
    var type_LineSegments: typingsJapgolly.three.threeStrings.LineSegments = js.native
  }
  
  val LinePieces: Double = js.native
  val LineStrip: Double = js.native
}

