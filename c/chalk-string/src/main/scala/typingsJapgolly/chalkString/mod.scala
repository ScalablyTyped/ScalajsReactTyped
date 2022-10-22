package typingsJapgolly.chalkString

import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chalk-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function2[/* styles */ Styles, /* input */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function2[/* styles */ Styles, /* input */ String, String]]
  inline def default(options: Options): js.Function2[/* styles */ Styles, /* input */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* styles */ Styles, /* input */ String, String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chalkString.chalkStringStrings.black
    - typingsJapgolly.chalkString.chalkStringStrings.red
    - typingsJapgolly.chalkString.chalkStringStrings.green
    - typingsJapgolly.chalkString.chalkStringStrings.yellow
    - typingsJapgolly.chalkString.chalkStringStrings.blue
    - typingsJapgolly.chalkString.chalkStringStrings.magenta
    - typingsJapgolly.chalkString.chalkStringStrings.cyan
    - typingsJapgolly.chalkString.chalkStringStrings.white
    - typingsJapgolly.chalkString.chalkStringStrings.gray
  */
  trait BasicColors
    extends StObject
       with _Style
  object BasicColors {
    
    inline def black: typingsJapgolly.chalkString.chalkStringStrings.black = "black".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.black]
    
    inline def blue: typingsJapgolly.chalkString.chalkStringStrings.blue = "blue".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.blue]
    
    inline def cyan: typingsJapgolly.chalkString.chalkStringStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.cyan]
    
    inline def gray: typingsJapgolly.chalkString.chalkStringStrings.gray = "gray".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.gray]
    
    inline def green: typingsJapgolly.chalkString.chalkStringStrings.green = "green".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.green]
    
    inline def magenta: typingsJapgolly.chalkString.chalkStringStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.magenta]
    
    inline def red: typingsJapgolly.chalkString.chalkStringStrings.red = "red".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.red]
    
    inline def white: typingsJapgolly.chalkString.chalkStringStrings.white = "white".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.white]
    
    inline def yellow: typingsJapgolly.chalkString.chalkStringStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.yellow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chalkString.chalkStringStrings.bold
    - typingsJapgolly.chalkString.chalkStringStrings.underline
    - typingsJapgolly.chalkString.chalkStringStrings.inverse
    - typingsJapgolly.chalkString.chalkStringStrings.reset
    - typingsJapgolly.chalkString.chalkStringStrings.dim
    - typingsJapgolly.chalkString.chalkStringStrings.italic
    - typingsJapgolly.chalkString.chalkStringStrings.hidden
    - typingsJapgolly.chalkString.chalkStringStrings.strikethrough
    - typingsJapgolly.chalkString.chalkStringStrings.visible
  */
  trait BasicStyle
    extends StObject
       with _Style
  object BasicStyle {
    
    inline def bold: typingsJapgolly.chalkString.chalkStringStrings.bold = "bold".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.bold]
    
    inline def dim: typingsJapgolly.chalkString.chalkStringStrings.dim = "dim".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.dim]
    
    inline def hidden: typingsJapgolly.chalkString.chalkStringStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.hidden]
    
    inline def inverse: typingsJapgolly.chalkString.chalkStringStrings.inverse = "inverse".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.inverse]
    
    inline def italic: typingsJapgolly.chalkString.chalkStringStrings.italic = "italic".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.italic]
    
    inline def reset: typingsJapgolly.chalkString.chalkStringStrings.reset = "reset".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.reset]
    
    inline def strikethrough: typingsJapgolly.chalkString.chalkStringStrings.strikethrough = "strikethrough".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.strikethrough]
    
    inline def underline: typingsJapgolly.chalkString.chalkStringStrings.underline = "underline".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.underline]
    
    inline def visible: typingsJapgolly.chalkString.chalkStringStrings.visible = "visible".asInstanceOf[typingsJapgolly.chalkString.chalkStringStrings.visible]
  }
  
  trait Options extends StObject {
    
    /**
      * Whether colors should be enabled/disabled, regardless of terminal
      * support. Colors support is automatically detected, so this is only meant
      * to override that default behavior.
      *
      * @default undefined
      */
    val colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stream used to detect colors support.
      * This should be the file or terminal where the colors are output.
      *
      * @default process.stdout
      */
    val stream: js.UndefOr[Stream] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chalkString.mod.BasicStyle
    - typingsJapgolly.chalkString.mod.BasicColors
    - / * template literal string: ${BasicColors}Bright * / java.lang.String
  */
  type Style = _Style | (/* template literal string: ${BasicColors}Bright */ String)
  
  type Styles = Style | (/* template literal string: ${Style} ${Style} */ String)
  
  trait _Style extends StObject
}
