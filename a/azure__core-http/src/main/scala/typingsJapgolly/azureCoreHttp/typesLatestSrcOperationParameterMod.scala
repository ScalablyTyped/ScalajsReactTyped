package typingsJapgolly.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat
import typingsJapgolly.azureCoreHttp.typesLatestSrcSerializerMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcOperationParameterMod {
  
  @JSImport("@azure/core-http/types/latest/src/operationParameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathStringFromParameter(parameter: OperationParameter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathStringFromParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPathStringFromParameterPath(parameterPath: ParameterPath, mapper: Mapper): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathStringFromParameterPath")(parameterPath.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait OperationParameter extends StObject {
    
    /**
      * The mapper that defines how to validate and serialize this parameter's value.
      */
    var mapper: Mapper
    
    /**
      * The path to this parameter's value in OperationArguments or the object that contains paths for
      * each property's value in OperationArguments.
      */
    var parameterPath: ParameterPath
  }
  object OperationParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationParameter]
    }
    
    extension [Self <: OperationParameter](x: Self) {
      
      inline def setMapper(value: Mapper): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setParameterPath(value: ParameterPath): Self = StObject.set(x, "parameterPath", value.asInstanceOf[js.Any])
      
      inline def setParameterPathVarargs(value: String*): Self = StObject.set(x, "parameterPath", js.Array(value*))
    }
  }
  
  trait OperationQueryParameter
    extends StObject
       with OperationParameter {
    
    /**
      * If this query parameter's value is a collection, what type of format should the value be
      * converted to.
      */
    var collectionFormat: js.UndefOr[QueryCollectionFormat] = js.undefined
    
    /**
      * Whether or not to skip encoding the query parameter's value before adding it to the URL.
      */
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object OperationQueryParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationQueryParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationQueryParameter]
    }
    
    extension [Self <: OperationQueryParameter](x: Self) {
      
      inline def setCollectionFormat(value: QueryCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  trait OperationURLParameter
    extends StObject
       with OperationParameter {
    
    /**
      * Whether or not to skip encoding the URL parameter's value before adding it to the URL.
      */
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object OperationURLParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationURLParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationURLParameter]
    }
    
    extension [Self <: OperationURLParameter](x: Self) {
      
      inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  type ParameterPath = String | js.Array[String] | StringDictionary[Any]
}
