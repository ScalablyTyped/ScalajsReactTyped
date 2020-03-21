package typingsJapgolly.jsonStableStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparator = js.Function2[
    /* a */ typingsJapgolly.jsonStableStringify.mod.Element, 
    /* b */ typingsJapgolly.jsonStableStringify.mod.Element, 
    scala.Double
  ]
  type Replacer = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
