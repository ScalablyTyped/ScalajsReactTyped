package typingsJapgolly.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends StObject
@JSImport("node-forge", "tls.CompressionMethod")
@js.native
object CompressionMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod & Double] = js.native
  
  @js.native
  sealed trait deflate
    extends StObject
       with CompressionMethod
  /* 1 */ val deflate: typingsJapgolly.nodeForge.mod.tls.CompressionMethod.deflate & Double = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with CompressionMethod
  /* 0 */ val none: typingsJapgolly.nodeForge.mod.tls.CompressionMethod.none & Double = js.native
}
