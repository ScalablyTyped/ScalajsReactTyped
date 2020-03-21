package typingsJapgolly.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* options */ typingsJapgolly.wordpressApiFetch.mod.APIFetchOptions, 
    /* next */ js.Function1[
      /* options */ typingsJapgolly.wordpressApiFetch.mod.APIFetchOptions, 
      js.Promise[js.Any]
    ], 
    js.Promise[js.Any]
  ]
}
