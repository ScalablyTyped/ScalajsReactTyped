package typingsJapgolly.wonderFrp.distEs2015Mod

import typingsJapgolly.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
open class FilterObserver protected ()
  extends typingsJapgolly.wonderFrp.distEs2015ObserverFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ Any, Boolean],
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream
  ) = this()
}
/* static members */
object FilterObserver {
  
  @JSImport("wonder-frp/dist/es2015", "FilterObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream
  ): typingsJapgolly.wonderFrp.distEs2015ObserverFilterObserverMod.FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015ObserverFilterObserverMod.FilterObserver]
}
