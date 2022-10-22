package typingsJapgolly.googleGax.mod

import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("google-gax", "ChannelCredentials")
@js.native
/* protected */ open class ChannelCredentials ()
  extends typingsJapgolly.grpcGrpcJs.mod.ChannelCredentials {
  /* protected */ def this(callCredentials: CallCredentials) = this()
}
/* static members */
object ChannelCredentials {
  
  @JSImport("google-gax", "ChannelCredentials")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return a new ChannelCredentials instance with credentials created using
    * the provided secureContext. The resulting instances can be used to
    * construct a Channel that communicates over TLS. gRPC will not override
    * anything in the provided secureContext, so the environment variables
    * GRPC_SSL_CIPHER_SUITES and GRPC_DEFAULT_SSL_ROOTS_FILE_PATH will
    * not be applied.
    * @param secureContext The return value of tls.createSecureContext()
    * @param verifyOptions Additional options to modify certificate verification
    */
  inline def createFromSecureContext(secureContext: SecureContext): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
  inline def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
  
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  inline def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
  
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    * @param verifyOptions Additional options to modify certificate verification
    */
  inline def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
}
