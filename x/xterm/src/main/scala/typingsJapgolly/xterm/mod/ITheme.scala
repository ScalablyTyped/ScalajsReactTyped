package typingsJapgolly.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITheme extends StObject {
  
  /** The default background color */
  var background: js.UndefOr[String] = js.undefined
  
  /** ANSI black (eg. `\x1b[30m`) */
  var black: js.UndefOr[String] = js.undefined
  
  /** ANSI blue (eg. `\x1b[34m`) */
  var blue: js.UndefOr[String] = js.undefined
  
  /** ANSI bright black (eg. `\x1b[1;30m`) */
  var brightBlack: js.UndefOr[String] = js.undefined
  
  /** ANSI bright blue (eg. `\x1b[1;34m`) */
  var brightBlue: js.UndefOr[String] = js.undefined
  
  /** ANSI bright cyan (eg. `\x1b[1;36m`) */
  var brightCyan: js.UndefOr[String] = js.undefined
  
  /** ANSI bright green (eg. `\x1b[1;32m`) */
  var brightGreen: js.UndefOr[String] = js.undefined
  
  /** ANSI bright magenta (eg. `\x1b[1;35m`) */
  var brightMagenta: js.UndefOr[String] = js.undefined
  
  /** ANSI bright red (eg. `\x1b[1;31m`) */
  var brightRed: js.UndefOr[String] = js.undefined
  
  /** ANSI bright white (eg. `\x1b[1;37m`) */
  var brightWhite: js.UndefOr[String] = js.undefined
  
  /** ANSI bright yellow (eg. `\x1b[1;33m`) */
  var brightYellow: js.UndefOr[String] = js.undefined
  
  /** The cursor color */
  var cursor: js.UndefOr[String] = js.undefined
  
  /** The accent color of the cursor (fg color for a block cursor) */
  var cursorAccent: js.UndefOr[String] = js.undefined
  
  /** ANSI cyan (eg. `\x1b[36m`) */
  var cyan: js.UndefOr[String] = js.undefined
  
  /** ANSI extended colors (16-255) */
  var extendedAnsi: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The default foreground color */
  var foreground: js.UndefOr[String] = js.undefined
  
  /** ANSI green (eg. `\x1b[32m`) */
  var green: js.UndefOr[String] = js.undefined
  
  /** ANSI magenta (eg. `\x1b[35m`) */
  var magenta: js.UndefOr[String] = js.undefined
  
  /** ANSI red (eg. `\x1b[31m`) */
  var red: js.UndefOr[String] = js.undefined
  
  /** The selection background color (can be transparent) */
  var selectionBackground: js.UndefOr[String] = js.undefined
  
  /** The selection foreground color */
  var selectionForeground: js.UndefOr[String] = js.undefined
  
  /** The selection background color when the terminal does not have focus (can be transparent) */
  var selectionInactiveBackground: js.UndefOr[String] = js.undefined
  
  /** ANSI white (eg. `\x1b[37m`) */
  var white: js.UndefOr[String] = js.undefined
  
  /** ANSI yellow (eg. `\x1b[33m`) */
  var yellow: js.UndefOr[String] = js.undefined
}
object ITheme {
  
  inline def apply(): ITheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITheme]
  }
  
  extension [Self <: ITheme](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBlackUndefined: Self = StObject.set(x, "black", js.undefined)
    
    inline def setBlue(value: String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setBrightBlack(value: String): Self = StObject.set(x, "brightBlack", value.asInstanceOf[js.Any])
    
    inline def setBrightBlackUndefined: Self = StObject.set(x, "brightBlack", js.undefined)
    
    inline def setBrightBlue(value: String): Self = StObject.set(x, "brightBlue", value.asInstanceOf[js.Any])
    
    inline def setBrightBlueUndefined: Self = StObject.set(x, "brightBlue", js.undefined)
    
    inline def setBrightCyan(value: String): Self = StObject.set(x, "brightCyan", value.asInstanceOf[js.Any])
    
    inline def setBrightCyanUndefined: Self = StObject.set(x, "brightCyan", js.undefined)
    
    inline def setBrightGreen(value: String): Self = StObject.set(x, "brightGreen", value.asInstanceOf[js.Any])
    
    inline def setBrightGreenUndefined: Self = StObject.set(x, "brightGreen", js.undefined)
    
    inline def setBrightMagenta(value: String): Self = StObject.set(x, "brightMagenta", value.asInstanceOf[js.Any])
    
    inline def setBrightMagentaUndefined: Self = StObject.set(x, "brightMagenta", js.undefined)
    
    inline def setBrightRed(value: String): Self = StObject.set(x, "brightRed", value.asInstanceOf[js.Any])
    
    inline def setBrightRedUndefined: Self = StObject.set(x, "brightRed", js.undefined)
    
    inline def setBrightWhite(value: String): Self = StObject.set(x, "brightWhite", value.asInstanceOf[js.Any])
    
    inline def setBrightWhiteUndefined: Self = StObject.set(x, "brightWhite", js.undefined)
    
    inline def setBrightYellow(value: String): Self = StObject.set(x, "brightYellow", value.asInstanceOf[js.Any])
    
    inline def setBrightYellowUndefined: Self = StObject.set(x, "brightYellow", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorAccent(value: String): Self = StObject.set(x, "cursorAccent", value.asInstanceOf[js.Any])
    
    inline def setCursorAccentUndefined: Self = StObject.set(x, "cursorAccent", js.undefined)
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setCyan(value: String): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
    
    inline def setCyanUndefined: Self = StObject.set(x, "cyan", js.undefined)
    
    inline def setExtendedAnsi(value: js.Array[String]): Self = StObject.set(x, "extendedAnsi", value.asInstanceOf[js.Any])
    
    inline def setExtendedAnsiUndefined: Self = StObject.set(x, "extendedAnsi", js.undefined)
    
    inline def setExtendedAnsiVarargs(value: String*): Self = StObject.set(x, "extendedAnsi", js.Array(value*))
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    inline def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setMagenta(value: String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setMagentaUndefined: Self = StObject.set(x, "magenta", js.undefined)
    
    inline def setRed(value: String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    inline def setSelectionBackground(value: String): Self = StObject.set(x, "selectionBackground", value.asInstanceOf[js.Any])
    
    inline def setSelectionBackgroundUndefined: Self = StObject.set(x, "selectionBackground", js.undefined)
    
    inline def setSelectionForeground(value: String): Self = StObject.set(x, "selectionForeground", value.asInstanceOf[js.Any])
    
    inline def setSelectionForegroundUndefined: Self = StObject.set(x, "selectionForeground", js.undefined)
    
    inline def setSelectionInactiveBackground(value: String): Self = StObject.set(x, "selectionInactiveBackground", value.asInstanceOf[js.Any])
    
    inline def setSelectionInactiveBackgroundUndefined: Self = StObject.set(x, "selectionInactiveBackground", js.undefined)
    
    inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
    
    inline def setYellow(value: String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    
    inline def setYellowUndefined: Self = StObject.set(x, "yellow", js.undefined)
  }
}
