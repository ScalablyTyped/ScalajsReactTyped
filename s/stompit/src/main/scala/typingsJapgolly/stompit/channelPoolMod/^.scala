package typingsJapgolly.stompit.channelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class ^ protected () extends ChannelPool {
  def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^) = this()
  def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsJapgolly.stompit.channelMod.^, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
}

