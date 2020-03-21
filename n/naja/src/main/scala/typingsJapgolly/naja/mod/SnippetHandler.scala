package typingsJapgolly.naja.mod

import typingsJapgolly.naja.najaStrings.afterUpdate
import typingsJapgolly.naja.najaStrings.beforeUpdate
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetHandler extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
}

