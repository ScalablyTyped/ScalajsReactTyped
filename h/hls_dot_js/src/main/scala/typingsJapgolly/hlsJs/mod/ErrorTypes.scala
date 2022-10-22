package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorTypes extends StObject
@JSImport("hls.js", "ErrorTypes")
@js.native
object ErrorTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorTypes & String] = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_ERROR
    extends StObject
       with ErrorTypes
  /* "keySystemError" */ val KEY_SYSTEM_ERROR: typingsJapgolly.hlsJs.mod.ErrorTypes.KEY_SYSTEM_ERROR & String = js.native
  
  @js.native
  sealed trait MEDIA_ERROR
    extends StObject
       with ErrorTypes
  /* "mediaError" */ val MEDIA_ERROR: typingsJapgolly.hlsJs.mod.ErrorTypes.MEDIA_ERROR & String = js.native
  
  @js.native
  sealed trait MUX_ERROR
    extends StObject
       with ErrorTypes
  /* "muxError" */ val MUX_ERROR: typingsJapgolly.hlsJs.mod.ErrorTypes.MUX_ERROR & String = js.native
  
  @js.native
  sealed trait NETWORK_ERROR
    extends StObject
       with ErrorTypes
  /* "networkError" */ val NETWORK_ERROR: typingsJapgolly.hlsJs.mod.ErrorTypes.NETWORK_ERROR & String = js.native
  
  @js.native
  sealed trait OTHER_ERROR
    extends StObject
       with ErrorTypes
  /* "otherError" */ val OTHER_ERROR: typingsJapgolly.hlsJs.mod.ErrorTypes.OTHER_ERROR & String = js.native
}
