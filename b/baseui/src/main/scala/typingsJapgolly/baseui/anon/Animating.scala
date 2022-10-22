package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animating extends StObject {
  
  @JSName("$animating")
  var $animating: Boolean
  
  @JSName("$placement")
  var $placement: typingsJapgolly.baseui.snackbarTypesMod.Placement
  
  @JSName("$translateHeight")
  var $translateHeight: Double
}
object Animating {
  
  inline def apply(
    $animating: Boolean,
    $placement: typingsJapgolly.baseui.snackbarTypesMod.Placement,
    $translateHeight: Double
  ): Animating = {
    val __obj = js.Dynamic.literal($animating = $animating.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $translateHeight = $translateHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  extension [Self <: Animating](x: Self) {
    
    inline def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
    
    inline def set$placement(value: typingsJapgolly.baseui.snackbarTypesMod.Placement): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    inline def set$translateHeight(value: Double): Self = StObject.set(x, "$translateHeight", value.asInstanceOf[js.Any])
  }
}
