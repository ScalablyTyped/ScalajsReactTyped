package typingsJapgolly.nodeRsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.nodeRsa.mod.KeyComponentsPrivate
    - typingsJapgolly.nodeRsa.mod.KeyComponentsPublic
  */
  type Key = typingsJapgolly.nodeRsa.mod._Key | java.lang.String | typingsJapgolly.node.Buffer
}
