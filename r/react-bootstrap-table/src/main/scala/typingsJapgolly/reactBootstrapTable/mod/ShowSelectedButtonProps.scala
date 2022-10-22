package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowSelectedButtonProps extends StObject {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
    */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  
  /**
    * Custom class for the button
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Function to be called to activate the normal onClick functionality for this button.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Any & Element], Unit]] = js.undefined
  
  /**
    * Label for when clicking the button will toggle the table back into "show all rows" mode.
    */
  var showAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Label for when clicking the button will toggle the table into "show only selected rows" mode.
    */
  var showOnlySelectText: js.UndefOr[String] = js.undefined
}
object ShowSelectedButtonProps {
  
  inline def apply(): ShowSelectedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSelectedButtonProps]
  }
  
  extension [Self <: ShowSelectedButtonProps](x: Self) {
    
    inline def setBtnContextual(value: String): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
    
    inline def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
    
    inline def setBtnGlyphicon(value: String): Self = StObject.set(x, "btnGlyphicon", value.asInstanceOf[js.Any])
    
    inline def setBtnGlyphiconUndefined: Self = StObject.set(x, "btnGlyphicon", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnClick(value: /* e */ ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    inline def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    inline def setShowOnlySelectText(value: String): Self = StObject.set(x, "showOnlySelectText", value.asInstanceOf[js.Any])
    
    inline def setShowOnlySelectTextUndefined: Self = StObject.set(x, "showOnlySelectText", js.undefined)
  }
}
