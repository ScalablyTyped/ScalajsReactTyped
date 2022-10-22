package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
trait BootstrapClientTreeViewNodeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}
object BootstrapClientTreeViewNodeEventArgs {
  
  inline def apply(node: BootstrapClientTreeViewNode): BootstrapClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeEventArgs]
  }
  
  extension [Self <: BootstrapClientTreeViewNodeEventArgs](x: Self) {
    
    inline def setNode(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
