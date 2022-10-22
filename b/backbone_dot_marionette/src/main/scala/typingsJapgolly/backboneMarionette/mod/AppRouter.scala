package typingsJapgolly.backboneMarionette.mod

import typingsJapgolly.backbone.mod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "AppRouter")
@js.native
open class AppRouter () extends Router {
  def this(options: AppRouterOptions) = this()
  
  /**
    * Add an app route at runtime.
    */
  def appRoute(route: String, methodName: String): Unit = js.native
  
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: Any = js.native
  
  /**
    * Fires whenever the user navigates to a new route in your application
    * that matches a route.
    */
  def onRoute(name: String, path: String, args: js.Array[Any]): Unit = js.native
  
  /**
    * Specify a controller with the multiple routes at runtime. This will
    * preserve the existing controller as well.
    */
  def processAppRoutes(controller: Any, appRoutes: AppRoutes): Unit = js.native
}
