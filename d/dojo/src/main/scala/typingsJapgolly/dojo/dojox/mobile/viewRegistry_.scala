package typingsJapgolly.dojo.dojox.mobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/viewRegistry.html
  *
  * A registry of existing views.
  *
  */
trait viewRegistry_ extends js.Object {
  /**
    *
    */
  var initialView: js.Object
  /**
    * The number of registered views.
    *
    */
  var length: Double
  /**
    * Adds a view to the registry.
    *
    * @param view
    */
  def add(view: View): Unit
  /**
    * Gets the children views of the specified view.
    *
    * @param parent
    */
  def getChildViews(parent: View): js.Array[_]
  /**
    * Gets the dojox/mobile/scrollable object containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingScrollable(node: HTMLElement): scrollable
  /**
    * Gets the view containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingView(node: HTMLElement): View
  /**
    * Gets the parent view of the specified view.
    *
    * @param view
    */
  def getParentView(view: View): View
  /**
    * Gets all registered views.
    *
    */
  def getViews(): js.Array[_]
  /**
    * Removes a view from the registry.
    *
    * @param id
    */
  def remove(id: String): Unit
}

object viewRegistry_ {
  @scala.inline
  def apply(
    add: View => Callback,
    getChildViews: View => CallbackTo[js.Array[js.Any]],
    getEnclosingScrollable: HTMLElement => CallbackTo[scrollable],
    getEnclosingView: HTMLElement => CallbackTo[View],
    getParentView: View => CallbackTo[View],
    getViews: CallbackTo[js.Array[js.Any]],
    initialView: js.Object,
    length: Double,
    remove: String => Callback
  ): viewRegistry_ = {
    val __obj = js.Dynamic.literal(initialView = initialView.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.mobile.View) => add(t0).runNow()))
    __obj.updateDynamic("getChildViews")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.mobile.View) => getChildViews(t0).runNow()))
    __obj.updateDynamic("getEnclosingScrollable")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getEnclosingScrollable(t0).runNow()))
    __obj.updateDynamic("getEnclosingView")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getEnclosingView(t0).runNow()))
    __obj.updateDynamic("getParentView")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.mobile.View) => getParentView(t0).runNow()))
    __obj.updateDynamic("getViews")(getViews.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[viewRegistry_]
  }
}

