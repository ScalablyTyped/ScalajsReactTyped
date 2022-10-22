package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
trait BootstrapClientTreeViewNodeCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}
object BootstrapClientTreeViewNodeCancelEventArgs {
  
  inline def apply(cancel: Boolean, node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeCancelEventArgs]
  }
  
  extension [Self <: BootstrapClientTreeViewNodeCancelEventArgs](x: Self) {
    
    inline def setNode(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
