package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.NotificationConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.Notification")
@js.native
/**
  * Notification
  */
open class Notification ()
  extends typingsJapgolly.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}
object Notification {
  
  @JSGlobal("Electron.Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
