package typingsJapgolly.storybookAddonActions

import typingsJapgolly.storybookAddonActions.distTs3Dot9ModelsActionOptionsMod.ActionOptions
import typingsJapgolly.storybookAddonActions.distTs3Dot9ModelsHandlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewActionMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/preview/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def action(name: String): HandlerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any]).asInstanceOf[HandlerFunction]
  inline def action(name: String, options: ActionOptions): HandlerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("action")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlerFunction]
}
