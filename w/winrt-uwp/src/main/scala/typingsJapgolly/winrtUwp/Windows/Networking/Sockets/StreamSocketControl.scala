package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
@js.native
abstract class StreamSocketControl () extends js.Object {
  /** Gets or sets the client SSL/TLS certificate that will be sent to the server if the server requests a client certificate. */
  var clientCertificate: Certificate = js.native
  /** Get a vector of SSL server errors to ignore when making an SSL connection with a StreamSocket . */
  var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
  /** A value that indicates whether keep-alive packets are sent to the remote destination on a StreamSocket object. */
  var keepAlive: Boolean = js.native
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object. */
  var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object. */
  var outboundUnicastHopLimit: Double = js.native
  /** The quality of service on a StreamSocket object. */
  var qualityOfService: SocketQualityOfService = js.native
  /** A value that indicates whether, when multiple connection attempts are being made, the attempts are made in parallel or serially. */
  var serializeConnectionAttempts: Boolean = js.native
}

