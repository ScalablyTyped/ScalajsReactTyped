package typingsJapgolly.tsJest

import typingsJapgolly.jestTypes.mod.InitialOptions
import typingsJapgolly.tsJest.distTypesMod.TsJestPresets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPresetsCreateJestPresetMod {
  
  @JSImport("ts-jest/dist/presets/create-jest-preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJestPreset(): TsJestPresets = ^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")().asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean): TsJestPresets = ^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any]).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Boolean): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Boolean, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Unit, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Boolean): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Boolean, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Unit, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
}
