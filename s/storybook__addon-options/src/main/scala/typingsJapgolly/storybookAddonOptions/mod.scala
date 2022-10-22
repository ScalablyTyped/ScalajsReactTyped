package typingsJapgolly.storybookAddonOptions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-options", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/options" */ String = js.native
  
  inline def setOptions(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withOptions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
