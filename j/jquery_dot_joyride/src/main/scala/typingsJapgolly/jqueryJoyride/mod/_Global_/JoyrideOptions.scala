package typingsJapgolly.jqueryJoyride.mod._Global_

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoyrideOptions extends js.Object {
  /**
  		 * true or false - false tour starts when restart called
  		 * @member {boolean}
  		 */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Will this cookie be attached to a domain, ie. '.notableapp.com'
  		 * @member {any}
  		 */
  var cookieDomain: js.UndefOr[js.Any] = js.undefined
  /**
  		 * true/false for whether cookies are used
  		 * @member {boolean}
  		 */
  var cookieMonster: js.UndefOr[Boolean] = js.undefined
  /**
  		 * choose your own cookie name
  		 * member {string}
  		 */
  var cookieName: js.UndefOr[String] = js.undefined
  /**
  		 * Set to '/' if you want the cookie for the whole website
  		 * @member {any}
  		 */
  var cookiePath: js.UndefOr[js.Any] = js.undefined
  /**
  		 *  Whether to expose the elements at each step in the tour (requires modal:true)
  		 * @member {boolean}
  		 */
  var expose: js.UndefOr[Boolean] = js.undefined
  /**
  		 * true or false to control whether localstorage is used
  		 * @member {boolean}
  		 */
  var localStorage: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Keyname in localstorage
  		 @member {string}
  		 */
  var localStorageKey: js.UndefOr[String] = js.undefined
  /**
  		 * Whether to cover page with modal during the tour
  		 * @member {boolean}
  		 */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
  		 * true/false for next button visibility
  		 * @member {boolean}
  		 */
  var nextButton: js.UndefOr[Boolean] = js.undefined
  /**
  		 * override on a per tooltip bases
  		 * @member {any}
  		 */
  var nubPosition: js.UndefOr[js.Any] = js.undefined
  /**
  		 * array of indexes where to pause the tour after
  		 * @member {any[]}
  		 */
  var pauseAfter: js.UndefOr[js.Array[_]] = js.undefined
  /**
  		 * A method to call after an element has been exposed
  		 * @method
  		 * @param {number} index Tip Index
  		 * @param {JQuery} nextTip Tip object
  		 * @param {JQuery} el Element
  		 */
  var postExposeCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
  		 * a method to call once the tour closes
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {boolean} isAborted Is Aborted?
  		 */
  var postRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
  		 * A method to call after each step
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {boolean} isAborted Is Aborted?
  		 */
  var postStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
  		 * A method to call before the tour starts (passed index, tip, and cloned exposed element)
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {JQuery} el Element
  		 */
  var preRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
  		 * A method to call before each step
  		 * @method
  		 * @param {number} index Tip Index
  		 * @param {JQuery} nextTip Tip object
  		 * @param {JQuery} el Element
  		 */
  var preStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
  		 * whether to scroll to tips
  		 * @member {boolean}
  		 */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Page scrolling speed in ms
  		 * @member {number}
  		 */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  /**
  		 * the index of the tooltip you want to start on (index of the li)
  		 * @member {number}
  		 */
  var startOffset: js.UndefOr[Double] = js.undefined
  /**
  		 * true/false to start timer on first click
  		 * @member {boolean}
  		 */
  var startTimerOnClick: js.UndefOr[Boolean] = js.undefined
  /**
  		 * HTML segments for tip layout
  		 * @member {JoyrideTemplate}
  		 */
  var template: js.UndefOr[JoyrideTemplate] = js.undefined
  /**
  		 * 0 = off, all other numbers = time(ms)
  		 * @member {number}
  		 */
  var timer: js.UndefOr[Double] = js.undefined
  /**
  		 * 'pop' or 'fade' in each tip
  		 * @member {string}
  		 */
  var tipAnimation: js.UndefOr[String] = js.undefined
  /**
  		 * if 'fade'- speed in ms of transition
  		 * @member {number}
  		 */
  var tipAnimationFadeSpeed: js.UndefOr[Double] = js.undefined
  /**
  		 * Where the tip be attached if not inline
  		 * @member {HTMLElement}
  		 */
  var tipContainer: js.UndefOr[HTMLElement] = js.undefined
  /**
  		 * 'top' or 'bottom' in relation to parent
  		 * @member {string}
  		 */
  var tipLocation: js.UndefOr[String] = js.undefined
  /**
  		 * Version
  		 * @member {string}
  		 */
  var version: js.UndefOr[String] = js.undefined
}

object JoyrideOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    cookieDomain: js.Any = null,
    cookieMonster: js.UndefOr[Boolean] = js.undefined,
    cookieName: String = null,
    cookiePath: js.Any = null,
    expose: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    localStorageKey: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    nextButton: js.UndefOr[Boolean] = js.undefined,
    nubPosition: js.Any = null,
    pauseAfter: js.Array[_] = null,
    postExposeCallback: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Callback = null,
    postRideCallback: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Callback = null,
    postStepCallback: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Callback = null,
    preRideCallback: (/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Callback = null,
    preStepCallback: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Callback = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSpeed: Int | Double = null,
    startOffset: Int | Double = null,
    startTimerOnClick: js.UndefOr[Boolean] = js.undefined,
    template: JoyrideTemplate = null,
    timer: Int | Double = null,
    tipAnimation: String = null,
    tipAnimationFadeSpeed: Int | Double = null,
    tipContainer: HTMLElement = null,
    tipLocation: String = null,
    version: String = null
  ): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieMonster)) __obj.updateDynamic("cookieMonster")(cookieMonster.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (!js.isUndefined(expose)) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (localStorageKey != null) __obj.updateDynamic("localStorageKey")(localStorageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(nextButton)) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (nubPosition != null) __obj.updateDynamic("nubPosition")(nubPosition.asInstanceOf[js.Any])
    if (pauseAfter != null) __obj.updateDynamic("pauseAfter")(pauseAfter.asInstanceOf[js.Any])
    if (postExposeCallback != null) __obj.updateDynamic("postExposeCallback")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* nextTip */ typingsJapgolly.jqueryJoyride.mod._Global_.JQuery, t2: /* el */ js.UndefOr[typingsJapgolly.jqueryJoyride.mod._Global_.JQuery]) => postExposeCallback(t0, t1, t2).runNow()))
    if (postRideCallback != null) __obj.updateDynamic("postRideCallback")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* currentTip */ typingsJapgolly.jqueryJoyride.mod._Global_.JQuery, t2: /* isAborted */ js.UndefOr[scala.Boolean]) => postRideCallback(t0, t1, t2).runNow()))
    if (postStepCallback != null) __obj.updateDynamic("postStepCallback")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* currentTip */ typingsJapgolly.jqueryJoyride.mod._Global_.JQuery, t2: /* isAborted */ js.UndefOr[scala.Boolean]) => postStepCallback(t0, t1, t2).runNow()))
    if (preRideCallback != null) __obj.updateDynamic("preRideCallback")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* currentTip */ typingsJapgolly.jqueryJoyride.mod._Global_.JQuery, t2: /* el */ js.UndefOr[typingsJapgolly.jqueryJoyride.mod._Global_.JQuery]) => preRideCallback(t0, t1, t2).runNow()))
    if (preStepCallback != null) __obj.updateDynamic("preStepCallback")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* nextTip */ typingsJapgolly.jqueryJoyride.mod._Global_.JQuery, t2: /* el */ js.UndefOr[typingsJapgolly.jqueryJoyride.mod._Global_.JQuery]) => preStepCallback(t0, t1, t2).runNow()))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimerOnClick)) __obj.updateDynamic("startTimerOnClick")(startTimerOnClick.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (tipAnimation != null) __obj.updateDynamic("tipAnimation")(tipAnimation.asInstanceOf[js.Any])
    if (tipAnimationFadeSpeed != null) __obj.updateDynamic("tipAnimationFadeSpeed")(tipAnimationFadeSpeed.asInstanceOf[js.Any])
    if (tipContainer != null) __obj.updateDynamic("tipContainer")(tipContainer.asInstanceOf[js.Any])
    if (tipLocation != null) __obj.updateDynamic("tipLocation")(tipLocation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoyrideOptions]
  }
}

