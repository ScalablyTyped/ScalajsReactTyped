package typingsJapgolly.webosService

import typingsJapgolly.webosService.activityManagerMod.ActivityManager
import typingsJapgolly.webosService.mod.default
import typingsJapgolly.webosService.serviceMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("WebosService")
  @js.native
  open class WebosService protected () extends default {
    def this(busId: String) = this()
    def this(busId: String, activityManager: ActivityManager) = this()
    def this(busId: String, activityManager: Unit, options: ServiceOptions) = this()
    def this(busId: String, activityManager: ActivityManager, options: ServiceOptions) = this()
  }
}
