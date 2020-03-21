package typingsJapgolly.dojo.dojo.main

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.dijit.html
  *
  *
  */
trait dijit extends js.Object {
  /**
    *
    */
  var form: js.Object
  /**
    *
    */
  var layout: js.Object
  /**
    * W3C range API
    *
    */
  var range: js.Object
  /**
    *
    */
  var registry: js.Object
  /**
    *
    */
  var tree: js.Object
  /**
    *
    */
  def Calendar(): Unit
  /**
    *
    */
  def CalendarLite(): Unit
  /**
    *
    */
  def CheckedMenuItem(): Unit
  /**
    *
    */
  def ColorPalette(): Unit
  /**
    *
    */
  def Declaration(): Unit
  /**
    *
    */
  def Destroyable(): Unit
  /**
    *
    */
  def Dialog(): Unit
  /**
    *
    */
  def DialogUnderlay(): Unit
  /**
    *
    */
  def DropDownMenu(): Unit
  /**
    *
    */
  def Dye(): Unit
  /**
    *
    */
  def Editor(): Unit
  /**
    *
    */
  def Fieldset(): Unit
  /**
    *
    */
  def InlineEditBox(): Unit
  /**
    *
    */
  def Menu(): Unit
  /**
    *
    */
  def MenuBar(): Unit
  /**
    *
    */
  def MenuBarItem(): Unit
  /**
    *
    */
  def MenuItem(): Unit
  /**
    *
    */
  def MenuSeparator(): Unit
  /**
    *
    */
  def PopupMenuBarItem(): Unit
  /**
    *
    */
  def PopupMenuItem(): Unit
  /**
    *
    */
  def ProgressBar(): Unit
  /**
    *
    */
  def RadioButtonMenuItem(): Unit
  /**
    *
    */
  def TitlePane(): Unit
  /**
    *
    */
  def Toolbar(): Unit
  /**
    *
    */
  def ToolbarSeparator(): Unit
  /**
    *
    */
  def Tooltip(): Unit
  /**
    *
    */
  def TooltipDialog(): Unit
  /**
    *
    */
  def Tree(): Unit
  /**
    *
    */
  def WidgetSet(): Unit
  /**
    *
    * @param id
    */
  def byId(id: js.Any): js.Any
}

object dijit {
  @scala.inline
  def apply(
    Calendar: Callback,
    CalendarLite: Callback,
    CheckedMenuItem: Callback,
    ColorPalette: Callback,
    Declaration: Callback,
    Destroyable: Callback,
    Dialog: Callback,
    DialogUnderlay: Callback,
    DropDownMenu: Callback,
    Dye: Callback,
    Editor: Callback,
    Fieldset: Callback,
    InlineEditBox: Callback,
    Menu: Callback,
    MenuBar: Callback,
    MenuBarItem: Callback,
    MenuItem: Callback,
    MenuSeparator: Callback,
    PopupMenuBarItem: Callback,
    PopupMenuItem: Callback,
    ProgressBar: Callback,
    RadioButtonMenuItem: Callback,
    TitlePane: Callback,
    Toolbar: Callback,
    ToolbarSeparator: Callback,
    Tooltip: Callback,
    TooltipDialog: Callback,
    Tree: Callback,
    WidgetSet: Callback,
    byId: js.Any => CallbackTo[js.Any],
    form: js.Object,
    layout: js.Object,
    range: js.Object,
    registry: js.Object,
    tree: js.Object
  ): dijit = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("Calendar")(Calendar.toJsFn)
    __obj.updateDynamic("CalendarLite")(CalendarLite.toJsFn)
    __obj.updateDynamic("CheckedMenuItem")(CheckedMenuItem.toJsFn)
    __obj.updateDynamic("ColorPalette")(ColorPalette.toJsFn)
    __obj.updateDynamic("Declaration")(Declaration.toJsFn)
    __obj.updateDynamic("Destroyable")(Destroyable.toJsFn)
    __obj.updateDynamic("Dialog")(Dialog.toJsFn)
    __obj.updateDynamic("DialogUnderlay")(DialogUnderlay.toJsFn)
    __obj.updateDynamic("DropDownMenu")(DropDownMenu.toJsFn)
    __obj.updateDynamic("Dye")(Dye.toJsFn)
    __obj.updateDynamic("Editor")(Editor.toJsFn)
    __obj.updateDynamic("Fieldset")(Fieldset.toJsFn)
    __obj.updateDynamic("InlineEditBox")(InlineEditBox.toJsFn)
    __obj.updateDynamic("Menu")(Menu.toJsFn)
    __obj.updateDynamic("MenuBar")(MenuBar.toJsFn)
    __obj.updateDynamic("MenuBarItem")(MenuBarItem.toJsFn)
    __obj.updateDynamic("MenuItem")(MenuItem.toJsFn)
    __obj.updateDynamic("MenuSeparator")(MenuSeparator.toJsFn)
    __obj.updateDynamic("PopupMenuBarItem")(PopupMenuBarItem.toJsFn)
    __obj.updateDynamic("PopupMenuItem")(PopupMenuItem.toJsFn)
    __obj.updateDynamic("ProgressBar")(ProgressBar.toJsFn)
    __obj.updateDynamic("RadioButtonMenuItem")(RadioButtonMenuItem.toJsFn)
    __obj.updateDynamic("TitlePane")(TitlePane.toJsFn)
    __obj.updateDynamic("Toolbar")(Toolbar.toJsFn)
    __obj.updateDynamic("ToolbarSeparator")(ToolbarSeparator.toJsFn)
    __obj.updateDynamic("Tooltip")(Tooltip.toJsFn)
    __obj.updateDynamic("TooltipDialog")(TooltipDialog.toJsFn)
    __obj.updateDynamic("Tree")(Tree.toJsFn)
    __obj.updateDynamic("WidgetSet")(WidgetSet.toJsFn)
    __obj.updateDynamic("byId")(js.Any.fromFunction1((t0: js.Any) => byId(t0).runNow()))
    __obj.asInstanceOf[dijit]
  }
}

