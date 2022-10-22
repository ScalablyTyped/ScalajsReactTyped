package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typingsJapgolly.raml1Parser.distParserToolsSchemaModelGenApiMod.ModelToSchemaGenerator
import typingsJapgolly.raml1Parser.distParserToolsSchemaModelGenApiMod.SchemaToModelGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaMod {
  
  @JSImport("raml-1-parser/dist/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeReference(includePath: String, includeReference: IncludeReference, content: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeReference")(includePath.asInstanceOf[js.Any], includeReference.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def createModelToSchemaGenerator(): ModelToSchemaGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("createModelToSchemaGenerator")().asInstanceOf[ModelToSchemaGenerator]
  
  inline def createSchema(c: String, u: ICompilationUnit): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(c.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def createSchemaModelGenerator(): SchemaToModelGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchemaModelGenerator")().asInstanceOf[SchemaToModelGenerator]
  
  inline def dereference(schemaPath: String, jsonReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schemaPath.asInstanceOf[js.Any], jsonReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getIncludePath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludePath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIncludeReference(p: String): IncludeReference = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludeReference")(p.asInstanceOf[js.Any]).asInstanceOf[IncludeReference]
  
  inline def getJSONSchema(c: String, u: ICompilationUnit): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONSchema")(c.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def getXMLSchema(c: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("getXMLSchema")(c.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  trait IncludeReference extends StObject {
    
    def asString(): String
    
    def encodedName(): String
    
    def getFragments(): js.Array[String]
    
    def getIncludePath(): String
  }
  object IncludeReference {
    
    inline def apply(
      asString: CallbackTo[String],
      encodedName: CallbackTo[String],
      getFragments: CallbackTo[js.Array[String]],
      getIncludePath: CallbackTo[String]
    ): IncludeReference = {
      val __obj = js.Dynamic.literal(asString = asString.toJsFn, encodedName = encodedName.toJsFn, getFragments = getFragments.toJsFn, getIncludePath = getIncludePath.toJsFn)
      __obj.asInstanceOf[IncludeReference]
    }
    
    extension [Self <: IncludeReference](x: Self) {
      
      inline def setAsString(value: CallbackTo[String]): Self = StObject.set(x, "asString", value.toJsFn)
      
      inline def setEncodedName(value: CallbackTo[String]): Self = StObject.set(x, "encodedName", value.toJsFn)
      
      inline def setGetFragments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getFragments", value.toJsFn)
      
      inline def setGetIncludePath(value: CallbackTo[String]): Self = StObject.set(x, "getIncludePath", value.toJsFn)
    }
  }
  
  trait Schema extends StObject {
    
    def getType(): String
    
    def validate(content: String): Unit
    
    def validateObject(`object`: Any): Unit
  }
  object Schema {
    
    inline def apply(getType: CallbackTo[String], validate: String => Callback, validateObject: Any => Callback): Schema = {
      val __obj = js.Dynamic.literal(getType = getType.toJsFn, validate = js.Any.fromFunction1((t0: String) => validate(t0).runNow()), validateObject = js.Any.fromFunction1((t0: Any) => validateObject(t0).runNow()))
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setValidate(value: String => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setValidateObject(value: Any => Callback): Self = StObject.set(x, "validateObject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
