package typingsJapgolly.staleLruCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OptionsCallback[K, V] = js.Function3[
    /* error */ js.Any, 
    /* value */ js.UndefOr[V], 
    /* options */ js.UndefOr[java.lang.String | (typingsJapgolly.staleLruCache.mod.SetOptions[K, V])], 
    scala.Unit
  ]
  type RevalidationCallback[K, V] = js.Function2[
    /* key */ K, 
    /* callback */ typingsJapgolly.staleLruCache.mod.OptionsCallback[K, V], 
    scala.Unit
  ]
}
