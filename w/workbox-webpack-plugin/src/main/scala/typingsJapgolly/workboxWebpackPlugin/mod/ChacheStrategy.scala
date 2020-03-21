package typingsJapgolly.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst
  - typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly
  - typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst
  - typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly
  - typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate
*/
trait ChacheStrategy extends js.Object

object ChacheStrategy {
  @scala.inline
  def CacheFirst: typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst = this.cast("CacheFirst")
  @scala.inline
  def CacheOnly: typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly = this.cast("CacheOnly")
  @scala.inline
  def NetworkFirst: typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst = this.cast("NetworkFirst")
  @scala.inline
  def NetworkOnly: typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly = this.cast("NetworkOnly")
  @scala.inline
  def StaleWhileRevalidate: typingsJapgolly.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate = this.cast("StaleWhileRevalidate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

