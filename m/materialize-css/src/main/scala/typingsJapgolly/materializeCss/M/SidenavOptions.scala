package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.materializeCssStrings.left
import typingsJapgolly.materializeCss.materializeCssStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Sidenav
  */
trait SidenavOptions extends js.Object {
  /**
    * Allow swipe gestures to open/close Sidenav
    * @default true
    */
  var draggable: Boolean
  /**
    * Side of screen on which Sidenav appears
    * @default 'left'
    */
  var edge: left | right
  /**
    * Length in ms of enter transition
    * @default 250
    */
  var inDuration: Double
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: Double
  /**
    * Function called when sidenav finishes exiting
    */
  def onCloseEnd(elem: Element): Unit
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(elem: Element): Unit
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(elem: Element): Unit
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(elem: Element): Unit
}

object SidenavOptions {
  @scala.inline
  def apply(
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    outDuration: Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
    __obj.updateDynamic("onCloseEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseEnd(t0).runNow()))
    __obj.updateDynamic("onCloseStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseStart(t0).runNow()))
    __obj.updateDynamic("onOpenEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenEnd(t0).runNow()))
    __obj.updateDynamic("onOpenStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenStart(t0).runNow()))
    __obj.asInstanceOf[SidenavOptions]
  }
}

