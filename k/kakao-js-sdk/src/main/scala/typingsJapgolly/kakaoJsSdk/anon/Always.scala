package typingsJapgolly.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.FileList
import typingsJapgolly.kakaoJsSdk.Kakao.API.ApiError
import typingsJapgolly.kakaoJsSdk.Kakao.API.ApiResponse
import typingsJapgolly.kakaoJsSdk.Kakao.API.RequestAlwaysCallback
import typingsJapgolly.kakaoJsSdk.Kakao.API.RequestFailCallback
import typingsJapgolly.kakaoJsSdk.Kakao.API.RequestSuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Always extends StObject {
  
  var always: js.UndefOr[RequestAlwaysCallback] = js.undefined
  
  // Kakao REST API urls
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var fail: js.UndefOr[RequestFailCallback] = js.undefined
  
  var files: js.UndefOr[FileList | (js.Array[Blob | org.scalajs.dom.File])] = js.undefined
  
  var success: js.UndefOr[RequestSuccessCallback] = js.undefined
  
  var url: String
}
object Always {
  
  inline def apply(url: String): Always = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  
  extension [Self <: Always](x: Self) {
    
    inline def setAlways(value: /* param */ ApiResponse | ApiError => japgolly.scalajs.react.Callback): Self = StObject.set(x, "always", js.Any.fromFunction1((t0: /* param */ ApiResponse | ApiError) => value(t0).runNow()))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFail(value: /* error */ ApiError => japgolly.scalajs.react.Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* error */ ApiError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFiles(value: FileList | (js.Array[Blob | org.scalajs.dom.File])): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: (Blob | org.scalajs.dom.File)*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setSuccess(value: /* response */ ApiResponse => japgolly.scalajs.react.Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* response */ ApiResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
