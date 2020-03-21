package typingsJapgolly.awsSdkMiddlewareEc2Copysnapshot.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials]
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[HttpEndpoint]
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String]
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder
}

object AddPresignedUrlParameters {
  @scala.inline
  def apply(
    base64Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String],
    credentials: CallbackTo[js.Promise[Credentials]],
    endpoint: CallbackTo[js.Promise[HttpEndpoint]],
    region: CallbackTo[js.Promise[String]],
    sha256: HashConstructor,
    utf8Decoder: /* input */ String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array]
  ): AddPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.updateDynamic("base64Encoder")(js.Any.fromFunction1((t0: /* input */ scala.scalajs.js.typedarray.Uint8Array) => base64Encoder(t0).runNow()))
    __obj.updateDynamic("credentials")(credentials.toJsFn)
    __obj.updateDynamic("endpoint")(endpoint.toJsFn)
    __obj.updateDynamic("region")(region.toJsFn)
    __obj.updateDynamic("utf8Decoder")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => utf8Decoder(t0).runNow()))
    __obj.asInstanceOf[AddPresignedUrlParameters]
  }
}

