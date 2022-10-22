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
  - typingsJapgolly.babelTypes.mod.DeclareModuleExports_
  - typingsJapgolly.babelTypes.mod.DeclareTypeAlias_
  - typingsJapgolly.babelTypes.mod.DeclareOpaqueType_
  - typingsJapgolly.babelTypes.mod.DeclareVariable_
  - typingsJapgolly.babelTypes.mod.DeclareExportDeclaration_
  - typingsJapgolly.babelTypes.mod.DeclareExportAllDeclaration_
  - typingsJapgolly.babelTypes.mod.InterfaceDeclaration_
  - typingsJapgolly.babelTypes.mod.OpaqueType_
  - typingsJapgolly.babelTypes.mod.TypeAlias_
  - typingsJapgolly.babelTypes.mod.EnumDeclaration_
  - typingsJapgolly.babelTypes.mod.TSDeclareFunction_
  - typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration_
  - typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration_
  - typingsJapgolly.babelTypes.mod.TSEnumDeclaration_
  - typingsJapgolly.babelTypes.mod.TSModuleDeclaration_
*/
trait Declaration
  extends StObject
     with _Node
object Declaration {
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typingsJapgolly.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, decorators = null, end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ClassDeclaration_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareClass")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.mod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typingsJapgolly.babelTypes.mod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, source = null, specifiers = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typingsJapgolly.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.mod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typingsJapgolly.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, kind = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typingsJapgolly.babelTypes.mod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, impltype = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typingsJapgolly.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclareVariable_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typingsJapgolly.babelTypes.mod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumDeclaration_]
  }
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.FunctionDeclaration_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typingsJapgolly.babelTypes.mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], assertions = null, end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ImportDeclaration_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.InterfaceDeclaration_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typingsJapgolly.babelTypes.mod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.OpaqueType_]
  }
  
  inline def TSDeclareFunction_(async: Boolean, generator: Boolean, params: js.Array[Identifier_ | Pattern | RestElement_]): typingsJapgolly.babelTypes.mod.TSDeclareFunction_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSDeclareFunction_]
  }
  
  inline def TSEnumDeclaration_(id: Identifier_, members: js.Array[TSEnumMember_]): typingsJapgolly.babelTypes.mod.TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], const = null, declare = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSEnumDeclaration_]
  }
  
  inline def TSInterfaceDeclaration_(body: TSInterfaceBody_, id: Identifier_): typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSInterfaceDeclaration_]
  }
  
  inline def TSModuleDeclaration_(
    body: TSModuleBlock_ | typingsJapgolly.babelTypes.mod.TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_
  ): typingsJapgolly.babelTypes.mod.TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, global = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSModuleDeclaration_]
  }
  
  inline def TSTypeAliasDeclaration_(id: Identifier_, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeAliasDeclaration_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeAlias_]
  }
  
  inline def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): typingsJapgolly.babelTypes.mod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.VariableDeclaration_]
  }
}
