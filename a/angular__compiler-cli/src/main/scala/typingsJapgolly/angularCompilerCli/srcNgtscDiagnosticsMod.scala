package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.DiagnosticMessageChain
import typingsJapgolly.typescript.mod.DiagnosticRelatedInformation
import typingsJapgolly.typescript.mod.DiagnosticWithLocation
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", "COMPILER_ERRORS_WITH_GUIDES")
  @js.native
  val COMPILER_ERRORS_WITH_GUIDES: Set[ErrorCode] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", "ERROR_DETAILS_PAGE_BASE_URL")
  @js.native
  val ERROR_DETAILS_PAGE_BASE_URL: /* "https://angular.io/errors" */ String = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode & Double
      ] = js.native
    
    /* 2011 */ val COMPONENT_IMPORT_NOT_STANDALONE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_IMPORT_NOT_STANDALONE & Double = js.native
    
    /* 2009 */ val COMPONENT_INVALID_SHADOW_DOM_SELECTOR: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_INVALID_SHADOW_DOM_SELECTOR & Double = js.native
    
    /* 2001 */ val COMPONENT_MISSING_TEMPLATE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_MISSING_TEMPLATE & Double = js.native
    
    /* 2010 */ val COMPONENT_NOT_STANDALONE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_NOT_STANDALONE & Double = js.native
    
    /* 2008 */ val COMPONENT_RESOURCE_NOT_FOUND: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_RESOURCE_NOT_FOUND & Double = js.native
    
    /* 2012 */ val COMPONENT_UNKNOWN_IMPORT: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_UNKNOWN_IMPORT & Double = js.native
    
    /* 4003 */ val CONFIG_EXTENDED_DIAGNOSTICS_IMPLIES_STRICT_TEMPLATES: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_IMPLIES_STRICT_TEMPLATES & Double = js.native
    
    /* 4004 */ val CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CATEGORY_LABEL: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CATEGORY_LABEL & Double = js.native
    
    /* 4005 */ val CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CHECK: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CHECK & Double = js.native
    
    /* 4001 */ val CONFIG_FLAT_MODULE_NO_INDEX: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_FLAT_MODULE_NO_INDEX & Double = js.native
    
    /* 4002 */ val CONFIG_STRICT_TEMPLATES_IMPLIES_FULL_TEMPLATE_TYPECHECK: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_STRICT_TEMPLATES_IMPLIES_FULL_TEMPLATE_TYPECHECK & Double = js.native
    
    /* 1001 */ val DECORATOR_ARG_NOT_LITERAL: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_ARG_NOT_LITERAL & Double = js.native
    
    /* 1002 */ val DECORATOR_ARITY_WRONG: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_ARITY_WRONG & Double = js.native
    
    /* 1006 */ val DECORATOR_COLLISION: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_COLLISION & Double = js.native
    
    /* 1003 */ val DECORATOR_NOT_CALLED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_NOT_CALLED & Double = js.native
    
    /* 1005 */ val DECORATOR_UNEXPECTED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_UNEXPECTED & Double = js.native
    
    /* 2006 */ val DIRECTIVE_INHERITS_UNDECORATED_CTOR: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DIRECTIVE_INHERITS_UNDECORATED_CTOR & Double = js.native
    
    /* 2004 */ val DIRECTIVE_MISSING_SELECTOR: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DIRECTIVE_MISSING_SELECTOR & Double = js.native
    
    /* 8006 */ val DUPLICATE_VARIABLE_DECLARATION: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DUPLICATE_VARIABLE_DECLARATION & Double = js.native
    
    /* 5001 */ val HOST_BINDING_PARSE_ERROR: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.HOST_BINDING_PARSE_ERROR & Double = js.native
    
    /* 3003 */ val IMPORT_CYCLE_DETECTED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.IMPORT_CYCLE_DETECTED & Double = js.native
    
    /* 3004 */ val IMPORT_GENERATION_FAILURE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.IMPORT_GENERATION_FAILURE & Double = js.native
    
    /* 9001 */ val INJECTABLE_DUPLICATE_PROV: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INJECTABLE_DUPLICATE_PROV & Double = js.native
    
    /* 8900 */ val INLINE_TCB_REQUIRED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INLINE_TCB_REQUIRED & Double = js.native
    
    /* 8901 */ val INLINE_TYPE_CTOR_REQUIRED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INLINE_TYPE_CTOR_REQUIRED & Double = js.native
    
    /* 8101 */ val INVALID_BANANA_IN_BOX: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INVALID_BANANA_IN_BOX & Double = js.native
    
    /* 8103 */ val MISSING_CONTROL_FLOW_DIRECTIVE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_CONTROL_FLOW_DIRECTIVE & Double = js.native
    
    /* 8105 */ val MISSING_NGFOROF_LET: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_NGFOROF_LET & Double = js.native
    
    /* 8004 */ val MISSING_PIPE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_PIPE & Double = js.native
    
    /* 8003 */ val MISSING_REFERENCE_TARGET: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_REFERENCE_TARGET & Double = js.native
    
    /* 6009 */ val NGMODULE_BOOTSTRAP_IS_STANDALONE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_BOOTSTRAP_IS_STANDALONE & Double = js.native
    
    /* 6008 */ val NGMODULE_DECLARATION_IS_STANDALONE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_DECLARATION_IS_STANDALONE & Double = js.native
    
    /* 6007 */ val NGMODULE_DECLARATION_NOT_UNIQUE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_DECLARATION_NOT_UNIQUE & Double = js.native
    
    /* 6001 */ val NGMODULE_INVALID_DECLARATION: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_DECLARATION & Double = js.native
    
    /* 6003 */ val NGMODULE_INVALID_EXPORT: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_EXPORT & Double = js.native
    
    /* 6002 */ val NGMODULE_INVALID_IMPORT: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_IMPORT & Double = js.native
    
    /* 6004 */ val NGMODULE_INVALID_REEXPORT: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_REEXPORT & Double = js.native
    
    /* 6005 */ val NGMODULE_MODULE_WITH_PROVIDERS_MISSING_GENERIC: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_MODULE_WITH_PROVIDERS_MISSING_GENERIC & Double = js.native
    
    /* 6006 */ val NGMODULE_REEXPORT_NAME_COLLISION: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_REEXPORT_NAME_COLLISION & Double = js.native
    
    /* 6999 */ val NGMODULE_VE_DEPENDENCY_ON_IVY_LIB: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_VE_DEPENDENCY_ON_IVY_LIB & Double = js.native
    
    /* 8102 */ val NULLISH_COALESCING_NOT_NULLABLE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NULLISH_COALESCING_NOT_NULLABLE & Double = js.native
    
    /* 8107 */ val OPTIONAL_CHAIN_NOT_NULLABLE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.OPTIONAL_CHAIN_NOT_NULLABLE & Double = js.native
    
    /* 2003 */ val PARAM_MISSING_TOKEN: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.PARAM_MISSING_TOKEN & Double = js.native
    
    /* 2002 */ val PIPE_MISSING_NAME: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.PIPE_MISSING_NAME & Double = js.native
    
    /* 8002 */ val SCHEMA_INVALID_ATTRIBUTE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SCHEMA_INVALID_ATTRIBUTE & Double = js.native
    
    /* 8001 */ val SCHEMA_INVALID_ELEMENT: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SCHEMA_INVALID_ELEMENT & Double = js.native
    
    /* 8007 */ val SPLIT_TWO_WAY_BINDING: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SPLIT_TWO_WAY_BINDING & Double = js.native
    
    /* 8106 */ val SUFFIX_NOT_SUPPORTED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUFFIX_NOT_SUPPORTED & Double = js.native
    
    /* 10001 */ val SUGGEST_STRICT_TEMPLATES: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUGGEST_STRICT_TEMPLATES & Double = js.native
    
    /* 10002 */ val SUGGEST_SUBOPTIMAL_TYPE_INFERENCE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUGGEST_SUBOPTIMAL_TYPE_INFERENCE & Double = js.native
    
    /* 3001 */ val SYMBOL_NOT_EXPORTED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SYMBOL_NOT_EXPORTED & Double = js.native
    
    /* 5002 */ val TEMPLATE_PARSE_ERROR: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.TEMPLATE_PARSE_ERROR & Double = js.native
    
    /* 8104 */ val TEXT_ATTRIBUTE_NOT_BINDING: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.TEXT_ATTRIBUTE_NOT_BINDING & Double = js.native
    
    /* 2007 */ val UNDECORATED_CLASS_USING_ANGULAR_FEATURES: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.UNDECORATED_CLASS_USING_ANGULAR_FEATURES & Double = js.native
    
    /* 2005 */ val UNDECORATED_PROVIDER: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.UNDECORATED_PROVIDER & Double = js.native
    
    /* 1010 */ val VALUE_HAS_WRONG_TYPE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.VALUE_HAS_WRONG_TYPE & Double = js.native
    
    /* 1011 */ val VALUE_NOT_LITERAL: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.VALUE_NOT_LITERAL & Double = js.native
    
    /* 6100 */ val WARN_NGMODULE_ID_UNNECESSARY: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.WARN_NGMODULE_ID_UNNECESSARY & Double = js.native
    
    /* 8005 */ val WRITE_TO_READ_ONLY_VARIABLE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.WRITE_TO_READ_ONLY_VARIABLE & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", "ExtendedTemplateDiagnosticName")
  @js.native
  object ExtendedTemplateDiagnosticName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName & String
      ] = js.native
    
    /* "invalidBananaInBox" */ val INVALID_BANANA_IN_BOX: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.INVALID_BANANA_IN_BOX & String = js.native
    
    /* "missingControlFlowDirective" */ val MISSING_CONTROL_FLOW_DIRECTIVE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_CONTROL_FLOW_DIRECTIVE & String = js.native
    
    /* "missingNgForOfLet" */ val MISSING_NGFOROF_LET: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_NGFOROF_LET & String = js.native
    
    /* "nullishCoalescingNotNullable" */ val NULLISH_COALESCING_NOT_NULLABLE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.NULLISH_COALESCING_NOT_NULLABLE & String = js.native
    
    /* "optionalChainNotNullable" */ val OPTIONAL_CHAIN_NOT_NULLABLE: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.OPTIONAL_CHAIN_NOT_NULLABLE & String = js.native
    
    /* "suffixNotSupported" */ val SUFFIX_NOT_SUPPORTED: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.SUFFIX_NOT_SUPPORTED & String = js.native
    
    /* "textAttributeNotBinding" */ val TEXT_ATTRIBUTE_NOT_BINDING: typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.TEXT_ATTRIBUTE_NOT_BINDING & String = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics", "FatalDiagnosticError")
  @js.native
  open class FatalDiagnosticError protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorMod.FatalDiagnosticError {
    def this(code: ErrorCode, node: Node, message: String) = this()
    def this(code: ErrorCode, node: Node, message: DiagnosticMessageChain) = this()
    def this(
      code: ErrorCode,
      node: Node,
      message: String,
      relatedInformation: js.Array[DiagnosticRelatedInformation]
    ) = this()
    def this(
      code: ErrorCode,
      node: Node,
      message: DiagnosticMessageChain,
      relatedInformation: js.Array[DiagnosticRelatedInformation]
    ) = this()
  }
  
  inline def isFatalDiagnosticError(err: Any): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/error.FatalDiagnosticError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFatalDiagnosticError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/error.FatalDiagnosticError */ Boolean]
  
  inline def makeDiagnostic(code: ErrorCode, node: Node, messageText: String): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(
    code: ErrorCode,
    node: Node,
    messageText: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(code: ErrorCode, node: Node, messageText: DiagnosticMessageChain): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(
    code: ErrorCode,
    node: Node,
    messageText: DiagnosticMessageChain,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  
  inline def makeDiagnosticChain(messageText: String): DiagnosticMessageChain = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnosticChain")(messageText.asInstanceOf[js.Any]).asInstanceOf[DiagnosticMessageChain]
  inline def makeDiagnosticChain(messageText: String, next: js.Array[DiagnosticMessageChain]): DiagnosticMessageChain = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnosticChain")(messageText.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[DiagnosticMessageChain]
  
  inline def makeRelatedInformation(node: Node, messageText: String): DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRelatedInformation")(node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticRelatedInformation]
  
  inline def ngErrorCode(code: ErrorCode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ngErrorCode")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def replaceTsWithNgInErrors(errors: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceTsWithNgInErrors")(errors.asInstanceOf[js.Any]).asInstanceOf[String]
}
