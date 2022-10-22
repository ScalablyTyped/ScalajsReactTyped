package typingsJapgolly.ramlTypesystem

import typingsJapgolly.ramlTypesystem.distSrcParseMod.ParseNode
import typingsJapgolly.ramlTypesystem.distSrcSchemaUtilMod.IContentProvider
import typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.TypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypeExpressionsMod {
  
  @JSImport("raml-typesystem/dist/src/typeExpressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): BaseNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[BaseNode]
  
  inline def parseToType(`val`: String, t: TypeRegistry): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: Unit,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: IContentProvider
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: Unit,
    typeAttributeContentProvider: IContentProvider,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(`val`: String, t: TypeRegistry, contentProvidingNode: ParseNode): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: Unit,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: IContentProvider
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  inline def parseToType(
    `val`: String,
    t: TypeRegistry,
    contentProvidingNode: ParseNode,
    typeAttributeContentProvider: IContentProvider,
    isPropertyType: Boolean
  ): AbstractType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToType")(`val`.asInstanceOf[js.Any], t.asInstanceOf[js.Any], contentProvidingNode.asInstanceOf[js.Any], typeAttributeContentProvider.asInstanceOf[js.Any], isPropertyType.asInstanceOf[js.Any])).asInstanceOf[AbstractType]
  
  inline def serializeToString(node: BaseNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def storeToString(t: AbstractType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storeToString")(t.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def visit(node: BaseNode, action: js.Function1[/* n */ BaseNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type BaseNode = typingsJapgolly.ramlTypesystem.distSrcTypeExpressionUtilMod.BaseNode
  
  type Literal = typingsJapgolly.ramlTypesystem.distSrcTypeExpressionUtilMod.Literal
  
  type Parens = typingsJapgolly.ramlTypesystem.distSrcTypeExpressionUtilMod.Parens
  
  type Union = typingsJapgolly.ramlTypesystem.distSrcTypeExpressionUtilMod.Union
}
