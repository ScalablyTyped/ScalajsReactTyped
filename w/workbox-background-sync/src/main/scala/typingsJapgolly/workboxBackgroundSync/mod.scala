package typingsJapgolly.workboxBackgroundSync

import typingsJapgolly.workboxBackgroundSync.queueMod.QueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-background-sync", "Plugin")
  @js.native
  open class Plugin protected ()
    extends typingsJapgolly.workboxBackgroundSync.pluginMod.Plugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  @JSImport("workbox-background-sync", "Queue")
  @js.native
  open class Queue protected ()
    extends typingsJapgolly.workboxBackgroundSync.queueMod.Queue {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
}
