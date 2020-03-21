package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.container.IAbstractContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer extends IAbstractContainer {
  /** [Config Option] (Number/Object) */
  var anchorSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Return the immediate child Component in which the passed element is located
  		* @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
  		* @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
  		* @returns Ext.Component The child item which contains the passed element.
  		*/
  var getChildByElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
}

object IContainer {
  @scala.inline
  def apply(
    IAbstractContainer: IAbstractContainer = null,
    anchorSize: js.Any = null,
    getChildByElement: (/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => CallbackTo[IComponent] = null
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    if (IAbstractContainer != null) js.Dynamic.global.Object.assign(__obj, IAbstractContainer)
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (getChildByElement != null) __obj.updateDynamic("getChildByElement")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* deep */ js.UndefOr[scala.Boolean]) => getChildByElement(t0, t1).runNow()))
    __obj.asInstanceOf[IContainer]
  }
}

