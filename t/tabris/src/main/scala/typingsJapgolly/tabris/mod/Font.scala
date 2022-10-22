package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.`sans-serif`
import typingsJapgolly.tabris.tabrisStrings.black
import typingsJapgolly.tabris.tabrisStrings.bold
import typingsJapgolly.tabris.tabrisStrings.italic
import typingsJapgolly.tabris.tabrisStrings.light
import typingsJapgolly.tabris.tabrisStrings.medium
import typingsJapgolly.tabris.tabrisStrings.normal
import typingsJapgolly.tabris.tabrisStrings.thin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Font")
@js.native
open class Font protected () extends StObject {
  /**
    * Represents a font. See also ${doc:FontValue}
    */
  def this(size: Double) = this()
  def this(size: Double, family: js.Array[String]) = this()
  def this(size: Double, family: js.Array[String], weight: black | bold | medium | thin | light | normal) = this()
  def this(size: Double, family: Unit, weight: black | bold | medium | thin | light | normal) = this()
  def this(
    size: Double,
    family: js.Array[String],
    weight: black | bold | medium | thin | light | normal,
    style: italic | normal
  ) = this()
  def this(size: Double, family: js.Array[String], weight: Unit, style: italic | normal) = this()
  def this(
    size: Double,
    family: Unit,
    weight: black | bold | medium | thin | light | normal,
    style: italic | normal
  ) = this()
  def this(size: Double, family: Unit, weight: Unit, style: italic | normal) = this()
  
  /**
    * Tests if the given value is a `Font` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Font): Boolean = js.native
  
  /**
    * Prioritized list of font families
    * @constant
    */
  val family: js.Array[String] = js.native
  
  /**
    * Positive number in dip
    * @constant
    */
  val size: Double = js.native
  
  /**
    * Face of the font family to be used
    * @constant
    */
  val style: italic | normal = js.native
  
  /**
    * Boldness of the font
    * @constant
    */
  val weight: black | bold | medium | thin | light | normal = js.native
}
/* static members */
object Font {
  
  @JSImport("tabris", "Font")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tabris", "Font.condensed")
  @js.native
  val condensed: typingsJapgolly.tabris.tabrisStrings.condensed = js.native
  
  /**
    * Creates a new instance of Font using any valid font expression. For any other value, including `null`
    * and `'initial'` the method throws.
    * @param fontValue The value to create a Font instance from
    */
  inline def from(fontValue: FontValue): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(fontValue.asInstanceOf[js.Any]).asInstanceOf[Font]
  
  /**
    * Returns true if value is a FontValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a font property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isFontValue(value: Any): /* is tabris.tabris.FontValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFontValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.FontValue */ Boolean]
  
  /**
    * Returns true if value is a valid FontValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Font.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidFontValue(value: Any): /* is tabris.tabris.FontValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFontValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.FontValue */ Boolean]
  
  @JSImport("tabris", "Font.monospace")
  @js.native
  val monospace: typingsJapgolly.tabris.tabrisStrings.monospace = js.native
  
  @JSImport("tabris", "Font.sansSerif")
  @js.native
  val sansSerif: `sans-serif` = js.native
  
  @JSImport("tabris", "Font.serif")
  @js.native
  val serif: typingsJapgolly.tabris.tabrisStrings.serif = js.native
}
