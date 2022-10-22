package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.anon.Errors
import typingsJapgolly.jestCucumber.distSrcModelsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigurationMod {
  
  @JSImport("jest-cucumber/dist/src/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJestCucumberConfiguration(): Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestCucumberConfiguration")().asInstanceOf[Errors]
  inline def getJestCucumberConfiguration(options: Options): Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestCucumberConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Errors]
  
  inline def setJestCucumberConfiguration(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setJestCucumberConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
