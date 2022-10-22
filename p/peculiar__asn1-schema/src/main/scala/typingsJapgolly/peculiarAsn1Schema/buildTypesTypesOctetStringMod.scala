package typingsJapgolly.peculiarAsn1Schema

import typingsJapgolly.asn1js.mod.AsnType
import typingsJapgolly.asn1js.mod.BaseBlock
import typingsJapgolly.asn1js.mod.ValueBlock
import typingsJapgolly.asn1js.mod.ValueBlockJson
import typingsJapgolly.peculiarAsn1Schema.buildTypesTypesMod.IAsnConvertible
import typingsJapgolly.pvtsutils.mod.BufferSource
import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesOctetStringMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/types/octet_string", "OctetString")
  @js.native
  open class OctetString ()
    extends StObject
       with IAsnConvertible[AsnType]
       with ArrayBufferView {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
    
    /**
      * The ArrayBuffer instance referenced by the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var buffer: ArrayBufferLike = js.native
    @JSName("buffer")
    var buffer_OctetString: js.typedarray.ArrayBuffer = js.native
    
    /**
      * The length in bytes of the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var byteLength: Double = js.native
    @JSName("byteLength")
    def byteLength_MOctetString: Double = js.native
    
    /**
      * The offset in bytes of the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var byteOffset: Double = js.native
    @JSName("byteOffset")
    def byteOffset_MOctetString: Double = js.native
    
    /* CompleteClass */
    override def fromASN(asn: AsnType): this.type = js.native
    def fromASN(asn: typingsJapgolly.asn1js.mod.OctetString): this.type = js.native
    
    /* CompleteClass */
    override def toASN(): AsnType = js.native
    
    /* CompleteClass */
    override def toSchema(name: String): BaseBlock[ValueBlock, ValueBlockJson] = js.native
  }
}
