package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionPosition extends StObject {
  
  @JSName("$actionPosition")
  var $actionPosition: typingsJapgolly.baseui.bannerTypesMod.ActionPosition
}
object ActionPosition {
  
  inline def apply($actionPosition: typingsJapgolly.baseui.bannerTypesMod.ActionPosition): ActionPosition = {
    val __obj = js.Dynamic.literal($actionPosition = $actionPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionPosition]
  }
  
  extension [Self <: ActionPosition](x: Self) {
    
    inline def set$actionPosition(value: typingsJapgolly.baseui.bannerTypesMod.ActionPosition): Self = StObject.set(x, "$actionPosition", value.asInstanceOf[js.Any])
  }
}
