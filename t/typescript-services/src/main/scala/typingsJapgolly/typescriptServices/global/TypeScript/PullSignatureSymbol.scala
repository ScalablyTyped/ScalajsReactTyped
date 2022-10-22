package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
open class PullSignatureSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol {
  def this(kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind) = this()
  def this(kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullSignatureSymbol {
  
  @JSGlobal("TypeScript.PullSignatureSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getSignatureTypeMemberName(
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureTypeMemberName")(candidateSignature.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  
  /* static member */
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Boolean
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Boolean,
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Unit,
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
  inline def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Unit,
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName]]
}
