package typingsJapgolly.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR extends StObject
@JSImport("undici/lib/llhttp/constants", "ERROR")
@js.native
object ERROR extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR & Double] = js.native
  
  @js.native
  sealed trait CB_CHUNK_COMPLETE
    extends StObject
       with ERROR
  /* 20 */ val CB_CHUNK_COMPLETE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CB_CHUNK_COMPLETE & Double = js.native
  
  @js.native
  sealed trait CB_CHUNK_HEADER
    extends StObject
       with ERROR
  /* 19 */ val CB_CHUNK_HEADER: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CB_CHUNK_HEADER & Double = js.native
  
  @js.native
  sealed trait CB_HEADERS_COMPLETE
    extends StObject
       with ERROR
  /* 17 */ val CB_HEADERS_COMPLETE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CB_HEADERS_COMPLETE & Double = js.native
  
  @js.native
  sealed trait CB_MESSAGE_BEGIN
    extends StObject
       with ERROR
  /* 16 */ val CB_MESSAGE_BEGIN: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CB_MESSAGE_BEGIN & Double = js.native
  
  @js.native
  sealed trait CB_MESSAGE_COMPLETE
    extends StObject
       with ERROR
  /* 18 */ val CB_MESSAGE_COMPLETE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CB_MESSAGE_COMPLETE & Double = js.native
  
  @js.native
  sealed trait CLOSED_CONNECTION
    extends StObject
       with ERROR
  /* 5 */ val CLOSED_CONNECTION: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.CLOSED_CONNECTION & Double = js.native
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with ERROR
  /* 1 */ val INTERNAL: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INTERNAL & Double = js.native
  
  @js.native
  sealed trait INVALID_CHUNK_SIZE
    extends StObject
       with ERROR
  /* 12 */ val INVALID_CHUNK_SIZE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_CHUNK_SIZE & Double = js.native
  
  @js.native
  sealed trait INVALID_CONSTANT
    extends StObject
       with ERROR
  /* 8 */ val INVALID_CONSTANT: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_CONSTANT & Double = js.native
  
  @js.native
  sealed trait INVALID_CONTENT_LENGTH
    extends StObject
       with ERROR
  /* 11 */ val INVALID_CONTENT_LENGTH: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_CONTENT_LENGTH & Double = js.native
  
  @js.native
  sealed trait INVALID_EOF_STATE
    extends StObject
       with ERROR
  /* 14 */ val INVALID_EOF_STATE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_EOF_STATE & Double = js.native
  
  @js.native
  sealed trait INVALID_HEADER_TOKEN
    extends StObject
       with ERROR
  /* 10 */ val INVALID_HEADER_TOKEN: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_HEADER_TOKEN & Double = js.native
  
  @js.native
  sealed trait INVALID_METHOD
    extends StObject
       with ERROR
  /* 6 */ val INVALID_METHOD: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_METHOD & Double = js.native
  
  @js.native
  sealed trait INVALID_STATUS
    extends StObject
       with ERROR
  /* 13 */ val INVALID_STATUS: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_STATUS & Double = js.native
  
  @js.native
  sealed trait INVALID_TRANSFER_ENCODING
    extends StObject
       with ERROR
  /* 15 */ val INVALID_TRANSFER_ENCODING: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_TRANSFER_ENCODING & Double = js.native
  
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with ERROR
  /* 7 */ val INVALID_URL: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_URL & Double = js.native
  
  @js.native
  sealed trait INVALID_VERSION
    extends StObject
       with ERROR
  /* 9 */ val INVALID_VERSION: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.INVALID_VERSION & Double = js.native
  
  @js.native
  sealed trait LF_EXPECTED
    extends StObject
       with ERROR
  /* 3 */ val LF_EXPECTED: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.LF_EXPECTED & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with ERROR
  /* 0 */ val OK: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.OK & Double = js.native
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with ERROR
  /* 21 */ val PAUSED: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.PAUSED & Double = js.native
  
  @js.native
  sealed trait PAUSED_H2_UPGRADE
    extends StObject
       with ERROR
  /* 23 */ val PAUSED_H2_UPGRADE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.PAUSED_H2_UPGRADE & Double = js.native
  
  @js.native
  sealed trait PAUSED_UPGRADE
    extends StObject
       with ERROR
  /* 22 */ val PAUSED_UPGRADE: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.PAUSED_UPGRADE & Double = js.native
  
  @js.native
  sealed trait STRICT
    extends StObject
       with ERROR
  /* 2 */ val STRICT: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.STRICT & Double = js.native
  
  @js.native
  sealed trait UNEXPECTED_CONTENT_LENGTH
    extends StObject
       with ERROR
  /* 4 */ val UNEXPECTED_CONTENT_LENGTH: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.UNEXPECTED_CONTENT_LENGTH & Double = js.native
  
  @js.native
  sealed trait USER
    extends StObject
       with ERROR
  /* 24 */ val USER: typingsJapgolly.undici.libLlhttpConstantsMod.ERROR.USER & Double = js.native
}
