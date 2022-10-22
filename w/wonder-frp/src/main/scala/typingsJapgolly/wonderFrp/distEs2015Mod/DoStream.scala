package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
open class DoStream protected ()
  extends typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream {
  def this(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}
/* static members */
object DoStream {
  
  @JSImport("wonder-frp/dist/es2015", "DoStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream, onNext: js.Function): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: Unit,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: Unit,
    onError: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: Unit,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
  inline def create(
    source: typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream,
    onNext: Unit,
    onError: Unit,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamDoStreamMod.DoStream]
}
