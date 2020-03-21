package typingsJapgolly.dojo.dojox.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.layout.ContentPane
import typingsJapgolly.dojo.dojoStrings.canGoBack
import typingsJapgolly.dojo.dojoStrings.doneFunction
import typingsJapgolly.dojo.dojoStrings.passFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/WizardPane.html
  *
  * A panel in a dojox.widget.Wizard
  * An extended ContentPane with additional hooks for passing named
  * functions to prevent the pane from going either forward or
  * backwards.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.WizardPane")
@js.native
class WizardPane () extends ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, then can move back to a previous panel (by clicking the "Previous" button)
    *
    */
  var canGoBack: Boolean = js.native
  /**
    * Name of function that is run if you press the "Done" button from this panel
    *
    */
  var doneFunction: String = js.native
  /**
    * Name of function that checks if it's OK to advance to the next panel.
    * If it's not OK (for example, mandatory field hasn't been entered), then
    * returns an error message (String) explaining the reason. Can return null (pass)
    * or a Boolean (true == pass)
    *
    */
  var passFunction: String = js.native
  /**
    *
    */
  def done(): Unit = js.native
  @JSName("get")
  def get_canGoBack(property: canGoBack): Boolean = js.native
  @JSName("get")
  def get_doneFunction(property: doneFunction): String = js.native
  @JSName("get")
  def get_passFunction(property: passFunction): String = js.native
  @JSName("set")
  def set_canGoBack(property: canGoBack, value: Boolean): Unit = js.native
  @JSName("set")
  def set_doneFunction(property: doneFunction, value: String): Unit = js.native
  @JSName("set")
  def set_passFunction(property: passFunction, value: String): Unit = js.native
  @JSName("watch")
  def watch_canGoBack(
    property: canGoBack,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_doneFunction(
    property: doneFunction,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_passFunction(
    property: passFunction,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

