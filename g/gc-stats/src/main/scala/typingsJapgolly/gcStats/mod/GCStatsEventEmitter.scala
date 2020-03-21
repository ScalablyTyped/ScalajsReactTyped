package typingsJapgolly.gcStats.mod

import typingsJapgolly.gcStats.gcStatsStrings.stats
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCStatsEventEmitter extends EventEmitter {
  @JSName("addListener")
  def addListener_stats(event: stats, listener: GCStatsListener): this.type = js.native
  @JSName("on")
  def on_stats(event: stats, listener: GCStatsListener): this.type = js.native
  @JSName("once")
  def once_stats(event: stats, listener: GCStatsListener): this.type = js.native
}

