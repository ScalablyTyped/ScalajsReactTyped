package typingsJapgolly.extjs.Ext.panel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader extends IContainer {
  /** [Method] Add a tool to the header
  		* @param tool Object
  		*/
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the tools for this header
  		* @returns Ext.panel.Tool[] The tools
  		*/
  var getTools: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
  		* @param component Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets glyph that provides the icon image for this header
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the image path that provides the icon image for this header
  		* @param icon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the CSS class that provides the icon image for this header
  		* @param cls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the title of the header
  		* @param title String The title to be set
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[Double] = js.undefined
}

object IHeader {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    addTool: /* tool */ js.UndefOr[js.Any] => Callback = null,
    addUIClsToElement: /* cls */ js.UndefOr[js.Any] => Callback = null,
    afterLayout: js.UndefOr[Callback] = js.undefined,
    getTools: js.UndefOr[CallbackTo[Array]] = js.undefined,
    glyph: js.Any = null,
    icon: String = null,
    iconCls: String = null,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    onAdd: (/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Callback = null,
    removeUIClsFromElement: /* cls */ js.UndefOr[js.Any] => Callback = null,
    setGlyph: /* glyph */ js.UndefOr[js.Any] => Callback = null,
    setIcon: /* icon */ js.UndefOr[String] => Callback = null,
    setIconCls: /* cls */ js.UndefOr[String] => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    title: String = null,
    titleAlign: String = null,
    titlePosition: Int | Double = null
  ): IHeader = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (addTool != null) __obj.updateDynamic("addTool")(js.Any.fromFunction1((t0: /* tool */ js.UndefOr[js.Any]) => addTool(t0).runNow()))
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => addUIClsToElement(t0).runNow()))
    afterLayout.foreach(p => __obj.updateDynamic("afterLayout")(p.toJsFn))
    getTools.foreach(p => __obj.updateDynamic("getTools")(p.toJsFn))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[js.Any]) => onAdd(t0, t1).runNow()))
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => removeUIClsFromElement(t0).runNow()))
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(js.Any.fromFunction1((t0: /* glyph */ js.UndefOr[js.Any]) => setGlyph(t0).runNow()))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: /* icon */ js.UndefOr[java.lang.String]) => setIcon(t0).runNow()))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setIconCls(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
}

