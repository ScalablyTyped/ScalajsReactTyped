package typingsJapgolly.awsSdkApplyBodyChecksumMiddleware

import typingsJapgolly.awsSdkApplyBodyChecksumMiddleware.anon.Instantiable
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.StreamHasher
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/apply-body-checksum-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Instantiable, encoder: Encoder): BuildMiddleware[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBodyChecksumMiddleware")(headerName.asInstanceOf[js.Any], hashCtor.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[Any, Any]]
  inline def applyBodyChecksumMiddleware[StreamType](
    headerName: String,
    hashCtor: Instantiable,
    encoder: Encoder,
    streamHasher: StreamHasher[StreamType]
  ): BuildMiddleware[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBodyChecksumMiddleware")(headerName.asInstanceOf[js.Any], hashCtor.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any], streamHasher.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[Any, Any]]
}
