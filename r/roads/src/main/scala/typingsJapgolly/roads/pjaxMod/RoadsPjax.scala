package typingsJapgolly.roads.pjaxMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadsPjax extends js.Object {
  var _container_element: HTMLElement
  var _page_title: js.UndefOr[String] = js.undefined
  var _road: typingsJapgolly.roads.roadMod.default
  var _window: Window_
  /**
    * Handles all click events, and directs
    * @param {MouseEvent} event
    */
  /* protected */ def _pjaxEventMonitor(event: MouseEvent): Unit
  /**
    * Submits the form and re-renders the UI
    *
    * @param {HTMLFormElement} form
    */
  /* protected */ def _roadsFormEvent(form: HTMLFormElement): Unit
  /**
    * Follows the link and renders the UI
    *
    * @param  {HTMLAnchorElement} link
    */
  /* protected */ def _roadsLinkEvent(link: HTMLAnchorElement): Unit
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    *
    * @param {Document} document - The pages document object to properly parse and set cookies
    * @returns {RoadsPjax} this object, useful for chaining
    */
  def addCookieMiddleware(document: Document_): RoadsPjax
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the PJAX object (as opposed to the request object like the setTitle middlweare does).
    * This allows you to easily update the page title.
    *
    * @returns {RoadsPjax} this, useful for chaining
    */
  def addTitleMiddleware(): RoadsPjax
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor.
    */
  def register(): Unit
  /**
    *
    * @param {HTMLAnchorElement} element
    */
  def registerAdditionalElement(element: HTMLAnchorElement): Unit
  /**
    * The response from the roads request
    *
    * @param {Response} response_object
    */
  def render(response_object: typingsJapgolly.roads.responseMod.default): Unit
}

object RoadsPjax {
  @scala.inline
  def apply(
    _container_element: HTMLElement,
    _pjaxEventMonitor: MouseEvent => Callback,
    _road: typingsJapgolly.roads.roadMod.default,
    _roadsFormEvent: HTMLFormElement => Callback,
    _roadsLinkEvent: HTMLAnchorElement => Callback,
    _window: Window_,
    addCookieMiddleware: Document_ => CallbackTo[RoadsPjax],
    addTitleMiddleware: CallbackTo[RoadsPjax],
    register: Callback,
    registerAdditionalElement: HTMLAnchorElement => Callback,
    render: typingsJapgolly.roads.responseMod.default => Callback,
    _page_title: String = null
  ): RoadsPjax = {
    val __obj = js.Dynamic.literal(_container_element = _container_element.asInstanceOf[js.Any], _road = _road.asInstanceOf[js.Any], _window = _window.asInstanceOf[js.Any])
    __obj.updateDynamic("_pjaxEventMonitor")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => _pjaxEventMonitor(t0).runNow()))
    __obj.updateDynamic("_roadsFormEvent")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLFormElement) => _roadsFormEvent(t0).runNow()))
    __obj.updateDynamic("_roadsLinkEvent")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLAnchorElement) => _roadsLinkEvent(t0).runNow()))
    __obj.updateDynamic("addCookieMiddleware")(js.Any.fromFunction1((t0: typingsJapgolly.std.Document_) => addCookieMiddleware(t0).runNow()))
    __obj.updateDynamic("addTitleMiddleware")(addTitleMiddleware.toJsFn)
    __obj.updateDynamic("register")(register.toJsFn)
    __obj.updateDynamic("registerAdditionalElement")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLAnchorElement) => registerAdditionalElement(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.roads.responseMod.default) => render(t0).runNow()))
    if (_page_title != null) __obj.updateDynamic("_page_title")(_page_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsPjax]
  }
}

