package typingsJapgolly.nodeForge.mod

import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asn1 {
  
  @JSImport("node-forge", "asn1")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Class extends StObject
  @JSImport("node-forge", "asn1.Class")
  @js.native
  object Class extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Class & Double] = js.native
    
    @js.native
    sealed trait APPLICATION
      extends StObject
         with Class
    /* 0x40 */ val APPLICATION: typingsJapgolly.nodeForge.mod.asn1.Class.APPLICATION & Double = js.native
    
    @js.native
    sealed trait CONTEXT_SPECIFIC
      extends StObject
         with Class
    /* 0x80 */ val CONTEXT_SPECIFIC: typingsJapgolly.nodeForge.mod.asn1.Class.CONTEXT_SPECIFIC & Double = js.native
    
    @js.native
    sealed trait PRIVATE
      extends StObject
         with Class
    /* 0xc0 */ val PRIVATE: typingsJapgolly.nodeForge.mod.asn1.Class.PRIVATE & Double = js.native
    
    @js.native
    sealed trait UNIVERSAL
      extends StObject
         with Class
    /* 0x00 */ val UNIVERSAL: typingsJapgolly.nodeForge.mod.asn1.Class.UNIVERSAL & Double = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("node-forge", "asn1.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type & Double] = js.native
    
    @js.native
    sealed trait BITSTRING
      extends StObject
         with Type
    /* 3 */ val BITSTRING: typingsJapgolly.nodeForge.mod.asn1.Type.BITSTRING & Double = js.native
    
    @js.native
    sealed trait BMPSTRING
      extends StObject
         with Type
    /* 30 */ val BMPSTRING: typingsJapgolly.nodeForge.mod.asn1.Type.BMPSTRING & Double = js.native
    
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with Type
    /* 1 */ val BOOLEAN: typingsJapgolly.nodeForge.mod.asn1.Type.BOOLEAN & Double = js.native
    
    @js.native
    sealed trait EMBEDDED
      extends StObject
         with Type
    /* 11 */ val EMBEDDED: typingsJapgolly.nodeForge.mod.asn1.Type.EMBEDDED & Double = js.native
    
    @js.native
    sealed trait ENUMERATED
      extends StObject
         with Type
    /* 10 */ val ENUMERATED: typingsJapgolly.nodeForge.mod.asn1.Type.ENUMERATED & Double = js.native
    
    @js.native
    sealed trait EXTERNAL
      extends StObject
         with Type
    /* 8 */ val EXTERNAL: typingsJapgolly.nodeForge.mod.asn1.Type.EXTERNAL & Double = js.native
    
    @js.native
    sealed trait GENERALIZEDTIME
      extends StObject
         with Type
    /* 24 */ val GENERALIZEDTIME: typingsJapgolly.nodeForge.mod.asn1.Type.GENERALIZEDTIME & Double = js.native
    
    @js.native
    sealed trait IA5STRING
      extends StObject
         with Type
    /* 22 */ val IA5STRING: typingsJapgolly.nodeForge.mod.asn1.Type.IA5STRING & Double = js.native
    
    @js.native
    sealed trait INTEGER
      extends StObject
         with Type
    /* 2 */ val INTEGER: typingsJapgolly.nodeForge.mod.asn1.Type.INTEGER & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Type
    /* 0 */ val NONE: typingsJapgolly.nodeForge.mod.asn1.Type.NONE & Double = js.native
    
    @js.native
    sealed trait NULL
      extends StObject
         with Type
    /* 5 */ val NULL: typingsJapgolly.nodeForge.mod.asn1.Type.NULL & Double = js.native
    
    @js.native
    sealed trait OCTETSTRING
      extends StObject
         with Type
    /* 4 */ val OCTETSTRING: typingsJapgolly.nodeForge.mod.asn1.Type.OCTETSTRING & Double = js.native
    
    @js.native
    sealed trait ODESC
      extends StObject
         with Type
    /* 7 */ val ODESC: typingsJapgolly.nodeForge.mod.asn1.Type.ODESC & Double = js.native
    
    @js.native
    sealed trait OID
      extends StObject
         with Type
    /* 6 */ val OID: typingsJapgolly.nodeForge.mod.asn1.Type.OID & Double = js.native
    
    @js.native
    sealed trait PRINTABLESTRING
      extends StObject
         with Type
    /* 19 */ val PRINTABLESTRING: typingsJapgolly.nodeForge.mod.asn1.Type.PRINTABLESTRING & Double = js.native
    
    @js.native
    sealed trait REAL
      extends StObject
         with Type
    /* 9 */ val REAL: typingsJapgolly.nodeForge.mod.asn1.Type.REAL & Double = js.native
    
    @js.native
    sealed trait ROID
      extends StObject
         with Type
    /* 13 */ val ROID: typingsJapgolly.nodeForge.mod.asn1.Type.ROID & Double = js.native
    
    @js.native
    sealed trait SEQUENCE
      extends StObject
         with Type
    /* 16 */ val SEQUENCE: typingsJapgolly.nodeForge.mod.asn1.Type.SEQUENCE & Double = js.native
    
    @js.native
    sealed trait SET
      extends StObject
         with Type
    /* 17 */ val SET: typingsJapgolly.nodeForge.mod.asn1.Type.SET & Double = js.native
    
    @js.native
    sealed trait UTCTIME
      extends StObject
         with Type
    /* 23 */ val UTCTIME: typingsJapgolly.nodeForge.mod.asn1.Type.UTCTIME & Double = js.native
    
    @js.native
    sealed trait UTF8
      extends StObject
         with Type
    /* 12 */ val UTF8: typingsJapgolly.nodeForge.mod.asn1.Type.UTF8 & Double = js.native
  }
  
  inline def create(tagClass: Class, `type`: Type, constructed: Boolean, value: js.Array[Asn1]): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagClass.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], constructed.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  inline def create(tagClass: Class, `type`: Type, constructed: Boolean, value: Bytes): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagClass.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], constructed.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  
  inline def derToOid(der: ByteStringBuffer): OID = ^.asInstanceOf[js.Dynamic].applyDynamic("derToOid")(der.asInstanceOf[js.Any]).asInstanceOf[OID]
  
  inline def fromDer(bytes: Bytes): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDer")(bytes.asInstanceOf[js.Any]).asInstanceOf[Asn1]
  inline def fromDer(bytes: Bytes, strict: Boolean): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDer")(bytes.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  inline def fromDer(bytes: ByteBuffer): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDer")(bytes.asInstanceOf[js.Any]).asInstanceOf[Asn1]
  inline def fromDer(bytes: ByteBuffer, strict: Boolean): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDer")(bytes.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  
  inline def oidToDer(oid: OID): ByteStringBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("oidToDer")(oid.asInstanceOf[js.Any]).asInstanceOf[ByteStringBuffer]
  
  inline def toDer(obj: Asn1): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toDer")(obj.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  
  trait Asn1 extends StObject {
    
    var composed: Boolean
    
    var constructed: Boolean
    
    var tagClass: Class
    
    var `type`: Type
    
    var value: Bytes | js.Array[Asn1]
  }
  object Asn1 {
    
    inline def apply(
      composed: Boolean,
      constructed: Boolean,
      tagClass: Class,
      `type`: Type,
      value: Bytes | js.Array[Asn1]
    ): Asn1 = {
      val __obj = js.Dynamic.literal(composed = composed.asInstanceOf[js.Any], constructed = constructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asn1]
    }
    
    extension [Self <: Asn1](x: Self) {
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setConstructed(value: Boolean): Self = StObject.set(x, "constructed", value.asInstanceOf[js.Any])
      
      inline def setTagClass(value: Class): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Bytes | js.Array[Asn1]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Asn1*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
