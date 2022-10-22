package typingsJapgolly.officeJs.Word.Interfaces

import typingsJapgolly.officeJs.Word.UnderlineType
import typingsJapgolly.officeJs.officeJsStrings.DashLine
import typingsJapgolly.officeJs.officeJsStrings.DashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.DashLineLong
import typingsJapgolly.officeJs.officeJsStrings.DashLineLongHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotDashLine
import typingsJapgolly.officeJs.officeJsStrings.DotDashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotLine
import typingsJapgolly.officeJs.officeJsStrings.Dotted
import typingsJapgolly.officeJs.officeJsStrings.DottedHeavy
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.Hidden
import typingsJapgolly.officeJs.officeJsStrings.Mixed
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Single
import typingsJapgolly.officeJs.officeJsStrings.Thick
import typingsJapgolly.officeJs.officeJsStrings.TwoDotDashLine
import typingsJapgolly.officeJs.officeJsStrings.TwoDotDashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.Wave
import typingsJapgolly.officeJs.officeJsStrings.WaveDouble
import typingsJapgolly.officeJs.officeJsStrings.WaveHeavy
import typingsJapgolly.officeJs.officeJsStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentContentRange.toJSON()`. */
trait CommentContentRangeData extends StObject {
  
  /**
    * Gets or sets a value that indicates whether the comment text is bold.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether the range length is zero.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var isEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the comment text is italicized.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the comment text has a strikethrough.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text of the comment range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets a value that indicates the comment text's underline type. 'None' if the comment text is not underlined.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.undefined
}
object CommentContentRangeData {
  
  inline def apply(): CommentContentRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentContentRangeData]
  }
  
  extension [Self <: CommentContentRangeData](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setStrikeThrough(value: Boolean): Self = StObject.set(x, "strikeThrough", value.asInstanceOf[js.Any])
    
    inline def setStrikeThroughUndefined: Self = StObject.set(x, "strikeThrough", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUnderline(
      value: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
