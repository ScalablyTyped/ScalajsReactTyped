package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typingsJapgolly.typescriptServices.anon.AllSignatures
import typingsJapgolly.typescriptServices.anon.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @JSGlobal("TypeScript.PullHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("TypeScript.PullHelpers.OtherPullDeclsWalker")
  @js.native
  open class OtherPullDeclsWalker ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker {
    
    /* private */ /* CompleteClass */
    var currentlyWalkingOtherDecls: Any = js.native
    
    /* CompleteClass */
    override def walkOtherPullDecls(
      currentDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
      otherDecls: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl],
      callBack: js.Function1[/* otherDecl */ typingsJapgolly.typescriptServices.TypeScript.PullDecl, Unit]
    ): Unit = js.native
  }
  
  inline def diagnosticFromDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[Any]
  ): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[Any],
    additionalLocations: js.Array[typingsJapgolly.typescriptServices.TypeScript.Location]
  ): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], additionalLocations.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: Unit,
    additionalLocations: js.Array[typingsJapgolly.typescriptServices.TypeScript.Location]
  ): typingsJapgolly.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], additionalLocations.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]
  
  inline def getAccessorSymbol(
    getterOrSetter: typingsJapgolly.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ): typingsJapgolly.typescriptServices.TypeScript.PullAccessorSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessorSymbol")(getterOrSetter.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PullAccessorSymbol]
  
  inline def getGetterAndSetterFunction(
    funcDecl: typingsJapgolly.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = (^.asInstanceOf[js.Dynamic].applyDynamic("getGetterAndSetterFunction")(funcDecl.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any])).asInstanceOf[Getter]
  
  inline def getRootType(`type`: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol): typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootType")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]
  
  inline def getSignatureForFuncDecl(functionDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): AllSignatures = ^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureForFuncDecl")(functionDecl.asInstanceOf[js.Any]).asInstanceOf[AllSignatures]
  
  inline def isExportedSymbolInClodule(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportedSymbolInClodule")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameNumeric(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameNumeric")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbolDeclaredInScopeChain(
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolDeclaredInScopeChain")(symbol.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSymbolLocal(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolLocal")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveDeclaredSymbolToUseType(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeclaredSymbolToUseType")(symbol.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def symbolIsEnum(source: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolIsEnum")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def symbolIsModule(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolIsModule")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def typeSymbolsAreIdentical(
    a: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    b: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeSymbolsAreIdentical")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def walkPullTypeSymbolStructure(
    typeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPullTypeSymbolStructure")(typeSymbol.asInstanceOf[js.Any], walker.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
