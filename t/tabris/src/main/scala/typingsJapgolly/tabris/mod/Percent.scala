package typingsJapgolly.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Percent")
@js.native
open class Percent protected () extends StObject {
  /**
    * Represents a percentage. See also ${doc:PercentValue}
    */
  def this(value: Double) = this()
  
  /**
    * A number between and including 0 and 100
    * @constant
    */
  val percent: Double = js.native
}
/* static members */
object Percent {
  
  @JSImport("tabris", "Percent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Percent using any valid percent expression. For any other value, including
    * `null` the method throws.
    * @param percentValue The value to create a Percent instance from
    */
  inline def from(percentValue: PercentValue): Percent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(percentValue.asInstanceOf[js.Any]).asInstanceOf[Percent]
  
  /**
    * Returns true if value is a valid PercentValue. This excludes `null`. Use this to check if a value
    * will be accepted by Percent.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidPercentValue(value: Any): /* is tabris.tabris.PercentValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPercentValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.PercentValue */ Boolean]
}
