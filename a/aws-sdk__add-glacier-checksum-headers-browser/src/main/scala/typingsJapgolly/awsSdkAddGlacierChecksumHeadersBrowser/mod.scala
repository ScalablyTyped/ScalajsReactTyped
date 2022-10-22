package typingsJapgolly.awsSdkAddGlacierChecksumHeadersBrowser

import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.BuildHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerArguments
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[Any, Any], 
    js.Function1[/* hasHasBodyHeadersRequestRestRest */ BuildHandlerArguments[Any], js.Promise[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeaders")(Sha256.asInstanceOf[js.Any], fromUtf8.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ BuildHandler[Any, Any], 
    js.Function1[/* hasHasBodyHeadersRequestRestRest */ BuildHandlerArguments[Any], js.Promise[Any]]
  ]]
}
