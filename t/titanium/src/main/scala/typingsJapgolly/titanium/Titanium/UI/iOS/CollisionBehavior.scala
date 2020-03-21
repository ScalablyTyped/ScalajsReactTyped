package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.BoundaryIdentifier
import typingsJapgolly.titanium.ReferenceInsets
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.View
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support collisions between items and boundaries.
			 */
trait CollisionBehavior extends Proxy {
  /**
  				 * Boundary identfiers added to this behavior.
  				 */
  val boundaryIdentifiers: js.Array[BoundaryIdentifier]
  /**
  				 * Specifies the collision behavior.
  				 */
  var collisionMode: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Insets to apply when using the animator's reference view as the boundary.
  				 */
  var referenceInsets: ReferenceInsets
  /**
  				 * Use the animator's reference view as the boundary.
  				 */
  var treatReferenceAsBoundary: Boolean
  /**
  				 * Adds a boundary to this behavior.
  				 */
  def addBoundary(boundary: BoundaryIdentifier): Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.boundaryIdentifiers> property.
  				 */
  def getBoundaryIdentifiers(): js.Array[BoundaryIdentifier]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def getCollisionMode(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def getReferenceInsets(): ReferenceInsets
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def getTreatReferenceAsBoundary(): Boolean
  /**
  				 * Removes all boundaries from this behavior.
  				 */
  def removeAllBoundaries(): Unit
  /**
  				 * Removes the specified boundary from this behavior.
  				 */
  def removeBoundary(boundary: BoundaryIdentifier): Unit
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def setCollisionMode(collisionMode: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def setReferenceInsets(referenceInsets: ReferenceInsets): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def setTreatReferenceAsBoundary(treatReferenceAsBoundary: Boolean): Unit
}

object CollisionBehavior {
  @scala.inline
  def apply(
    addBoundary: BoundaryIdentifier => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addItem: js.Any => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    boundaryIdentifiers: js.Array[BoundaryIdentifier],
    bubbleParent: Boolean,
    collisionMode: Double,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBoundaryIdentifiers: CallbackTo[js.Array[BoundaryIdentifier]],
    getBubbleParent: CallbackTo[Boolean],
    getCollisionMode: CallbackTo[Double],
    getItems: CallbackTo[js.Array[View]],
    getReferenceInsets: CallbackTo[ReferenceInsets],
    getTreatReferenceAsBoundary: CallbackTo[Boolean],
    items: js.Array[View],
    referenceInsets: ReferenceInsets,
    removeAllBoundaries: Callback,
    removeBoundary: BoundaryIdentifier => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeItem: js.Any => Callback,
    setBubbleParent: Boolean => Callback,
    setCollisionMode: Double => Callback,
    setReferenceInsets: ReferenceInsets => Callback,
    setTreatReferenceAsBoundary: Boolean => Callback,
    treatReferenceAsBoundary: Boolean,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): CollisionBehavior = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], boundaryIdentifiers = boundaryIdentifiers.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], collisionMode = collisionMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], referenceInsets = referenceInsets.asInstanceOf[js.Any], treatReferenceAsBoundary = treatReferenceAsBoundary.asInstanceOf[js.Any])
    __obj.updateDynamic("addBoundary")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.BoundaryIdentifier) => addBoundary(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Any) => addItem(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBoundaryIdentifiers")(getBoundaryIdentifiers.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getCollisionMode")(getCollisionMode.toJsFn)
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("getReferenceInsets")(getReferenceInsets.toJsFn)
    __obj.updateDynamic("getTreatReferenceAsBoundary")(getTreatReferenceAsBoundary.toJsFn)
    __obj.updateDynamic("removeAllBoundaries")(removeAllBoundaries.toJsFn)
    __obj.updateDynamic("removeBoundary")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.BoundaryIdentifier) => removeBoundary(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: js.Any) => removeItem(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setCollisionMode")(js.Any.fromFunction1((t0: scala.Double) => setCollisionMode(t0).runNow()))
    __obj.updateDynamic("setReferenceInsets")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.ReferenceInsets) => setReferenceInsets(t0).runNow()))
    __obj.updateDynamic("setTreatReferenceAsBoundary")(js.Any.fromFunction1((t0: scala.Boolean) => setTreatReferenceAsBoundary(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehavior]
  }
}

