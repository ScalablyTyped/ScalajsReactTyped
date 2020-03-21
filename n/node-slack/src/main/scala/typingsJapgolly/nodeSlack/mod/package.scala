package typingsJapgolly.nodeSlack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResponseCallback = js.Function2[/* err */ js.Any, /* query */ typingsJapgolly.nodeSlack.mod.Query, js.Any]
  type SendCallback = js.Function2[/* err */ js.Any, /* body */ js.Any, js.Any]
}
