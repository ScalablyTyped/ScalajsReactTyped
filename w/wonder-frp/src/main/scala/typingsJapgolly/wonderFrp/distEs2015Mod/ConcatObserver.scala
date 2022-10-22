package typingsJapgolly.wonderFrp.distEs2015Mod

import typingsJapgolly.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
open class ConcatObserver protected ()
  extends typingsJapgolly.wonderFrp.distEs2015ObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}
/* static members */
object ConcatObserver {
  
  @JSImport("wonder-frp/dist/es2015", "ConcatObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, startNextStream: js.Function): typingsJapgolly.wonderFrp.distEs2015ObserverConcatObserverMod.ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015ObserverConcatObserverMod.ConcatObserver]
}
