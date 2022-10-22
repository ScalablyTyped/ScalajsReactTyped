package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRouter extends StObject {
  
  /**
    * Go back to previous page in the window.history.
    */
  def back(): js.Promise[Unit] = js.native
  
  def canTransition(): js.Promise[String | Boolean] = js.native
  
  def navChanged(direction: RouterDirection): js.Promise[Boolean] = js.native
  
  def printDebug(): js.Promise[Unit] = js.native
  
  /**
    * Navigate to the specified path.
    * @param path The path to navigate to.
    * @param direction The direction of the animation. Defaults to `"forward"`.
    */
  def push(path: String): js.Promise[Boolean] = js.native
  def push(path: String, direction: Unit, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def push(path: String, direction: RouterDirection): js.Promise[Boolean] = js.native
  def push(path: String, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  
  /**
    * The root path to use when matching URLs. By default, this is set to "/", but you can specify an alternate prefix for all URL paths.
    */
  var root: String = js.native
  
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the other side hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: Boolean = js.native
}
