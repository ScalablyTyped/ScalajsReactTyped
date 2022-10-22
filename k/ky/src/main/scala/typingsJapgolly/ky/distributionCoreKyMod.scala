package typingsJapgolly.ky

import org.scalajs.dom.AbortController
import org.scalajs.dom.Request
import org.scalajs.dom.Response
import typingsJapgolly.ky.distributionTypesOptionsMod.DownloadProgress
import typingsJapgolly.ky.distributionTypesOptionsMod.Input
import typingsJapgolly.ky.distributionTypesOptionsMod.InternalOptions
import typingsJapgolly.ky.distributionTypesOptionsMod.Options
import typingsJapgolly.ky.distributionTypesResponsePromiseMod.ResponsePromise
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionCoreKyMod {
  
  @JSImport("ky/distribution/core/Ky", "Ky")
  @js.native
  open class Ky protected () extends StObject {
    def this(input: Input) = this()
    def this(input: Input, options: Options) = this()
    
    /* protected */ def _calculateRetryDelay(error: Any): Double = js.native
    
    /* protected */ def _decorateResponse(response: Response): Response = js.native
    
    /* protected */ def _fetch(): js.Promise[Response] = js.native
    
    /* protected */ var _input: Input = js.native
    
    /* protected */ var _options: InternalOptions = js.native
    
    /* protected */ def _retry[T /* <: js.Function1[/* args */ Any, js.Promise[Any]] */](fn: T): js.Promise[ReturnType[T] | Unit] = js.native
    
    /* protected */ var _retryCount: Double = js.native
    
    /* protected */ def _stream(response: Response): Response = js.native
    /* protected */ def _stream(
      response: Response,
      onDownloadProgress: js.Function2[/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array, Unit]
    ): Response = js.native
    
    /* protected */ var abortController: js.UndefOr[AbortController] = js.native
    
    var request: Request = js.native
  }
  /* static members */
  object Ky {
    
    @JSImport("ky/distribution/core/Ky", "Ky")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(input: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
  }
}
