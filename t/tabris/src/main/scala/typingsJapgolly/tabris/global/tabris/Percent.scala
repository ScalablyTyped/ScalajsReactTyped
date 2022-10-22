package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.mod.PercentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Percent")
@js.native
open class Percent protected ()
  extends typingsJapgolly.tabris.mod.Percent {
  /**
    * Represents a percentage. See also ${doc:PercentValue}
    */
  def this(value: Double) = this()
}
/* static members */
object Percent {
  
  @JSGlobal("tabris.Percent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Percent using any valid percent expression. For any other value, including
    * `null` the method throws.
    * @param percentValue The value to create a Percent instance from
    */
  inline def from(percentValue: PercentValue): typingsJapgolly.tabris.mod.Percent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(percentValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.Percent]
  
  /**
    * Returns true if value is a valid PercentValue. This excludes `null`. Use this to check if a value
    * will be accepted by Percent.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidPercentValue(value: Any): /* is tabris.tabris.PercentValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPercentValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.PercentValue */ Boolean]
}
