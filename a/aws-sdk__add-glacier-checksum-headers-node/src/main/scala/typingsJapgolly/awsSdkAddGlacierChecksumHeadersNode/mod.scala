package typingsJapgolly.awsSdkAddGlacierChecksumHeadersNode

import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandler
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Readable], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Readable], js.Promise[_]]
  ] = js.native
}

