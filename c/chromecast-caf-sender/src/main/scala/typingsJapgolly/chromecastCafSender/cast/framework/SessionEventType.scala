package typingsJapgolly.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionEventType extends StObject
@JSGlobal("cast.framework.SessionEventType")
@js.native
object SessionEventType extends StObject {
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_CHANGED
    extends StObject
       with SessionEventType
  
  @js.native
  sealed trait APPLICATION_METADATA_CHANGED
    extends StObject
       with SessionEventType
  
  @js.native
  sealed trait APPLICATION_STATUS_CHANGED
    extends StObject
       with SessionEventType
  
  @js.native
  sealed trait MEDIA_SESSION
    extends StObject
       with SessionEventType
  
  @js.native
  sealed trait VOLUME_CHANGED
    extends StObject
       with SessionEventType
}
