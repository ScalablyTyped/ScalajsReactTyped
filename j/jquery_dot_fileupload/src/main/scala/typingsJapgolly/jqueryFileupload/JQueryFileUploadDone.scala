package typingsJapgolly.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadDone
  extends StObject
     with JQueryFileInputOptions
     with JQueryFileUploadXhr
object JQueryFileUploadDone {
  
  inline def apply(
    errorThrown: Any,
    headers: StringDictionary[Any],
    jqXHR: JQueryXHR,
    result: Any,
    textStatus: String
  ): JQueryFileUploadDone = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadDone]
  }
}
