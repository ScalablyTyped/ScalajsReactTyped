package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
open class MapStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsStreamMapStreamMod.MapStream {
  def this(source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream, selector: js.Function) = this()
}
/* static members */
object MapStream {
  
  @JSImport("wonder-frp/dist/commonjs", "MapStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream, selector: js.Function): typingsJapgolly.wonderFrp.distCommonjsStreamMapStreamMod.MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamMapStreamMod.MapStream]
}
