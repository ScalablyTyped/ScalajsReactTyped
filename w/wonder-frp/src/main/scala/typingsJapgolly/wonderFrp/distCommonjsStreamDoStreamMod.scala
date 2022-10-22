package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamDoStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/DoStream", "DoStream")
  @js.native
  open class DoStream protected () extends BaseStream {
    def this(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object DoStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/DoStream", "DoStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream): DoStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: js.Function, onError: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: js.Function, onError: Unit, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: Unit, onError: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: Unit, onError: js.Function, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    inline def create(source: Stream, onNext: Unit, onError: Unit, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
  }
}
