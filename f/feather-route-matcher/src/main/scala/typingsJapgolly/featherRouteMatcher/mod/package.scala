package typingsJapgolly.featherRouteMatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Matcher[T] = js.Function1[/* path */ java.lang.String, typingsJapgolly.featherRouteMatcher.mod.Match[T]]
  type RouteConfig[T] = org.scalablytyped.runtime.StringDictionary[T]
}
