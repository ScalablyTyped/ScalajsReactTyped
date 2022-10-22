package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.Call
import typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.BaseFilter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCallCredentialsFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilter")
  @js.native
  open class CallCredentialsFilter protected () extends BaseFilter {
    def this(channel: Channel, stream: Call) = this()
    
    /* private */ val channel: Any = js.native
    
    /* private */ var serviceUrl: Any = js.native
    
    /* private */ val stream: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilterFactory")
  @js.native
  open class CallCredentialsFilterFactory protected ()
    extends StObject
       with FilterFactory[CallCredentialsFilter] {
    def this(channel: Channel) = this()
    
    /* private */ val channel: Any = js.native
    
    /* CompleteClass */
    override def createFilter(callStream: Call): CallCredentialsFilter = js.native
  }
}
