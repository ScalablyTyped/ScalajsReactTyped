package typingsJapgolly.jestPresetAngular

import typingsJapgolly.jestPresetAngular.anon.ExtensionsToTreatAsEsm
import typingsJapgolly.jestPresetAngular.anon.Globals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetsMod {
  
  object default {
    
    @JSImport("jest-preset-angular/presets", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-preset-angular/presets", "default.defaults")
    @js.native
    def defaults: Globals = js.native
    
    @JSImport("jest-preset-angular/presets", "default.defaultsESM")
    @js.native
    def defaultsESM: ExtensionsToTreatAsEsm = js.native
    inline def defaultsESM_=(x: ExtensionsToTreatAsEsm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultsESM")(x.asInstanceOf[js.Any])
    
    inline def defaults_=(x: Globals): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  }
}
