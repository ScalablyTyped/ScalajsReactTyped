package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
class FilterStream protected ()
  extends typingsJapgolly.wonderFrp.streamFilterStreamMod.FilterStream {
  def this(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typingsJapgolly.wonderFrp.coreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsJapgolly.wonderFrp.streamFilterStreamMod.FilterStream = js.native
}

