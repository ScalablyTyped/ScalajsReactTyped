package typingsJapgolly.materializeCss.M

import typingsJapgolly.materializeCss.materializeCssStrings.buttom
import typingsJapgolly.materializeCss.materializeCssStrings.left
import typingsJapgolly.materializeCss.materializeCssStrings.right
import typingsJapgolly.materializeCss.materializeCssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingActionButtonOptions extends StObject {
  
  /**
    * Direction FAB menu opens
    * @default "top"
    */
  var direction: top | right | buttom | left
  
  /**
    * true: FAB menu appears on hover, false: FAB menu appears on click
    * @default true
    */
  var hoverEnabled: Boolean
  
  /**
    * Enable transit the FAB into a toolbar on click
    * @default false
    */
  var toolbarEnabled: Boolean
}
object FloatingActionButtonOptions {
  
  inline def apply(direction: top | right | buttom | left, hoverEnabled: Boolean, toolbarEnabled: Boolean): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], hoverEnabled = hoverEnabled.asInstanceOf[js.Any], toolbarEnabled = toolbarEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
  
  extension [Self <: FloatingActionButtonOptions](x: Self) {
    
    inline def setDirection(value: top | right | buttom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
  }
}
