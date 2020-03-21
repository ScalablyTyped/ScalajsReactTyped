package typingsJapgolly.jupyterlabDocmanager.managerMod.DocumentManager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabDocregistry.mod.DocumentRegistry
import typingsJapgolly.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document manager.
  */
trait IOptions extends js.Object {
  /**
    * A service manager instance.
    */
  var manager: IManager
  /**
    * A widget opener for sibling widgets.
    */
  var opener: IWidgetOpener
  /**
    * A document registry instance.
    */
  var registry: DocumentRegistry
  /**
    * A function called when a kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
  /**
    * A promise for when to start using the manager.
    */
  var when: js.UndefOr[js.Promise[Unit]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IManager,
    opener: IWidgetOpener,
    registry: DocumentRegistry,
    setBusy: js.UndefOr[CallbackTo[IDisposable]] = js.undefined,
    when: js.Promise[Unit] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    setBusy.foreach(p => __obj.updateDynamic("setBusy")(p.toJsFn))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

