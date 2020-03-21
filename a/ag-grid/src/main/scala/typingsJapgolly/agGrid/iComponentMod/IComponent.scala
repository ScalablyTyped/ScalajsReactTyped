package typingsJapgolly.agGrid.iComponentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent[T] extends js.Object {
  /** A hook to perform any necessary operation just after the gui for this component has been renderer
    in the screen.
    If the filter popup is closed and reopened, this method is called each time the filter is shown.
    This is useful for any
    logic that requires attachment before executing, such as putting focus on a particular DOM
    element. The params has one callback method 'hidePopup', which you can call at any later
    point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
    after it is pressed. */
  var afterGuiAttached: js.UndefOr[js.Function1[/* params */ js.UndefOr[IAfterGuiAttachedParams], Unit]] = js.undefined
  /** Gets called once by grid after editing is finished - if your editor needs to do any cleanup, do it here */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The init(params) method is called on the filter once. See below for details on the parameters. */
  var init: js.UndefOr[js.Function1[/* params */ T, Promise[Unit] | Unit]] = js.undefined
  /** Return the DOM element of your editor, this is what the grid puts into the DOM */
  def getGui(): HTMLElement
}

object IComponent {
  @scala.inline
  def apply[T](
    getGui: CallbackTo[HTMLElement],
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: /* params */ T => CallbackTo[Promise[Unit] | Unit] = null
  ): IComponent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* params */ T) => init(t0).runNow()))
    __obj.asInstanceOf[IComponent[T]]
  }
}

