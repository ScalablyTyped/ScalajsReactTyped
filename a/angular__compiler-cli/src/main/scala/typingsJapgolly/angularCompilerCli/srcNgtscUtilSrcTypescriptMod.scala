package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.ModuleResolutionHostPickC
import typingsJapgolly.angularCompilerCli.anon.NodenameNodeundefined
import typingsJapgolly.angularCompilerCli.anon.PickCompilerHostgetCurren
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.ResolvedModule
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscUtilSrcTypescriptMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/util/src/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRootDirs(host: PickCompilerHostgetCurren, options: CompilerOptions): js.Array[AbsoluteFsPath] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRootDirs")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[AbsoluteFsPath]]
  
  inline def getSourceFile(node: Node): SourceFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFile")(node.asInstanceOf[js.Any]).asInstanceOf[SourceFile]
  
  inline def getSourceFileOrNull(program: Program, fileName: AbsoluteFsPath): SourceFile | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrNull")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile | Null]
  
  inline def getTokenAtPosition(sf: SourceFile, pos: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(sf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def identifierOfNode(decl: NodenameNodeundefined): Identifier | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierOfNode")(decl.asInstanceOf[js.Any]).asInstanceOf[Identifier | Null]
  
  inline def isAssignment(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BinaryExpression */ Boolean]
  
  inline def isDeclaration(node: Node): /* is typescript.typescript.Declaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Declaration */ Boolean]
  
  inline def isDtsPath(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDtsPath")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExported(node: DeclarationNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExported")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFromDtsFile(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFromDtsFile")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNamedDeclaration(node: Node): /* is @angular/compiler-cli.anon.DeclarationnameIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.DeclarationnameIdentifier */ Boolean]
  
  inline def isNonDeclarationTsPath(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonDeclarationTsPath")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbolWithValueDeclaration(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.SymbolWithValueDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolWithValueDeclaration")().asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.SymbolWithValueDeclaration */ Boolean]
  inline def isSymbolWithValueDeclaration(symbol: Symbol): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.SymbolWithValueDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolWithValueDeclaration")(symbol.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.SymbolWithValueDeclaration */ Boolean]
  
  inline def isTypeDeclaration(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValueDeclaration(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodeDebugInfo(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeDebugInfo")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nodeNameForError(node: NodenameNodeundefined): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeNameForError")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveModuleName(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    compilerHost: ModuleResolutionHostPickC
  ): js.UndefOr[ResolvedModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], compilerHost.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResolvedModule]]
  inline def resolveModuleName(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    compilerHost: ModuleResolutionHostPickC,
    moduleResolutionCache: ModuleResolutionCache
  ): js.UndefOr[ResolvedModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], compilerHost.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResolvedModule]]
  
  inline def toUnredirectedSourceFile(sf: SourceFile): SourceFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnredirectedSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[SourceFile]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ M in keyof std.Required<T> ]: T[M]}
    }}}
    */
  type RequiredDelegations[T] = T
  
  type SubsetOfKeys[T, K /* <: /* keyof T */ String */] = K
  
  @js.native
  trait SymbolWithValueDeclaration
    extends StObject
       with Symbol {
    
    @JSName("declarations")
    var declarations_SymbolWithValueDeclaration: js.Array[Declaration] = js.native
    
    @JSName("valueDeclaration")
    var valueDeclaration_SymbolWithValueDeclaration: Declaration = js.native
  }
}
