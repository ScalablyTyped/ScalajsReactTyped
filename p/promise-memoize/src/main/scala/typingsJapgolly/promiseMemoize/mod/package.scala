package typingsJapgolly.promiseMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.promiseMemoize.promiseMemoizeStrings.simple
    - typingsJapgolly.promiseMemoize.promiseMemoizeStrings.json
    - js.Function1[/ * args * / js.Array[js.Any], js.Any]
    - js.Array[
  typingsJapgolly.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
  */
  type KeyResolver = typingsJapgolly.promiseMemoize.mod._KeyResolver | (js.Function1[/* args */ js.Array[js.Any], js.Any]) | (js.Array[
    typingsJapgolly.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/* arg */ js.Any, js.Any])
  ])
}
