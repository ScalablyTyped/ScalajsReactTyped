package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
@JSGlobal("ASPxClientRibbonGroup")
@js.native
open class ASPxClientRibbonGroup ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRibbonGroup {
  
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Gets or sets the group's index within the collection.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name of the current ribbon group.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the client ribbon object to which the current group belongs.
    */
  /* CompleteClass */
  var ribbon: typingsJapgolly.devexpressWeb.ASPxClientRibbon = js.native
  
  /**
    * Gets the client tab object to which the current group belongs.
    */
  /* CompleteClass */
  var tab: typingsJapgolly.devexpressWeb.ASPxClientRibbonTab = js.native
}
