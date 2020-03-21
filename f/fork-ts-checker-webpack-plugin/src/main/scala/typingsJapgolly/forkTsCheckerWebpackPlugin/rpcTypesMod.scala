package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationTokenData
import typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.run
import typingsJapgolly.forkTsCheckerWebpackPlugin.messageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/RpcTypes", JSImport.Namespace)
@js.native
object rpcTypesMod extends js.Object {
  val RUN: run = js.native
  type RunPayload = CancellationTokenData
  type RunResult = js.UndefOr[Message]
}

