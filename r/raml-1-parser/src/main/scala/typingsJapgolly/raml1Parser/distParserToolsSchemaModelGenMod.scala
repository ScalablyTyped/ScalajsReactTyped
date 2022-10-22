package typingsJapgolly.raml1Parser

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod.ArrayTypeDeclarationImpl
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod.TypeDeclarationImpl
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserToolsSchemaModelGenMod {
  
  @JSImport("raml-1-parser/dist/parser/tools/schemaModelGen", "ModelToSchemaGenerator")
  @js.native
  open class ModelToSchemaGenerator () extends StObject {
    
    def allTypes(node: IHighLevelNode): js.Object = js.native
    
    def generateProperties(node: IHighLevelNode): Any = js.native
    
    def generateProperty(node: IHighLevelNode, optional: Boolean): Any = js.native
    
    def generateSchema(node: IHighLevelNode): Any = js.native
    
    def generateType(`type`: IHighLevelNode): Any = js.native
    
    def generateTypeExp(`type`: String, types: Any): Any = js.native
    
    def isSimpleType(name: Any): Boolean = js.native
    
    def makeUnion(typelist: Any, types: Any): js.Array[Any] = js.native
    
    def resolveType(node: IHighLevelNode, name: String): Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/tools/schemaModelGen", "SchemaToModelGenerator")
  @js.native
  open class SchemaToModelGenerator ()
    extends StObject
       with typingsJapgolly.raml1Parser.distParserToolsSchemaModelGenApiMod.SchemaToModelGenerator {
    
    def generateItemsTo(a: ArrayTypeDeclarationImpl, obj: Any): Unit = js.native
    
    def generateObj(e: Any, lev: Double): String = js.native
    
    def generateObjTo(`type`: TypeDeclarationImpl, e: Any): Unit = js.native
    
    def generateText(schema: String): String = js.native
    
    def makeType(name: String, `type`: String): TypeDeclarationImpl = js.native
    
    def makeTypeField(name: String, p: Any): TypeDeclarationImpl = js.native
  }
}
