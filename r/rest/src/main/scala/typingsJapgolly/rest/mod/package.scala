package typingsJapgolly.rest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Interceptor[T] = js.Function2[
    /* parent */ js.UndefOr[typingsJapgolly.rest.mod.Client], 
    /* config */ js.UndefOr[T], 
    typingsJapgolly.rest.mod.Client
  ]
}
