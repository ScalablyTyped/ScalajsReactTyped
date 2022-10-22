package typingsJapgolly.peculiarAsn1Schema

import typingsJapgolly.asn1js.mod.AsnType
import typingsJapgolly.asn1js.mod.BaseBlock
import typingsJapgolly.asn1js.mod.ValueBlock
import typingsJapgolly.asn1js.mod.ValueBlockJson
import typingsJapgolly.peculiarAsn1Schema.buildTypesTypesMod.IAsnConvertible
import typingsJapgolly.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesBitStringMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/types/bit_string", "BitString")
  @js.native
  open class BitString[T /* <: Double */] ()
    extends StObject
       with IAsnConvertible[AsnType] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
    
    /* CompleteClass */
    override def fromASN(asn: AsnType): this.type = js.native
    def fromASN(asn: typingsJapgolly.asn1js.mod.BitString): this.type = js.native
    
    def fromNumber(value: T): Unit = js.native
    
    /* CompleteClass */
    override def toASN(): AsnType = js.native
    
    def toNumber(): T = js.native
    
    /* CompleteClass */
    override def toSchema(name: String): BaseBlock[ValueBlock, ValueBlockJson] = js.native
    
    var unusedBits: Double = js.native
    
    var value: js.typedarray.ArrayBuffer = js.native
  }
}
