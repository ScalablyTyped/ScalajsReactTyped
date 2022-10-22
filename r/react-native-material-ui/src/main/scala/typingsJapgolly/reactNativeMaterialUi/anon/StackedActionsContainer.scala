package typingsJapgolly.reactNativeMaterialUi.anon

import typingsJapgolly.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedActionsContainer extends StObject {
  
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object StackedActionsContainer {
  
  inline def apply(): StackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedActionsContainer]
  }
  
  extension [Self <: StackedActionsContainer](x: Self) {
    
    inline def setStackedActionsContainer(value: ViewStyle): Self = StObject.set(x, "stackedActionsContainer", value.asInstanceOf[js.Any])
    
    inline def setStackedActionsContainerNull: Self = StObject.set(x, "stackedActionsContainer", null)
    
    inline def setStackedActionsContainerUndefined: Self = StObject.set(x, "stackedActionsContainer", js.undefined)
  }
}
