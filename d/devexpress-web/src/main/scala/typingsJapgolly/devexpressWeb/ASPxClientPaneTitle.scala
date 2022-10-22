package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pane title.
  */
trait ASPxClientPaneTitle
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Returns the value that defines how to align the pane title.
    */
  var alignment: String
  
  /**
    * Returns the pane title's text.
    */
  var text: String
}
object ASPxClientPaneTitle {
  
  inline def apply(alignment: String, chart: ASPxClientWebChart, text: String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
  
  extension [Self <: ASPxClientPaneTitle](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
