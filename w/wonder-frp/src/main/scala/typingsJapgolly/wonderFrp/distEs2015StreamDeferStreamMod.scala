package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamDeferStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
  @js.native
  open class DeferStream protected () extends BaseStream {
    def this(buildStreamFunc: js.Function) = this()
    
    /* private */ var _buildStreamFunc: Any = js.native
  }
  /* static members */
  object DeferStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(buildStreamFunc: js.Function): DeferStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buildStreamFunc.asInstanceOf[js.Any]).asInstanceOf[DeferStream]
  }
}
