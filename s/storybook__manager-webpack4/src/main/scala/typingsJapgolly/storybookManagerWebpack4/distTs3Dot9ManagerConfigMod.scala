package typingsJapgolly.storybookManagerWebpack4

import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Ref
import typingsJapgolly.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ManagerConfigMod {
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/manager-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoRefs(options: Options): js.Promise[js.Array[Ref]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoRefs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Ref]]]
  inline def getAutoRefs(options: Options, disabledRefs: js.Array[String]): js.Promise[js.Array[Ref]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoRefs")(options.asInstanceOf[js.Any], disabledRefs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Ref]]]
  
  inline def getManagerWebpackConfig(options: Options): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManagerWebpackConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
}
