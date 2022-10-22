package typingsJapgolly.ramlTypesystem

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod.RangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSchemaUtilMod {
  
  @JSImport("raml-typesystem/dist/src/schemaUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/schemaUtil", "JSONSchemaObject")
  @js.native
  open class JSONSchemaObject protected () extends StObject {
    def this(schema: String, provider: IContentProvider) = this()
    
    /* private */ var EXAMPLE_ERROR_ENTRY: Any = js.native
    
    /* private */ var SCHEMA_ERROR_ENTRY: Any = js.native
    
    /* private */ var acceptErrors: Any = js.native
    
    /* private */ var collectRefContainers: Any = js.native
    
    def contentAsync(_reference: Any): Promise = js.native
    
    /* private */ var customErrors: Any = js.native
    
    def fixRequired(obj: Any): Unit = js.native
    
    def getMissingReferences(references: js.Array[Any]): js.Array[Any] = js.native
    def getMissingReferences(references: js.Array[Any], normalize: Boolean): js.Array[Any] = js.native
    
    /* private */ var getSchemaPath: Any = js.native
    
    def getType(): String = js.native
    
    /* private */ var graph: Any = js.native
    
    var jsonSchema: Any = js.native
    
    /* private */ var patchSchema: Any = js.native
    
    /* private */ var provider: Any = js.native
    
    /* private */ var removeFragmentPartOfIDs: Any = js.native
    
    /* private */ var schema: Any = js.native
    
    /* private */ var setupId: Any = js.native
    
    /* private */ var updateGraph: Any = js.native
    
    def validate(content: Any): Unit = js.native
    def validate(content: Any, alreadyAccepted: js.Array[Any]): Unit = js.native
    
    def validateObject(`object`: Any): Any = js.native
    
    def validateSelf(): Unit = js.native
    def validateSelf(alreadyAccepted: js.Array[Any]): Unit = js.native
  }
  /* static members */
  object JSONSchemaObject {
    
    @JSImport("raml-typesystem/dist/src/schemaUtil", "JSONSchemaObject")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/schemaUtil", "JSONSchemaObject.EXAMPLE_ERROR_CODES")
    @js.native
    def EXAMPLE_ERROR_CODES: Any = js.native
    inline def EXAMPLE_ERROR_CODES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXAMPLE_ERROR_CODES")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-typesystem/dist/src/schemaUtil", "JSONSchemaObject.SCHEMA_ERROR_CODES")
    @js.native
    def SCHEMA_ERROR_CODES: Any = js.native
    inline def SCHEMA_ERROR_CODES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCHEMA_ERROR_CODES")(x.asInstanceOf[js.Any])
    
    /**
      * Checks for z-schema messages related to the inability to assign to a property of non-object variables.
      * @param message
      *
      * @returns null if related message is not detected, assigned value if it can be detected, and empty string
      * if related message is detected, but assigned value can not be found.
      */
    inline def checkIfNonObjectAssignmentFailure(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfNonObjectAssignmentFailure")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("raml-typesystem/dist/src/schemaUtil", "ValidationResult")
  @js.native
  open class ValidationResult () extends StObject {
    
    var num: Double = js.native
    
    var result: Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/schemaUtil", "XMLSchemaObject")
  @js.native
  open class XMLSchemaObject protected () extends StObject {
    def this(schema: String, provider: IContentProvider) = this()
    
    /* private */ var acceptErrors: Any = js.native
    
    def collectReferences(xmlString: String, context: String, references: Any): String = js.native
    
    /* private */ var collectReferencesAsync: Any = js.native
    
    /* private */ var contentToResult: Any = js.native
    
    /* private */ var extraElementData: Any = js.native
    
    def getMissingReferences(): js.Array[String] = js.native
    
    def getType(): String = js.native
    
    /* private */ var handleReferenceElement: Any = js.native
    
    def loadSchemaReferencesAsync(): Promise = js.native
    
    /* private */ var namspacePrefix: Any = js.native
    
    /* private */ var provider: Any = js.native
    
    var references: Any = js.native
    
    /* private */ var schema: Any = js.native
    
    /* private */ var schemaString: Any = js.native
    
    def validate(xml: Any): Unit = js.native
    
    def validateObject(`object`: Any): Any = js.native
  }
  
  inline def createSchema(content: String, provider: IContentProvider): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(content.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def getJSONRange(jsonStrig: String, jsonObj: Any, jsonPath: String): RangeObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONRange")(jsonStrig.asInstanceOf[js.Any], jsonObj.asInstanceOf[js.Any], jsonPath.asInstanceOf[js.Any])).asInstanceOf[RangeObject]
  
  inline def getJSONSchema(content: String, provider: IContentProvider): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONSchema")(content.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getXMLSchema(content: String, provider: IContentProvider): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getXMLSchema")(content.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def messageToValidationError(message: String): typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("messageToValidationError")(message.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.ValidationError]
  inline def messageToValidationError(message: String, isExample: Boolean): typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("messageToValidationError")(message.asInstanceOf[js.Any], isExample.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.ValidationError]
  
  inline def tryParseJSON(content: Any, isExample: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParseJSON")(content.asInstanceOf[js.Any], isExample.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IContentProvider extends StObject {
    
    def content(reference: String): String
    
    def contentAsync(arg: Any): Promise
    
    def contextPath(): String
    
    def hasAsyncRequests(): Boolean
    
    def isAbsolutePath(uri: String): Boolean
    
    def normalizePath(url: String): String
    
    def promiseResolve(arg: Any): Promise
    
    def resolvePath(context: String, relativePath: String): String
  }
  object IContentProvider {
    
    inline def apply(
      content: String => String,
      contentAsync: Any => Promise,
      contextPath: CallbackTo[String],
      hasAsyncRequests: CallbackTo[Boolean],
      isAbsolutePath: String => Boolean,
      normalizePath: String => String,
      promiseResolve: Any => Promise,
      resolvePath: (String, String) => String
    ): IContentProvider = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction1(content), contentAsync = js.Any.fromFunction1(contentAsync), contextPath = contextPath.toJsFn, hasAsyncRequests = hasAsyncRequests.toJsFn, isAbsolutePath = js.Any.fromFunction1(isAbsolutePath), normalizePath = js.Any.fromFunction1(normalizePath), promiseResolve = js.Any.fromFunction1(promiseResolve), resolvePath = js.Any.fromFunction2(resolvePath))
      __obj.asInstanceOf[IContentProvider]
    }
    
    extension [Self <: IContentProvider](x: Self) {
      
      inline def setContent(value: String => String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentAsync(value: Any => Promise): Self = StObject.set(x, "contentAsync", js.Any.fromFunction1(value))
      
      inline def setContextPath(value: CallbackTo[String]): Self = StObject.set(x, "contextPath", value.toJsFn)
      
      inline def setHasAsyncRequests(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAsyncRequests", value.toJsFn)
      
      inline def setIsAbsolutePath(value: String => Boolean): Self = StObject.set(x, "isAbsolutePath", js.Any.fromFunction1(value))
      
      inline def setNormalizePath(value: String => String): Self = StObject.set(x, "normalizePath", js.Any.fromFunction1(value))
      
      inline def setPromiseResolve(value: Any => Promise): Self = StObject.set(x, "promiseResolve", js.Any.fromFunction1(value))
      
      inline def setResolvePath(value: (String, String) => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction2(value))
    }
  }
  
  trait IExtendedContentProvider
    extends StObject
       with IContentProvider {
    
    def isWebPath(p: String): Boolean
    
    def relativePath(from: String, to: String): String
    
    def rootPath(): String
  }
  object IExtendedContentProvider {
    
    inline def apply(
      content: String => String,
      contentAsync: Any => Promise,
      contextPath: CallbackTo[String],
      hasAsyncRequests: CallbackTo[Boolean],
      isAbsolutePath: String => Boolean,
      isWebPath: String => Boolean,
      normalizePath: String => String,
      promiseResolve: Any => Promise,
      relativePath: (String, String) => String,
      resolvePath: (String, String) => String,
      rootPath: CallbackTo[String]
    ): IExtendedContentProvider = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction1(content), contentAsync = js.Any.fromFunction1(contentAsync), contextPath = contextPath.toJsFn, hasAsyncRequests = hasAsyncRequests.toJsFn, isAbsolutePath = js.Any.fromFunction1(isAbsolutePath), isWebPath = js.Any.fromFunction1(isWebPath), normalizePath = js.Any.fromFunction1(normalizePath), promiseResolve = js.Any.fromFunction1(promiseResolve), relativePath = js.Any.fromFunction2(relativePath), resolvePath = js.Any.fromFunction2(resolvePath), rootPath = rootPath.toJsFn)
      __obj.asInstanceOf[IExtendedContentProvider]
    }
    
    extension [Self <: IExtendedContentProvider](x: Self) {
      
      inline def setIsWebPath(value: String => Boolean): Self = StObject.set(x, "isWebPath", js.Any.fromFunction1(value))
      
      inline def setRelativePath(value: (String, String) => String): Self = StObject.set(x, "relativePath", js.Any.fromFunction2(value))
      
      inline def setRootPath(value: CallbackTo[String]): Self = StObject.set(x, "rootPath", value.toJsFn)
    }
  }
  
  @js.native
  trait Promise extends StObject {
    
    def resolve(arg: Any): Any = js.native
    
    def `then`(instance: Any): Any = js.native
    def `then`(instance: Any, reject: Any): Any = js.native
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
  
  trait ValidationError extends StObject {
    
    var code: String
    
    var message: String
    
    var params: js.Array[String]
    
    var path: String
  }
  object ValidationError {
    
    inline def apply(code: String, message: String, params: js.Array[String], path: String): ValidationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    extension [Self <: ValidationError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
