package typingsJapgolly.vegaTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecColorMod {
  
  type Color = ColorName | HexColor | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.black
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.silver
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.gray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.white
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.maroon
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.red
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.purple
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.fuchsia
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.green
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lime
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.olive
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.yellow
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.navy
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.blue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.teal
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.aqua
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.orange
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.aliceblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.antiquewhite
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.aquamarine
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.azure
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.beige
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.bisque
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.blanchedalmond
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.blueviolet
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.brown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.burlywood
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.cadetblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.chartreuse
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.chocolate
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.coral
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.cornflowerblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.cornsilk
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.crimson
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.cyan
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkcyan
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgoldenrod
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkkhaki
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkmagenta
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkolivegreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorange
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorchid
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkred
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darksalmon
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkseagreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslateblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkturquoise
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.darkviolet
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.deeppink
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.deepskyblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dodgerblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.firebrick
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.floralwhite
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.forestgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.gainsboro
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.ghostwhite
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.gold
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.goldenrod
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.greenyellow
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.grey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.honeydew
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.hotpink
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.indianred
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.indigo
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.ivory
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.khaki
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lavender
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lavenderblush
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lawngreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lemonchiffon
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcoral
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcyan
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightpink
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsalmon
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightseagreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightskyblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsteelblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.lightyellow
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.limegreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.linen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.magenta
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumaquamarine
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumorchid
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumpurple
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumseagreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumslateblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumspringgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumturquoise
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumvioletred
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.midnightblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mintcream
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mistyrose
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.moccasin
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.navajowhite
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.oldlace
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.olivedrab
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.orangered
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.orchid
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.palegoldenrod
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.palegreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.paleturquoise
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.palevioletred
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.papayawhip
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.peachpuff
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.peru
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.pink
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.plum
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.powderblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.rosybrown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.royalblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.saddlebrown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.salmon
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.sandybrown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.seagreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.seashell
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.sienna
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.skyblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.slateblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.slategray
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.slategrey
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.snow
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.springgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.steelblue
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.tan
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.thistle
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.tomato
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.turquoise
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.violet
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.wheat
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.whitesmoke
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.yellowgreen
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.rebeccapurple
  */
  trait ColorName extends StObject
  object ColorName {
    
    inline def aliceblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.aliceblue = "aliceblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.aliceblue]
    
    inline def antiquewhite: typingsJapgolly.vegaTypings.vegaTypingsStrings.antiquewhite = "antiquewhite".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.antiquewhite]
    
    inline def aqua: typingsJapgolly.vegaTypings.vegaTypingsStrings.aqua = "aqua".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.aqua]
    
    inline def aquamarine: typingsJapgolly.vegaTypings.vegaTypingsStrings.aquamarine = "aquamarine".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.aquamarine]
    
    inline def azure: typingsJapgolly.vegaTypings.vegaTypingsStrings.azure = "azure".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.azure]
    
    inline def beige: typingsJapgolly.vegaTypings.vegaTypingsStrings.beige = "beige".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.beige]
    
    inline def bisque: typingsJapgolly.vegaTypings.vegaTypingsStrings.bisque = "bisque".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.bisque]
    
    inline def black: typingsJapgolly.vegaTypings.vegaTypingsStrings.black = "black".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.black]
    
    inline def blanchedalmond: typingsJapgolly.vegaTypings.vegaTypingsStrings.blanchedalmond = "blanchedalmond".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.blanchedalmond]
    
    inline def blue: typingsJapgolly.vegaTypings.vegaTypingsStrings.blue = "blue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.blue]
    
    inline def blueviolet: typingsJapgolly.vegaTypings.vegaTypingsStrings.blueviolet = "blueviolet".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.blueviolet]
    
    inline def brown: typingsJapgolly.vegaTypings.vegaTypingsStrings.brown = "brown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.brown]
    
    inline def burlywood: typingsJapgolly.vegaTypings.vegaTypingsStrings.burlywood = "burlywood".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.burlywood]
    
    inline def cadetblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.cadetblue = "cadetblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.cadetblue]
    
    inline def chartreuse: typingsJapgolly.vegaTypings.vegaTypingsStrings.chartreuse = "chartreuse".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.chartreuse]
    
    inline def chocolate: typingsJapgolly.vegaTypings.vegaTypingsStrings.chocolate = "chocolate".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.chocolate]
    
    inline def coral: typingsJapgolly.vegaTypings.vegaTypingsStrings.coral = "coral".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.coral]
    
    inline def cornflowerblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.cornflowerblue = "cornflowerblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.cornflowerblue]
    
    inline def cornsilk: typingsJapgolly.vegaTypings.vegaTypingsStrings.cornsilk = "cornsilk".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.cornsilk]
    
    inline def crimson: typingsJapgolly.vegaTypings.vegaTypingsStrings.crimson = "crimson".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.crimson]
    
    inline def cyan: typingsJapgolly.vegaTypings.vegaTypingsStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.cyan]
    
    inline def darkblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkblue = "darkblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkblue]
    
    inline def darkcyan: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkcyan = "darkcyan".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkcyan]
    
    inline def darkgoldenrod: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgoldenrod = "darkgoldenrod".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgoldenrod]
    
    inline def darkgray: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgray = "darkgray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgray]
    
    inline def darkgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgreen = "darkgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgreen]
    
    inline def darkgrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgrey = "darkgrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkgrey]
    
    inline def darkkhaki: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkkhaki = "darkkhaki".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkkhaki]
    
    inline def darkmagenta: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkmagenta = "darkmagenta".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkmagenta]
    
    inline def darkolivegreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkolivegreen = "darkolivegreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkolivegreen]
    
    inline def darkorange: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorange = "darkorange".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorange]
    
    inline def darkorchid: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorchid = "darkorchid".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkorchid]
    
    inline def darkred: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkred = "darkred".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkred]
    
    inline def darksalmon: typingsJapgolly.vegaTypings.vegaTypingsStrings.darksalmon = "darksalmon".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darksalmon]
    
    inline def darkseagreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkseagreen = "darkseagreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkseagreen]
    
    inline def darkslateblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslateblue = "darkslateblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslateblue]
    
    inline def darkslategray: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategray = "darkslategray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategray]
    
    inline def darkslategrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategrey = "darkslategrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkslategrey]
    
    inline def darkturquoise: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkturquoise = "darkturquoise".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkturquoise]
    
    inline def darkviolet: typingsJapgolly.vegaTypings.vegaTypingsStrings.darkviolet = "darkviolet".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.darkviolet]
    
    inline def deeppink: typingsJapgolly.vegaTypings.vegaTypingsStrings.deeppink = "deeppink".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.deeppink]
    
    inline def deepskyblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.deepskyblue = "deepskyblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.deepskyblue]
    
    inline def dimgray: typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgray = "dimgray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgray]
    
    inline def dimgrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgrey = "dimgrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dimgrey]
    
    inline def dodgerblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.dodgerblue = "dodgerblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dodgerblue]
    
    inline def firebrick: typingsJapgolly.vegaTypings.vegaTypingsStrings.firebrick = "firebrick".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.firebrick]
    
    inline def floralwhite: typingsJapgolly.vegaTypings.vegaTypingsStrings.floralwhite = "floralwhite".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.floralwhite]
    
    inline def forestgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.forestgreen = "forestgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.forestgreen]
    
    inline def fuchsia: typingsJapgolly.vegaTypings.vegaTypingsStrings.fuchsia = "fuchsia".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.fuchsia]
    
    inline def gainsboro: typingsJapgolly.vegaTypings.vegaTypingsStrings.gainsboro = "gainsboro".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.gainsboro]
    
    inline def ghostwhite: typingsJapgolly.vegaTypings.vegaTypingsStrings.ghostwhite = "ghostwhite".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.ghostwhite]
    
    inline def gold: typingsJapgolly.vegaTypings.vegaTypingsStrings.gold = "gold".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.gold]
    
    inline def goldenrod: typingsJapgolly.vegaTypings.vegaTypingsStrings.goldenrod = "goldenrod".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.goldenrod]
    
    inline def gray: typingsJapgolly.vegaTypings.vegaTypingsStrings.gray = "gray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.gray]
    
    inline def green: typingsJapgolly.vegaTypings.vegaTypingsStrings.green = "green".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.green]
    
    inline def greenyellow: typingsJapgolly.vegaTypings.vegaTypingsStrings.greenyellow = "greenyellow".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.greenyellow]
    
    inline def grey: typingsJapgolly.vegaTypings.vegaTypingsStrings.grey = "grey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.grey]
    
    inline def honeydew: typingsJapgolly.vegaTypings.vegaTypingsStrings.honeydew = "honeydew".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.honeydew]
    
    inline def hotpink: typingsJapgolly.vegaTypings.vegaTypingsStrings.hotpink = "hotpink".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.hotpink]
    
    inline def indianred: typingsJapgolly.vegaTypings.vegaTypingsStrings.indianred = "indianred".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.indianred]
    
    inline def indigo: typingsJapgolly.vegaTypings.vegaTypingsStrings.indigo = "indigo".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.indigo]
    
    inline def ivory: typingsJapgolly.vegaTypings.vegaTypingsStrings.ivory = "ivory".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.ivory]
    
    inline def khaki: typingsJapgolly.vegaTypings.vegaTypingsStrings.khaki = "khaki".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.khaki]
    
    inline def lavender: typingsJapgolly.vegaTypings.vegaTypingsStrings.lavender = "lavender".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lavender]
    
    inline def lavenderblush: typingsJapgolly.vegaTypings.vegaTypingsStrings.lavenderblush = "lavenderblush".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lavenderblush]
    
    inline def lawngreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.lawngreen = "lawngreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lawngreen]
    
    inline def lemonchiffon: typingsJapgolly.vegaTypings.vegaTypingsStrings.lemonchiffon = "lemonchiffon".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lemonchiffon]
    
    inline def lightblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightblue = "lightblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightblue]
    
    inline def lightcoral: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcoral = "lightcoral".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcoral]
    
    inline def lightcyan: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcyan = "lightcyan".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightcyan]
    
    inline def lightgoldenrodyellow: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow]
    
    inline def lightgray: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgray = "lightgray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgray]
    
    inline def lightgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgreen = "lightgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgreen]
    
    inline def lightgrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgrey = "lightgrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightgrey]
    
    inline def lightpink: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightpink = "lightpink".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightpink]
    
    inline def lightsalmon: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsalmon = "lightsalmon".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsalmon]
    
    inline def lightseagreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightseagreen = "lightseagreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightseagreen]
    
    inline def lightskyblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightskyblue = "lightskyblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightskyblue]
    
    inline def lightslategray: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategray = "lightslategray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategray]
    
    inline def lightslategrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategrey = "lightslategrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightslategrey]
    
    inline def lightsteelblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsteelblue = "lightsteelblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightsteelblue]
    
    inline def lightyellow: typingsJapgolly.vegaTypings.vegaTypingsStrings.lightyellow = "lightyellow".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lightyellow]
    
    inline def lime: typingsJapgolly.vegaTypings.vegaTypingsStrings.lime = "lime".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.lime]
    
    inline def limegreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.limegreen = "limegreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.limegreen]
    
    inline def linen: typingsJapgolly.vegaTypings.vegaTypingsStrings.linen = "linen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.linen]
    
    inline def magenta: typingsJapgolly.vegaTypings.vegaTypingsStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.magenta]
    
    inline def maroon: typingsJapgolly.vegaTypings.vegaTypingsStrings.maroon = "maroon".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.maroon]
    
    inline def mediumaquamarine: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumaquamarine = "mediumaquamarine".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumaquamarine]
    
    inline def mediumblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumblue = "mediumblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumblue]
    
    inline def mediumorchid: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumorchid = "mediumorchid".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumorchid]
    
    inline def mediumpurple: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumpurple = "mediumpurple".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumpurple]
    
    inline def mediumseagreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumseagreen = "mediumseagreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumseagreen]
    
    inline def mediumslateblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumslateblue = "mediumslateblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumslateblue]
    
    inline def mediumspringgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumspringgreen = "mediumspringgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumspringgreen]
    
    inline def mediumturquoise: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumturquoise = "mediumturquoise".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumturquoise]
    
    inline def mediumvioletred: typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumvioletred = "mediumvioletred".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mediumvioletred]
    
    inline def midnightblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.midnightblue = "midnightblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.midnightblue]
    
    inline def mintcream: typingsJapgolly.vegaTypings.vegaTypingsStrings.mintcream = "mintcream".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mintcream]
    
    inline def mistyrose: typingsJapgolly.vegaTypings.vegaTypingsStrings.mistyrose = "mistyrose".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mistyrose]
    
    inline def moccasin: typingsJapgolly.vegaTypings.vegaTypingsStrings.moccasin = "moccasin".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.moccasin]
    
    inline def navajowhite: typingsJapgolly.vegaTypings.vegaTypingsStrings.navajowhite = "navajowhite".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.navajowhite]
    
    inline def navy: typingsJapgolly.vegaTypings.vegaTypingsStrings.navy = "navy".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.navy]
    
    inline def oldlace: typingsJapgolly.vegaTypings.vegaTypingsStrings.oldlace = "oldlace".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.oldlace]
    
    inline def olive: typingsJapgolly.vegaTypings.vegaTypingsStrings.olive = "olive".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.olive]
    
    inline def olivedrab: typingsJapgolly.vegaTypings.vegaTypingsStrings.olivedrab = "olivedrab".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.olivedrab]
    
    inline def orange: typingsJapgolly.vegaTypings.vegaTypingsStrings.orange = "orange".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.orange]
    
    inline def orangered: typingsJapgolly.vegaTypings.vegaTypingsStrings.orangered = "orangered".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.orangered]
    
    inline def orchid: typingsJapgolly.vegaTypings.vegaTypingsStrings.orchid = "orchid".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.orchid]
    
    inline def palegoldenrod: typingsJapgolly.vegaTypings.vegaTypingsStrings.palegoldenrod = "palegoldenrod".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.palegoldenrod]
    
    inline def palegreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.palegreen = "palegreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.palegreen]
    
    inline def paleturquoise: typingsJapgolly.vegaTypings.vegaTypingsStrings.paleturquoise = "paleturquoise".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.paleturquoise]
    
    inline def palevioletred: typingsJapgolly.vegaTypings.vegaTypingsStrings.palevioletred = "palevioletred".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.palevioletred]
    
    inline def papayawhip: typingsJapgolly.vegaTypings.vegaTypingsStrings.papayawhip = "papayawhip".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.papayawhip]
    
    inline def peachpuff: typingsJapgolly.vegaTypings.vegaTypingsStrings.peachpuff = "peachpuff".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.peachpuff]
    
    inline def peru: typingsJapgolly.vegaTypings.vegaTypingsStrings.peru = "peru".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.peru]
    
    inline def pink: typingsJapgolly.vegaTypings.vegaTypingsStrings.pink = "pink".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.pink]
    
    inline def plum: typingsJapgolly.vegaTypings.vegaTypingsStrings.plum = "plum".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.plum]
    
    inline def powderblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.powderblue = "powderblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.powderblue]
    
    inline def purple: typingsJapgolly.vegaTypings.vegaTypingsStrings.purple = "purple".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.purple]
    
    inline def rebeccapurple: typingsJapgolly.vegaTypings.vegaTypingsStrings.rebeccapurple = "rebeccapurple".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.rebeccapurple]
    
    inline def red: typingsJapgolly.vegaTypings.vegaTypingsStrings.red = "red".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.red]
    
    inline def rosybrown: typingsJapgolly.vegaTypings.vegaTypingsStrings.rosybrown = "rosybrown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.rosybrown]
    
    inline def royalblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.royalblue = "royalblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.royalblue]
    
    inline def saddlebrown: typingsJapgolly.vegaTypings.vegaTypingsStrings.saddlebrown = "saddlebrown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.saddlebrown]
    
    inline def salmon: typingsJapgolly.vegaTypings.vegaTypingsStrings.salmon = "salmon".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.salmon]
    
    inline def sandybrown: typingsJapgolly.vegaTypings.vegaTypingsStrings.sandybrown = "sandybrown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.sandybrown]
    
    inline def seagreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.seagreen = "seagreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.seagreen]
    
    inline def seashell: typingsJapgolly.vegaTypings.vegaTypingsStrings.seashell = "seashell".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.seashell]
    
    inline def sienna: typingsJapgolly.vegaTypings.vegaTypingsStrings.sienna = "sienna".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.sienna]
    
    inline def silver: typingsJapgolly.vegaTypings.vegaTypingsStrings.silver = "silver".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.silver]
    
    inline def skyblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.skyblue = "skyblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.skyblue]
    
    inline def slateblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.slateblue = "slateblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.slateblue]
    
    inline def slategray: typingsJapgolly.vegaTypings.vegaTypingsStrings.slategray = "slategray".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.slategray]
    
    inline def slategrey: typingsJapgolly.vegaTypings.vegaTypingsStrings.slategrey = "slategrey".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.slategrey]
    
    inline def snow: typingsJapgolly.vegaTypings.vegaTypingsStrings.snow = "snow".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.snow]
    
    inline def springgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.springgreen = "springgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.springgreen]
    
    inline def steelblue: typingsJapgolly.vegaTypings.vegaTypingsStrings.steelblue = "steelblue".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.steelblue]
    
    inline def tan: typingsJapgolly.vegaTypings.vegaTypingsStrings.tan = "tan".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.tan]
    
    inline def teal: typingsJapgolly.vegaTypings.vegaTypingsStrings.teal = "teal".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.teal]
    
    inline def thistle: typingsJapgolly.vegaTypings.vegaTypingsStrings.thistle = "thistle".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.thistle]
    
    inline def tomato: typingsJapgolly.vegaTypings.vegaTypingsStrings.tomato = "tomato".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.tomato]
    
    inline def turquoise: typingsJapgolly.vegaTypings.vegaTypingsStrings.turquoise = "turquoise".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.turquoise]
    
    inline def violet: typingsJapgolly.vegaTypings.vegaTypingsStrings.violet = "violet".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.violet]
    
    inline def wheat: typingsJapgolly.vegaTypings.vegaTypingsStrings.wheat = "wheat".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.wheat]
    
    inline def white: typingsJapgolly.vegaTypings.vegaTypingsStrings.white = "white".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.white]
    
    inline def whitesmoke: typingsJapgolly.vegaTypings.vegaTypingsStrings.whitesmoke = "whitesmoke".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.whitesmoke]
    
    inline def yellow: typingsJapgolly.vegaTypings.vegaTypingsStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.yellow]
    
    inline def yellowgreen: typingsJapgolly.vegaTypings.vegaTypingsStrings.yellowgreen = "yellowgreen".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.yellowgreen]
  }
  
  type HexColor = String
}
