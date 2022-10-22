package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Color")
@js.native
open class Color () extends StObject {
  def this(red: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: Unit, green: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Unit, blue: Double) = this()
  def this(red: Unit, green: Double, blue: Double) = this()
  def this(red: Unit, green: Unit, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Unit, alpha: Double) = this()
  
  /**
    * The alpha component.
    */
  var alpha: Double = js.native
  
  /**
    * The blue component.
    */
  var blue: Double = js.native
  
  /**
    * Brightens this color by the provided magnitude.
    * @example
    * const brightBlue = Cesium.Color.BLUE.brighten(0.5, new Cesium.Color());
    * @param magnitude - A positive number indicating the amount to brighten.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  def brighten(magnitude: Double, result: Color): Color = js.native
  
  def clone(result: Color): Color = js.native
  
  /**
    * Darkens this color by the provided magnitude.
    * @example
    * const darkBlue = Cesium.Color.BLUE.darken(0.5, new Cesium.Color());
    * @param magnitude - A positive number indicating the amount to darken.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  def darken(magnitude: Double, result: Color): Color = js.native
  
  /**
    * Returns true if this Color equals other.
    * @param other - The Color to compare for equality.
    * @returns <code>true</code> if the Colors are equal; otherwise, <code>false</code>.
    */
  def equals(other: Color): Boolean = js.native
  
  /**
    * Returns <code>true</code> if this Color equals other componentwise within the specified epsilon.
    * @param other - The Color to compare for equality.
    * @param [epsilon = 0.0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if the Colors are equal within the specified epsilon; otherwise, <code>false</code>.
    */
  def equalsEpsilon(other: Color): Boolean = js.native
  def equalsEpsilon(other: Color, epsilon: Double): Boolean = js.native
  
  /**
    * The green component.
    */
  var green: Double = js.native
  
  /**
    * The red component.
    */
  var red: Double = js.native
  
  /**
    * Converts this color to an array of red, green, blue, and alpha values
    * that are in the range of 0 to 255.
    * @param [result] - The array to store the result in, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined.
    */
  def toBytes(): js.Array[Double] = js.native
  def toBytes(result: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * Creates a string containing the CSS color value for this color.
    * @returns The CSS equivalent of this color.
    */
  def toCssColorString(): String = js.native
  
  /**
    * Creates a string containing CSS hex string color value for this color.
    * @returns The CSS hex string equivalent of this color.
    */
  def toCssHexString(): String = js.native
  
  /**
    * Converts this color to a single numeric unsigned 32-bit RGBA value, using the endianness
    * of the system.
    * @example
    * const rgba = Cesium.Color.BLUE.toRgba();
    * @returns A single numeric unsigned 32-bit RGBA value.
    */
  def toRgba(): Double = js.native
  
  /**
    * Creates a new Color that has the same red, green, and blue components
    * as this Color, but with the specified alpha value.
    * @example
    * const translucentRed = Cesium.Color.RED.withAlpha(0.9);
    * @param alpha - The new alpha component.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  def withAlpha(alpha: Double): Color = js.native
  def withAlpha(alpha: Double, result: Color): Color = js.native
}
/* static members */
object Color {
  
  @JSImport("cesium", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F0F8FF
    * <span class="colorSwath" style="background: #F0F8FF;"></span>
    */
  @JSImport("cesium", "Color.ALICEBLUE")
  @js.native
  val ALICEBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FAEBD7
    * <span class="colorSwath" style="background: #FAEBD7;"></span>
    */
  @JSImport("cesium", "Color.ANTIQUEWHITE")
  @js.native
  val ANTIQUEWHITE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00FFFF
    * <span class="colorSwath" style="background: #00FFFF;"></span>
    */
  @JSImport("cesium", "Color.AQUA")
  @js.native
  val AQUA: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #7FFFD4
    * <span class="colorSwath" style="background: #7FFFD4;"></span>
    */
  @JSImport("cesium", "Color.AQUAMARINE")
  @js.native
  val AQUAMARINE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F0FFFF
    * <span class="colorSwath" style="background: #F0FFFF;"></span>
    */
  @JSImport("cesium", "Color.AZURE")
  @js.native
  val AZURE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F5F5DC
    * <span class="colorSwath" style="background: #F5F5DC;"></span>
    */
  @JSImport("cesium", "Color.BEIGE")
  @js.native
  val BEIGE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFE4C4
    * <span class="colorSwath" style="background: #FFE4C4;"></span>
    */
  @JSImport("cesium", "Color.BISQUE")
  @js.native
  val BISQUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #000000
    * <span class="colorSwath" style="background: #000000;"></span>
    */
  @JSImport("cesium", "Color.BLACK")
  @js.native
  val BLACK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFEBCD
    * <span class="colorSwath" style="background: #FFEBCD;"></span>
    */
  @JSImport("cesium", "Color.BLANCHEDALMOND")
  @js.native
  val BLANCHEDALMOND: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #0000FF
    * <span class="colorSwath" style="background: #0000FF;"></span>
    */
  @JSImport("cesium", "Color.BLUE")
  @js.native
  val BLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #8A2BE2
    * <span class="colorSwath" style="background: #8A2BE2;"></span>
    */
  @JSImport("cesium", "Color.BLUEVIOLET")
  @js.native
  val BLUEVIOLET: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #A52A2A
    * <span class="colorSwath" style="background: #A52A2A;"></span>
    */
  @JSImport("cesium", "Color.BROWN")
  @js.native
  val BROWN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DEB887
    * <span class="colorSwath" style="background: #DEB887;"></span>
    */
  @JSImport("cesium", "Color.BURLYWOOD")
  @js.native
  val BURLYWOOD: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #5F9EA0
    * <span class="colorSwath" style="background: #5F9EA0;"></span>
    */
  @JSImport("cesium", "Color.CADETBLUE")
  @js.native
  val CADETBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #7FFF00
    * <span class="colorSwath" style="background: #7FFF00;"></span>
    */
  @JSImport("cesium", "Color.CHARTREUSE")
  @js.native
  val CHARTREUSE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #D2691E
    * <span class="colorSwath" style="background: #D2691E;"></span>
    */
  @JSImport("cesium", "Color.CHOCOLATE")
  @js.native
  val CHOCOLATE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF7F50
    * <span class="colorSwath" style="background: #FF7F50;"></span>
    */
  @JSImport("cesium", "Color.CORAL")
  @js.native
  val CORAL: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #6495ED
    * <span class="colorSwath" style="background: #6495ED;"></span>
    */
  @JSImport("cesium", "Color.CORNFLOWERBLUE")
  @js.native
  val CORNFLOWERBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFF8DC
    * <span class="colorSwath" style="background: #FFF8DC;"></span>
    */
  @JSImport("cesium", "Color.CORNSILK")
  @js.native
  val CORNSILK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DC143C
    * <span class="colorSwath" style="background: #DC143C;"></span>
    */
  @JSImport("cesium", "Color.CRIMSON")
  @js.native
  val CRIMSON: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00FFFF
    * <span class="colorSwath" style="background: #00FFFF;"></span>
    */
  @JSImport("cesium", "Color.CYAN")
  @js.native
  val CYAN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00008B
    * <span class="colorSwath" style="background: #00008B;"></span>
    */
  @JSImport("cesium", "Color.DARKBLUE")
  @js.native
  val DARKBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #008B8B
    * <span class="colorSwath" style="background: #008B8B;"></span>
    */
  @JSImport("cesium", "Color.DARKCYAN")
  @js.native
  val DARKCYAN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #B8860B
    * <span class="colorSwath" style="background: #B8860B;"></span>
    */
  @JSImport("cesium", "Color.DARKGOLDENROD")
  @js.native
  val DARKGOLDENROD: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #A9A9A9
    * <span class="colorSwath" style="background: #A9A9A9;"></span>
    */
  @JSImport("cesium", "Color.DARKGRAY")
  @js.native
  val DARKGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #006400
    * <span class="colorSwath" style="background: #006400;"></span>
    */
  @JSImport("cesium", "Color.DARKGREEN")
  @js.native
  val DARKGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #A9A9A9
    * <span class="colorSwath" style="background: #A9A9A9;"></span>
    */
  @JSImport("cesium", "Color.DARKGREY")
  @js.native
  val DARKGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #BDB76B
    * <span class="colorSwath" style="background: #BDB76B;"></span>
    */
  @JSImport("cesium", "Color.DARKKHAKI")
  @js.native
  val DARKKHAKI: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #8B008B
    * <span class="colorSwath" style="background: #8B008B;"></span>
    */
  @JSImport("cesium", "Color.DARKMAGENTA")
  @js.native
  val DARKMAGENTA: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #556B2F
    * <span class="colorSwath" style="background: #556B2F;"></span>
    */
  @JSImport("cesium", "Color.DARKOLIVEGREEN")
  @js.native
  val DARKOLIVEGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF8C00
    * <span class="colorSwath" style="background: #FF8C00;"></span>
    */
  @JSImport("cesium", "Color.DARKORANGE")
  @js.native
  val DARKORANGE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #9932CC
    * <span class="colorSwath" style="background: #9932CC;"></span>
    */
  @JSImport("cesium", "Color.DARKORCHID")
  @js.native
  val DARKORCHID: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #8B0000
    * <span class="colorSwath" style="background: #8B0000;"></span>
    */
  @JSImport("cesium", "Color.DARKRED")
  @js.native
  val DARKRED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #E9967A
    * <span class="colorSwath" style="background: #E9967A;"></span>
    */
  @JSImport("cesium", "Color.DARKSALMON")
  @js.native
  val DARKSALMON: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #8FBC8F
    * <span class="colorSwath" style="background: #8FBC8F;"></span>
    */
  @JSImport("cesium", "Color.DARKSEAGREEN")
  @js.native
  val DARKSEAGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #483D8B
    * <span class="colorSwath" style="background: #483D8B;"></span>
    */
  @JSImport("cesium", "Color.DARKSLATEBLUE")
  @js.native
  val DARKSLATEBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #2F4F4F
    * <span class="colorSwath" style="background: #2F4F4F;"></span>
    */
  @JSImport("cesium", "Color.DARKSLATEGRAY")
  @js.native
  val DARKSLATEGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #2F4F4F
    * <span class="colorSwath" style="background: #2F4F4F;"></span>
    */
  @JSImport("cesium", "Color.DARKSLATEGREY")
  @js.native
  val DARKSLATEGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00CED1
    * <span class="colorSwath" style="background: #00CED1;"></span>
    */
  @JSImport("cesium", "Color.DARKTURQUOISE")
  @js.native
  val DARKTURQUOISE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #9400D3
    * <span class="colorSwath" style="background: #9400D3;"></span>
    */
  @JSImport("cesium", "Color.DARKVIOLET")
  @js.native
  val DARKVIOLET: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF1493
    * <span class="colorSwath" style="background: #FF1493;"></span>
    */
  @JSImport("cesium", "Color.DEEPPINK")
  @js.native
  val DEEPPINK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00BFFF
    * <span class="colorSwath" style="background: #00BFFF;"></span>
    */
  @JSImport("cesium", "Color.DEEPSKYBLUE")
  @js.native
  val DEEPSKYBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #696969
    * <span class="colorSwath" style="background: #696969;"></span>
    */
  @JSImport("cesium", "Color.DIMGRAY")
  @js.native
  val DIMGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #696969
    * <span class="colorSwath" style="background: #696969;"></span>
    */
  @JSImport("cesium", "Color.DIMGREY")
  @js.native
  val DIMGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #1E90FF
    * <span class="colorSwath" style="background: #1E90FF;"></span>
    */
  @JSImport("cesium", "Color.DODGERBLUE")
  @js.native
  val DODGERBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #B22222
    * <span class="colorSwath" style="background: #B22222;"></span>
    */
  @JSImport("cesium", "Color.FIREBRICK")
  @js.native
  val FIREBRICK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFAF0
    * <span class="colorSwath" style="background: #FFFAF0;"></span>
    */
  @JSImport("cesium", "Color.FLORALWHITE")
  @js.native
  val FLORALWHITE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #228B22
    * <span class="colorSwath" style="background: #228B22;"></span>
    */
  @JSImport("cesium", "Color.FORESTGREEN")
  @js.native
  val FORESTGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF00FF
    * <span class="colorSwath" style="background: #FF00FF;"></span>
    */
  @JSImport("cesium", "Color.FUCHSIA")
  @js.native
  val FUCHSIA: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DCDCDC
    * <span class="colorSwath" style="background: #DCDCDC;"></span>
    */
  @JSImport("cesium", "Color.GAINSBORO")
  @js.native
  val GAINSBORO: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F8F8FF
    * <span class="colorSwath" style="background: #F8F8FF;"></span>
    */
  @JSImport("cesium", "Color.GHOSTWHITE")
  @js.native
  val GHOSTWHITE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFD700
    * <span class="colorSwath" style="background: #FFD700;"></span>
    */
  @JSImport("cesium", "Color.GOLD")
  @js.native
  val GOLD: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DAA520
    * <span class="colorSwath" style="background: #DAA520;"></span>
    */
  @JSImport("cesium", "Color.GOLDENROD")
  @js.native
  val GOLDENROD: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #808080
    * <span class="colorSwath" style="background: #808080;"></span>
    */
  @JSImport("cesium", "Color.GRAY")
  @js.native
  val GRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #008000
    * <span class="colorSwath" style="background: #008000;"></span>
    */
  @JSImport("cesium", "Color.GREEN")
  @js.native
  val GREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #ADFF2F
    * <span class="colorSwath" style="background: #ADFF2F;"></span>
    */
  @JSImport("cesium", "Color.GREENYELLOW")
  @js.native
  val GREENYELLOW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #808080
    * <span class="colorSwath" style="background: #808080;"></span>
    */
  @JSImport("cesium", "Color.GREY")
  @js.native
  val GREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F0FFF0
    * <span class="colorSwath" style="background: #F0FFF0;"></span>
    */
  @JSImport("cesium", "Color.HONEYDEW")
  @js.native
  val HONEYDEW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF69B4
    * <span class="colorSwath" style="background: #FF69B4;"></span>
    */
  @JSImport("cesium", "Color.HOTPINK")
  @js.native
  val HOTPINK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #CD5C5C
    * <span class="colorSwath" style="background: #CD5C5C;"></span>
    */
  @JSImport("cesium", "Color.INDIANRED")
  @js.native
  val INDIANRED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #4B0082
    * <span class="colorSwath" style="background: #4B0082;"></span>
    */
  @JSImport("cesium", "Color.INDIGO")
  @js.native
  val INDIGO: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFFF0
    * <span class="colorSwath" style="background: #FFFFF0;"></span>
    */
  @JSImport("cesium", "Color.IVORY")
  @js.native
  val IVORY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F0E68C
    * <span class="colorSwath" style="background: #F0E68C;"></span>
    */
  @JSImport("cesium", "Color.KHAKI")
  @js.native
  val KHAKI: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFF0F5
    * <span class="colorSwath" style="background: #FFF0F5;"></span>
    */
  @JSImport("cesium", "Color.LAVENDAR_BLUSH")
  @js.native
  val LAVENDAR_BLUSH: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #E6E6FA
    * <span class="colorSwath" style="background: #E6E6FA;"></span>
    */
  @JSImport("cesium", "Color.LAVENDER")
  @js.native
  val LAVENDER: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #7CFC00
    * <span class="colorSwath" style="background: #7CFC00;"></span>
    */
  @JSImport("cesium", "Color.LAWNGREEN")
  @js.native
  val LAWNGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFACD
    * <span class="colorSwath" style="background: #FFFACD;"></span>
    */
  @JSImport("cesium", "Color.LEMONCHIFFON")
  @js.native
  val LEMONCHIFFON: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #ADD8E6
    * <span class="colorSwath" style="background: #ADD8E6;"></span>
    */
  @JSImport("cesium", "Color.LIGHTBLUE")
  @js.native
  val LIGHTBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F08080
    * <span class="colorSwath" style="background: #F08080;"></span>
    */
  @JSImport("cesium", "Color.LIGHTCORAL")
  @js.native
  val LIGHTCORAL: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #E0FFFF
    * <span class="colorSwath" style="background: #E0FFFF;"></span>
    */
  @JSImport("cesium", "Color.LIGHTCYAN")
  @js.native
  val LIGHTCYAN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FAFAD2
    * <span class="colorSwath" style="background: #FAFAD2;"></span>
    */
  @JSImport("cesium", "Color.LIGHTGOLDENRODYELLOW")
  @js.native
  val LIGHTGOLDENRODYELLOW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #D3D3D3
    * <span class="colorSwath" style="background: #D3D3D3;"></span>
    */
  @JSImport("cesium", "Color.LIGHTGRAY")
  @js.native
  val LIGHTGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #90EE90
    * <span class="colorSwath" style="background: #90EE90;"></span>
    */
  @JSImport("cesium", "Color.LIGHTGREEN")
  @js.native
  val LIGHTGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #D3D3D3
    * <span class="colorSwath" style="background: #D3D3D3;"></span>
    */
  @JSImport("cesium", "Color.LIGHTGREY")
  @js.native
  val LIGHTGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFB6C1
    * <span class="colorSwath" style="background: #FFB6C1;"></span>
    */
  @JSImport("cesium", "Color.LIGHTPINK")
  @js.native
  val LIGHTPINK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #20B2AA
    * <span class="colorSwath" style="background: #20B2AA;"></span>
    */
  @JSImport("cesium", "Color.LIGHTSEAGREEN")
  @js.native
  val LIGHTSEAGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #87CEFA
    * <span class="colorSwath" style="background: #87CEFA;"></span>
    */
  @JSImport("cesium", "Color.LIGHTSKYBLUE")
  @js.native
  val LIGHTSKYBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #778899
    * <span class="colorSwath" style="background: #778899;"></span>
    */
  @JSImport("cesium", "Color.LIGHTSLATEGRAY")
  @js.native
  val LIGHTSLATEGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #778899
    * <span class="colorSwath" style="background: #778899;"></span>
    */
  @JSImport("cesium", "Color.LIGHTSLATEGREY")
  @js.native
  val LIGHTSLATEGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #B0C4DE
    * <span class="colorSwath" style="background: #B0C4DE;"></span>
    */
  @JSImport("cesium", "Color.LIGHTSTEELBLUE")
  @js.native
  val LIGHTSTEELBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFFE0
    * <span class="colorSwath" style="background: #FFFFE0;"></span>
    */
  @JSImport("cesium", "Color.LIGHTYELLOW")
  @js.native
  val LIGHTYELLOW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00FF00
    * <span class="colorSwath" style="background: #00FF00;"></span>
    */
  @JSImport("cesium", "Color.LIME")
  @js.native
  val LIME: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #32CD32
    * <span class="colorSwath" style="background: #32CD32;"></span>
    */
  @JSImport("cesium", "Color.LIMEGREEN")
  @js.native
  val LIMEGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FAF0E6
    * <span class="colorSwath" style="background: #FAF0E6;"></span>
    */
  @JSImport("cesium", "Color.LINEN")
  @js.native
  val LINEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF00FF
    * <span class="colorSwath" style="background: #FF00FF;"></span>
    */
  @JSImport("cesium", "Color.MAGENTA")
  @js.native
  val MAGENTA: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #800000
    * <span class="colorSwath" style="background: #800000;"></span>
    */
  @JSImport("cesium", "Color.MAROON")
  @js.native
  val MAROON: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #66CDAA
    * <span class="colorSwath" style="background: #66CDAA;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMAQUAMARINE")
  @js.native
  val MEDIUMAQUAMARINE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #0000CD
    * <span class="colorSwath" style="background: #0000CD;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMBLUE")
  @js.native
  val MEDIUMBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #BA55D3
    * <span class="colorSwath" style="background: #BA55D3;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMORCHID")
  @js.native
  val MEDIUMORCHID: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #9370DB
    * <span class="colorSwath" style="background: #9370DB;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMPURPLE")
  @js.native
  val MEDIUMPURPLE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #3CB371
    * <span class="colorSwath" style="background: #3CB371;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMSEAGREEN")
  @js.native
  val MEDIUMSEAGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #7B68EE
    * <span class="colorSwath" style="background: #7B68EE;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMSLATEBLUE")
  @js.native
  val MEDIUMSLATEBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00FA9A
    * <span class="colorSwath" style="background: #00FA9A;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMSPRINGGREEN")
  @js.native
  val MEDIUMSPRINGGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #48D1CC
    * <span class="colorSwath" style="background: #48D1CC;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMTURQUOISE")
  @js.native
  val MEDIUMTURQUOISE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #C71585
    * <span class="colorSwath" style="background: #C71585;"></span>
    */
  @JSImport("cesium", "Color.MEDIUMVIOLETRED")
  @js.native
  val MEDIUMVIOLETRED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #191970
    * <span class="colorSwath" style="background: #191970;"></span>
    */
  @JSImport("cesium", "Color.MIDNIGHTBLUE")
  @js.native
  val MIDNIGHTBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F5FFFA
    * <span class="colorSwath" style="background: #F5FFFA;"></span>
    */
  @JSImport("cesium", "Color.MINTCREAM")
  @js.native
  val MINTCREAM: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFE4E1
    * <span class="colorSwath" style="background: #FFE4E1;"></span>
    */
  @JSImport("cesium", "Color.MISTYROSE")
  @js.native
  val MISTYROSE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFE4B5
    * <span class="colorSwath" style="background: #FFE4B5;"></span>
    */
  @JSImport("cesium", "Color.MOCCASIN")
  @js.native
  val MOCCASIN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFDEAD
    * <span class="colorSwath" style="background: #FFDEAD;"></span>
    */
  @JSImport("cesium", "Color.NAVAJOWHITE")
  @js.native
  val NAVAJOWHITE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #000080
    * <span class="colorSwath" style="background: #000080;"></span>
    */
  @JSImport("cesium", "Color.NAVY")
  @js.native
  val NAVY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FDF5E6
    * <span class="colorSwath" style="background: #FDF5E6;"></span>
    */
  @JSImport("cesium", "Color.OLDLACE")
  @js.native
  val OLDLACE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #808000
    * <span class="colorSwath" style="background: #808000;"></span>
    */
  @JSImport("cesium", "Color.OLIVE")
  @js.native
  val OLIVE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #6B8E23
    * <span class="colorSwath" style="background: #6B8E23;"></span>
    */
  @JSImport("cesium", "Color.OLIVEDRAB")
  @js.native
  val OLIVEDRAB: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFA500
    * <span class="colorSwath" style="background: #FFA500;"></span>
    */
  @JSImport("cesium", "Color.ORANGE")
  @js.native
  val ORANGE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF4500
    * <span class="colorSwath" style="background: #FF4500;"></span>
    */
  @JSImport("cesium", "Color.ORANGERED")
  @js.native
  val ORANGERED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DA70D6
    * <span class="colorSwath" style="background: #DA70D6;"></span>
    */
  @JSImport("cesium", "Color.ORCHID")
  @js.native
  val ORCHID: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #EEE8AA
    * <span class="colorSwath" style="background: #EEE8AA;"></span>
    */
  @JSImport("cesium", "Color.PALEGOLDENROD")
  @js.native
  val PALEGOLDENROD: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #98FB98
    * <span class="colorSwath" style="background: #98FB98;"></span>
    */
  @JSImport("cesium", "Color.PALEGREEN")
  @js.native
  val PALEGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #AFEEEE
    * <span class="colorSwath" style="background: #AFEEEE;"></span>
    */
  @JSImport("cesium", "Color.PALETURQUOISE")
  @js.native
  val PALETURQUOISE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DB7093
    * <span class="colorSwath" style="background: #DB7093;"></span>
    */
  @JSImport("cesium", "Color.PALEVIOLETRED")
  @js.native
  val PALEVIOLETRED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFEFD5
    * <span class="colorSwath" style="background: #FFEFD5;"></span>
    */
  @JSImport("cesium", "Color.PAPAYAWHIP")
  @js.native
  val PAPAYAWHIP: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFDAB9
    * <span class="colorSwath" style="background: #FFDAB9;"></span>
    */
  @JSImport("cesium", "Color.PEACHPUFF")
  @js.native
  val PEACHPUFF: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #CD853F
    * <span class="colorSwath" style="background: #CD853F;"></span>
    */
  @JSImport("cesium", "Color.PERU")
  @js.native
  val PERU: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFC0CB
    * <span class="colorSwath" style="background: #FFC0CB;"></span>
    */
  @JSImport("cesium", "Color.PINK")
  @js.native
  val PINK: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #DDA0DD
    * <span class="colorSwath" style="background: #DDA0DD;"></span>
    */
  @JSImport("cesium", "Color.PLUM")
  @js.native
  val PLUM: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #B0E0E6
    * <span class="colorSwath" style="background: #B0E0E6;"></span>
    */
  @JSImport("cesium", "Color.POWDERBLUE")
  @js.native
  val POWDERBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #800080
    * <span class="colorSwath" style="background: #800080;"></span>
    */
  @JSImport("cesium", "Color.PURPLE")
  @js.native
  val PURPLE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF0000
    * <span class="colorSwath" style="background: #FF0000;"></span>
    */
  @JSImport("cesium", "Color.RED")
  @js.native
  val RED: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #BC8F8F
    * <span class="colorSwath" style="background: #BC8F8F;"></span>
    */
  @JSImport("cesium", "Color.ROSYBROWN")
  @js.native
  val ROSYBROWN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #4169E1
    * <span class="colorSwath" style="background: #4169E1;"></span>
    */
  @JSImport("cesium", "Color.ROYALBLUE")
  @js.native
  val ROYALBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #8B4513
    * <span class="colorSwath" style="background: #8B4513;"></span>
    */
  @JSImport("cesium", "Color.SADDLEBROWN")
  @js.native
  val SADDLEBROWN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FA8072
    * <span class="colorSwath" style="background: #FA8072;"></span>
    */
  @JSImport("cesium", "Color.SALMON")
  @js.native
  val SALMON: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F4A460
    * <span class="colorSwath" style="background: #F4A460;"></span>
    */
  @JSImport("cesium", "Color.SANDYBROWN")
  @js.native
  val SANDYBROWN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #2E8B57
    * <span class="colorSwath" style="background: #2E8B57;"></span>
    */
  @JSImport("cesium", "Color.SEAGREEN")
  @js.native
  val SEAGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFF5EE
    * <span class="colorSwath" style="background: #FFF5EE;"></span>
    */
  @JSImport("cesium", "Color.SEASHELL")
  @js.native
  val SEASHELL: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #A0522D
    * <span class="colorSwath" style="background: #A0522D;"></span>
    */
  @JSImport("cesium", "Color.SIENNA")
  @js.native
  val SIENNA: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #C0C0C0
    * <span class="colorSwath" style="background: #C0C0C0;"></span>
    */
  @JSImport("cesium", "Color.SILVER")
  @js.native
  val SILVER: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #87CEEB
    * <span class="colorSwath" style="background: #87CEEB;"></span>
    */
  @JSImport("cesium", "Color.SKYBLUE")
  @js.native
  val SKYBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #6A5ACD
    * <span class="colorSwath" style="background: #6A5ACD;"></span>
    */
  @JSImport("cesium", "Color.SLATEBLUE")
  @js.native
  val SLATEBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #708090
    * <span class="colorSwath" style="background: #708090;"></span>
    */
  @JSImport("cesium", "Color.SLATEGRAY")
  @js.native
  val SLATEGRAY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #708090
    * <span class="colorSwath" style="background: #708090;"></span>
    */
  @JSImport("cesium", "Color.SLATEGREY")
  @js.native
  val SLATEGREY: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFAFA
    * <span class="colorSwath" style="background: #FFFAFA;"></span>
    */
  @JSImport("cesium", "Color.SNOW")
  @js.native
  val SNOW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #00FF7F
    * <span class="colorSwath" style="background: #00FF7F;"></span>
    */
  @JSImport("cesium", "Color.SPRINGGREEN")
  @js.native
  val SPRINGGREEN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #4682B4
    * <span class="colorSwath" style="background: #4682B4;"></span>
    */
  @JSImport("cesium", "Color.STEELBLUE")
  @js.native
  val STEELBLUE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #D2B48C
    * <span class="colorSwath" style="background: #D2B48C;"></span>
    */
  @JSImport("cesium", "Color.TAN")
  @js.native
  val TAN: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #008080
    * <span class="colorSwath" style="background: #008080;"></span>
    */
  @JSImport("cesium", "Color.TEAL")
  @js.native
  val TEAL: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #D8BFD8
    * <span class="colorSwath" style="background: #D8BFD8;"></span>
    */
  @JSImport("cesium", "Color.THISTLE")
  @js.native
  val THISTLE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FF6347
    * <span class="colorSwath" style="background: #FF6347;"></span>
    */
  @JSImport("cesium", "Color.TOMATO")
  @js.native
  val TOMATO: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS transparent.
    * <span class="colorSwath" style="background: transparent;"></span>
    */
  @JSImport("cesium", "Color.TRANSPARENT")
  @js.native
  val TRANSPARENT: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #40E0D0
    * <span class="colorSwath" style="background: #40E0D0;"></span>
    */
  @JSImport("cesium", "Color.TURQUOISE")
  @js.native
  val TURQUOISE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #EE82EE
    * <span class="colorSwath" style="background: #EE82EE;"></span>
    */
  @JSImport("cesium", "Color.VIOLET")
  @js.native
  val VIOLET: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F5DEB3
    * <span class="colorSwath" style="background: #F5DEB3;"></span>
    */
  @JSImport("cesium", "Color.WHEAT")
  @js.native
  val WHEAT: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFFFF
    * <span class="colorSwath" style="background: #FFFFFF;"></span>
    */
  @JSImport("cesium", "Color.WHITE")
  @js.native
  val WHITE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #F5F5F5
    * <span class="colorSwath" style="background: #F5F5F5;"></span>
    */
  @JSImport("cesium", "Color.WHITESMOKE")
  @js.native
  val WHITESMOKE: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #FFFF00
    * <span class="colorSwath" style="background: #FFFF00;"></span>
    */
  @JSImport("cesium", "Color.YELLOW")
  @js.native
  val YELLOW: Color = js.native
  
  /**
    * An immutable Color instance initialized to CSS color #9ACD32
    * <span class="colorSwath" style="background: #9ACD32;"></span>
    */
  @JSImport("cesium", "Color.YELLOWGREEN")
  @js.native
  val YELLOWGREEN: Color = js.native
  
  /**
    * Computes the componentwise sum of two Colors.
    * @param left - The first Color.
    * @param right - The second Color.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def add(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Converts a 'byte' color component in the range of 0 to 255 into
    * a 'float' color component in the range of 0 to 1.0.
    * @param number - The number to be converted.
    * @returns The converted number.
    */
  inline def byteToFloat(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteToFloat")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Duplicates a Color.
    * @param color - The Color to duplicate.
    * @param [result] - The object to store the result in, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined. (Returns undefined if color is undefined)
    */
  inline def clone(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def clone(color: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Computes the componentwise quotient of two Colors.
    * @param left - The first Color.
    * @param right - The second Color.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divide(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Divides the provided Color componentwise by the provided scalar.
    * @param color - The Color to be divided.
    * @param scalar - The scalar to divide with.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideByScalar(color: Color, scalar: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Returns true if the first Color equals the second color.
    * @param left - The first Color to compare for equality.
    * @param right - The second Color to compare for equality.
    * @returns <code>true</code> if the Colors are equal; otherwise, <code>false</code>.
    */
  inline def equals(left: Color, right: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts a 'float' color component in the range of 0 to 1.0 into
    * a 'byte' color component in the range of 0 to 255.
    * @param number - The number to be converted.
    * @returns The converted number.
    */
  inline def floatToByte(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floatToByte")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Creates a new Color that has the same red, green, and blue components
    * of the specified color, but with the specified alpha value.
    * @example
    * const translucentRed = Cesium.Color.fromAlpha(Cesium.Color.RED, 0.9);
    * @param color - The base color
    * @param alpha - The new alpha component.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  inline def fromAlpha(color: Color, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlpha")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromAlpha(color: Color, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlpha")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a new Color specified using red, green, blue, and alpha values
    * that are in the range of 0 to 255, converting them internally to a range of 0.0 to 1.0.
    * @param [red = 255] - The red component.
    * @param [green = 255] - The green component.
    * @param [blue = 255] - The blue component.
    * @param [alpha = 255] - The alpha component.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  inline def fromBytes(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")().asInstanceOf[Color]
  inline def fromBytes(red: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a Color instance from a {@link Cartesian4}. <code>x</code>, <code>y</code>, <code>z</code>,
    * and <code>w</code> map to <code>red</code>, <code>green</code>, <code>blue</code>, and <code>alpha</code>, respectively.
    * @param cartesian - The source cartesian.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  inline def fromCartesian4(cartesian: Cartesian4): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromCartesian4(cartesian: Cartesian4, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a Color instance from a CSS color value.
    * @example
    * const cesiumBlue = Cesium.Color.fromCssColorString('#67ADDF');
    * const green = Cesium.Color.fromCssColorString('green');
    * @param color - The CSS color value in #rgb, #rgba, #rrggbb, #rrggbbaa, rgb(), rgba(), hsl(), or hsla() format.
    * @param [result] - The object to store the result in, if undefined a new instance will be created.
    * @returns The color object, or undefined if the string was not a valid CSS color.
    */
  inline def fromCssColorString(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCssColorString")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromCssColorString(color: String, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCssColorString")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a Color instance from hue, saturation, and lightness.
    * @param [hue = 0] - The hue angle 0...1
    * @param [saturation = 0] - The saturation value 0...1
    * @param [lightness = 0] - The lightness value 0...1
    * @param [alpha = 1.0] - The alpha component 0...1
    * @param [result] - The object to store the result in, if undefined a new instance will be created.
    * @returns The color object.
    */
  inline def fromHsl(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")().asInstanceOf[Color]
  inline def fromHsl(hue: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a random color using the provided options. For reproducible random colors, you should
    * call {@link Math#setRandomNumberSeed} once at the beginning of your application.
    * @example
    * //Create a completely random color
    * const color = Cesium.Color.fromRandom();
    *
    * //Create a random shade of yellow.
    * const color1 = Cesium.Color.fromRandom({
    *     red : 1.0,
    *     green : 1.0,
    *     alpha : 1.0
    * });
    *
    * //Create a random bright color.
    * const color2 = Cesium.Color.fromRandom({
    *     minimumRed : 0.75,
    *     minimumGreen : 0.75,
    *     minimumBlue : 0.75,
    *     alpha : 1.0
    * });
    * @param [options] - Object with the following properties:
    * @param [options.red] - If specified, the red component to use instead of a randomized value.
    * @param [options.minimumRed = 0.0] - The maximum red value to generate if none was specified.
    * @param [options.maximumRed = 1.0] - The minimum red value to generate if none was specified.
    * @param [options.green] - If specified, the green component to use instead of a randomized value.
    * @param [options.minimumGreen = 0.0] - The maximum green value to generate if none was specified.
    * @param [options.maximumGreen = 1.0] - The minimum green value to generate if none was specified.
    * @param [options.blue] - If specified, the blue component to use instead of a randomized value.
    * @param [options.minimumBlue = 0.0] - The maximum blue value to generate if none was specified.
    * @param [options.maximumBlue = 1.0] - The minimum blue value to generate if none was specified.
    * @param [options.alpha] - If specified, the alpha component to use instead of a randomized value.
    * @param [options.minimumAlpha = 0.0] - The maximum alpha value to generate if none was specified.
    * @param [options.maximumAlpha = 1.0] - The minimum alpha value to generate if none was specified.
    * @param [result] - The object to store the result in, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined.
    */
  inline def fromRandom(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")().asInstanceOf[Color]
  inline def fromRandom(options: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromRandom(options: Alpha): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromRandom(options: Alpha, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Creates a new Color from a single numeric unsigned 32-bit RGBA value, using the endianness
    * of the system.
    * @example
    * const color = Cesium.Color.fromRgba(0x67ADDFFF);
    * @param rgba - A single numeric unsigned 32-bit RGBA value.
    * @param [result] - The object to store the result in, if undefined a new instance will be created.
    * @returns The color object.
    */
  inline def fromRgba(rgba: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgba")(rgba.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromRgba(rgba: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRgba")(rgba.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Computes the linear interpolation or extrapolation at t between the provided colors.
    * @param start - The color corresponding to t at 0.0.
    * @param end - The color corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def lerp(start: Color, end: Color, t: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Computes the componentwise modulus of two Colors.
    * @param left - The first Color.
    * @param right - The second Color.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def mod(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Computes the componentwise product of two Colors.
    * @param left - The first Color.
    * @param right - The second Color.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiply(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Multiplies the provided Color componentwise by the provided scalar.
    * @param color - The Color to be scaled.
    * @param scalar - The scalar to multiply with.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyByScalar(color: Color, scalar: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Color, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Color, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "Color.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Computes the componentwise difference of two Colors.
    * @param left - The first Color.
    * @param right - The second Color.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def subtract(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
}
