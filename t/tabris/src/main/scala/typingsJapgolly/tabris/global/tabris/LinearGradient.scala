package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.mod.LinearGradientValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.LinearGradient")
@js.native
open class LinearGradient protected ()
  extends typingsJapgolly.tabris.mod.LinearGradient {
  /**
    * Represents a linear gradient. See also ${doc:LinearGradientValue}
    */
  def this(colorStops: js.Array[
        typingsJapgolly.tabris.mod.Color | (js.Tuple2[typingsJapgolly.tabris.mod.Color, typingsJapgolly.tabris.mod.Percent])
      ]) = this()
  def this(
    colorStops: js.Array[
        typingsJapgolly.tabris.mod.Color | (js.Tuple2[typingsJapgolly.tabris.mod.Color, typingsJapgolly.tabris.mod.Percent])
      ],
    direction: Double
  ) = this()
}
/* static members */
object LinearGradient {
  
  @JSGlobal("tabris.LinearGradient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of LinearGradient using any valid linear gradient expression. For any other
    * value, including `null` and `'initial'` the method throws.
    * @param linearGradientValue The value to create a LinearGradient instance from
    */
  inline def from(linearGradientValue: LinearGradientValue): typingsJapgolly.tabris.mod.LinearGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(linearGradientValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.LinearGradient]
  
  /**
    * Returns true if value is a LinearGradientValue. This includes `null` and `'initial'`. Use this to
    * check if a value will be accepted by a linear gradient property. This is also a valid TypeScript type
    * guard function.
    * @param value The value to test
    */
  inline def isLinearGradientValue(value: Any): /* is tabris.tabris.LinearGradientValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinearGradientValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.LinearGradientValue */ Boolean]
  
  /**
    * Returns true if value is a valid LinearGradientValue. This excludes `null` and `'initial'`. Use this
    * to check if a value will be accepted by LinearGradient.from. This is also a valid TypeScript type
    * guard function.
    * @param value The value to test
    */
  inline def isValidLinearGradientValue(value: Any): /* is tabris.tabris.LinearGradientValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidLinearGradientValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.LinearGradientValue */ Boolean]
}
