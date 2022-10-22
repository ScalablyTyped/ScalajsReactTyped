package typingsJapgolly.ipfsGrpcServer

import typingsJapgolly.ipfsCoreTypes.mod.IPFS
import typingsJapgolly.ipfsGrpcServer.distSrcTypesMod.Options
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsMfsWriteMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/mfs/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grpcMfsWrite(ipfs: IPFS[js.Object]): js.Function3[
    /* arg1 */ AsyncIterable[Any], 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("grpcMfsWrite")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ AsyncIterable[Any], 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ]]
  inline def grpcMfsWrite(ipfs: IPFS[js.Object], options: Options): js.Function3[
    /* arg1 */ AsyncIterable[Any], 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("grpcMfsWrite")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* arg1 */ AsyncIterable[Any], 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ]]
}
