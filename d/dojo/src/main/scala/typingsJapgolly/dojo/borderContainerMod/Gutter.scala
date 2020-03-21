package typingsJapgolly.dojo.borderContainerMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Gutter.html
  *
  * Just a spacer div to separate side pane from center pane.
  * Basically a trick to lookup the gutter/splitter width from the theme.
  * Instantiated by dijit/layout/BorderContainer.  Users should not
  * create directly.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSImport("dijit/layout/BorderContainer", "_Gutter")
@js.native
class Gutter ()
  extends typingsJapgolly.dojo.dijit.layout.BorderContainer.Gutter {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

