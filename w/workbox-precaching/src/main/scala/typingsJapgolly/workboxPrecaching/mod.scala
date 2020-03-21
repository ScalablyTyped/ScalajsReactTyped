package typingsJapgolly.workboxPrecaching

import typingsJapgolly.workboxCore.workboxPluginMod.WorkboxPlugin
import typingsJapgolly.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typingsJapgolly.workboxPrecaching.precacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-precaching", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PrecacheController ()
    extends typingsJapgolly.workboxPrecaching.precacheControllerMod.PrecacheController {
    def this(cacheName: String) = this()
  }
  
  def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = js.native
  def addRoute(): Unit = js.native
  def addRoute(options: FetchListenerOptions): Unit = js.native
  def cleanupOutdatedCaches(): Unit = js.native
  def getCacheKeyForURL(url: String): String = js.native
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
}

