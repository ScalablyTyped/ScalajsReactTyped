package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.component
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.directive
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.pipe
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasingHost
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.DiagnosticWithLocation
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "ComponentScopeKind")
  @js.native
  object ComponentScopeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind & Double
      ] = js.native
    
    /* 0 */ val NgModule: typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.NgModule & Double = js.native
    
    /* 1 */ val Standalone: typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.Standalone & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "CompoundComponentScopeReader")
  @js.native
  open class CompoundComponentScopeReader protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcComponentScopeMod.CompoundComponentScopeReader {
    def this(readers: js.Array[ComponentScopeReader]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "LocalModuleScopeRegistry")
  @js.native
  open class LocalModuleScopeRegistry protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcLocalMod.LocalModuleScopeRegistry {
    def this(
      localReader: MetadataReader,
      fullReader: MetadataReader,
      dependencyScopeReader: DtsModuleScopeResolver,
      refEmitter: ReferenceEmitter
    ) = this()
    def this(
      localReader: MetadataReader,
      fullReader: MetadataReader,
      dependencyScopeReader: DtsModuleScopeResolver,
      refEmitter: ReferenceEmitter,
      aliasingHost: AliasingHost
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "MetadataDtsModuleScopeResolver")
  @js.native
  open class MetadataDtsModuleScopeResolver protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcDependencyMod.MetadataDtsModuleScopeResolver {
    /**
      * @param dtsMetaReader a `MetadataReader` which can read metadata from `.d.ts` files.
      */
    def this(dtsMetaReader: MetadataReader) = this()
    def this(dtsMetaReader: MetadataReader, aliasingHost: AliasingHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "TypeCheckScopeRegistry")
  @js.native
  open class TypeCheckScopeRegistry protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcTypecheckMod.TypeCheckScopeRegistry {
    def this(scopeReader: ComponentScopeReader, metaReader: MetadataReader) = this()
  }
  
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclaration[DeclarationNode]],
    rawExpr: Null,
    kind: component | directive | pipe
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclaration[DeclarationNode]],
    rawExpr: Expression,
    kind: component | directive | pipe
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  inline def makeUnknownComponentImportDiagnostic(ref: Reference[ClassDeclaration[DeclarationNode]], rawExpr: Expression): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUnknownComponentImportDiagnostic")(ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
}
