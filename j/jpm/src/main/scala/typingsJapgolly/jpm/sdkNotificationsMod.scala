package typingsJapgolly.jpm

import typingsJapgolly.jpm.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Display transient, toaster-style desktop messages to the user
  */
object sdkNotificationsMod {
  
  @JSImport("sdk/notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notify_(options: Data): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
