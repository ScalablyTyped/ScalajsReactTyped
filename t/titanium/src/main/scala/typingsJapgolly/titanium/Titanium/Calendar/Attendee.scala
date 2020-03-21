package typingsJapgolly.titanium.Titanium.Calendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single attendee of an event.
		 */
trait Attendee extends Proxy {
  /**
  			 * The attendee email.
  			 */
  var email: String
  /**
  			 * Indicates whether this attendee is the event organizer.
  			 */
  var isOrganizer: Boolean
  /**
  			 * The attendee name.
  			 */
  var name: String
  /**
  			 * The role of the attendee.
  			 */
  var role: Double
  /**
  			 * The status of the attendee.
  			 */
  var status: Double
  /**
  			 * The type of the attendee.
  			 */
  var `type`: Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def getEmail(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def getIsOrganizer(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def getRole(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def getStatus(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def getType(): Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def setEmail(email: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def setIsOrganizer(isOrganizer: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def setRole(role: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def setStatus(status: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def setType(`type`: Double): Unit
}

object Attendee {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    email: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getEmail: CallbackTo[String],
    getIsOrganizer: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getRole: CallbackTo[Double],
    getStatus: CallbackTo[Double],
    getType: CallbackTo[Double],
    isOrganizer: Boolean,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    role: Double,
    setBubbleParent: Boolean => Callback,
    setEmail: String => Callback,
    setIsOrganizer: Boolean => Callback,
    setName: String => Callback,
    setRole: Double => Callback,
    setStatus: Double => Callback,
    setType: Double => Callback,
    status: Double,
    `type`: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Attendee = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], isOrganizer = isOrganizer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getIsOrganizer")(getIsOrganizer.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getRole")(getRole.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setEmail")(js.Any.fromFunction1((t0: java.lang.String) => setEmail(t0).runNow()))
    __obj.updateDynamic("setIsOrganizer")(js.Any.fromFunction1((t0: scala.Boolean) => setIsOrganizer(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setRole")(js.Any.fromFunction1((t0: scala.Double) => setRole(t0).runNow()))
    __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: scala.Double) => setStatus(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: scala.Double) => setType(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attendee]
  }
}

