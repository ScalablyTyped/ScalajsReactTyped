package typingsJapgolly.axiosCaseConverter

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.FormData
import typingsJapgolly.axios.mod.AxiosInstance
import typingsJapgolly.axios.mod.AxiosRequestConfig
import typingsJapgolly.axios.mod.AxiosRequestTransformer
import typingsJapgolly.axios.mod.AxiosResponseTransformer
import typingsJapgolly.axiosCaseConverter.anon.PartialCaseFunctions
import typingsJapgolly.axiosCaseConverter.anon.RequestInterceptor
import typingsJapgolly.noCase.mod.Options
import typingsJapgolly.std.Record
import typingsJapgolly.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsTypesMod {
  
  type ApplyCaseMiddleware = js.Function2[
    /* axios */ AxiosInstance, 
    /* options */ js.UndefOr[ApplyCaseMiddlewareOptions], 
    AxiosInstance
  ]
  
  /* Inlined axios-case-converter.axios-case-converter/typings/types.AxiosCaseMiddlewareOptions & {  caseMiddleware :{  requestTransformer :axios.axios.AxiosRequestTransformer | undefined,   responseTransformer :axios.axios.AxiosResponseTransformer | undefined,   requestInterceptor :axios-case-converter.axios-case-converter/typings/types.AxiosInterceptor | undefined} | undefined} */
  trait ApplyCaseMiddlewareOptions extends StObject {
    
    var caseFunctions: js.UndefOr[PartialCaseFunctions] = js.undefined
    
    var caseMiddleware: js.UndefOr[RequestInterceptor] = js.undefined
    
    var caseOptions: js.UndefOr[Options] = js.undefined
    
    var ignoreHeaders: js.UndefOr[Boolean] = js.undefined
    
    var preservedKeys: js.UndefOr[js.Array[String] | PreservedKeysCondition] = js.undefined
  }
  object ApplyCaseMiddlewareOptions {
    
    inline def apply(): ApplyCaseMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyCaseMiddlewareOptions]
    }
    
    extension [Self <: ApplyCaseMiddlewareOptions](x: Self) {
      
      inline def setCaseFunctions(value: PartialCaseFunctions): Self = StObject.set(x, "caseFunctions", value.asInstanceOf[js.Any])
      
      inline def setCaseFunctionsUndefined: Self = StObject.set(x, "caseFunctions", js.undefined)
      
      inline def setCaseMiddleware(value: RequestInterceptor): Self = StObject.set(x, "caseMiddleware", value.asInstanceOf[js.Any])
      
      inline def setCaseMiddlewareUndefined: Self = StObject.set(x, "caseMiddleware", js.undefined)
      
      inline def setCaseOptions(value: Options): Self = StObject.set(x, "caseOptions", value.asInstanceOf[js.Any])
      
      inline def setCaseOptionsUndefined: Self = StObject.set(x, "caseOptions", js.undefined)
      
      inline def setIgnoreHeaders(value: Boolean): Self = StObject.set(x, "ignoreHeaders", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHeadersUndefined: Self = StObject.set(x, "ignoreHeaders", js.undefined)
      
      inline def setPreservedKeys(value: js.Array[String] | PreservedKeysCondition): Self = StObject.set(x, "preservedKeys", value.asInstanceOf[js.Any])
      
      inline def setPreservedKeysFunction2(value: (/* input */ String, /* options */ js.UndefOr[Options]) => Boolean): Self = StObject.set(x, "preservedKeys", js.Any.fromFunction2(value))
      
      inline def setPreservedKeysUndefined: Self = StObject.set(x, "preservedKeys", js.undefined)
      
      inline def setPreservedKeysVarargs(value: String*): Self = StObject.set(x, "preservedKeys", js.Array(value*))
    }
  }
  
  type ApplyCaseOptions = js.Function2[/* fn */ CaseFunction, /* options */ js.UndefOr[Options], CaseFunction]
  
  /* Inlined std.Omit<axios-case-converter.axios-case-converter/typings/types.ObjectTransformerOptions, 'overwrite'> & {  caseFunctions :std.Partial<axios-case-converter.axios-case-converter/typings/types.CaseFunctions> | undefined,   ignoreHeaders :boolean | undefined} */
  trait AxiosCaseMiddlewareOptions extends StObject {
    
    var caseFunctions: js.UndefOr[PartialCaseFunctions] = js.undefined
    
    var caseOptions: js.UndefOr[Options] = js.undefined
    
    var ignoreHeaders: js.UndefOr[Boolean] = js.undefined
    
    var preservedKeys: js.UndefOr[js.Array[String] | PreservedKeysCondition] = js.undefined
  }
  object AxiosCaseMiddlewareOptions {
    
    inline def apply(): AxiosCaseMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxiosCaseMiddlewareOptions]
    }
    
    extension [Self <: AxiosCaseMiddlewareOptions](x: Self) {
      
      inline def setCaseFunctions(value: PartialCaseFunctions): Self = StObject.set(x, "caseFunctions", value.asInstanceOf[js.Any])
      
      inline def setCaseFunctionsUndefined: Self = StObject.set(x, "caseFunctions", js.undefined)
      
      inline def setCaseOptions(value: Options): Self = StObject.set(x, "caseOptions", value.asInstanceOf[js.Any])
      
      inline def setCaseOptionsUndefined: Self = StObject.set(x, "caseOptions", js.undefined)
      
      inline def setIgnoreHeaders(value: Boolean): Self = StObject.set(x, "ignoreHeaders", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHeadersUndefined: Self = StObject.set(x, "ignoreHeaders", js.undefined)
      
      inline def setPreservedKeys(value: js.Array[String] | PreservedKeysCondition): Self = StObject.set(x, "preservedKeys", value.asInstanceOf[js.Any])
      
      inline def setPreservedKeysFunction2(value: (/* input */ String, /* options */ js.UndefOr[Options]) => Boolean): Self = StObject.set(x, "preservedKeys", js.Any.fromFunction2(value))
      
      inline def setPreservedKeysUndefined: Self = StObject.set(x, "preservedKeys", js.undefined)
      
      inline def setPreservedKeysVarargs(value: String*): Self = StObject.set(x, "preservedKeys", js.Array(value*))
    }
  }
  
  type AxiosInterceptor = js.Function1[/* config */ AxiosRequestConfig[Any], AxiosRequestConfig[Any]]
  
  type CaseFunction = js.Function2[/* input */ String, /* options */ js.UndefOr[Options], String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.snake
    - typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.camel
    - typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.header
  */
  trait CaseFunctionTypes extends StObject
  object CaseFunctionTypes {
    
    inline def camel: typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.camel = "camel".asInstanceOf[typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.camel]
    
    inline def header: typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.header = "header".asInstanceOf[typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.header]
    
    inline def snake: typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.snake = "snake".asInstanceOf[typingsJapgolly.axiosCaseConverter.axiosCaseConverterStrings.snake]
  }
  
  /* Inlined {[ K in axios-case-converter.axios-case-converter/typings/types.CaseFunctionTypes ]: axios-case-converter.axios-case-converter/typings/types.CaseFunction} */
  trait CaseFunctions extends StObject {
    
    def camel(input: String): String
    def camel(input: String, options: Options): String
    @JSName("camel")
    var camel_Original: CaseFunction
    
    def header(input: String): String
    def header(input: String, options: Options): String
    @JSName("header")
    var header_Original: CaseFunction
    
    def snake(input: String): String
    def snake(input: String, options: Options): String
    @JSName("snake")
    var snake_Original: CaseFunction
  }
  object CaseFunctions {
    
    inline def apply(
      camel: (/* input */ String, /* options */ js.UndefOr[Options]) => String,
      header: (/* input */ String, /* options */ js.UndefOr[Options]) => String,
      snake: (/* input */ String, /* options */ js.UndefOr[Options]) => String
    ): CaseFunctions = {
      val __obj = js.Dynamic.literal(camel = js.Any.fromFunction2(camel), header = js.Any.fromFunction2(header), snake = js.Any.fromFunction2(snake))
      __obj.asInstanceOf[CaseFunctions]
    }
    
    extension [Self <: CaseFunctions](x: Self) {
      
      inline def setCamel(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "camel", js.Any.fromFunction2(value))
      
      inline def setHeader(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setSnake(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "snake", js.Any.fromFunction2(value))
    }
  }
  
  type CreateAxiosInterceptor = js.Function1[/* options */ js.UndefOr[AxiosCaseMiddlewareOptions], AxiosInterceptor]
  
  type CreateAxiosRequestTransformer = js.Function1[/* options */ js.UndefOr[AxiosCaseMiddlewareOptions], AxiosRequestTransformer]
  
  type CreateAxiosResponseTransformer = js.Function1[/* options */ js.UndefOr[AxiosCaseMiddlewareOptions], AxiosResponseTransformer]
  
  type CreateObjectTransformer = js.Function1[/* fn */ CaseFunction, ObjectTransformer]
  
  type CreateObjectTransformerOf = js.Function2[
    /* type */ CaseFunctionTypes, 
    /* options */ js.UndefOr[PartialCaseFunctions], 
    ObjectTransformer
  ]
  
  type CreateObjectTransformers = js.Function1[/* options */ js.UndefOr[PartialCaseFunctions], ObjectTransformers]
  
  type ObjectTransformer = js.Function2[/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions], Any]
  
  trait ObjectTransformerOptions extends StObject {
    
    var caseOptions: js.UndefOr[Options] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var preservedKeys: js.UndefOr[js.Array[String] | PreservedKeysCondition] = js.undefined
  }
  object ObjectTransformerOptions {
    
    inline def apply(): ObjectTransformerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectTransformerOptions]
    }
    
    extension [Self <: ObjectTransformerOptions](x: Self) {
      
      inline def setCaseOptions(value: Options): Self = StObject.set(x, "caseOptions", value.asInstanceOf[js.Any])
      
      inline def setCaseOptionsUndefined: Self = StObject.set(x, "caseOptions", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPreservedKeys(value: js.Array[String] | PreservedKeysCondition): Self = StObject.set(x, "preservedKeys", value.asInstanceOf[js.Any])
      
      inline def setPreservedKeysFunction2(value: (/* input */ String, /* options */ js.UndefOr[Options]) => Boolean): Self = StObject.set(x, "preservedKeys", js.Any.fromFunction2(value))
      
      inline def setPreservedKeysUndefined: Self = StObject.set(x, "preservedKeys", js.undefined)
      
      inline def setPreservedKeysVarargs(value: String*): Self = StObject.set(x, "preservedKeys", js.Array(value*))
    }
  }
  
  /* Inlined {[ K in axios-case-converter.axios-case-converter/typings/types.CaseFunctionTypes ]: axios-case-converter.axios-case-converter/typings/types.ObjectTransformer} */
  trait ObjectTransformers extends StObject {
    
    def camel(data: Any): Any
    def camel(data: Any, options: ObjectTransformerOptions): Any
    @JSName("camel")
    var camel_Original: ObjectTransformer
    
    def header(data: Any): Any
    def header(data: Any, options: ObjectTransformerOptions): Any
    @JSName("header")
    var header_Original: ObjectTransformer
    
    def snake(data: Any): Any
    def snake(data: Any, options: ObjectTransformerOptions): Any
    @JSName("snake")
    var snake_Original: ObjectTransformer
  }
  object ObjectTransformers {
    
    inline def apply(
      camel: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any,
      header: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any,
      snake: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any
    ): ObjectTransformers = {
      val __obj = js.Dynamic.literal(camel = js.Any.fromFunction2(camel), header = js.Any.fromFunction2(header), snake = js.Any.fromFunction2(snake))
      __obj.asInstanceOf[ObjectTransformers]
    }
    
    extension [Self <: ObjectTransformers](x: Self) {
      
      inline def setCamel(value: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any): Self = StObject.set(x, "camel", js.Any.fromFunction2(value))
      
      inline def setHeader(value: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setSnake(value: (/* data */ Any, /* options */ js.UndefOr[ObjectTransformerOptions]) => Any): Self = StObject.set(x, "snake", js.Any.fromFunction2(value))
    }
  }
  
  type PreserveSpecificKeys = js.Function2[
    /* fn */ CaseFunction, 
    /* keys */ js.Array[String] | PreservedKeysCondition, 
    CaseFunction
  ]
  
  type PreservedKeysCondition = js.Function2[/* input */ String, /* options */ js.UndefOr[Options], Boolean]
  
  type Transformable = (js.Array[Any] & TransformableObject) | ((Record[String | Double, Any]) & TransformableObject) | (FormData & TransformableObject) | (URLSearchParams & TransformableObject)
  
  type TransformableObject = StringDictionary[Any]
}
