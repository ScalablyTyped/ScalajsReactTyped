package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.`var`
import typingsJapgolly.babelTypes.babelTypesStrings.const
import typingsJapgolly.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.FunctionDeclaration_
  - typingsJapgolly.babelTypes.mod.VariableDeclaration_
  - typingsJapgolly.babelTypes.mod.ClassDeclaration_
  - typingsJapgolly.babelTypes.mod.ExportAllDeclaration_
  - typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_
  - typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_
  - typingsJapgolly.babelTypes.mod.ImportDeclaration_
  - typingsJapgolly.babelTypes.mod.DeclareClass_
  - typingsJapgolly.babelTypes.mod.DeclareFunction_
  - typingsJapgolly.babelTypes.mod.DeclareInterface_
  - typingsJapgolly.babelTypes.mod.DeclareModule_
  - typingsJapgolly.babelTypes.mod.DeclareTypeAlias_
  - typingsJapgolly.babelTypes.mod.DeclareVariable_
  - typingsJapgolly.babelTypes.mod.InterfaceDeclaration_
  - typingsJapgolly.babelTypes.mod.TypeAlias_
  - typingsJapgolly.babelTypes.mod.TSDeclareFunction
  - typingsJapgolly.babelTypes.mod.TSEnumDeclaration
  - typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration
  - typingsJapgolly.babelTypes.mod.TSModuleDeclaration
  - typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration
*/
trait Declaration extends StObject
object Declaration {
  
  inline def ClassDeclaration_(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression
  ): typingsJapgolly.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ClassDeclaration_]
  }
  
  inline def DeclareClass_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareClass_]
  }
  
  inline def DeclareFunction_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareInterface_]
  }
  
  inline def DeclareModule_(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double
  ): typingsJapgolly.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareModule_]
  }
  
  inline def DeclareTypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareVariable_]
  }
  
  inline def ExportAllDeclaration_(end: Double, loc: SourceLocation, source: StringLiteral_, start: Double): typingsJapgolly.babelTypes.mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: Declaration | Expression, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double
  ): typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], source = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typingsJapgolly.babelTypes.mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.FunctionDeclaration_]
  }
  
  inline def ImportDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double
  ): typingsJapgolly.babelTypes.mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ImportDeclaration_]
  }
  
  inline def InterfaceDeclaration_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.InterfaceDeclaration_]
  }
  
  inline def TSDeclareFunction(
    async: Boolean,
    end: Double,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typingsJapgolly.babelTypes.mod.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, id = null, returnType = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSDeclareFunction]
  }
  
  inline def TSEnumDeclaration(end: Double, id: Identifier_, loc: SourceLocation, members: js.Array[TSEnumMember], start: Double): typingsJapgolly.babelTypes.mod.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], const = null, declare = null, initializer = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSEnumDeclaration]
  }
  
  inline def TSInterfaceDeclaration(body: TSInterfaceBody, end: Double, id: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration]
  }
  
  inline def TSModuleDeclaration(
    body: TSModuleBlock | typingsJapgolly.babelTypes.mod.TSModuleDeclaration,
    end: Double,
    id: Identifier_ | StringLiteral_,
    loc: SourceLocation,
    start: Double
  ): typingsJapgolly.babelTypes.mod.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, global = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSModuleDeclaration]
  }
  
  inline def TSTypeAliasDeclaration(end: Double, id: Identifier_, loc: SourceLocation, start: Double, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration]
  }
  
  inline def TypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeAlias_]
  }
  
  inline def VariableDeclaration_(
    declarations: js.Array[VariableDeclarator_],
    end: Double,
    kind: `var` | let | const,
    loc: SourceLocation,
    start: Double
  ): typingsJapgolly.babelTypes.mod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.VariableDeclaration_]
  }
}
