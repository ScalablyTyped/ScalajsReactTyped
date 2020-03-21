package typingsJapgolly.agGrid.overlayWrapperComponentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayWrapperComp extends IComponent[IOverlayWrapperParams] {
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit
}

object IOverlayWrapperComp {
  @scala.inline
  def apply(
    getGui: CallbackTo[HTMLElement],
    hideOverlay: HTMLElement => Callback,
    showLoadingOverlay: HTMLElement => Callback,
    showNoRowsOverlay: HTMLElement => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: IOverlayWrapperParams => CallbackTo[Promise[Unit] | Unit] = null
  ): IOverlayWrapperComp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("hideOverlay")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => hideOverlay(t0).runNow()))
    __obj.updateDynamic("showLoadingOverlay")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => showLoadingOverlay(t0).runNow()))
    __obj.updateDynamic("showNoRowsOverlay")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => showNoRowsOverlay(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.overlayWrapperComponentMod.IOverlayWrapperParams) => init(t0).runNow()))
    __obj.asInstanceOf[IOverlayWrapperComp]
  }
}

