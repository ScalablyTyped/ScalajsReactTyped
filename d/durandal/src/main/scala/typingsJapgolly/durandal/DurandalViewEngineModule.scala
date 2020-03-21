package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalViewEngineModule extends js.Object {
  /**
    * The file extension that view source files are expected to have.
    * @default .html
    */
  var viewExtension: String
  /**
    * The name of the RequireJS loader plugin used by the viewLocator to obtain the view source. (Use requirejs to map the plugin's full path).
    * @default text
    */
  var viewPlugin: String
  /**
    * Parameters passed to the RequireJS loader plugin used by the viewLocator to obtain the view source.
    * @default The empty string by default.
    */
  var viewPluginParameters: String
  /**
    * Converts a view id into a full RequireJS path.
    * @param {string} viewId The view id to convert.
    * @returns {string} The require path.
    */
  def convertViewIdToRequirePath(viewId: String): String
  /**
    * Converts a view url into a view id.
    * @param {string} url The url to convert.
    * @returns {string} The view id.
    */
  def convertViewUrlToViewId(url: String): String
  /**
    * Called when a view cannot be found to provide the opportunity to locate or generate a fallback view. Mainly used to ease development.
    * @param {string} viewId The view id whose view should be created.
    * @param {string} requirePath The require path that was attempted.
    * @param {Error} requirePath The error that was returned from the attempt to locate the default view.
    * @returns {Promise} A promise for the fallback view.
    */
  def createFallbackView(viewId: String, requirePath: String, err: js.Error): DurandalPromise[HTMLElement]
  /**
    * Creates the view associated with the view id.
    * @param {string} viewId The view id whose view should be created.
    * @returns {DurandalPromise<HTMLElement>} A promise of the view.
    */
  def createView(viewId: String): DurandalPromise[HTMLElement]
  /**
    * Converts an array of elements into a single element. White space and comments are removed. If a single element does not remain, then the elements are wrapped.
    * @param {HTMLElement[]} allElements The elements.
    * @returns {HTMLElement} A single element.
    */
  def ensureSingleElement(allElements: js.Array[Node]): HTMLElement
  /**
    * Determines if the url is a url for a view, according to the view engine.
    * @param {string} url The potential view url.
    * @returns {boolean} True if the url is a view url, false otherwise.
    */
  def isViewUrl(url: String): Boolean
  /**
    * Parses the view engine recognized markup and returns DOM elements.
    * @param {string} markup The markup to parse.
    * @returns {HTMLElement[]} The elements.
    */
  def parseMarkup(markup: String): js.Array[Node]
  /**
    * Calls `parseMarkup` and then pipes the results through `ensureSingleElement`.
    * @param {string} markup The markup to process.
    * @returns {HTMLElement} The view.
    */
  def processMarkup(markup: String): HTMLElement
  /**
    * Puts the view associated with the id into the cache of parsed views.
    * @param {string} id The view id whose view should be cached.
    * @param {DOMElement} view The view to cache.
    */
  def putViewInCache(id: String, view: HTMLElement): Unit
  /**
    * Gets the view associated with the id from the cache of parsed views.
    * @param {string} id The view id to lookup in the cache.
    * @return {DOMElement|null} The cached view or null if it's not in the cache.
    */
  def tryGetViewFromCache(id: String): HTMLElement
}

object DurandalViewEngineModule {
  @scala.inline
  def apply(
    convertViewIdToRequirePath: String => CallbackTo[String],
    convertViewUrlToViewId: String => CallbackTo[String],
    createFallbackView: (String, String, js.Error) => CallbackTo[DurandalPromise[HTMLElement]],
    createView: String => CallbackTo[DurandalPromise[HTMLElement]],
    ensureSingleElement: js.Array[Node] => CallbackTo[HTMLElement],
    isViewUrl: String => CallbackTo[Boolean],
    parseMarkup: String => CallbackTo[js.Array[Node]],
    processMarkup: String => CallbackTo[HTMLElement],
    putViewInCache: (String, HTMLElement) => Callback,
    tryGetViewFromCache: String => CallbackTo[HTMLElement],
    viewExtension: String,
    viewPlugin: String,
    viewPluginParameters: String
  ): DurandalViewEngineModule = {
    val __obj = js.Dynamic.literal(viewExtension = viewExtension.asInstanceOf[js.Any], viewPlugin = viewPlugin.asInstanceOf[js.Any], viewPluginParameters = viewPluginParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("convertViewIdToRequirePath")(js.Any.fromFunction1((t0: java.lang.String) => convertViewIdToRequirePath(t0).runNow()))
    __obj.updateDynamic("convertViewUrlToViewId")(js.Any.fromFunction1((t0: java.lang.String) => convertViewUrlToViewId(t0).runNow()))
    __obj.updateDynamic("createFallbackView")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Error) => createFallbackView(t0, t1, t2).runNow()))
    __obj.updateDynamic("createView")(js.Any.fromFunction1((t0: java.lang.String) => createView(t0).runNow()))
    __obj.updateDynamic("ensureSingleElement")(js.Any.fromFunction1((t0: js.Array[org.scalajs.dom.raw.Node]) => ensureSingleElement(t0).runNow()))
    __obj.updateDynamic("isViewUrl")(js.Any.fromFunction1((t0: java.lang.String) => isViewUrl(t0).runNow()))
    __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1((t0: java.lang.String) => parseMarkup(t0).runNow()))
    __obj.updateDynamic("processMarkup")(js.Any.fromFunction1((t0: java.lang.String) => processMarkup(t0).runNow()))
    __obj.updateDynamic("putViewInCache")(js.Any.fromFunction2((t0: java.lang.String, t1: org.scalajs.dom.raw.HTMLElement) => putViewInCache(t0, t1).runNow()))
    __obj.updateDynamic("tryGetViewFromCache")(js.Any.fromFunction1((t0: java.lang.String) => tryGetViewFromCache(t0).runNow()))
    __obj.asInstanceOf[DurandalViewEngineModule]
  }
}

