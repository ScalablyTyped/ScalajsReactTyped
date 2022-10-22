package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.CustomExportConditions
import typingsJapgolly.nrwlJest.anon.Tsjshtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  object default {
    
    @JSImport("@nrwl/jest/preset", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nrwl/jest/preset", "default.coverageReporters")
    @js.native
    def coverageReporters: js.Array[String] = js.native
    inline def coverageReporters_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(x.asInstanceOf[js.Any])
    
    @JSImport("@nrwl/jest/preset", "default.moduleFileExtensions")
    @js.native
    def moduleFileExtensions: js.Array[String] = js.native
    inline def moduleFileExtensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleFileExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("@nrwl/jest/preset", "default.resolver")
    @js.native
    def resolver: String = js.native
    inline def resolver_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolver")(x.asInstanceOf[js.Any])
    
    @JSImport("@nrwl/jest/preset", "default.testEnvironment")
    @js.native
    def testEnvironment: String = js.native
    
    /**
      * manually set the exports names to load in common js, to mimic the behaviors of jest 27
      * before jest didn't fully support package exports and would load in common js code (typically via main field). now jest 28+ will load in the browser esm code, but jest esm support is not fully supported.
      * In this case we will tell jest to load in the common js code regardless of environment.
      *
      * this can be removed via just overriding this setting in it's usage
      *
      * @example
      * module.exports = {
      *   ...nxPreset,
      *   testEnvironmentOptions: {},
      * }
      */
    @JSImport("@nrwl/jest/preset", "default.testEnvironmentOptions")
    @js.native
    def testEnvironmentOptions: CustomExportConditions = js.native
    inline def testEnvironmentOptions_=(x: CustomExportConditions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testEnvironmentOptions")(x.asInstanceOf[js.Any])
    
    inline def testEnvironment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(x.asInstanceOf[js.Any])
    
    @JSImport("@nrwl/jest/preset", "default.testMatch")
    @js.native
    def testMatch: js.Array[String] = js.native
    inline def testMatch_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("@nrwl/jest/preset", "default.transform")
    @js.native
    def transform: Tsjshtml = js.native
    inline def transform_=(x: Tsjshtml): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transform")(x.asInstanceOf[js.Any])
  }
}
