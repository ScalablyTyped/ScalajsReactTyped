package typingsJapgolly.rsmq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* response */ T, scala.Unit]
  type DeleteQueueOptions = typingsJapgolly.rsmq.mod.BaseOptions
  type GetQueueAttributesOptions = typingsJapgolly.rsmq.mod.BaseOptions
  type PopMessageOptions = typingsJapgolly.rsmq.mod.BaseOptions
}
