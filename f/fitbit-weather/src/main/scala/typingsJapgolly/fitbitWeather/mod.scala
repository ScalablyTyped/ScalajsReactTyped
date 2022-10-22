package typingsJapgolly.fitbitWeather

import typingsJapgolly.fitbitWeather.appMod.Result
import typingsJapgolly.fitbitWeather.companionMod.Configuration
import typingsJapgolly.fitbitWeather.companionMod.ProvidersCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fitbit-weather", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fitbit-weather", "Providers")
  @js.native
  val Providers: ProvidersCodes = js.native
  
  inline def fetch(age: Double): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(age.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def setup(configuration: Configuration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
