package typingsJapgolly.twilioSync.treeMod

import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMapInterface[K, V]
  extends Map[K, V]
     with Iterable[js.Tuple2[K, V]]

