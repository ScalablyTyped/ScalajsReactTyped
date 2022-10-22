package typingsJapgolly.googleCloudCommon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleCloudCommon.buildSrcUtilMod.ApiError
import typingsJapgolly.googleCloudCommon.buildSrcUtilMod.GoogleErrorBody
import typingsJapgolly.googleCloudCommon.buildSrcUtilMod.GoogleInnerError
import typingsJapgolly.teenyRequest.mod.CoreOptions
import typingsJapgolly.teenyRequest.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  @js.native
  trait OnAuthenticated extends StObject {
    
    def onAuthenticated(): Unit = js.native
    def onAuthenticated(err: js.Error): Unit = js.native
    def onAuthenticated(err: js.Error, authenticatedReqOpts: Options): Unit = js.native
    def onAuthenticated(err: Null, authenticatedReqOpts: Options): Unit = js.native
  }
  
  trait ReqOpts extends StObject {
    
    var reqOpts: js.UndefOr[CoreOptions] = js.undefined
  }
  object ReqOpts {
    
    inline def apply(): ReqOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqOpts]
    }
    
    extension [Self <: ReqOpts](x: Self) {
      
      inline def setReqOpts(value: CoreOptions): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
      
      inline def setReqOptsUndefined: Self = StObject.set(x, "reqOpts", js.undefined)
    }
  }
  
  @js.native
  trait TypeofApiError
    extends StObject
       with Instantiable1[/* errorMessage */ String, ApiError] {
    
    /**
      * Pieces together an error message by combining all unique error messages
      * returned from a single GoogleError
      *
      * @private
      *
      * @param {GoogleErrorBody} err The original error.
      * @param {GoogleInnerError[]} [errors] Inner errors, if any.
      * @returns {string}
      */
    def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
    def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
  }
}
