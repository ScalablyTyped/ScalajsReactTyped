package typingsJapgolly.ethersprojectHash

import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataField
import typingsJapgolly.ethersprojectBytes.mod.Bytes
import typingsJapgolly.ethersprojectHash.anon.Domain
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/hash", "_TypedDataEncoder")
  @js.native
  open class TypedDataEncoder protected ()
    extends typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def from(types: Record[String, js.Array[TypedDataField]]): typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(types.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder]
    
    inline def getPayload(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryType")(types.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hash(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def hashDomain(domain: TypedDataDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolveNames(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any],
      resolveName: js.Function1[/* name */ String, js.Promise[String]]
    ): js.Promise[Domain] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNames")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolveName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Domain]]
  }
  
  inline def dnsEncode(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsEncode")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensNormalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashMessage(message: Bytes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def id(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@ethersproject/hash", "messagePrefix")
  @js.native
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
  
  inline def namehash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namehash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
