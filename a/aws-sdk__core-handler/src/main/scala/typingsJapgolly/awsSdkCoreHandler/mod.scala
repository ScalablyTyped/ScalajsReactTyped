package typingsJapgolly.awsSdkCoreHandler

import typingsJapgolly.awsSdkTypes.httpMod.HttpHandler
import typingsJapgolly.awsSdkTypes.httpMod.HttpOptions
import typingsJapgolly.awsSdkTypes.middlewareMod.Terminalware
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ResponseParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](httpHandler: HttpHandler[Stream, HttpOptions], responseParser: ResponseParser[Stream]): Terminalware[OutputConstraint, Stream] = js.native
}

