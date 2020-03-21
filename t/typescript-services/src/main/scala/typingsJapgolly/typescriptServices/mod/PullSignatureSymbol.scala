package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol {
  def this(kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind) = this()
  def this(kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.MemberName] = js.native
}

