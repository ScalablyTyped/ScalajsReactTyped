package typingsJapgolly.awsSdkResponseMetadataExtractor

import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpResponse
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/response-metadata-extractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractMetadata(httpResponse: HttpResponse): ResponseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMetadata")(httpResponse.asInstanceOf[js.Any]).asInstanceOf[ResponseMetadata]
}
