package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single cell in the terminal's buffer.
  */
trait IBufferCell extends js.Object {
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
  /** Whether the cell has the inverse attribute (CSI 5 m). */
  def isBlink(): Double
  /** Whether the cell has the bold attribute (CSI 1 m). */
  def isBold(): Double
  /** Whether the cell has the inverse attribute (CSI 2 m). */
  def isDim(): Double
  /** Whether the cell is using the default foreground color mode. */
  def isFgDefault(): Boolean
  /** Whether the cell is using the palette foreground color mode. */
  def isFgPalette(): Boolean
  /** Whether the cell is using the RGB foreground color mode. */
  def isFgRGB(): Boolean
  /** Whether the cell has the inverse attribute (CSI 7 m). */
  def isInverse(): Double
  /** Whether the cell has the inverse attribute (CSI 8 m). */
  def isInvisible(): Double
  /** Whether the cell has the inverse attribute (CSI 3 m). */
  def isItalic(): Double
  /** Whether the cell has the underline attribute (CSI 4 m). */
  def isUnderline(): Double
}

object IBufferCell {
  @scala.inline
  def apply(
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
    isUnderline: CallbackTo[Double]
  ): IBufferCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBgColor")(getBgColor.toJsFn)
    __obj.updateDynamic("getBgColorMode")(getBgColorMode.toJsFn)
    __obj.updateDynamic("getChars")(getChars.toJsFn)
    __obj.updateDynamic("getCode")(getCode.toJsFn)
    __obj.updateDynamic("getFgColor")(getFgColor.toJsFn)
    __obj.updateDynamic("getFgColorMode")(getFgColorMode.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("isAttributeDefault")(isAttributeDefault.toJsFn)
    __obj.updateDynamic("isBgDefault")(isBgDefault.toJsFn)
    __obj.updateDynamic("isBgPalette")(isBgPalette.toJsFn)
    __obj.updateDynamic("isBgRGB")(isBgRGB.toJsFn)
    __obj.updateDynamic("isBlink")(isBlink.toJsFn)
    __obj.updateDynamic("isBold")(isBold.toJsFn)
    __obj.updateDynamic("isDim")(isDim.toJsFn)
    __obj.updateDynamic("isFgDefault")(isFgDefault.toJsFn)
    __obj.updateDynamic("isFgPalette")(isFgPalette.toJsFn)
    __obj.updateDynamic("isFgRGB")(isFgRGB.toJsFn)
    __obj.updateDynamic("isInverse")(isInverse.toJsFn)
    __obj.updateDynamic("isInvisible")(isInvisible.toJsFn)
    __obj.updateDynamic("isItalic")(isItalic.toJsFn)
    __obj.updateDynamic("isUnderline")(isUnderline.toJsFn)
    __obj.asInstanceOf[IBufferCell]
  }
}

