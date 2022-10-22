package typingsJapgolly.peculiarAsn1Schema

import typingsJapgolly.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesIndexMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/types/index", "BitString")
  @js.native
  open class BitString[T /* <: Double */] ()
    extends typingsJapgolly.peculiarAsn1Schema.buildTypesTypesBitStringMod.BitString[T] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
  }
  
  @JSImport("@peculiar/asn1-schema/build/types/types/index", "OctetString")
  @js.native
  open class OctetString ()
    extends typingsJapgolly.peculiarAsn1Schema.buildTypesTypesOctetStringMod.OctetString {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
  }
}
