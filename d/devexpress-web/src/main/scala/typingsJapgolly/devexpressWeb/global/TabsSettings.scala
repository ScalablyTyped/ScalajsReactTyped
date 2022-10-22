package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the information about tab stops.
  */
@JSGlobal("TabsSettings")
@js.native
open class TabsSettings ()
  extends StObject
     with typingsJapgolly.devexpressWeb.TabsSettings {
  
  /**
    * Specifies the default distance between tab stops.
    */
  /* CompleteClass */
  var defaultTabStop: Double = js.native
  
  /**
    * Gets or sets a list of tab stops.
    */
  /* CompleteClass */
  var tabs: js.Array[typingsJapgolly.devexpressWeb.TabSettings] = js.native
}
