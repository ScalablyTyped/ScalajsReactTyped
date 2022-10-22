package typingsJapgolly.angularUiRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "PathNode")
@js.native
open class PathNode protected ()
  extends typingsJapgolly.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject) = this()
}
/* static members */
object PathNode {
  
  @JSImport("angular-ui-router", "PathNode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  inline def clone(node: typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode): typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
}
