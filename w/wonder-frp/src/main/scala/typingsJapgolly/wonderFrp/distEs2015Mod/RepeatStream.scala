package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "RepeatStream")
@js.native
open class RepeatStream protected ()
  extends typingsJapgolly.wonderFrp.distEs2015StreamRepeatStreamMod.RepeatStream {
  def this(source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream, count: Double) = this()
}
/* static members */
object RepeatStream {
  
  @JSImport("wonder-frp/dist/es2015", "RepeatStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream, count: Double): typingsJapgolly.wonderFrp.distEs2015StreamRepeatStreamMod.RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamRepeatStreamMod.RepeatStream]
}
