package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.AssertMissingModProviders
import typingsJapgolly.expoConfigPlugins.anon.Introspect
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ExportedConfig
import typingsJapgolly.expoConfigPlugins.buildPluginsCreateBaseModMod.ForwardedBaseModOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsModCompilerMod {
  
  @JSImport("@expo/config-plugins/build/plugins/mod-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileModsAsync(config: ExportedConfig, props: AssertMissingModProviders): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileModsAsync")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]
  
  inline def evalModsAsync(config: ExportedConfig, hasProjectRootIntrospectPlatformsAssertMissingModProviders: Introspect): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalModsAsync")(config.asInstanceOf[js.Any], hasProjectRootIntrospectPlatformsAssertMissingModProviders.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]
  
  inline def withDefaultBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withDefaultBaseMods(config: ExportedConfig, props: ForwardedBaseModOptions): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  inline def withIntrospectionBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withIntrospectionBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withIntrospectionBaseMods(config: ExportedConfig, props: ForwardedBaseModOptions): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withIntrospectionBaseMods")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
}
