package typingsJapgolly.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an RGBA color value for use in rendering operations.
  */
@JSGlobal("Color")
@js.native
open class Color protected ()
  extends StObject
     with typingsJapgolly.sphereEngineBrowser.Color {
  /**
    * Construct a new `Color` object from the given RGBA values. All values must be in the range
    * [0.0,1.0].
    * @param red    The amount of red in the color.
    * @param green  The amount of green in the color.
    * @param blue   The amount of blue in the color.
    * @param alpha  Alpha (opacity).  Defaults to `1.0`.
    */
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  
  /**
    * The value of the color's alpha component, representing its opacity. Use values less than 1.0
    * for translucency.
    */
  /* CompleteClass */
  var a: Double = js.native
  
  /** The value of the color's blue component. */
  /* CompleteClass */
  var b: Double = js.native
  
  /**
    * Gets a new `Color` with the same RGB as this one but with its alpha multiplied by the given
    * factor. Useful for implementing transitions.
    */
  /* CompleteClass */
  override def fadeTo(alphaFactor: Double): typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /** The value of the color's green component. */
  /* CompleteClass */
  var g: Double = js.native
  
  /** The X11 name of the color for known colors, or else its HTML representation, e.g. `#FF8080FF`. */
  /* CompleteClass */
  var name: String = js.native
  
  /** The value of the color's red component. */
  /* CompleteClass */
  var r: Double = js.native
}
object Color {
  
  @JSGlobal("Color")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Color.AliceBlue")
  @js.native
  val AliceBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.AntiqueWhite")
  @js.native
  val AntiqueWhite: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Aqua")
  @js.native
  val Aqua: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Aquamarine")
  @js.native
  val Aquamarine: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Azure")
  @js.native
  val Azure: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Beige")
  @js.native
  val Beige: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Bisque")
  @js.native
  val Bisque: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Black")
  @js.native
  val Black: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BlanchedAlmond")
  @js.native
  val BlanchedAlmond: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Blue")
  @js.native
  val Blue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BlueViolet")
  @js.native
  val BlueViolet: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Brown")
  @js.native
  val Brown: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BurlyWood")
  @js.native
  val BurlyWood: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.CadetBlue")
  @js.native
  val CadetBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /** Chartreuse. The best color with the best name. */
  /* static member */
  @JSGlobal("Color.Chartreuse")
  @js.native
  val Chartreuse: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Chocolate")
  @js.native
  val Chocolate: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Coral")
  @js.native
  val Coral: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.CornflowerBlue")
  @js.native
  val CornflowerBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Cornsilk")
  @js.native
  val Cornsilk: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Crimson")
  @js.native
  val Crimson: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Cyan")
  @js.native
  val Cyan: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkBlue")
  @js.native
  val DarkBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkCyan")
  @js.native
  val DarkCyan: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGoldenrod")
  @js.native
  val DarkGoldenrod: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGray")
  @js.native
  val DarkGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGreen")
  @js.native
  val DarkGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkKhaki")
  @js.native
  val DarkKhaki: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkMagenta")
  @js.native
  val DarkMagenta: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOliveGreen")
  @js.native
  val DarkOliveGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOrange")
  @js.native
  val DarkOrange: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOrchid")
  @js.native
  val DarkOrchid: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkRed")
  @js.native
  val DarkRed: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSalmon")
  @js.native
  val DarkSalmon: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSeaGreen")
  @js.native
  val DarkSeaGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSlateBlue")
  @js.native
  val DarkSlateBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSlateGray")
  @js.native
  val DarkSlateGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkTurquoise")
  @js.native
  val DarkTurquoise: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkViolet")
  @js.native
  val DarkViolet: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DeepPink")
  @js.native
  val DeepPink: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DeepSkyBlue")
  @js.native
  val DeepSkyBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DimGray")
  @js.native
  val DimGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DodgerBlue")
  @js.native
  val DodgerBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.FireBrick")
  @js.native
  val FireBrick: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.FloralWhite")
  @js.native
  val FloralWhite: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.ForestGreen")
  @js.native
  val ForestGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Fuchsia")
  @js.native
  val Fuchsia: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gainsboro")
  @js.native
  val Gainsboro: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.GhostWhite")
  @js.native
  val GhostWhite: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gold")
  @js.native
  val Gold: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Goldenrod")
  @js.native
  val Goldenrod: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gray")
  @js.native
  val Gray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Green")
  @js.native
  val Green: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.GreenYellow")
  @js.native
  val GreenYellow: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Honeydew")
  @js.native
  val Honeydew: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.HotPink")
  @js.native
  val HotPink: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.IndianRed")
  @js.native
  val IndianRed: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Indigo")
  @js.native
  val Indigo: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Ivory")
  @js.native
  val Ivory: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Khaki")
  @js.native
  val Khaki: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Lavender")
  @js.native
  val Lavender: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LavenderBlush")
  @js.native
  val LavenderBlush: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LawnGreen")
  @js.native
  val LawnGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LemonChiffon")
  @js.native
  val LemonChiffon: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightBlue")
  @js.native
  val LightBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightCoral")
  @js.native
  val LightCoral: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightCyan")
  @js.native
  val LightCyan: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGoldenrodYellow")
  @js.native
  val LightGoldenrodYellow: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGray")
  @js.native
  val LightGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGreen")
  @js.native
  val LightGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightPink")
  @js.native
  val LightPink: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSalmon")
  @js.native
  val LightSalmon: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSeaGreen")
  @js.native
  val LightSeaGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSkyBlue")
  @js.native
  val LightSkyBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSlateGray")
  @js.native
  val LightSlateGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSteelBlue")
  @js.native
  val LightSteelBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightYellow")
  @js.native
  val LightYellow: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Lime")
  @js.native
  val Lime: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LimeGreen")
  @js.native
  val LimeGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Linen")
  @js.native
  val Linen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Magenta")
  @js.native
  val Magenta: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Maroon")
  @js.native
  val Maroon: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumAquamarine")
  @js.native
  val MediumAquamarine: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumBlue")
  @js.native
  val MediumBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumOrchid")
  @js.native
  val MediumOrchid: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumPurple")
  @js.native
  val MediumPurple: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSeaGreen")
  @js.native
  val MediumSeaGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSlateBlue")
  @js.native
  val MediumSlateBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSpringGreen")
  @js.native
  val MediumSpringGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumTurquoise")
  @js.native
  val MediumTurquoise: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumVioletRed")
  @js.native
  val MediumVioletRed: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MidnightBlue")
  @js.native
  val MidnightBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MintCream")
  @js.native
  val MintCream: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MistyRose")
  @js.native
  val MistyRose: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Moccasin")
  @js.native
  val Moccasin: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.NavajoWhite")
  @js.native
  val NavajoWhite: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Navy")
  @js.native
  val Navy: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OldLace")
  @js.native
  val OldLace: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Olive")
  @js.native
  val Olive: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OliveDrab")
  @js.native
  val OliveDrab: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Orange")
  @js.native
  val Orange: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OrangeRed")
  @js.native
  val OrangeRed: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Orchid")
  @js.native
  val Orchid: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleGoldenrod")
  @js.native
  val PaleGoldenrod: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleGreen")
  @js.native
  val PaleGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleTurquoise")
  @js.native
  val PaleTurquoise: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleVioletRed")
  @js.native
  val PaleVioletRed: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PapayaWhip")
  @js.native
  val PapayaWhip: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PeachPuff")
  @js.native
  val PeachPuff: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Peru")
  @js.native
  val Peru: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /** Pink. The color of eaty pigs. **\*MUNCH\*** */
  /* static member */
  @JSGlobal("Color.Pink")
  @js.native
  val Pink: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Plum")
  @js.native
  val Plum: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PowderBlue")
  @js.native
  val PowderBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Purple")
  @js.native
  val Purple: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PurwaBlue")
  @js.native
  val PurwaBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RebeccaPurple")
  @js.native
  val RebeccaPurple: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Red")
  @js.native
  val Red: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RosyBrown")
  @js.native
  val RosyBrown: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RoyalBlue")
  @js.native
  val RoyalBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SaddleBrown")
  @js.native
  val SaddleBrown: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Salmon")
  @js.native
  val Salmon: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SandyBrown")
  @js.native
  val SandyBrown: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SeaGreen")
  @js.native
  val SeaGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Seashell")
  @js.native
  val Seashell: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Sienna")
  @js.native
  val Sienna: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Silver")
  @js.native
  val Silver: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SkyBlue")
  @js.native
  val SkyBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SlateBlue")
  @js.native
  val SlateBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SlateGray")
  @js.native
  val SlateGray: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Snow")
  @js.native
  val Snow: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SpringGreen")
  @js.native
  val SpringGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /** Stanky Bean. The first color created and named by an AI. */
  /* static member */
  @JSGlobal("Color.StankyBean")
  @js.native
  val StankyBean: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SteelBlue")
  @js.native
  val SteelBlue: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Tan")
  @js.native
  val Tan: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Teal")
  @js.native
  val Teal: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Thistle")
  @js.native
  val Thistle: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Tomato")
  @js.native
  val Tomato: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Transparent")
  @js.native
  val Transparent: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Turquoise")
  @js.native
  val Turquoise: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Violet")
  @js.native
  val Violet: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Wheat")
  @js.native
  val Wheat: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.White")
  @js.native
  val White: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.WhiteSmoke")
  @js.native
  val WhiteSmoke: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Yellow")
  @js.native
  val Yellow: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.YellowGreen")
  @js.native
  val YellowGreen: typingsJapgolly.sphereEngineBrowser.Color = js.native
  
  /** Check if two `Color` objects are equivalent without regard to their alpha values. */
  /* static member */
  inline def is(
    color1: typingsJapgolly.sphereEngineBrowser.Color,
    color2: typingsJapgolly.sphereEngineBrowser.Color
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** Get a new `Color` which is a 50/50 blend of the two given ones. */
  /* static member */
  inline def mix(
    color1: typingsJapgolly.sphereEngineBrowser.Color,
    color2: typingsJapgolly.sphereEngineBrowser.Color
  ): typingsJapgolly.sphereEngineBrowser.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sphereEngineBrowser.Color]
  /**
    * Get a new `Color` which is a weighted average of the two given ones, using the given
    * weighting factors.
    */
  /* static member */
  inline def mix(
    color1: typingsJapgolly.sphereEngineBrowser.Color,
    color2: typingsJapgolly.sphereEngineBrowser.Color,
    w1: Double,
    w2: Double
  ): typingsJapgolly.sphereEngineBrowser.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], w2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sphereEngineBrowser.Color]
  
  /**
    * Gets a `Color` corresponding to the specified color name which can be either HTML notation
    * (e.g. `#7FFF00`) or an X11 color name such as `chartreuse` (case insensitive).
    */
  /* static member */
  inline def of(name: String): typingsJapgolly.sphereEngineBrowser.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sphereEngineBrowser.Color]
}
