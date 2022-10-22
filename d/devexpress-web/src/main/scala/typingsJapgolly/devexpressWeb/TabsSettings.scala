package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the information about tab stops.
  */
trait TabsSettings extends StObject {
  
  /**
    * Specifies the default distance between tab stops.
    */
  var defaultTabStop: Double
  
  /**
    * Gets or sets a list of tab stops.
    */
  var tabs: js.Array[TabSettings]
}
object TabsSettings {
  
  inline def apply(defaultTabStop: Double, tabs: js.Array[TabSettings]): TabsSettings = {
    val __obj = js.Dynamic.literal(defaultTabStop = defaultTabStop.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsSettings]
  }
  
  extension [Self <: TabsSettings](x: Self) {
    
    inline def setDefaultTabStop(value: Double): Self = StObject.set(x, "defaultTabStop", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: js.Array[TabSettings]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: TabSettings*): Self = StObject.set(x, "tabs", js.Array(value*))
  }
}
