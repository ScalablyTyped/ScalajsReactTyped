package typingsJapgolly.reactNotificationSystemRedux

import typingsJapgolly.reactNotificationSystemRedux.mod.NotificationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNotificationSystemReduxStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with NotificationLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with NotificationLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait success
    extends StObject
       with NotificationLevel
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait warning
    extends StObject
       with NotificationLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
