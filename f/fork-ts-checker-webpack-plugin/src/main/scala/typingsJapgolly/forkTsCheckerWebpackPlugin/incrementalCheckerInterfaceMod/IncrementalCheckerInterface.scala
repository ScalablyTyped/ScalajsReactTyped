package typingsJapgolly.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken
import typingsJapgolly.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerInterface extends js.Object {
  def getDiagnostics(cancellationToken: CancellationToken): js.Promise[js.Array[NormalizedMessage]]
  def getEsLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage]
  def getLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage]
  def hasEsLinter(): Boolean
  def hasLinter(): Boolean
  def nextIteration(): Unit
}

object IncrementalCheckerInterface {
  @scala.inline
  def apply(
    getDiagnostics: CancellationToken => CallbackTo[js.Promise[js.Array[NormalizedMessage]]],
    getEsLints: CancellationToken => CallbackTo[js.Array[NormalizedMessage]],
    getLints: CancellationToken => CallbackTo[js.Array[NormalizedMessage]],
    hasEsLinter: CallbackTo[Boolean],
    hasLinter: CallbackTo[Boolean],
    nextIteration: Callback
  ): IncrementalCheckerInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDiagnostics")(js.Any.fromFunction1((t0: typingsJapgolly.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken) => getDiagnostics(t0).runNow()))
    __obj.updateDynamic("getEsLints")(js.Any.fromFunction1((t0: typingsJapgolly.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken) => getEsLints(t0).runNow()))
    __obj.updateDynamic("getLints")(js.Any.fromFunction1((t0: typingsJapgolly.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken) => getLints(t0).runNow()))
    __obj.updateDynamic("hasEsLinter")(hasEsLinter.toJsFn)
    __obj.updateDynamic("hasLinter")(hasLinter.toJsFn)
    __obj.updateDynamic("nextIteration")(nextIteration.toJsFn)
    __obj.asInstanceOf[IncrementalCheckerInterface]
  }
}

