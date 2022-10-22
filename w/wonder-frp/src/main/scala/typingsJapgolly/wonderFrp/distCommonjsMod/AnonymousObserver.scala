package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "AnonymousObserver")
@js.native
open class AnonymousObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverAnonymousObserverMod.AnonymousObserver {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}
/* static members */
object AnonymousObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "AnonymousObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): typingsJapgolly.wonderFrp.distCommonjsObserverAnonymousObserverMod.AnonymousObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsObserverAnonymousObserverMod.AnonymousObserver]
}
