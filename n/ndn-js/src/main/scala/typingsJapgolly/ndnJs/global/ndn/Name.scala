package typingsJapgolly.ndnJs.global.ndn

import typingsJapgolly.ndnJs.nameMod.Name.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.Name")
@js.native
open class Name ()
  extends typingsJapgolly.ndnJs.mod.Name {
  def this(components: js.Array[Component | js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typingsJapgolly.ndnJs.nameMod.Name) = this()
}
/* static members */
object Name {
  
  @JSGlobal("ndn.Name")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ndn.Name.Component")
  @js.native
  open class Component ()
    extends typingsJapgolly.ndnJs.mod.Name.Component {
    def this(component: typingsJapgolly.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: js.typedarray.ArrayBuffer) = this()
    def this(value: js.typedarray.Uint8Array) = this()
    def this(value: typingsJapgolly.ndnJs.blobMod.Blob) = this()
    def this(value: String, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.Uint8Array, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: Unit, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: typingsJapgolly.ndnJs.blobMod.Blob, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: Unit, otherTypeCode: Double) = this()
    def this(value: String, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: js.Array[Double],
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.ArrayBuffer,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: js.typedarray.Uint8Array, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.Uint8Array,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: Unit, `type`: Unit, otherTypeCode: Double) = this()
    def this(value: Unit, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: typingsJapgolly.ndnJs.blobMod.Blob, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: typingsJapgolly.ndnJs.blobMod.Blob,
      `type`: typingsJapgolly.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  object Component {
    
    @JSGlobal("ndn.Name.Component")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromImplicitSha256Digest(digest: typingsJapgolly.ndnJs.blobMod.Blob): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImplicitSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromNumber(number: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: Unit, otherTypeCode: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType): typingsJapgolly.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: typingsJapgolly.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromNumberWithMarker(number: Double, marker: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberWithMarker")(number.asInstanceOf[js.Any], marker.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromParametersSha256Digest(digest: typingsJapgolly.ndnJs.blobMod.Blob): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParametersSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSegment(segment: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSegmentOffset(segmentOffset: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegmentOffset")(segmentOffset.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSequenceNumber(sequenceNumber: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSequenceNumber")(sequenceNumber.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromTimestamp(timestamp: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTimestamp")(timestamp.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromVersion(version: Double): typingsJapgolly.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVersion")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name.Component]
  }
  
  inline def fromEscapedString(uri: String): typingsJapgolly.ndnJs.nameMod.Name = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEscapedString")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ndnJs.nameMod.Name]
}
