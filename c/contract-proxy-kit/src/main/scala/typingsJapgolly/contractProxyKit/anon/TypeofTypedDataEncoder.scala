package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.utils.TypedDataEncoder
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataField
import typingsJapgolly.ethersprojectHash.anon.Domain
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTypedDataEncoder
  extends StObject
     with Instantiable1[/* types */ Record[String, js.Array[TypedDataField]], TypedDataEncoder] {
  
  def encode(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): String = js.native
  
  def from(types: Record[String, js.Array[TypedDataField]]): typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder = js.native
  
  def getPayload(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): Any = js.native
  
  def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
  
  def hash(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): String = js.native
  
  def hashDomain(domain: TypedDataDomain): String = js.native
  
  def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, Any]): String = js.native
  
  def resolveNames(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    resolveName: js.Function1[/* name */ String, js.Promise[String]]
  ): js.Promise[Domain] = js.native
}
