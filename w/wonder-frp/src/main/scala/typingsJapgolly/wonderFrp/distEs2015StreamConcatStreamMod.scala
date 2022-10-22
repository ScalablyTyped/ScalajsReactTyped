package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamConcatStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/ConcatStream", "ConcatStream")
  @js.native
  open class ConcatStream protected () extends BaseStream {
    def this(sources: js.Array[Stream]) = this()
    
    /* private */ var _sources: Any = js.native
  }
  /* static members */
  object ConcatStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/ConcatStream", "ConcatStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(sources: js.Array[Stream]): ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[ConcatStream]
  }
}
