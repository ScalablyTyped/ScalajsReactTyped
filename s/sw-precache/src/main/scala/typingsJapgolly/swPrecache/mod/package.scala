package typingsJapgolly.swPrecache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Generate_ = js.Function2[
    /* options */ js.UndefOr[typingsJapgolly.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[
      js.Function2[
        /* error */ typingsJapgolly.node.NodeJS.ErrnoException, 
        /* serviceWorkerString */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Promise[java.lang.String]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.swPrecache.swPrecacheStrings.networkFirst
    - typingsJapgolly.swPrecache.swPrecacheStrings.cacheFirst
    - typingsJapgolly.swPrecache.swPrecacheStrings.fastest
    - typingsJapgolly.swPrecache.swPrecacheStrings.cacheOnly
    - typingsJapgolly.swPrecache.swPrecacheStrings.networkOnly
    - typingsJapgolly.swToolbox.mod.Handler
  */
  type Handler = typingsJapgolly.swPrecache.mod._Handler | typingsJapgolly.swToolbox.mod.Handler
  type Write_ = js.Function3[
    /* filePath */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ typingsJapgolly.node.NodeJS.ErrnoException, scala.Unit]], 
    js.Promise[java.lang.String]
  ]
}
