package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends typingsJapgolly.wonderFrp.filterWithStateStreamMod.FilterWithStateStream

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsJapgolly.wonderFrp.filterWithStateStreamMod.FilterWithStateStream = js.native
}

