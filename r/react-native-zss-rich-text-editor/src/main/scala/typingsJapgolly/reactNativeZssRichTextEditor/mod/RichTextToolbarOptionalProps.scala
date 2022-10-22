package typingsJapgolly.reactNativeZssRichTextEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichTextToolbarOptionalProps extends StObject {
  
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS]
  
  var iconMap: IconsMap
  
  var iconTint: String
  
  var onPressAddImage: FunctionWithZeroArgs
  
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs
  
  def renderAction(): Node
  
  var selectedButtonStyle: ElementStyles
  
  var selectedIconTint: String
  
  var unselectedButtonStyle: ElementStyles
}
object RichTextToolbarOptionalProps {
  
  inline def apply(
    actions: js.Array[ACTIONS],
    iconMap: IconsMap,
    iconTint: String,
    onPressAddImage: Callback,
    onPressAddLink: Callback,
    renderAction: CallbackTo[Node],
    selectedIconTint: String
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], iconMap = iconMap.asInstanceOf[js.Any], iconTint = iconTint.asInstanceOf[js.Any], onPressAddImage = onPressAddImage.toJsFn, onPressAddLink = onPressAddLink.toJsFn, renderAction = renderAction.toJsFn, selectedIconTint = selectedIconTint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
  
  extension [Self <: RichTextToolbarOptionalProps](x: Self) {
    
    inline def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    inline def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
    
    inline def setOnPressAddImage(value: Callback): Self = StObject.set(x, "onPressAddImage", value.toJsFn)
    
    inline def setOnPressAddLink(value: Callback): Self = StObject.set(x, "onPressAddLink", value.toJsFn)
    
    inline def setRenderAction(value: CallbackTo[Node]): Self = StObject.set(x, "renderAction", value.toJsFn)
    
    inline def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    inline def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    inline def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
    
    inline def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
    
    inline def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
  }
}
