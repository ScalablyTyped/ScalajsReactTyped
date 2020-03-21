package typingsJapgolly.gijgo.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var border: js.UndefOr[Boolean] = js.undefined
  var cascadeCheck: js.UndefOr[Boolean] = js.undefined
  var cascadeSelection: js.UndefOr[Boolean] = js.undefined
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String, _]
  ] = js.undefined
  var checkboxes: js.UndefOr[Boolean] = js.undefined
  var checkedField: js.UndefOr[String] = js.undefined
  var childrenField: js.UndefOr[String] = js.undefined
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var disabledField: js.UndefOr[String] = js.undefined
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var hasChildrenField: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[TreeIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var imageCssClassField: js.UndefOr[String] = js.undefined
  var imageHtmlField: js.UndefOr[String] = js.undefined
  var imageUrlField: js.UndefOr[String] = js.undefined
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, _]
  ] = js.undefined
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var selectionType: js.UndefOr[String] = js.undefined
  var textField: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TreeSettings {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    border: js.UndefOr[Boolean] = js.undefined,
    cascadeCheck: js.UndefOr[Boolean] = js.undefined,
    cascadeSelection: js.UndefOr[Boolean] = js.undefined,
    checkboxChange: (/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String) => CallbackTo[js.Any] = null,
    checkboxes: js.UndefOr[Boolean] = js.undefined,
    checkedField: String = null,
    childrenField: String = null,
    collapse: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    dataBinding: /* e */ js.Any => CallbackTo[js.Any] = null,
    dataBound: /* e */ js.Any => CallbackTo[js.Any] = null,
    dataSource: js.Any = null,
    destroying: /* e */ js.Any => CallbackTo[js.Any] = null,
    disable: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    disabledField: String = null,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enable: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    expand: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    hasChildrenField: String = null,
    icons: TreeIcons = null,
    iconsLibrary: String = null,
    imageCssClassField: String = null,
    imageHtmlField: String = null,
    imageUrlField: String = null,
    initialized: /* e */ js.Any => CallbackTo[js.Any] = null,
    lazyLoading: js.UndefOr[Boolean] = js.undefined,
    nodeDataBound: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    nodeDrop: (/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => CallbackTo[js.Any] = null,
    paramNames: TreeParamNames = null,
    primaryKey: String = null,
    select: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    selectionType: String = null,
    textField: String = null,
    uiLibrary: String = null,
    unselect: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => CallbackTo[js.Any] = null,
    width: Int | Double = null
  ): TreeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(cascadeCheck)) __obj.updateDynamic("cascadeCheck")(cascadeCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(cascadeSelection)) __obj.updateDynamic("cascadeSelection")(cascadeSelection.asInstanceOf[js.Any])
    if (checkboxChange != null) __obj.updateDynamic("checkboxChange")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* record */ js.Any, t3: /* state */ java.lang.String) => checkboxChange(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(checkboxes)) __obj.updateDynamic("checkboxes")(checkboxes.asInstanceOf[js.Any])
    if (checkedField != null) __obj.updateDynamic("checkedField")(checkedField.asInstanceOf[js.Any])
    if (childrenField != null) __obj.updateDynamic("childrenField")(childrenField.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => collapse(t0, t1, t2).runNow()))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ js.Any) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ js.Any) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (destroying != null) __obj.updateDynamic("destroying")(js.Any.fromFunction1((t0: /* e */ js.Any) => destroying(t0).runNow()))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => disable(t0, t1, t2).runNow()))
    if (disabledField != null) __obj.updateDynamic("disabledField")(disabledField.asInstanceOf[js.Any])
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => enable(t0, t1, t2).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => expand(t0, t1, t2).runNow()))
    if (hasChildrenField != null) __obj.updateDynamic("hasChildrenField")(hasChildrenField.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary.asInstanceOf[js.Any])
    if (imageCssClassField != null) __obj.updateDynamic("imageCssClassField")(imageCssClassField.asInstanceOf[js.Any])
    if (imageHtmlField != null) __obj.updateDynamic("imageHtmlField")(imageHtmlField.asInstanceOf[js.Any])
    if (imageUrlField != null) __obj.updateDynamic("imageUrlField")(imageUrlField.asInstanceOf[js.Any])
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1((t0: /* e */ js.Any) => initialized(t0).runNow()))
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading.asInstanceOf[js.Any])
    if (nodeDataBound != null) __obj.updateDynamic("nodeDataBound")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => nodeDataBound(t0, t1, t2).runNow()))
    if (nodeDrop != null) __obj.updateDynamic("nodeDrop")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* id */ java.lang.String, t2: /* parentId */ java.lang.String, t3: /* orderNumber */ scala.Double) => nodeDrop(t0, t1, t2, t3).runNow()))
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => select(t0, t1, t2).runNow()))
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* node */ js.Any, t2: /* id */ java.lang.String) => unselect(t0, t1, t2).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSettings]
  }
}

