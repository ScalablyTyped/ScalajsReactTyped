package typingsJapgolly.titanium

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemIcon extends js.Object {
  /**
  				 * Bookmark style icon
  				 */
  val BOOKMARKS: Double
  /**
  				 * Contacts style icon
  				 */
  val CONTACTS: Double
  /**
  				 * Downloads style icon
  				 */
  val DOWNLOADS: Double
  /**
  				 * Favorites style icon
  				 */
  val FAVORITES: Double
  /**
  				 * Featured style icon
  				 */
  val FEATURED: Double
  /**
  				 * History style icon
  				 */
  val HISTORY: Double
  /**
  				 * More style icon
  				 */
  val MORE: Double
  /**
  				 * Most recent style icon
  				 */
  val MOST_RECENT: Double
  /**
  				 * Most viewed style icon
  				 */
  val MOST_VIEWED: Double
  /**
  				 * Recents style icon
  				 */
  val RECENTS: Double
  /**
  				 * Search style icon
  				 */
  val SEARCH: Double
  /**
  				 * Top rated style icon
  				 */
  val TOP_RATED: Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofSystemIcon {
  @scala.inline
  def apply(
    BOOKMARKS: Double,
    CONTACTS: Double,
    DOWNLOADS: Double,
    FAVORITES: Double,
    FEATURED: Double,
    HISTORY: Double,
    MORE: Double,
    MOST_RECENT: Double,
    MOST_VIEWED: Double,
    RECENTS: Double,
    SEARCH: Double,
    TOP_RATED: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback
  ): TypeofSystemIcon = {
    val __obj = js.Dynamic.literal(BOOKMARKS = BOOKMARKS.asInstanceOf[js.Any], CONTACTS = CONTACTS.asInstanceOf[js.Any], DOWNLOADS = DOWNLOADS.asInstanceOf[js.Any], FAVORITES = FAVORITES.asInstanceOf[js.Any], FEATURED = FEATURED.asInstanceOf[js.Any], HISTORY = HISTORY.asInstanceOf[js.Any], MORE = MORE.asInstanceOf[js.Any], MOST_RECENT = MOST_RECENT.asInstanceOf[js.Any], MOST_VIEWED = MOST_VIEWED.asInstanceOf[js.Any], RECENTS = RECENTS.asInstanceOf[js.Any], SEARCH = SEARCH.asInstanceOf[js.Any], TOP_RATED = TOP_RATED.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.asInstanceOf[TypeofSystemIcon]
  }
}

