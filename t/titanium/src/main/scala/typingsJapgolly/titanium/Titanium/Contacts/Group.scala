package typingsJapgolly.titanium.Titanium.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object which represents a group in the system contacts address book.
		 */
trait Group extends Proxy {
  /**
  			 * Identifier of the group.
  			 */
  val identifier: String
  /**
  			 * Name of this group.
  			 */
  var name: String
  /**
  			 * Record identifier of the group. Single value. Deprecated for iOS 9 and later.
  			 */
  var recordId: Double
  /**
  			 * Adds a person to this group.
  			 */
  def add(person: Person): Unit
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.identifier> property.
  			 */
  def getIdentifier(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def getRecordId(): Double
  /**
  			 * Gets people that are members of this group.
  			 */
  def members(): js.Array[Person]
  /**
  			 * Removes a person from this group. For >= iOS9, it is not
  			 * required to call <Titanium.Contacts.save> after calling this method.
  			 */
  def remove(person: Person): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def setRecordId(recordId: Double): Unit
  /**
  			 * Gets people that are members of this group, sorted in the specified order.
  			 */
  def sortedMembers(sortBy: Double): js.Array[Person]
}

object Group {
  @scala.inline
  def apply(
    add: Person => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getIdentifier: CallbackTo[String],
    getName: CallbackTo[String],
    getRecordId: CallbackTo[Double],
    identifier: String,
    members: CallbackTo[js.Array[Person]],
    name: String,
    recordId: Double,
    remove: Person => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setName: String => Callback,
    setRecordId: Double => Callback,
    sortedMembers: Double => CallbackTo[js.Array[Person]],
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Group = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Contacts.Person) => add(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getIdentifier")(getIdentifier.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getRecordId")(getRecordId.toJsFn)
    __obj.updateDynamic("members")(members.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Contacts.Person) => remove(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setRecordId")(js.Any.fromFunction1((t0: scala.Double) => setRecordId(t0).runNow()))
    __obj.updateDynamic("sortedMembers")(js.Any.fromFunction1((t0: scala.Double) => sortedMembers(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

