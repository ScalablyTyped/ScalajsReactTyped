package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
open class FilterWithStateStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream {
  def this(
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: Any
  ) = this()
}
/* static members */
object FilterWithStateStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: Any
  ): typingsJapgolly.wonderFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream]
}
