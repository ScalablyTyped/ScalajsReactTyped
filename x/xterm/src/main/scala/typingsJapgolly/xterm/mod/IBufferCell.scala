package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single cell in the terminal's buffer.
  */
trait IBufferCell extends StObject {
  
  /**
    * Gets a cell's background color number, this differs depending on what the
    * color mode of the cell is:
    *
    * - Default: This should be 0, representing the default background color
    *   (CSI 49 m).
    * - Palette: This is a number from 0 to 255 of ANSI colors
    *   (CSI 4(0-7) m, CSI 10(0-7) m, CSI 48 ; 5 ; 0-255 m).
    * - RGB: A hex value representing a 'true color': 0xRRGGBB
    *   (CSI 4 8 ; 2 ; Pi ; Pr ; Pg ; Pb)
    */
  def getBgColor(): Double
  
  /**
    * Gets the number representation of the background color mode, this can be
    * used to perform quick comparisons of 2 cells to see if they're the same.
    * Use `isBgRGB`, `isBgPalette` and `isBgDefault` to check what color mode
    * a cell is.
    */
  def getBgColorMode(): Double
  
  /**
    * The character(s) within the cell. Examples of what this can contain:
    *
    * - A normal width character
    * - A wide character (eg. CJK)
    * - An emoji
    */
  def getChars(): String
  
  /**
    * Gets the UTF32 codepoint of single characters, if content is a combined
    * string it returns the codepoint of the last character in the string.
    */
  def getCode(): Double
  
  /**
    * Gets a cell's foreground color number, this differs depending on what the
    * color mode of the cell is:
    *
    * - Default: This should be 0, representing the default foreground color
    *   (CSI 39 m).
    * - Palette: This is a number from 0 to 255 of ANSI colors (CSI 3(0-7) m,
    *   CSI 9(0-7) m, CSI 38 ; 5 ; 0-255 m).
    * - RGB: A hex value representing a 'true color': 0xRRGGBB.
    *   (CSI 3 8 ; 2 ; Pi ; Pr ; Pg ; Pb)
    */
  def getFgColor(): Double
  
  /**
    * Gets the number representation of the foreground color mode, this can be
    * used to perform quick comparisons of 2 cells to see if they're the same.
    * Use `isFgRGB`, `isFgPalette` and `isFgDefault` to check what color mode
    * a cell is.
    */
  def getFgColorMode(): Double
  
  /**
    * The width of the character. Some examples:
    *
    * - `1` for most cells.
    * - `2` for wide character like CJK glyphs.
    * - `0` for cells immediately following cells with a width of `2`.
    */
  def getWidth(): Double
  
  /** Whether the cell has the default attribute (no color or style). */
  def isAttributeDefault(): Boolean
  
  /** Whether the cell is using the default background color mode. */
  def isBgDefault(): Boolean
  
  /** Whether the cell is using the palette background color mode. */
  def isBgPalette(): Boolean
  
  /** Whether the cell is using the RGB background color mode. */
  def isBgRGB(): Boolean
  
  /** Whether the cell has the blink attribute (CSI 5 m). */
  def isBlink(): Double
  
  /** Whether the cell has the bold attribute (CSI 1 m). */
  def isBold(): Double
  
  /** Whether the cell has the dim attribute (CSI 2 m). */
  def isDim(): Double
  
  /** Whether the cell is using the default foreground color mode. */
  def isFgDefault(): Boolean
  
  /** Whether the cell is using the palette foreground color mode. */
  def isFgPalette(): Boolean
  
  /** Whether the cell is using the RGB foreground color mode. */
  def isFgRGB(): Boolean
  
  /** Whether the cell has the inverse attribute (CSI 7 m). */
  def isInverse(): Double
  
  /** Whether the cell has the invisible attribute (CSI 8 m). */
  def isInvisible(): Double
  
  /** Whether the cell has the italic attribute (CSI 3 m). */
  def isItalic(): Double
  
  /** Whether the cell has the strikethrough attribute (CSI 9 m). */
  def isStrikethrough(): Double
  
  /** Whether the cell has the underline attribute (CSI 4 m). */
  def isUnderline(): Double
}
object IBufferCell {
  
  inline def apply(
    getBgColor: CallbackTo[Double],
    getBgColorMode: CallbackTo[Double],
    getChars: CallbackTo[String],
    getCode: CallbackTo[Double],
    getFgColor: CallbackTo[Double],
    getFgColorMode: CallbackTo[Double],
    getWidth: CallbackTo[Double],
    isAttributeDefault: CallbackTo[Boolean],
    isBgDefault: CallbackTo[Boolean],
    isBgPalette: CallbackTo[Boolean],
    isBgRGB: CallbackTo[Boolean],
    isBlink: CallbackTo[Double],
    isBold: CallbackTo[Double],
    isDim: CallbackTo[Double],
    isFgDefault: CallbackTo[Boolean],
    isFgPalette: CallbackTo[Boolean],
    isFgRGB: CallbackTo[Boolean],
    isInverse: CallbackTo[Double],
    isInvisible: CallbackTo[Double],
    isItalic: CallbackTo[Double],
    isStrikethrough: CallbackTo[Double],
    isUnderline: CallbackTo[Double]
  ): IBufferCell = {
    val __obj = js.Dynamic.literal(getBgColor = getBgColor.toJsFn, getBgColorMode = getBgColorMode.toJsFn, getChars = getChars.toJsFn, getCode = getCode.toJsFn, getFgColor = getFgColor.toJsFn, getFgColorMode = getFgColorMode.toJsFn, getWidth = getWidth.toJsFn, isAttributeDefault = isAttributeDefault.toJsFn, isBgDefault = isBgDefault.toJsFn, isBgPalette = isBgPalette.toJsFn, isBgRGB = isBgRGB.toJsFn, isBlink = isBlink.toJsFn, isBold = isBold.toJsFn, isDim = isDim.toJsFn, isFgDefault = isFgDefault.toJsFn, isFgPalette = isFgPalette.toJsFn, isFgRGB = isFgRGB.toJsFn, isInverse = isInverse.toJsFn, isInvisible = isInvisible.toJsFn, isItalic = isItalic.toJsFn, isStrikethrough = isStrikethrough.toJsFn, isUnderline = isUnderline.toJsFn)
    __obj.asInstanceOf[IBufferCell]
  }
  
  extension [Self <: IBufferCell](x: Self) {
    
    inline def setGetBgColor(value: CallbackTo[Double]): Self = StObject.set(x, "getBgColor", value.toJsFn)
    
    inline def setGetBgColorMode(value: CallbackTo[Double]): Self = StObject.set(x, "getBgColorMode", value.toJsFn)
    
    inline def setGetChars(value: CallbackTo[String]): Self = StObject.set(x, "getChars", value.toJsFn)
    
    inline def setGetCode(value: CallbackTo[Double]): Self = StObject.set(x, "getCode", value.toJsFn)
    
    inline def setGetFgColor(value: CallbackTo[Double]): Self = StObject.set(x, "getFgColor", value.toJsFn)
    
    inline def setGetFgColorMode(value: CallbackTo[Double]): Self = StObject.set(x, "getFgColorMode", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setIsAttributeDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAttributeDefault", value.toJsFn)
    
    inline def setIsBgDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBgDefault", value.toJsFn)
    
    inline def setIsBgPalette(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBgPalette", value.toJsFn)
    
    inline def setIsBgRGB(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBgRGB", value.toJsFn)
    
    inline def setIsBlink(value: CallbackTo[Double]): Self = StObject.set(x, "isBlink", value.toJsFn)
    
    inline def setIsBold(value: CallbackTo[Double]): Self = StObject.set(x, "isBold", value.toJsFn)
    
    inline def setIsDim(value: CallbackTo[Double]): Self = StObject.set(x, "isDim", value.toJsFn)
    
    inline def setIsFgDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFgDefault", value.toJsFn)
    
    inline def setIsFgPalette(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFgPalette", value.toJsFn)
    
    inline def setIsFgRGB(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFgRGB", value.toJsFn)
    
    inline def setIsInverse(value: CallbackTo[Double]): Self = StObject.set(x, "isInverse", value.toJsFn)
    
    inline def setIsInvisible(value: CallbackTo[Double]): Self = StObject.set(x, "isInvisible", value.toJsFn)
    
    inline def setIsItalic(value: CallbackTo[Double]): Self = StObject.set(x, "isItalic", value.toJsFn)
    
    inline def setIsStrikethrough(value: CallbackTo[Double]): Self = StObject.set(x, "isStrikethrough", value.toJsFn)
    
    inline def setIsUnderline(value: CallbackTo[Double]): Self = StObject.set(x, "isUnderline", value.toJsFn)
  }
}
