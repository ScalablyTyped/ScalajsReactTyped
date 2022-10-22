package typingsJapgolly.ethersprojectHash

import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataField
import typingsJapgolly.ethersprojectHash.anon.Domain
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypedDataMod {
  
  @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder")
  @js.native
  open class TypedDataEncoder protected () extends StObject {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
    
    val _encoderCache: Record[String, js.Function1[/* value */ Any, String]] = js.native
    
    def _getEncoder(`type`: String): js.Function1[/* value */ Any, String] = js.native
    
    val _types: Record[String, String] = js.native
    
    def _visit(`type`: String, value: Any, callback: js.Function2[/* type */ String, /* data */ Any, Any]): Any = js.native
    
    def encode(value: Record[String, Any]): String = js.native
    
    def encodeData(`type`: String, value: Any): String = js.native
    
    def encodeType(name: String): String = js.native
    
    def getEncoder(`type`: String): js.Function1[/* value */ Any, String] = js.native
    
    def hash(value: Record[String, Any]): String = js.native
    
    def hashStruct(name: String, value: Record[String, Any]): String = js.native
    
    val primaryType: String = js.native
    
    val types: Record[String, js.Array[TypedDataField]] = js.native
    
    def visit(value: Record[String, Any], callback: js.Function2[/* type */ String, /* data */ Any, Any]): Any = js.native
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def from(types: Record[String, js.Array[TypedDataField]]): TypedDataEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(types.asInstanceOf[js.Any]).asInstanceOf[TypedDataEncoder]
    
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
}
