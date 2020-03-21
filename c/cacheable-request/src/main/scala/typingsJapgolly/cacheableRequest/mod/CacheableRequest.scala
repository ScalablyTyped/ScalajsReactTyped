package typingsJapgolly.cacheableRequest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        (RequestOptions with typingsJapgolly.httpCacheSemantics.mod.Options) | String | URL_, 
        js.UndefOr[js.Function1[ServerResponse | typingsJapgolly.responselike.mod.^ , Unit]], 
        Emitter
      ]
    ]
     with Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
      js.Function2[
        (RequestOptions with typingsJapgolly.httpCacheSemantics.mod.Options) | String | URL_, 
        js.UndefOr[js.Function1[ServerResponse | typingsJapgolly.responselike.mod.^ , Unit]], 
        Emitter
      ]
    ] {
  var CacheError: Instantiable1[/* error */ js.Error, CacheErrorCls] = js.native
  var RequestError: Instantiable1[/* error */ js.Error, RequestErrorCls] = js.native
}

