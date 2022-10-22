package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind & java.lang.String] = js.native
  
  @js.native
  sealed trait alias
    extends StObject
       with ScriptElementKind
  /* "alias" */ val alias: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.alias & java.lang.String = js.native
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends StObject
       with ScriptElementKind
  /* "call" */ val callSignatureElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.callSignatureElement & java.lang.String = js.native
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends StObject
       with ScriptElementKind
  /* "class" */ val classElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.classElement & java.lang.String = js.native
  
  @js.native
  sealed trait constElement
    extends StObject
       with ScriptElementKind
  /* "const" */ val constElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.constElement & java.lang.String = js.native
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends StObject
       with ScriptElementKind
  /* "construct" */ val constructSignatureElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.constructSignatureElement & java.lang.String = js.native
  
  /**
    * class X { constructor() { } }
    * class X { static { } }
    */
  @js.native
  sealed trait constructorImplementationElement
    extends StObject
       with ScriptElementKind
  /* "constructor" */ val constructorImplementationElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.constructorImplementationElement & java.lang.String = js.native
  
  @js.native
  sealed trait directory
    extends StObject
       with ScriptElementKind
  /* "directory" */ val directory: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.directory & java.lang.String = js.native
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends StObject
       with ScriptElementKind
  /* "enum" */ val enumElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.enumElement & java.lang.String = js.native
  
  @js.native
  sealed trait enumMemberElement
    extends StObject
       with ScriptElementKind
  /* "enum member" */ val enumMemberElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.enumMemberElement & java.lang.String = js.native
  
  @js.native
  sealed trait externalModuleName
    extends StObject
       with ScriptElementKind
  /* "external module name" */ val externalModuleName: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.externalModuleName & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends StObject
       with ScriptElementKind
  /* "function" */ val functionElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.functionElement & java.lang.String = js.native
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends StObject
       with ScriptElementKind
  /* "index" */ val indexSignatureElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.indexSignatureElement & java.lang.String = js.native
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends StObject
       with ScriptElementKind
  /* "interface" */ val interfaceElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.interfaceElement & java.lang.String = js.native
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    * @deprecated
    */
  @js.native
  sealed trait jsxAttribute
    extends StObject
       with ScriptElementKind
  /* "JSX attribute" */ val jsxAttribute: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.jsxAttribute & java.lang.String = js.native
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends StObject
       with ScriptElementKind
  /* "keyword" */ val keyword: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.keyword & java.lang.String = js.native
  
  @js.native
  sealed trait label
    extends StObject
       with ScriptElementKind
  /* "label" */ val label: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.label & java.lang.String = js.native
  
  @js.native
  sealed trait letElement
    extends StObject
       with ScriptElementKind
  /* "let" */ val letElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.letElement & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
  @js.native
  sealed trait link
    extends StObject
       with ScriptElementKind
  /* "link" */ val link: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.link & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
  @js.native
  sealed trait linkName
    extends StObject
       with ScriptElementKind
  /* "link name" */ val linkName: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.linkName & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
  @js.native
  sealed trait linkText
    extends StObject
       with ScriptElementKind
  /* "link text" */ val linkText: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.linkText & java.lang.String = js.native
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends StObject
       with ScriptElementKind
  /* "local class" */ val localClassElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.localClassElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends StObject
       with ScriptElementKind
  /* "local function" */ val localFunctionElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.localFunctionElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends StObject
       with ScriptElementKind
  /* "local var" */ val localVariableElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.localVariableElement & java.lang.String = js.native
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends StObject
       with ScriptElementKind
  /* "method" */ val memberFunctionElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.memberFunctionElement & java.lang.String = js.native
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "getter" */ val memberGetAccessorElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.memberGetAccessorElement & java.lang.String = js.native
  
  @js.native
  sealed trait memberSetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "setter" */ val memberSetAccessorElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.memberSetAccessorElement & java.lang.String = js.native
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends StObject
       with ScriptElementKind
  /* "property" */ val memberVariableElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.memberVariableElement & java.lang.String = js.native
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends StObject
       with ScriptElementKind
  /* "module" */ val moduleElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.moduleElement & java.lang.String = js.native
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends StObject
       with ScriptElementKind
  /* "parameter" */ val parameterElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.parameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait primitiveType
    extends StObject
       with ScriptElementKind
  /* "primitive type" */ val primitiveType: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.primitiveType & java.lang.String = js.native
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends StObject
       with ScriptElementKind
  /* "script" */ val scriptElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.scriptElement & java.lang.String = js.native
  
  /** String literal */
  @js.native
  sealed trait string
    extends StObject
       with ScriptElementKind
  /* "string" */ val string: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.string & java.lang.String = js.native
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends StObject
       with ScriptElementKind
  /* "type" */ val typeElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.typeElement & java.lang.String = js.native
  
  @js.native
  sealed trait typeParameterElement
    extends StObject
       with ScriptElementKind
  /* "type parameter" */ val typeParameterElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.typeParameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with ScriptElementKind
  /* "" */ val unknown: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.unknown & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends StObject
       with ScriptElementKind
  /* "var" */ val variableElement: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.variableElement & java.lang.String = js.native
  
  @js.native
  sealed trait warning
    extends StObject
       with ScriptElementKind
  /* "warning" */ val warning: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptElementKind.warning & java.lang.String = js.native
}
