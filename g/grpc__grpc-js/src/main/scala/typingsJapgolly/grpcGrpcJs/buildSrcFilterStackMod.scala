package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.Call
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.WriteObject
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.Filter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFilterStackMod {
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStack")
  @js.native
  open class FilterStack protected ()
    extends StObject
       with Filter {
    def this(filters: js.Array[Filter]) = this()
    
    /* private */ val filters: Any = js.native
    
    def getFilters(): js.Array[Filter] = js.native
    
    def push(filters: js.Array[Filter]): Unit = js.native
    
    /* CompleteClass */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def receiveMetadata(metadata: Metadata): Metadata = js.native
    
    /* CompleteClass */
    override def receiveTrailers(status: StatusObject): StatusObject = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /* CompleteClass */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    
    /* CompleteClass */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStackFactory")
  @js.native
  open class FilterStackFactory protected ()
    extends StObject
       with FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    
    /* CompleteClass */
    override def createFilter(callStream: Call): FilterStack = js.native
    
    /* private */ val factories: Any = js.native
    
    def push(filterFactories: js.Array[FilterFactory[Filter]]): Unit = js.native
  }
}
