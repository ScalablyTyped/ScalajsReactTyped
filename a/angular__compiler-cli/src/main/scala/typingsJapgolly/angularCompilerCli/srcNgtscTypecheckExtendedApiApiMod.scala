package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.TmplAstNode
import typingsJapgolly.angularCompilerCli.anon.End
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.NgTemplateDiagnostic
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedApiApiMod {
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/api/api", "TemplateCheckWithVisitor")
  @js.native
  open class TemplateCheckWithVisitor[Code /* <: ErrorCode */] ()
    extends StObject
       with TemplateCheck[Code] {
    
    /** Unique template check code, used for configuration and searching the error. */
    /* CompleteClass */
    var code: Code = js.native
    
    /** Runs check and returns information about the diagnostics to be generated. */
    /* CompleteClass */
    override def run(ctx: TemplateContext[Code], component: ClassDeclaration, template: js.Array[TmplAstNode]): js.Array[NgTemplateDiagnostic[Code]] = js.native
    
    def visitNode(ctx: TemplateContext[Code], component: ClassDeclaration, node: AST): js.Array[NgTemplateDiagnostic[Code]] = js.native
    /**
      * Visit a TmplAstNode or AST node of the template. Authors should override this
      * method to implement the check and return diagnostics.
      */
    def visitNode(ctx: TemplateContext[Code], component: ClassDeclaration, node: TmplAstNode): js.Array[NgTemplateDiagnostic[Code]] = js.native
  }
  
  trait TemplateCheck[Code /* <: ErrorCode */] extends StObject {
    
    /** Unique template check code, used for configuration and searching the error. */
    var code: Code
    
    /** Runs check and returns information about the diagnostics to be generated. */
    def run(ctx: TemplateContext[Code], component: ClassDeclaration, template: js.Array[TmplAstNode]): js.Array[NgTemplateDiagnostic[Code]]
  }
  object TemplateCheck {
    
    inline def apply[Code /* <: ErrorCode */](
      code: Code,
      run: (TemplateContext[Code], ClassDeclaration, js.Array[TmplAstNode]) => js.Array[NgTemplateDiagnostic[Code]]
    ): TemplateCheck[Code] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[TemplateCheck[Code]]
    }
    
    extension [Self <: TemplateCheck[?], Code /* <: ErrorCode */](x: Self & TemplateCheck[Code]) {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setRun(
        value: (TemplateContext[Code], ClassDeclaration, js.Array[TmplAstNode]) => js.Array[NgTemplateDiagnostic[Code]]
      ): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  trait TemplateCheckFactory[Code /* <: ErrorCode */, Name /* <: ExtendedTemplateDiagnosticName */] extends StObject {
    
    var code: Code
    
    def create(options: NgCompilerOptions): TemplateCheck[Code] | Null
    
    var name: Name
  }
  object TemplateCheckFactory {
    
    inline def apply[Code /* <: ErrorCode */, Name /* <: ExtendedTemplateDiagnosticName */](code: Code, create: NgCompilerOptions => TemplateCheck[Code] | Null, name: Name): TemplateCheckFactory[Code, Name] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCheckFactory[Code, Name]]
    }
    
    extension [Self <: TemplateCheckFactory[?, ?], Code /* <: ErrorCode */, Name /* <: ExtendedTemplateDiagnosticName */](x: Self & (TemplateCheckFactory[Code, Name])) {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: NgCompilerOptions => TemplateCheck[Code] | Null): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateContext[Code /* <: ErrorCode */] extends StObject {
    
    /**
      * Creates a template diagnostic with the given information for the template being processed and
      * using the diagnostic category configured for the extended template diagnostic.
      */
    def makeTemplateDiagnostic(sourceSpan: ParseSourceSpan, message: String): NgTemplateDiagnostic[Code] = js.native
    def makeTemplateDiagnostic(sourceSpan: ParseSourceSpan, message: String, relatedInformation: js.Array[End]): NgTemplateDiagnostic[Code] = js.native
    
    /** Interface that provides information about template nodes. */
    var templateTypeChecker: TemplateTypeChecker = js.native
    
    /**
      * TypeScript interface that provides type information about symbols that appear
      * in the template (it is not to query types outside the Angular component).
      */
    var typeChecker: TypeChecker = js.native
  }
}
