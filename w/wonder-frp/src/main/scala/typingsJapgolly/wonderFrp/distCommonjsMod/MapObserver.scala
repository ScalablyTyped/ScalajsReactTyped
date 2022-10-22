package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
open class MapObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverMapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}
/* static members */
object MapObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MapObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, selector: js.Function): typingsJapgolly.wonderFrp.distCommonjsObserverMapObserverMod.MapObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsObserverMapObserverMod.MapObserver]
}
