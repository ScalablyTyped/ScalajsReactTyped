package typingsJapgolly.storybookManagerWebpack4

import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.ManagerWebpackOptions
import typingsJapgolly.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typingsJapgolly.storybookManagerWebpack4.anon.ConfigDir
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PresetsManagerPresetMod {
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/presets/manager-preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def managerEntries(installedAddons: js.Array[String], options: ConfigDir): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")(installedAddons.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def managerWebpack(
    _underscore: Configuration,
    hasConfigDirConfigTypeDocsModeEntriesRefsOutputDirPreviewUrlVersionCheckReleaseNotesDataPresetsModernFeaturesServerChannelUrl: Options & ManagerWebpackOptions
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("managerWebpack")(_underscore.asInstanceOf[js.Any], hasConfigDirConfigTypeDocsModeEntriesRefsOutputDirPreviewUrlVersionCheckReleaseNotesDataPresetsModernFeaturesServerChannelUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
}
