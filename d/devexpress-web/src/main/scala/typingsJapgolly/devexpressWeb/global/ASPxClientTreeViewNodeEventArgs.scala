package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("ASPxClientTreeViewNodeEventArgs")
@js.native
open class ASPxClientTreeViewNodeEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTreeViewNodeEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeEventArgs type with the specified value.
    * @param node An ASPxClientTreeViewNode object representing the node related to the event.
    */
  def this(node: typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode) = this()
  
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  var node: typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
}
