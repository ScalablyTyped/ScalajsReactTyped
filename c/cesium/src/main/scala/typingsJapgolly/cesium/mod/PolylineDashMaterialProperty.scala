package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.DashLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineDashMaterialProperty")
@js.native
open class PolylineDashMaterialProperty () extends StObject {
  def this(options: DashLength) = this()
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the line.
    */
  var color: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the length of a dash cycle
    */
  var dashLength: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying a dash pattern
    */
  var dashPattern: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is considered to have changed if a call to getValue would return
    * a different result for the same time.
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
    * Gets or sets the Property specifying the {@link Color} of the gaps in the line.
    */
  var gapColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets the {@link Material} type at the provided time.
    * @param time - The time for which to retrieve the type.
    * @returns The type of material.
    */
  def getType(time: JulianDate): String = js.native
  
  /**
    * Gets the value of the property at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
}
