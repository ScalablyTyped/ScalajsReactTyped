package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.component
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.directive
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.pipe
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.DiagnosticWithLocation
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDiagnosticNode(ref: Reference[ClassDeclaration[DeclarationNode]]): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticNode")(ref.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def getDiagnosticNode(ref: Reference[ClassDeclaration[DeclarationNode]], rawExpr: Expression): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticNode")(ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
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
