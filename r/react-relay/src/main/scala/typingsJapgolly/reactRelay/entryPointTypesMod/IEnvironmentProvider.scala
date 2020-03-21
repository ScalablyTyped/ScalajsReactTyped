package typingsJapgolly.reactRelay.entryPointTypesMod

import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvironmentProvider[TOptions] extends js.Object {
  def getEnvironment(): Environment = js.native
  def getEnvironment(options: TOptions): Environment = js.native
}

