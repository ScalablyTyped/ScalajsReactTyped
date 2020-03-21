package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "geometry")
@js.native
object geometry extends js.Object {
  @js.native
  class LineString protected ()
    extends typingsJapgolly.cassandraDriver.geometryMod.geometry.LineString {
    def this(args: typingsJapgolly.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  
  @js.native
  class Point protected ()
    extends typingsJapgolly.cassandraDriver.geometryMod.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typingsJapgolly.cassandraDriver.geometryMod.geometry.Polygon {
    def this(args: typingsJapgolly.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  
  /* static members */
  @js.native
  object LineString extends js.Object {
    def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.geometryMod.geometry.LineString = js.native
    def fromString(textValue: String): typingsJapgolly.cassandraDriver.geometryMod.geometry.LineString = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.geometryMod.geometry.Point = js.native
    def fromString(textValue: String): typingsJapgolly.cassandraDriver.geometryMod.geometry.Point = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.geometryMod.geometry.Polygon = js.native
    def fromString(textValue: String): typingsJapgolly.cassandraDriver.geometryMod.geometry.Polygon = js.native
  }
  
}

