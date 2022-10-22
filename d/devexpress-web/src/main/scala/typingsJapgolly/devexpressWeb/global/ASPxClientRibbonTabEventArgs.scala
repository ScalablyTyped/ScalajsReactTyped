package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
@JSGlobal("ASPxClientRibbonTabEventArgs")
@js.native
open class ASPxClientRibbonTabEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRibbonTabEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRibbonTabEventArgs class with the specified setting.
    * @param tab An ASPxClientRibbonTab object that is a tab related to the event.
    */
  def this(tab: typingsJapgolly.devexpressWeb.ASPxClientRibbonTab) = this()
  
  /**
    * Gets the tab object related to the event.
    */
  /* CompleteClass */
  var tab: typingsJapgolly.devexpressWeb.ASPxClientRibbonTab = js.native
}
