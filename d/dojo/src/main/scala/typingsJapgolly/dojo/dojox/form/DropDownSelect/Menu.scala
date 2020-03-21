package typingsJapgolly.dojo.dojox.form.DropDownSelect

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.dijit.DropDownMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/DropDownSelect._Menu.html
  *
  * An internally-used menu for dropdown that allows us a vertical scrollbar
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.DropDownSelect._Menu")
@js.native
class Menu () extends DropDownMenu {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

