package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
open class TakeUntilStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream,
    otherStream: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}
/* static members */
object TakeUntilStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream,
    otherSteam: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
  ): typingsJapgolly.wonderFrp.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream]
}
