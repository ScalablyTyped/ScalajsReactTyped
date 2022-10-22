package typingsJapgolly.raml1Parser.mod

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.INodeDefinition
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.FindUsagesResult
import typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.IHighLevelSourceProvider
import typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object search {
  
  @JSImport("raml-1-parser", "search")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "search.LocationKind")
  @js.native
  object LocationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind & Double] = js.native
    
    /* 5 */ val ANNOTATION_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.ANNOTATION_COMPLETION & Double = js.native
    
    /* 3 */ val DIRECTIVE_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.DIRECTIVE_COMPLETION & Double = js.native
    
    /* 7 */ val INCOMMENT: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.INCOMMENT & Double = js.native
    
    /* 1 */ val KEY_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.KEY_COMPLETION & Double = js.native
    
    /* 2 */ val PATH_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.PATH_COMPLETION & Double = js.native
    
    /* 6 */ val SEQUENCE_KEY_COPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.SEQUENCE_KEY_COPLETION & Double = js.native
    
    /* 0 */ val VALUE_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.VALUE_COMPLETION & Double = js.native
    
    /* 4 */ val VERSION_COMPLETION: typingsJapgolly.raml1Parser.distSearchSearchInterfaceMod.LocationKind.VERSION_COMPLETION & Double = js.native
  }
  
  inline def allChildren(node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]]
  
  inline def declRoot(node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("declRoot")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def deepFindNode(
    parent: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult,
    offset: Double,
    end: Double
  ): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Boolean
  ): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Boolean,
    returnAttrs: Boolean
  ): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Unit,
    returnAttrs: Boolean
  ): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  
  inline def determineCompletionKind(text: String, offset: Double): LocationKind = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCompletionKind")(text.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocationKind]
  
  inline def enumValues(
    property: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IProperty,
    node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValues")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findAllSubTypes(
    property: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IProperty,
    node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllSubTypes")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
  
  inline def findDeclaration(unit: ICompilationUnit, offset: Double): ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  inline def findDeclaration(unit: ICompilationUnit, offset: Double, nodePart: LocationKind): ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  
  inline def findDeclarationByNode(node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult): ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  inline def findDeclarationByNode(node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult, nodePart: LocationKind): ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  
  inline def findExampleContentType(attribute: IAttribute): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("findExampleContentType")(attribute.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  inline def findUsages(unit: ICompilationUnit, offset: Double): FindUsagesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsages")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[FindUsagesResult]
  
  inline def getNominalTypeSource(nominalType: typingsJapgolly.ramlDefinitionSystem.mod.ITypeDefinition): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getNominalTypeSource")(nominalType.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def globalDeclarations(n: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("globalDeclarations")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]]
  
  inline def isExampleNode(node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExampleNodeContent(attribute: IAttribute): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNodeContent")(attribute.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodesDeclaringType(
    `type`: ITypeDefinition,
    context: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodesDeclaringType")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]]
  
  inline def parseDocumentationContent(attribute: IAttribute, definition: ITypeDefinition): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocumentationContent")(attribute.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def parseStructuredExample(
    exampleNode: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    definition: INodeDefinition
  ): typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredExample")(exampleNode.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
  
  inline def qName(
    node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    context: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("qName")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def refFinder(
    root: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    result: js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refFinder")(root.asInstanceOf[js.Any], node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def referenceTargets(
    property: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IProperty,
    node: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceTargets")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]]
  
  inline def subTypesWithLocals(
    `type`: ITypeDefinition,
    context: typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
  ): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("subTypesWithLocals")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
}
