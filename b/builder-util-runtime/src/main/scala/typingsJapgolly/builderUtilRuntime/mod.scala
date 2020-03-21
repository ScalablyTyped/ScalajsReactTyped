package typingsJapgolly.builderUtilRuntime

import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.installerDotexe
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.packageDot7z
import typingsJapgolly.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typingsJapgolly.builderUtilRuntime.publishOptionsMod.GithubOptions
import typingsJapgolly.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CancellationError ()
    extends typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationError
  
  @js.native
  class CancellationToken ()
    extends typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken {
    def this(parent: typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class DigestTransform protected ()
    extends typingsJapgolly.builderUtilRuntime.httpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typingsJapgolly.builderUtilRuntime.httpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
  }
  
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typingsJapgolly.builderUtilRuntime.httpExecutorMod.HttpExecutor[REQUEST]
  
  @js.native
  class ProgressCallbackTransform protected ()
    extends typingsJapgolly.builderUtilRuntime.progressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
    ) = this()
  }
  
  @js.native
  class UUID protected ()
    extends typingsJapgolly.builderUtilRuntime.uuidMod.UUID {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
  }
  
  @js.native
  class XElement protected ()
    extends typingsJapgolly.builderUtilRuntime.xmlMod.XElement {
    def this(name: String) = this()
  }
  
  val CURRENT_APP_INSTALLER_FILE_NAME: installerDotexe = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: packageDot7z = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = js.native
  def createHttpError(response: IncomingMessage): typingsJapgolly.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typingsJapgolly.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  def githubUrl(options: GithubOptions): String = js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  def newError(message: String, code: String): js.Error = js.native
  def parseDn(seq: String): Map[String, String] = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def parseXml(data: String): typingsJapgolly.builderUtilRuntime.xmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  /* static members */
  @js.native
  object HttpExecutor extends js.Object {
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  /* static members */
  @js.native
  object UUID extends js.Object {
    val OID: Buffer = js.native
    def check(uuid: String): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: String, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def parse(input: String): Buffer = js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
}

