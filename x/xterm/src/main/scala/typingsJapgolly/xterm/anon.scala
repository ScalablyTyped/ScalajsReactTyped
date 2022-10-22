package typingsJapgolly.xterm

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.xterm.mod.FontWeight
import typingsJapgolly.xterm.mod.IDecorationOverviewRulerOptions
import typingsJapgolly.xterm.mod.ILinkHandler
import typingsJapgolly.xterm.mod.ITheme
import typingsJapgolly.xterm.mod.IWindowOptions
import typingsJapgolly.xterm.mod.LogLevel
import typingsJapgolly.xterm.xtermStrings.alt
import typingsJapgolly.xterm.xtermStrings.bar
import typingsJapgolly.xterm.xtermStrings.block
import typingsJapgolly.xterm.xtermStrings.ctrl
import typingsJapgolly.xterm.xtermStrings.none
import typingsJapgolly.xterm.xtermStrings.shift
import typingsJapgolly.xterm.xtermStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cols extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object Cols {
    
    inline def apply(cols: Double, rows: Double): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    extension [Self <: Cols](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomEvent extends StObject {
    
    var domEvent: KeyboardEvent
    
    var key: String
  }
  object DomEvent {
    
    inline def apply(domEvent: KeyboardEvent, key: String): DomEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEvent]
    }
    
    extension [Self <: DomEvent](x: Self) {
      
      inline def setDomEvent(value: KeyboardEvent): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<xterm.xterm.IDecorationOptions, 'overviewRulerOptions'> */
  trait PickIDecorationOptionsove extends StObject {
    
    var overviewRulerOptions: js.UndefOr[IDecorationOverviewRulerOptions] = js.undefined
  }
  object PickIDecorationOptionsove {
    
    inline def apply(): PickIDecorationOptionsove = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickIDecorationOptionsove]
    }
    
    extension [Self <: PickIDecorationOptionsove](x: Self) {
      
      inline def setOverviewRulerOptions(value: IDecorationOverviewRulerOptions): Self = StObject.set(x, "overviewRulerOptions", value.asInstanceOf[js.Any])
      
      inline def setOverviewRulerOptionsUndefined: Self = StObject.set(x, "overviewRulerOptions", js.undefined)
    }
  }
  
  /* Inlined std.Required<xterm.xterm.ITerminalOptions> */
  trait RequiredITerminalOptions extends StObject {
    
    var allowProposedApi: Boolean
    
    var allowTransparency: Boolean
    
    var altClickMovesCursor: Boolean
    
    var convertEol: Boolean
    
    var cursorBlink: Boolean
    
    var cursorStyle: block | underline | bar
    
    var cursorWidth: Double
    
    var customGlyphs: Boolean
    
    var disableStdin: Boolean
    
    var drawBoldTextInBrightColors: Boolean
    
    var fastScrollModifier: none | alt | ctrl | shift
    
    var fastScrollSensitivity: Double
    
    var fontFamily: String
    
    var fontSize: Double
    
    var fontWeight: FontWeight
    
    var fontWeightBold: FontWeight
    
    var letterSpacing: Double
    
    var lineHeight: Double
    
    var linkHandler: ILinkHandler
    
    var logLevel: LogLevel
    
    var macOptionClickForcesSelection: Boolean
    
    var macOptionIsMeta: Boolean
    
    var minimumContrastRatio: Double
    
    var overviewRulerWidth: Double
    
    var rightClickSelectsWord: Boolean
    
    var screenReaderMode: Boolean
    
    var scrollSensitivity: Double
    
    var scrollback: Double
    
    var smoothScrollDuration: Double
    
    var tabStopWidth: Double
    
    var theme: ITheme
    
    var windowOptions: IWindowOptions
    
    var windowsMode: Boolean
    
    var wordSeparator: String
  }
  object RequiredITerminalOptions {
    
    inline def apply(
      allowProposedApi: Boolean,
      allowTransparency: Boolean,
      altClickMovesCursor: Boolean,
      convertEol: Boolean,
      cursorBlink: Boolean,
      cursorStyle: block | underline | bar,
      cursorWidth: Double,
      customGlyphs: Boolean,
      disableStdin: Boolean,
      drawBoldTextInBrightColors: Boolean,
      fastScrollModifier: none | alt | ctrl | shift,
      fastScrollSensitivity: Double,
      fontFamily: String,
      fontSize: Double,
      fontWeight: FontWeight,
      fontWeightBold: FontWeight,
      letterSpacing: Double,
      lineHeight: Double,
      linkHandler: ILinkHandler,
      logLevel: LogLevel,
      macOptionClickForcesSelection: Boolean,
      macOptionIsMeta: Boolean,
      minimumContrastRatio: Double,
      overviewRulerWidth: Double,
      rightClickSelectsWord: Boolean,
      screenReaderMode: Boolean,
      scrollSensitivity: Double,
      scrollback: Double,
      smoothScrollDuration: Double,
      tabStopWidth: Double,
      theme: ITheme,
      windowOptions: IWindowOptions,
      windowsMode: Boolean,
      wordSeparator: String
    ): RequiredITerminalOptions = {
      val __obj = js.Dynamic.literal(allowProposedApi = allowProposedApi.asInstanceOf[js.Any], allowTransparency = allowTransparency.asInstanceOf[js.Any], altClickMovesCursor = altClickMovesCursor.asInstanceOf[js.Any], convertEol = convertEol.asInstanceOf[js.Any], cursorBlink = cursorBlink.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], customGlyphs = customGlyphs.asInstanceOf[js.Any], disableStdin = disableStdin.asInstanceOf[js.Any], drawBoldTextInBrightColors = drawBoldTextInBrightColors.asInstanceOf[js.Any], fastScrollModifier = fastScrollModifier.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], fontWeightBold = fontWeightBold.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], linkHandler = linkHandler.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], macOptionClickForcesSelection = macOptionClickForcesSelection.asInstanceOf[js.Any], macOptionIsMeta = macOptionIsMeta.asInstanceOf[js.Any], minimumContrastRatio = minimumContrastRatio.asInstanceOf[js.Any], overviewRulerWidth = overviewRulerWidth.asInstanceOf[js.Any], rightClickSelectsWord = rightClickSelectsWord.asInstanceOf[js.Any], screenReaderMode = screenReaderMode.asInstanceOf[js.Any], scrollSensitivity = scrollSensitivity.asInstanceOf[js.Any], scrollback = scrollback.asInstanceOf[js.Any], smoothScrollDuration = smoothScrollDuration.asInstanceOf[js.Any], tabStopWidth = tabStopWidth.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], windowOptions = windowOptions.asInstanceOf[js.Any], windowsMode = windowsMode.asInstanceOf[js.Any], wordSeparator = wordSeparator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredITerminalOptions]
    }
    
    extension [Self <: RequiredITerminalOptions](x: Self) {
      
      inline def setAllowProposedApi(value: Boolean): Self = StObject.set(x, "allowProposedApi", value.asInstanceOf[js.Any])
      
      inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      inline def setAltClickMovesCursor(value: Boolean): Self = StObject.set(x, "altClickMovesCursor", value.asInstanceOf[js.Any])
      
      inline def setConvertEol(value: Boolean): Self = StObject.set(x, "convertEol", value.asInstanceOf[js.Any])
      
      inline def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
      
      inline def setCursorStyle(value: block | underline | bar): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      inline def setCustomGlyphs(value: Boolean): Self = StObject.set(x, "customGlyphs", value.asInstanceOf[js.Any])
      
      inline def setDisableStdin(value: Boolean): Self = StObject.set(x, "disableStdin", value.asInstanceOf[js.Any])
      
      inline def setDrawBoldTextInBrightColors(value: Boolean): Self = StObject.set(x, "drawBoldTextInBrightColors", value.asInstanceOf[js.Any])
      
      inline def setFastScrollModifier(value: none | alt | ctrl | shift): Self = StObject.set(x, "fastScrollModifier", value.asInstanceOf[js.Any])
      
      inline def setFastScrollSensitivity(value: Double): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setMacOptionClickForcesSelection(value: Boolean): Self = StObject.set(x, "macOptionClickForcesSelection", value.asInstanceOf[js.Any])
      
      inline def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
      
      inline def setMinimumContrastRatio(value: Double): Self = StObject.set(x, "minimumContrastRatio", value.asInstanceOf[js.Any])
      
      inline def setOverviewRulerWidth(value: Double): Self = StObject.set(x, "overviewRulerWidth", value.asInstanceOf[js.Any])
      
      inline def setRightClickSelectsWord(value: Boolean): Self = StObject.set(x, "rightClickSelectsWord", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
      
      inline def setSmoothScrollDuration(value: Double): Self = StObject.set(x, "smoothScrollDuration", value.asInstanceOf[js.Any])
      
      inline def setTabStopWidth(value: Double): Self = StObject.set(x, "tabStopWidth", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWindowOptions(value: IWindowOptions): Self = StObject.set(x, "windowOptions", value.asInstanceOf[js.Any])
      
      inline def setWindowsMode(value: Boolean): Self = StObject.set(x, "windowsMode", value.asInstanceOf[js.Any])
      
      inline def setWordSeparator(value: String): Self = StObject.set(x, "wordSeparator", value.asInstanceOf[js.Any])
    }
  }
}
