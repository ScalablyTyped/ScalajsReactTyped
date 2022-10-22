package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.SchemaMetadata
import typingsJapgolly.angularCompiler.mod.TmplAstElement
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TemplateSourceResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcDomMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/dom", "RegistryDomSchemaChecker")
  @js.native
  open class RegistryDomSchemaChecker protected ()
    extends StObject
       with DomSchemaChecker {
    def this(resolver: TemplateSourceResolver) = this()
    
    /* private */ var _diagnostics: Any = js.native
    
    /**
      * Check a non-Angular element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * element.
      * @param hostIsStandalone boolean indicating whether the element's host is a standalone
      *     component.
      */
    /* CompleteClass */
    override def checkElement(id: String, element: TmplAstElement, schemas: js.Array[SchemaMetadata], hostIsStandalone: Boolean): Unit = js.native
    def checkElement(
      id: TemplateId,
      element: TmplAstElement,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    
    /**
      * Check a property binding on an element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param name the name of the property being checked.
      * @param span the source span of the binding. This is redundant with `element.attributes` but is
      * passed separately to avoid having to look up the particular property name.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * property.
      */
    /* CompleteClass */
    override def checkProperty(
      id: String,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    def checkProperty(
      id: TemplateId,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    
    /**
      * Get the `ts.Diagnostic`s that have been generated via `checkElement` and `checkProperty` calls
      * thus far.
      */
    /* CompleteClass */
    override val diagnostics: js.Array[TemplateDiagnostic] = js.native
    @JSName("diagnostics")
    def diagnostics_MRegistryDomSchemaChecker: js.Array[TemplateDiagnostic] = js.native
    
    /* private */ var resolver: Any = js.native
  }
  
  trait DomSchemaChecker extends StObject {
    
    /**
      * Check a non-Angular element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * element.
      * @param hostIsStandalone boolean indicating whether the element's host is a standalone
      *     component.
      */
    def checkElement(id: String, element: TmplAstElement, schemas: js.Array[SchemaMetadata], hostIsStandalone: Boolean): Unit
    
    /**
      * Check a property binding on an element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param name the name of the property being checked.
      * @param span the source span of the binding. This is redundant with `element.attributes` but is
      * passed separately to avoid having to look up the particular property name.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * property.
      */
    def checkProperty(
      id: String,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit
    
    /**
      * Get the `ts.Diagnostic`s that have been generated via `checkElement` and `checkProperty` calls
      * thus far.
      */
    val diagnostics: js.Array[TemplateDiagnostic]
  }
  object DomSchemaChecker {
    
    inline def apply(
      checkElement: (String, TmplAstElement, js.Array[SchemaMetadata], Boolean) => Callback,
      checkProperty: (String, TmplAstElement, String, ParseSourceSpan, js.Array[SchemaMetadata], Boolean) => Callback,
      diagnostics: js.Array[TemplateDiagnostic]
    ): DomSchemaChecker = {
      val __obj = js.Dynamic.literal(checkElement = js.Any.fromFunction4((t0: String, t1: TmplAstElement, t2: js.Array[SchemaMetadata], t3: Boolean) => (checkElement(t0, t1, t2, t3)).runNow()), checkProperty = js.Any.fromFunction6((t0: String, t1: TmplAstElement, t2: String, t3: ParseSourceSpan, t4: js.Array[SchemaMetadata], t5: Boolean) => (checkProperty(t0, t1, t2, t3, t4, t5)).runNow()), diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomSchemaChecker]
    }
    
    extension [Self <: DomSchemaChecker](x: Self) {
      
      inline def setCheckElement(value: (String, TmplAstElement, js.Array[SchemaMetadata], Boolean) => Callback): Self = StObject.set(x, "checkElement", js.Any.fromFunction4((t0: String, t1: TmplAstElement, t2: js.Array[SchemaMetadata], t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCheckProperty(
        value: (String, TmplAstElement, String, ParseSourceSpan, js.Array[SchemaMetadata], Boolean) => Callback
      ): Self = StObject.set(x, "checkProperty", js.Any.fromFunction6((t0: String, t1: TmplAstElement, t2: String, t3: ParseSourceSpan, t4: js.Array[SchemaMetadata], t5: Boolean) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setDiagnostics(value: js.Array[TemplateDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: TemplateDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    }
  }
}
