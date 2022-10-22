package typingsJapgolly.ansiFragments

import typingsJapgolly.ansiFragments.buildFragmentsIfragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsColorMod {
  
  @JSImport("ansi-fragments/build/fragments/Color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Color", "Color")
  @js.native
  open class Color_ protected ()
    extends StObject
       with IFragment {
    def this(ansiColor: AnsiColor, children: js.Array[String | IFragment]) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val children: Any = js.native
    
    /* private */ val color: Any = js.native
  }
  
  inline def color(ansiColor: AnsiColor, children: (String | IFragment)*): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(scala.List(ansiColor.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Color_]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.black
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.red
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.green
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.yellow
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.blue
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.magenta
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.cyan
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.white
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlack
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightRed
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightGreen
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightYellow
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlue
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightMagenta
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightCyan
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightWhite
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.gray
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlack
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgRed
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgGreen
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgYellow
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlue
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgMagenta
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgCyan
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgWhite
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlack
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightRed
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightGreen
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightYellow
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlue
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightMagenta
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightCyan
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightWhite
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiColor extends StObject
  object AnsiColor {
    
    inline def bgBlack: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlack = "bgBlack".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlack]
    
    inline def bgBlue: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlue = "bgBlue".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBlue]
    
    inline def bgBrightBlack: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlack = "bgBrightBlack".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlack]
    
    inline def bgBrightBlue: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlue = "bgBrightBlue".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightBlue]
    
    inline def bgBrightCyan: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightCyan = "bgBrightCyan".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightCyan]
    
    inline def bgBrightGreen: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightGreen = "bgBrightGreen".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightGreen]
    
    inline def bgBrightMagenta: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightMagenta = "bgBrightMagenta".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightMagenta]
    
    inline def bgBrightRed: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightRed = "bgBrightRed".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightRed]
    
    inline def bgBrightWhite: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightWhite = "bgBrightWhite".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightWhite]
    
    inline def bgBrightYellow: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightYellow = "bgBrightYellow".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgBrightYellow]
    
    inline def bgCyan: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgCyan = "bgCyan".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgCyan]
    
    inline def bgGreen: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgGreen = "bgGreen".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgGreen]
    
    inline def bgMagenta: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgMagenta = "bgMagenta".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgMagenta]
    
    inline def bgRed: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgRed = "bgRed".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgRed]
    
    inline def bgWhite: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgWhite = "bgWhite".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgWhite]
    
    inline def bgYellow: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgYellow = "bgYellow".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bgYellow]
    
    inline def black: typingsJapgolly.ansiFragments.ansiFragmentsStrings.black = "black".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.black]
    
    inline def blue: typingsJapgolly.ansiFragments.ansiFragmentsStrings.blue = "blue".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.blue]
    
    inline def brightBlack: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlack = "brightBlack".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlack]
    
    inline def brightBlue: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlue = "brightBlue".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightBlue]
    
    inline def brightCyan: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightCyan = "brightCyan".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightCyan]
    
    inline def brightGreen: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightGreen = "brightGreen".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightGreen]
    
    inline def brightMagenta: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightMagenta = "brightMagenta".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightMagenta]
    
    inline def brightRed: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightRed = "brightRed".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightRed]
    
    inline def brightWhite: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightWhite = "brightWhite".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightWhite]
    
    inline def brightYellow: typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightYellow = "brightYellow".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.brightYellow]
    
    inline def cyan: typingsJapgolly.ansiFragments.ansiFragmentsStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.cyan]
    
    inline def gray: typingsJapgolly.ansiFragments.ansiFragmentsStrings.gray = "gray".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.gray]
    
    inline def green: typingsJapgolly.ansiFragments.ansiFragmentsStrings.green = "green".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.green]
    
    inline def magenta: typingsJapgolly.ansiFragments.ansiFragmentsStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.magenta]
    
    inline def none: typingsJapgolly.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.none]
    
    inline def red: typingsJapgolly.ansiFragments.ansiFragmentsStrings.red = "red".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.red]
    
    inline def white: typingsJapgolly.ansiFragments.ansiFragmentsStrings.white = "white".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.white]
    
    inline def yellow: typingsJapgolly.ansiFragments.ansiFragmentsStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.yellow]
  }
}
