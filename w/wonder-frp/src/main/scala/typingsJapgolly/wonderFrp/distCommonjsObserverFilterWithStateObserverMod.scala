package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver
import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsObserverFilterWithStateObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
  @js.native
  open class FilterWithStateObserver protected () extends FilterObserver {
    def this(prevObserver: IObserver, predicate: js.Function1[/* value */ Any, Boolean], source: Stream) = this()
    
    /* private */ var _isTrigger: Any = js.native
  }
  /* static members */
  object FilterWithStateObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      prevObserver: IObserver,
      predicate: js.Function3[
          /* value */ Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      source: Stream
    ): FilterWithStateObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[FilterWithStateObserver]
  }
}
