package typingsJapgolly.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FLAGS extends StObject
@JSImport("undici/lib/llhttp/constants", "FLAGS")
@js.native
object FLAGS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FLAGS & Double] = js.native
  
  @js.native
  sealed trait CHUNKED
    extends StObject
       with FLAGS
  /* 8 */ val CHUNKED: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.CHUNKED & Double = js.native
  
  @js.native
  sealed trait CONNECTION_CLOSE
    extends StObject
       with FLAGS
  /* 2 */ val CONNECTION_CLOSE: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.CONNECTION_CLOSE & Double = js.native
  
  @js.native
  sealed trait CONNECTION_KEEP_ALIVE
    extends StObject
       with FLAGS
  /* 1 */ val CONNECTION_KEEP_ALIVE: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.CONNECTION_KEEP_ALIVE & Double = js.native
  
  @js.native
  sealed trait CONNECTION_UPGRADE
    extends StObject
       with FLAGS
  /* 4 */ val CONNECTION_UPGRADE: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.CONNECTION_UPGRADE & Double = js.native
  
  @js.native
  sealed trait CONTENT_LENGTH
    extends StObject
       with FLAGS
  /* 32 */ val CONTENT_LENGTH: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.CONTENT_LENGTH & Double = js.native
  
  @js.native
  sealed trait SKIPBODY
    extends StObject
       with FLAGS
  /* 64 */ val SKIPBODY: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.SKIPBODY & Double = js.native
  
  @js.native
  sealed trait TRAILING
    extends StObject
       with FLAGS
  /* 128 */ val TRAILING: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.TRAILING & Double = js.native
  
  @js.native
  sealed trait TRANSFER_ENCODING
    extends StObject
       with FLAGS
  /* 512 */ val TRANSFER_ENCODING: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.TRANSFER_ENCODING & Double = js.native
  
  @js.native
  sealed trait UPGRADE
    extends StObject
       with FLAGS
  /* 16 */ val UPGRADE: typingsJapgolly.undici.libLlhttpConstantsMod.FLAGS.UPGRADE & Double = js.native
}
