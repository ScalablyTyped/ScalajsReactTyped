package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typingsJapgolly.expoConfigPlugins.buildAndroidPathsMod.ApplicationProjectFile
import typingsJapgolly.expoConfigPlugins.buildAndroidPathsMod.GradleProjectFile
import typingsJapgolly.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typingsJapgolly.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typingsJapgolly.expoConfigPlugins.buildPluginsCreateBaseModMod.BaseModProviderMethods
import typingsJapgolly.expoConfigPlugins.buildPluginsWithModMod.BaseModOptions
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.saveToInternal
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.skipEmptyMod
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@expo/config-plugins.@expo/config-plugins/build/plugins/withAndroidBaseMods.AndroidDefaultProviders> */
trait PartialAndroidDefaultProv extends StObject {
  
  var appBuildGradle: js.UndefOr[
    BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var colors: js.UndefOr[
    BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var colorsNight: js.UndefOr[
    BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var dangerous: js.UndefOr[
    BaseModProviderMethods[Any, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var gradleProperties: js.UndefOr[
    BaseModProviderMethods[
      js.Array[PropertiesItem], 
      Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
    ]
  ] = js.undefined
  
  var mainActivity: js.UndefOr[
    BaseModProviderMethods[
      ApplicationProjectFile, 
      Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
    ]
  ] = js.undefined
  
  var mainApplication: js.UndefOr[
    BaseModProviderMethods[
      ApplicationProjectFile, 
      Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
    ]
  ] = js.undefined
  
  var manifest: js.UndefOr[
    BaseModProviderMethods[AndroidManifest, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var projectBuildGradle: js.UndefOr[
    BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var settingsGradle: js.UndefOr[
    BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var strings: js.UndefOr[
    BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
  
  var styles: js.UndefOr[
    BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
  ] = js.undefined
}
object PartialAndroidDefaultProv {
  
  inline def apply(): PartialAndroidDefaultProv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAndroidDefaultProv]
  }
  
  extension [Self <: PartialAndroidDefaultProv](x: Self) {
    
    inline def setAppBuildGradle(
      value: BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "appBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setAppBuildGradleUndefined: Self = StObject.set(x, "appBuildGradle", js.undefined)
    
    inline def setColors(
      value: BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNight(
      value: BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "colorsNight", value.asInstanceOf[js.Any])
    
    inline def setColorsNightUndefined: Self = StObject.set(x, "colorsNight", js.undefined)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDangerous(value: BaseModProviderMethods[Any, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
    
    inline def setDangerousUndefined: Self = StObject.set(x, "dangerous", js.undefined)
    
    inline def setGradleProperties(
      value: BaseModProviderMethods[
          js.Array[PropertiesItem], 
          Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
        ]
    ): Self = StObject.set(x, "gradleProperties", value.asInstanceOf[js.Any])
    
    inline def setGradlePropertiesUndefined: Self = StObject.set(x, "gradleProperties", js.undefined)
    
    inline def setMainActivity(
      value: BaseModProviderMethods[
          ApplicationProjectFile, 
          Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
        ]
    ): Self = StObject.set(x, "mainActivity", value.asInstanceOf[js.Any])
    
    inline def setMainActivityUndefined: Self = StObject.set(x, "mainActivity", js.undefined)
    
    inline def setMainApplication(
      value: BaseModProviderMethods[
          ApplicationProjectFile, 
          Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]
        ]
    ): Self = StObject.set(x, "mainApplication", value.asInstanceOf[js.Any])
    
    inline def setMainApplicationUndefined: Self = StObject.set(x, "mainApplication", js.undefined)
    
    inline def setManifest(
      value: BaseModProviderMethods[AndroidManifest, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setProjectBuildGradle(
      value: BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "projectBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setProjectBuildGradleUndefined: Self = StObject.set(x, "projectBuildGradle", js.undefined)
    
    inline def setSettingsGradle(
      value: BaseModProviderMethods[GradleProjectFile, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "settingsGradle", value.asInstanceOf[js.Any])
    
    inline def setSettingsGradleUndefined: Self = StObject.set(x, "settingsGradle", js.undefined)
    
    inline def setStrings(
      value: BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStyles(
      value: BaseModProviderMethods[ResourceXML, Partial[Pick[BaseModOptions, skipEmptyMod | saveToInternal]]]
    ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
