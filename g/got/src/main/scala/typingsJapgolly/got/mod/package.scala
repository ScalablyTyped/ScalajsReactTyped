package typingsJapgolly.got

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * @param response Response object.
    * @param retryWithMergedOptions Retries request with the updated options.
    */
  type AfterResponseHook[Options, Body /* <: typingsJapgolly.node.Buffer | java.lang.String | js.Object */] = js.Function2[
    /* response */ typingsJapgolly.got.mod.Response[Body], 
    /* retryWithMergedOptions */ js.Function1[/* updateOptions */ Options, typingsJapgolly.got.mod.GotPromise[Body]], 
    typingsJapgolly.got.mod.Response[Body] | js.Promise[typingsJapgolly.got.mod.Response[Body]]
  ]
  type BeforeErrorHook = js.Function1[/* error */ typingsJapgolly.got.mod.GotError, js.Error | js.Promise[js.Error]]
  /**
    * @param options Normalized request options.
    */
  type BeforeRedirectHook[Options] = js.Function1[/* options */ Options, js.Any]
  /**
    * @param options Normalized request options.
    */
  type BeforeRequestHook[Options] = js.Function1[/* options */ Options, js.Any]
  /**
    * @param options Normalized request options.
    * @param error Request error.
    * @param retryCount Number of retry.
    */
  type BeforeRetryHook[Options] = js.Function3[
    /* options */ Options, 
    /* error */ typingsJapgolly.got.mod.GotError, 
    /* retryCount */ scala.Double, 
    js.Any
  ]
  type GotInstance[T] = T with (typingsJapgolly.std.Record[
    typingsJapgolly.got.gotStrings.get_ | typingsJapgolly.got.gotStrings.post_ | typingsJapgolly.got.gotStrings.put_ | typingsJapgolly.got.gotStrings.patch | typingsJapgolly.got.gotStrings.head_ | typingsJapgolly.got.gotStrings.delete_, 
    T
  ]) with typingsJapgolly.got.AnonCancelError
  type GotStreamFn = js.Function2[
    /* url */ typingsJapgolly.got.mod.GotUrl, 
    /* options */ js.UndefOr[typingsJapgolly.got.mod.GotOptions[java.lang.String | scala.Null]], 
    typingsJapgolly.got.mod.GotEmitter with typingsJapgolly.node.streamMod.Duplex
  ]
  type GotUrl = java.lang.String | typingsJapgolly.node.httpsMod.RequestOptions | typingsJapgolly.node.urlMod.Url | typingsJapgolly.node.urlMod.URL_
  /**
    * @param options Unnormalized request options.
    */
  type InitHook[Options] = js.Function1[/* options */ Options, scala.Unit]
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
}
