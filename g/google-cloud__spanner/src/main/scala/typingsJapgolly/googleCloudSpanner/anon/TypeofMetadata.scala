package typingsJapgolly.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.googleGax.mod.grpc.Metadata
import typingsJapgolly.node.http2Mod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMetadata
  extends StObject
     with Instantiable0[Metadata] {
  
  /**
    * Returns a new Metadata object based fields in a given IncomingHttpHeaders
    * object.
    * @param headers An IncomingHttpHeaders object.
    */
  def fromHttp2Headers(headers: IncomingHttpHeaders): typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata = js.native
}
