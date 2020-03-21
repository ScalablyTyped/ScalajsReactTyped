package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.AnonAllSignatures
import typingsJapgolly.typescriptServices.AnonGetter
import typingsJapgolly.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullHelpers")
@js.native
object PullHelpers extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typingsJapgolly.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  def diagnosticFromDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsJapgolly.typescriptServices.TypeScript.Location]
  ): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typingsJapgolly.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ): typingsJapgolly.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typingsJapgolly.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ): AnonGetter = js.native
  def getRootType(`type`: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol): typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): AnonAllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    b: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

