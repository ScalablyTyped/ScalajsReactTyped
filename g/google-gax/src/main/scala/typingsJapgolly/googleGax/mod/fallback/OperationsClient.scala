package typingsJapgolly.googleGax.mod.fallback

import typingsJapgolly.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.OperationsClient")
@js.native
open class OperationsClient protected ()
  extends typingsJapgolly.googleGax.buildSrcFallbackMod.OperationsClient {
  def this(
    gaxGrpc: typingsJapgolly.googleGax.buildSrcFallbackMod.GrpcClient,
    operationsProtos: Any,
    options: ClientOptions
  ) = this()
  def this(
    gaxGrpc: typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcClient,
    operationsProtos: Any,
    options: ClientOptions
  ) = this()
}
