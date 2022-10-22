package typingsJapgolly.jqueryToastPlugin

import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPosition extends StObject {
  
  var bottom: Double | auto
  
  var left: Double | auto
  
  var right: Double | auto
  
  var top: Double | auto
}
object CustomPosition {
  
  inline def apply(bottom: Double | auto, left: Double | auto, right: Double | auto, top: Double | auto): CustomPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPosition]
  }
  
  extension [Self <: CustomPosition](x: Self) {
    
    inline def setBottom(value: Double | auto): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double | auto): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double | auto): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double | auto): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
