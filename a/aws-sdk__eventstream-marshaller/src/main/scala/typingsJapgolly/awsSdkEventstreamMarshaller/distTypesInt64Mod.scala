package typingsJapgolly.awsSdkEventstreamMarshaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInt64Mod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist-types/Int64", "Int64")
  @js.native
  open class Int64 protected ()
    extends typingsJapgolly.awsSdkEventstreamCodec.mod.Int64 {
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-marshaller/dist-types/Int64", "Int64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromNumber(number: Double): typingsJapgolly.awsSdkEventstreamCodec.distTypesInt64Mod.Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsSdkEventstreamCodec.distTypesInt64Mod.Int64]
  }
}
