package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.Container
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionButtonProps extends StObject {
  
  var actions: js.UndefOr[js.Array[Element | typingsJapgolly.reactNativeMaterialUi.anon.Icon | String]] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[Container] = js.undefined
  
  var transition: js.UndefOr[toolbar | speedDial] = js.undefined
}
object ActionButtonProps {
  
  inline def apply(): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionButtonProps]
  }
  
  extension [Self <: ActionButtonProps](x: Self) {
    
    inline def setActions(value: js.Array[Element | typingsJapgolly.reactNativeMaterialUi.anon.Icon | String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (Element | typingsJapgolly.reactNativeMaterialUi.anon.Icon | String)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: Container): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransition(value: toolbar | speedDial): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
