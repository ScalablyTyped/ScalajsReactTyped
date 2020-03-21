package typingsJapgolly.arg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[T] = js.Function3[
    /* value */ java.lang.String, 
    /* name */ java.lang.String, 
    /* previousValue */ js.UndefOr[T], 
    T
  ]
  type Spec = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsJapgolly.arg.mod.Handler[js.Any] | js.Array[typingsJapgolly.arg.mod.Handler[js.Any]]
  ]
}
