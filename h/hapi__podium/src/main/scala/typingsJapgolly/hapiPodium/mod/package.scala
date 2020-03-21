package typingsJapgolly.hapiPodium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Criteria = java.lang.String | typingsJapgolly.hapiPodium.mod.CriteriaObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.hapiPodium.mod.EventOptionsObject
    - typingsJapgolly.hapiPodium.mod.Podium
  */
  type Events = typingsJapgolly.hapiPodium.mod._Events | java.lang.String
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[typingsJapgolly.hapiPodium.mod.Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
