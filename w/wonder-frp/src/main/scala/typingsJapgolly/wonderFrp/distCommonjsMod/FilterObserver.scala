package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
open class FilterObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ Any, Boolean],
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}
/* static members */
object FilterObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "FilterObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
  ): typingsJapgolly.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver]
}
