package typingsJapgolly.storybookAddonActions

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Pick
import typingsJapgolly.storybookAddonActions.distTs3Dot9ModelsActionDisplayMod.ActionDisplay
import typingsJapgolly.storybookTheming.mod.StyledComponent
import typingsJapgolly.storybookTheming.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsActionLoggerMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ActionLogger(hasActionsOnClear: ActionLoggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ActionLogger")(hasActionsOnClear.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger", "Wrapper")
  @js.native
  val Wrapper: StyledComponent[Any, Pick[Any, String | Double | js.Symbol], Theme] = js.native
  
  trait ActionLoggerProps extends StObject {
    
    var actions: js.Array[ActionDisplay]
    
    def onClear(): Unit
  }
  object ActionLoggerProps {
    
    inline def apply(actions: js.Array[ActionDisplay], onClear: Callback): ActionLoggerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = onClear.toJsFn)
      __obj.asInstanceOf[ActionLoggerProps]
    }
    
    extension [Self <: ActionLoggerProps](x: Self) {
      
      inline def setActions(value: js.Array[ActionDisplay]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionDisplay*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
    }
  }
}
