package typingsJapgolly.storybookBuilderWebpack4

import typingsJapgolly.storybookBuilderWebpack4.anon.FnCall
import typingsJapgolly.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PresetsCustomWebpackPresetMod {
  
  @JSImport("@storybook/builder-webpack4/dist/ts3.9/presets/custom-webpack-preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webpack(config: Configuration, options: Options): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def webpackInstance(): js.Promise[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("webpackInstance")().asInstanceOf[js.Promise[FnCall]]
  
  inline def webpackVersion(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("webpackVersion")().asInstanceOf[js.Promise[String]]
}
