package typingsJapgolly.awsSdkResponseMetadataExtractor

import typingsJapgolly.awsSdkTypes.httpMod.HttpResponse
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/response-metadata-extractor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extractMetadata(httpResponse: HttpResponse[_]): ResponseMetadata = js.native
}

