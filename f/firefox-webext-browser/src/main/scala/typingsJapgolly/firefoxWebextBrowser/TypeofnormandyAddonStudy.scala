package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnormandyAddonStudy extends js.Object {
  /* normandyAddonStudy events */
  /**
    * Fired when a user unenrolls from a study but before the addon is uninstalled.
    * @param reason The reason why the study is ending.
    */
  val onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]]
  /**
    * Marks the study as ended and then uninstalls the addon.
    * @param reason The reason why the study is ending.
    */
  def endStudy(reason: String): js.Promise[_]
  /** Returns an object with metadata about the client which may be required for constructing survey URLs. */
  def getClientMetadata(): js.Promise[_]
  /* normandyAddonStudy functions */
  /** Returns a study object for the current study. */
  def getStudy(): js.Promise[_]
}

object TypeofnormandyAddonStudy {
  @scala.inline
  def apply(
    endStudy: String => CallbackTo[js.Promise[js.Any]],
    getClientMetadata: CallbackTo[js.Promise[js.Any]],
    getStudy: CallbackTo[js.Promise[js.Any]],
    onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]]
  ): TypeofnormandyAddonStudy = {
    val __obj = js.Dynamic.literal(onUnenroll = onUnenroll.asInstanceOf[js.Any])
    __obj.updateDynamic("endStudy")(js.Any.fromFunction1((t0: java.lang.String) => endStudy(t0).runNow()))
    __obj.updateDynamic("getClientMetadata")(getClientMetadata.toJsFn)
    __obj.updateDynamic("getStudy")(getStudy.toJsFn)
    __obj.asInstanceOf[TypeofnormandyAddonStudy]
  }
}

