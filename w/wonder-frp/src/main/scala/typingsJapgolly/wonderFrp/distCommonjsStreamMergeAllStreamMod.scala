package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamMergeAllStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
  @js.native
  open class MergeAllStream protected () extends BaseStream {
    def this(source: Stream) = this()
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object MergeAllStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream): MergeAllStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[MergeAllStream]
  }
}
