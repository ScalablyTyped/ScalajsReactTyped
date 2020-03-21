package typingsJapgolly.serverlessJestPlugin.mod

import typingsJapgolly.serverless.mod.Options
import typingsJapgolly.serverless.pluginMod.Commands
import typingsJapgolly.serverless.pluginMod.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless-jest-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends ServerlessJestPlugin {
  def this(serverless: typingsJapgolly.serverless.mod.^, options: Options) = this()
  /* CompleteClass */
  @JSName("commands")
  override var commands_ServerlessJestPlugin: Commands = js.native
  /* CompleteClass */
  override var hooks: Hooks = js.native
}

