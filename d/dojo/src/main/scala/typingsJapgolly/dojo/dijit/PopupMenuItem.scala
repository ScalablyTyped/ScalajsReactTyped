package typingsJapgolly.dojo.dijit

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/PopupMenuItem.html
  *
  * An item in a Menu that spawn a drop down (usually a drop down menu)
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.PopupMenuItem")
@js.native
class PopupMenuItem () extends MenuItem {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

