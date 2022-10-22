package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.GroupRowExpanding and ASPxClientCardView.GroupRowCollapsing events.
  */
@JSGlobal("ASPxClientCardViewGroupCancelEventArgs")
@js.native
open class ASPxClientCardViewGroupCancelEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCardViewGroupCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewGroupCancelEventArgs class.
    * @param visibleIndex An integer value that specifies the group's visible index.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed group row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
