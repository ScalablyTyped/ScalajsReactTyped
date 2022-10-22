package typingsJapgolly.p2.global.p2

import typingsJapgolly.p2.mod.IslandManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.IslandManager")
@js.native
open class IslandManager ()
  extends typingsJapgolly.p2.mod.IslandManager {
  def this(options: IslandManagerOptions) = this()
}
/* static members */
object IslandManager {
  
  @JSGlobal("p2.IslandManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUnvisitedNode(nodes: js.Array[typingsJapgolly.p2.mod.IslandNode]): typingsJapgolly.p2.mod.IslandNode | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnvisitedNode")(nodes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.p2.mod.IslandNode | Boolean]
}
