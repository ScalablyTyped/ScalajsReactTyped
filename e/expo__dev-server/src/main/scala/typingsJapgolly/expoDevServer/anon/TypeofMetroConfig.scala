package typingsJapgolly.expoDevServer.anon

import typingsJapgolly.metroConfig.configTypesMod.ConfigT
import typingsJapgolly.metroConfig.configTypesMod.InputConfigT
import typingsJapgolly.metroConfig.configTypesMod.YargArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMetroConfig extends StObject {
  
  def loadConfig(): js.Promise[ConfigT] = js.native
  def loadConfig(argv: Unit, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = js.native
  def loadConfig(argv: YargArguments): js.Promise[ConfigT] = js.native
  def loadConfig(argv: YargArguments, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = js.native
}
