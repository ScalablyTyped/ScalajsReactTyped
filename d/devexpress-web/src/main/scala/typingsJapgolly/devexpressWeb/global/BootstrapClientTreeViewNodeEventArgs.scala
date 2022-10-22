package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("BootstrapClientTreeViewNodeEventArgs")
@js.native
open class BootstrapClientTreeViewNodeEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientTreeViewNodeEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTreeViewNodeEventArgs type with the specified value.
    * @param node An BootstrapClientTreeViewNode object representing the node related to the event.
    */
  def this(node: typingsJapgolly.devexpressWeb.BootstrapClientTreeViewNode) = this()
  
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  var node: typingsJapgolly.devexpressWeb.BootstrapClientTreeViewNode = js.native
}
