package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.`var`
import typingsJapgolly.babelTypes.babelTypesStrings.const
import typingsJapgolly.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.FunctionDeclaration_
  - typingsJapgolly.babelTypes.libMod.VariableDeclaration_
  - typingsJapgolly.babelTypes.libMod.ClassDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_
  - typingsJapgolly.babelTypes.libMod.ImportDeclaration_
  - typingsJapgolly.babelTypes.libMod.DeclareClass_
  - typingsJapgolly.babelTypes.libMod.DeclareFunction_
  - typingsJapgolly.babelTypes.libMod.DeclareInterface_
  - typingsJapgolly.babelTypes.libMod.DeclareModule_
  - typingsJapgolly.babelTypes.libMod.DeclareModuleExports_
  - typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_
  - typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_
  - typingsJapgolly.babelTypes.libMod.DeclareVariable_
  - typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_
  - typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_
  - typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_
  - typingsJapgolly.babelTypes.libMod.OpaqueType_
  - typingsJapgolly.babelTypes.libMod.TypeAlias_
  - typingsJapgolly.babelTypes.libMod.EnumDeclaration_
  - typingsJapgolly.babelTypes.libMod.TSDeclareFunction__
  - typingsJapgolly.babelTypes.libMod.TSInterfaceDeclaration__
  - typingsJapgolly.babelTypes.libMod.TSTypeAliasDeclaration__
  - typingsJapgolly.babelTypes.libMod.TSEnumDeclaration__
  - typingsJapgolly.babelTypes.libMod.TSModuleDeclaration__
*/
trait Declaration extends StObject
object Declaration {
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typingsJapgolly.babelTypes.libMod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassDeclaration_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.libMod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typingsJapgolly.babelTypes.libMod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareVariable_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typingsJapgolly.babelTypes.libMod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumDeclaration_]
  }
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction__ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionDeclaration_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typingsJapgolly.babelTypes.libMod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportDeclaration_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typingsJapgolly.babelTypes.libMod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OpaqueType_]
  }
  
  inline def TSDeclareFunction__(params: js.Array[Identifier_ | Pattern | RestElement_]): typingsJapgolly.babelTypes.libMod.TSDeclareFunction__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSDeclareFunction__]
  }
  
  inline def TSEnumDeclaration__(id: Identifier_, members: js.Array[TSEnumMember__]): typingsJapgolly.babelTypes.libMod.TSEnumDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSEnumDeclaration__]
  }
  
  inline def TSInterfaceDeclaration__(body: TSInterfaceBody__, id: Identifier_): typingsJapgolly.babelTypes.libMod.TSInterfaceDeclaration__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSInterfaceDeclaration__]
  }
  
  inline def TSModuleDeclaration__(
    body: TSModuleBlock__ | typingsJapgolly.babelTypes.libMod.TSModuleDeclaration__,
    id: Identifier_ | StringLiteral_
  ): typingsJapgolly.babelTypes.libMod.TSModuleDeclaration__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSModuleDeclaration__]
  }
  
  inline def TSTypeAliasDeclaration__(id: Identifier_, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSTypeAliasDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeAliasDeclaration__]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.libMod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeAlias_]
  }
  
  inline def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): typingsJapgolly.babelTypes.libMod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.VariableDeclaration_]
  }
}
