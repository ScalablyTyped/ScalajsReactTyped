package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.distSrcPowergraphMod.LinkTypeAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Configuration")
@js.native
open class Configuration[Link] protected ()
  extends typingsJapgolly.webcola.distSrcPowergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[Any]) = this()
}
/* static members */
object Configuration {
  
  @JSImport("webcola", "Configuration")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEdges(
    modules: typingsJapgolly.webcola.distSrcPowergraphMod.ModuleSet,
    es: js.Array[typingsJapgolly.webcola.distSrcPowergraphMod.PowerEdge]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdges")(modules.asInstanceOf[js.Any], es.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
