package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillOrientation extends StObject {
  
  @JSName("$fill")
  var $fill: js.UndefOr[typingsJapgolly.baseui.tabsMotionTypesMod.Fill] = js.undefined
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[typingsJapgolly.baseui.tabsMotionTypesMod.Orientation] = js.undefined
}
object FillOrientation {
  
  inline def apply(): FillOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOrientation]
  }
  
  extension [Self <: FillOrientation](x: Self) {
    
    inline def set$fill(value: typingsJapgolly.baseui.tabsMotionTypesMod.Fill): Self = StObject.set(x, "$fill", value.asInstanceOf[js.Any])
    
    inline def set$fillUndefined: Self = StObject.set(x, "$fill", js.undefined)
    
    inline def set$orientation(value: typingsJapgolly.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
