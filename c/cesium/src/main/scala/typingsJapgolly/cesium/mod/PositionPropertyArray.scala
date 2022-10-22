package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PositionPropertyArray")
@js.native
open class PositionPropertyArray () extends StObject {
  def this(value: js.Array[Property]) = this()
  def this(value: js.Array[Property], referenceFrame: ReferenceFrame) = this()
  def this(value: Unit, referenceFrame: ReferenceFrame) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is changed whenever setValue is called with data different
    * than the current value or one of the properties in the array also changes.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Compares this property to the provided property and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The other property.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  /**
    * Gets the value of the property.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): js.Array[Cartesian3] = js.native
  def getValue(time: JulianDate, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /**
    * Gets the value of the property at the provided time and in the provided reference frame.
    * @param time - The time for which to retrieve the value.
    * @param referenceFrame - The desired referenceFrame of the result.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): js.Array[Cartesian3] = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /**
    * Gets a value indicating if this property is constant.  This property
    * is considered constant if all property items in the array are constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets the reference frame in which the position is defined.
    */
  var referenceFrame: ReferenceFrame = js.native
  
  /**
    * Sets the value of the property.
    * @param value - An array of Property instances.
    */
  def setValue(value: js.Array[Property]): Unit = js.native
}
