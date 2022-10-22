package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
@js.native
open class FilterWithStateStream protected ()
  extends typingsJapgolly.wonderFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream {
  def this(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: Any
  ) = this()
}
/* static members */
object FilterWithStateStream {
  
  @JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: Any
  ): typingsJapgolly.wonderFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream]
}
