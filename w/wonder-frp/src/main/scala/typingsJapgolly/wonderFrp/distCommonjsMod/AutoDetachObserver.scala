package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
open class AutoDetachObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverAutoDetachObserverMod.AutoDetachObserver {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}
/* static members */
object AutoDetachObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(observer: IObserver): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observer.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[Any]
}
