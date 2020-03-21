package typingsJapgolly.ndnJs.mod

import typingsJapgolly.ndnJs.nameMod.Name.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typingsJapgolly.ndnJs.nameMod.Name {
  def this(components: js.Array[Component | scala.scalajs.js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typingsJapgolly.ndnJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  @js.native
  class Component ()
    extends typingsJapgolly.ndnJs.nameMod.Name.Component {
    def this(component: typingsJapgolly.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typingsJapgolly.ndnJs.blobMod.Blob) = this()
    def this(value: scala.scalajs.js.typedarray.ArrayBuffer) = this()
    def this(value: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(value: String, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: typingsJapgolly.ndnJs.blobMod.Blob, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(
      value: scala.scalajs.js.typedarray.ArrayBuffer,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType
    ) = this()
    def this(value: scala.scalajs.js.typedarray.Uint8Array, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(
      value: js.Array[Double],
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: typingsJapgolly.ndnJs.blobMod.Blob,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.ArrayBuffer,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.Uint8Array,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  
  def fromEscapedString(uri: String): typingsJapgolly.ndnJs.nameMod.Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typingsJapgolly.ndnJs.blobMod.Blob): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromParametersSha256Digest(digest: typingsJapgolly.ndnJs.blobMod.Blob): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromSegment(segment: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromTimestamp(timestamp: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
    def fromVersion(version: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = js.native
  }
  
}

