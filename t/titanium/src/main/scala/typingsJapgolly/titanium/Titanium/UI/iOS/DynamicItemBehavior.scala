package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Point
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.View
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base dynamic configuration for an item.
			 */
trait DynamicItemBehavior extends Proxy {
  /**
  				 * Specifies if this item can rotate.
  				 */
  var allowsRotation: Boolean
  /**
  				 * Specifies the angular resistance of this item.
  				 */
  var angularResistance: Double
  /**
  				 * Specifies the relative mass density of this item.
  				 */
  var density: Double
  /**
  				 * Specifies the elasticity applied to collisions for this item.
  				 */
  var elasticity: Double
  /**
  				 * Specifies the linear resistance of the item when it slides against another item.
  				 */
  var friction: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the linear resistance of this item which reduces linear velocity over time.
  				 */
  var resistance: Double
  /**
  				 * Adds a specified angular velocity for the item.
  				 */
  def addAngularVelocityForItem(item: js.Any, velocity: Double): Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Adds a specified linear velocity for the item.
  				 */
  def addLinearVelocityForItem(item: js.Any, velocity: Point): Unit
  /**
  				 * Returns the angular velocity of the item.
  				 */
  def angularVelocityForItem(item: js.Any): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def getAllowsRotation(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def getAngularResistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def getDensity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def getElasticity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def getFriction(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def getResistance(): Double
  /**
  				 * Returns the linear velocity of the item.
  				 */
  def linearVelocityForItem(item: js.Any): Point
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def setAllowsRotation(allowsRotation: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def setAngularResistance(angularResistance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def setDensity(density: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def setElasticity(elasticity: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def setFriction(friction: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def setResistance(resistance: Double): Unit
}

object DynamicItemBehavior {
  @scala.inline
  def apply(
    addAngularVelocityForItem: (js.Any, Double) => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addItem: js.Any => Callback,
    addLinearVelocityForItem: (js.Any, Point) => Callback,
    allowsRotation: Boolean,
    angularResistance: Double,
    angularVelocityForItem: js.Any => CallbackTo[Double],
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    density: Double,
    elasticity: Double,
    fireEvent: (String, js.Any) => Callback,
    friction: Double,
    getAllowsRotation: CallbackTo[Boolean],
    getAngularResistance: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDensity: CallbackTo[Double],
    getElasticity: CallbackTo[Double],
    getFriction: CallbackTo[Double],
    getItems: CallbackTo[js.Array[View]],
    getResistance: CallbackTo[Double],
    items: js.Array[View],
    linearVelocityForItem: js.Any => CallbackTo[Point],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeItem: js.Any => Callback,
    resistance: Double,
    setAllowsRotation: Boolean => Callback,
    setAngularResistance: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setDensity: Double => Callback,
    setElasticity: Double => Callback,
    setFriction: Double => Callback,
    setResistance: Double => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): DynamicItemBehavior = {
    val __obj = js.Dynamic.literal(allowsRotation = allowsRotation.asInstanceOf[js.Any], angularResistance = angularResistance.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], elasticity = elasticity.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], resistance = resistance.asInstanceOf[js.Any])
    __obj.updateDynamic("addAngularVelocityForItem")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => addAngularVelocityForItem(t0, t1).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Any) => addItem(t0).runNow()))
    __obj.updateDynamic("addLinearVelocityForItem")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.titanium.Point) => addLinearVelocityForItem(t0, t1).runNow()))
    __obj.updateDynamic("angularVelocityForItem")(js.Any.fromFunction1((t0: js.Any) => angularVelocityForItem(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAllowsRotation")(getAllowsRotation.toJsFn)
    __obj.updateDynamic("getAngularResistance")(getAngularResistance.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDensity")(getDensity.toJsFn)
    __obj.updateDynamic("getElasticity")(getElasticity.toJsFn)
    __obj.updateDynamic("getFriction")(getFriction.toJsFn)
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("getResistance")(getResistance.toJsFn)
    __obj.updateDynamic("linearVelocityForItem")(js.Any.fromFunction1((t0: js.Any) => linearVelocityForItem(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: js.Any) => removeItem(t0).runNow()))
    __obj.updateDynamic("setAllowsRotation")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowsRotation(t0).runNow()))
    __obj.updateDynamic("setAngularResistance")(js.Any.fromFunction1((t0: scala.Double) => setAngularResistance(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDensity")(js.Any.fromFunction1((t0: scala.Double) => setDensity(t0).runNow()))
    __obj.updateDynamic("setElasticity")(js.Any.fromFunction1((t0: scala.Double) => setElasticity(t0).runNow()))
    __obj.updateDynamic("setFriction")(js.Any.fromFunction1((t0: scala.Double) => setFriction(t0).runNow()))
    __obj.updateDynamic("setResistance")(js.Any.fromFunction1((t0: scala.Double) => setResistance(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicItemBehavior]
  }
}

