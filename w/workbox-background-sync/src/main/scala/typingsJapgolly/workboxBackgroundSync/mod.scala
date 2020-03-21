package typingsJapgolly.workboxBackgroundSync

import typingsJapgolly.workboxBackgroundSync.queueMod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Plugin protected ()
    extends typingsJapgolly.workboxBackgroundSync.pluginMod.Plugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  @js.native
  class Queue protected ()
    extends typingsJapgolly.workboxBackgroundSync.queueMod.Queue {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
}

