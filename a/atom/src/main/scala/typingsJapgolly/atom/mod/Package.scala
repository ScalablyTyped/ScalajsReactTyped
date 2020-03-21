package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /** The name of the Package. */
  val name: String
  /** The path to the Package on disk. */
  val path: String
  /** If a previous rebuild failed, get the contents of stderr. */
  def getBuildFailureOutput(): String | Null
  // Native Module Compatibility
  /**
    *  Are all native modules depended on by this package correctly compiled
    *  against the current version of Atom?
    */
  def isCompatible(): Boolean
  // Event Subscription
  /** Invoke the given callback when all packages have been activated. */
  def onDidDeactivate(callback: js.Function0[Unit]): Disposable
  /**
    *  Rebuild native modules in this package's dependencies for the current
    *  version of Atom.
    */
  def rebuild(): js.Promise[AnonCode]
}

object Package {
  @scala.inline
  def apply(
    getBuildFailureOutput: CallbackTo[String | Null],
    isCompatible: CallbackTo[Boolean],
    name: String,
    onDidDeactivate: js.Function0[Unit] => CallbackTo[Disposable],
    path: String,
    rebuild: CallbackTo[js.Promise[AnonCode]]
  ): Package = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("getBuildFailureOutput")(getBuildFailureOutput.toJsFn)
    __obj.updateDynamic("isCompatible")(isCompatible.toJsFn)
    __obj.updateDynamic("onDidDeactivate")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDidDeactivate(t0).runNow()))
    __obj.updateDynamic("rebuild")(rebuild.toJsFn)
    __obj.asInstanceOf[Package]
  }
}

