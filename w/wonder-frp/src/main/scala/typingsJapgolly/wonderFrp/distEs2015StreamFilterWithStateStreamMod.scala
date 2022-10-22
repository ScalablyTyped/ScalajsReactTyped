package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distEs2015StreamFilterStreamMod.FilterStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamFilterWithStateStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
  @js.native
  open class FilterWithStateStream protected () extends FilterStream {
    def this(
      source: Stream,
      predicate: js.Function3[
            /* value */ Any, 
            /* index */ js.UndefOr[Double], 
            /* source */ js.UndefOr[Stream], 
            Boolean
          ],
      thisArg: Any
    ) = this()
  }
  /* static members */
  object FilterWithStateStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      source: Stream,
      predicate: js.Function3[
          /* value */ Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: Any
    ): FilterWithStateStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[FilterWithStateStream]
  }
}
