package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamSkipUntilStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
  @js.native
  open class SkipUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    
    /* private */ var _otherStream: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    var isOpen: Boolean = js.native
  }
  /* static members */
  object SkipUntilStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, otherSteam: Stream): SkipUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[SkipUntilStream]
  }
}
