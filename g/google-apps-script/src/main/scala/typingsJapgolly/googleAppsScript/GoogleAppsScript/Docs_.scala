package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Collection.DocumentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.AutoText
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Background
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.BatchUpdateDocumentRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Body
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Bullet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Color
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.ColumnBreak
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateNamedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateParagraphBulletsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteContentRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteNamedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteParagraphBulletsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeletePositionedObjectRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableColumnRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableRowRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Dimension
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.DocumentStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.EndOfSegmentLocation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Equation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.FootnoteReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.HorizontalRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InlineObjectElement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertInlineImageRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertPageBreakRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRowRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Link
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Location
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyles
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.OptionalColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.PageBreak
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Paragraph
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphBorder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphElement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Range
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.ReplaceAllTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Request
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.RgbColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionBreak
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionColumnProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Shading
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Size
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.StructuralElement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.SubstringMatchCriteria
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TabStop
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Table
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCell
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellBorder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellLocation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableColumnProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableOfContents
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRow
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRowStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TableStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TextRun
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.TextStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateParagraphStyleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateTextStyleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.WeightedFontFamily
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.WriteControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Docs_ extends js.Object {
  var Documents: js.UndefOr[DocumentsCollection] = js.undefined
  // Create a new instance of AutoText
  def newAutoText(): AutoText
  // Create a new instance of Background
  def newBackground(): Background
  // Create a new instance of BatchUpdateDocumentRequest
  def newBatchUpdateDocumentRequest(): BatchUpdateDocumentRequest
  // Create a new instance of Body
  def newBody(): Body
  // Create a new instance of Bullet
  def newBullet(): Bullet
  // Create a new instance of Color
  def newColor(): Color
  // Create a new instance of ColumnBreak
  def newColumnBreak(): ColumnBreak
  // Create a new instance of CreateNamedRangeRequest
  def newCreateNamedRangeRequest(): CreateNamedRangeRequest
  // Create a new instance of CreateParagraphBulletsRequest
  def newCreateParagraphBulletsRequest(): CreateParagraphBulletsRequest
  // Create a new instance of DeleteContentRangeRequest
  def newDeleteContentRangeRequest(): DeleteContentRangeRequest
  // Create a new instance of DeleteNamedRangeRequest
  def newDeleteNamedRangeRequest(): DeleteNamedRangeRequest
  // Create a new instance of DeleteParagraphBulletsRequest
  def newDeleteParagraphBulletsRequest(): DeleteParagraphBulletsRequest
  // Create a new instance of DeletePositionedObjectRequest
  def newDeletePositionedObjectRequest(): DeletePositionedObjectRequest
  // Create a new instance of DeleteTableColumnRequest
  def newDeleteTableColumnRequest(): DeleteTableColumnRequest
  // Create a new instance of DeleteTableRowRequest
  def newDeleteTableRowRequest(): DeleteTableRowRequest
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of Document
  def newDocument(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Document
  // Create a new instance of DocumentStyle
  def newDocumentStyle(): DocumentStyle
  // Create a new instance of EndOfSegmentLocation
  def newEndOfSegmentLocation(): EndOfSegmentLocation
  // Create a new instance of Equation
  def newEquation(): Equation
  // Create a new instance of FootnoteReference
  def newFootnoteReference(): FootnoteReference
  // Create a new instance of HorizontalRule
  def newHorizontalRule(): HorizontalRule
  // Create a new instance of InlineObjectElement
  def newInlineObjectElement(): InlineObjectElement
  // Create a new instance of InsertInlineImageRequest
  def newInsertInlineImageRequest(): InsertInlineImageRequest
  // Create a new instance of InsertPageBreakRequest
  def newInsertPageBreakRequest(): InsertPageBreakRequest
  // Create a new instance of InsertTableRequest
  def newInsertTableRequest(): InsertTableRequest
  // Create a new instance of InsertTableRowRequest
  def newInsertTableRowRequest(): InsertTableRowRequest
  // Create a new instance of InsertTextRequest
  def newInsertTextRequest(): InsertTextRequest
  // Create a new instance of Link
  def newLink(): Link
  // Create a new instance of Location
  def newLocation(): Location
  // Create a new instance of NamedStyle
  def newNamedStyle(): NamedStyle
  // Create a new instance of NamedStyles
  def newNamedStyles(): NamedStyles
  // Create a new instance of OptionalColor
  def newOptionalColor(): OptionalColor
  // Create a new instance of PageBreak
  def newPageBreak(): PageBreak
  // Create a new instance of Paragraph
  def newParagraph(): Paragraph
  // Create a new instance of ParagraphBorder
  def newParagraphBorder(): ParagraphBorder
  // Create a new instance of ParagraphElement
  def newParagraphElement(): ParagraphElement
  // Create a new instance of ParagraphStyle
  def newParagraphStyle(): ParagraphStyle
  // Create a new instance of Range
  def newRange(): Range
  // Create a new instance of ReplaceAllTextRequest
  def newReplaceAllTextRequest(): ReplaceAllTextRequest
  // Create a new instance of Request
  def newRequest(): Request
  // Create a new instance of RgbColor
  def newRgbColor(): RgbColor
  // Create a new instance of SectionBreak
  def newSectionBreak(): SectionBreak
  // Create a new instance of SectionColumnProperties
  def newSectionColumnProperties(): SectionColumnProperties
  // Create a new instance of SectionStyle
  def newSectionStyle(): SectionStyle
  // Create a new instance of Shading
  def newShading(): Shading
  // Create a new instance of Size
  def newSize(): Size
  // Create a new instance of StructuralElement
  def newStructuralElement(): StructuralElement
  // Create a new instance of SubstringMatchCriteria
  def newSubstringMatchCriteria(): SubstringMatchCriteria
  // Create a new instance of TabStop
  def newTabStop(): TabStop
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TableCell
  def newTableCell(): TableCell
  // Create a new instance of TableCellBorder
  def newTableCellBorder(): TableCellBorder
  // Create a new instance of TableCellLocation
  def newTableCellLocation(): TableCellLocation
  // Create a new instance of TableCellStyle
  def newTableCellStyle(): TableCellStyle
  // Create a new instance of TableColumnProperties
  def newTableColumnProperties(): TableColumnProperties
  // Create a new instance of TableOfContents
  def newTableOfContents(): TableOfContents
  // Create a new instance of TableRow
  def newTableRow(): TableRow
  // Create a new instance of TableRowStyle
  def newTableRowStyle(): TableRowStyle
  // Create a new instance of TableStyle
  def newTableStyle(): TableStyle
  // Create a new instance of TextRun
  def newTextRun(): TextRun
  // Create a new instance of TextStyle
  def newTextStyle(): TextStyle
  // Create a new instance of UpdateParagraphStyleRequest
  def newUpdateParagraphStyleRequest(): UpdateParagraphStyleRequest
  // Create a new instance of UpdateTextStyleRequest
  def newUpdateTextStyleRequest(): UpdateTextStyleRequest
  // Create a new instance of WeightedFontFamily
  def newWeightedFontFamily(): WeightedFontFamily
  // Create a new instance of WriteControl
  def newWriteControl(): WriteControl
}

object Docs_ {
  @scala.inline
  def apply(
    newAutoText: CallbackTo[AutoText],
    newBackground: CallbackTo[Background],
    newBatchUpdateDocumentRequest: CallbackTo[BatchUpdateDocumentRequest],
    newBody: CallbackTo[Body],
    newBullet: CallbackTo[Bullet],
    newColor: CallbackTo[Color],
    newColumnBreak: CallbackTo[ColumnBreak],
    newCreateNamedRangeRequest: CallbackTo[CreateNamedRangeRequest],
    newCreateParagraphBulletsRequest: CallbackTo[CreateParagraphBulletsRequest],
    newDeleteContentRangeRequest: CallbackTo[DeleteContentRangeRequest],
    newDeleteNamedRangeRequest: CallbackTo[DeleteNamedRangeRequest],
    newDeleteParagraphBulletsRequest: CallbackTo[DeleteParagraphBulletsRequest],
    newDeletePositionedObjectRequest: CallbackTo[DeletePositionedObjectRequest],
    newDeleteTableColumnRequest: CallbackTo[DeleteTableColumnRequest],
    newDeleteTableRowRequest: CallbackTo[DeleteTableRowRequest],
    newDimension: CallbackTo[Dimension],
    newDocument: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema.Document],
    newDocumentStyle: CallbackTo[DocumentStyle],
    newEndOfSegmentLocation: CallbackTo[EndOfSegmentLocation],
    newEquation: CallbackTo[Equation],
    newFootnoteReference: CallbackTo[FootnoteReference],
    newHorizontalRule: CallbackTo[HorizontalRule],
    newInlineObjectElement: CallbackTo[InlineObjectElement],
    newInsertInlineImageRequest: CallbackTo[InsertInlineImageRequest],
    newInsertPageBreakRequest: CallbackTo[InsertPageBreakRequest],
    newInsertTableRequest: CallbackTo[InsertTableRequest],
    newInsertTableRowRequest: CallbackTo[InsertTableRowRequest],
    newInsertTextRequest: CallbackTo[InsertTextRequest],
    newLink: CallbackTo[Link],
    newLocation: CallbackTo[Location],
    newNamedStyle: CallbackTo[NamedStyle],
    newNamedStyles: CallbackTo[NamedStyles],
    newOptionalColor: CallbackTo[OptionalColor],
    newPageBreak: CallbackTo[PageBreak],
    newParagraph: CallbackTo[Paragraph],
    newParagraphBorder: CallbackTo[ParagraphBorder],
    newParagraphElement: CallbackTo[ParagraphElement],
    newParagraphStyle: CallbackTo[ParagraphStyle],
    newRange: CallbackTo[Range],
    newReplaceAllTextRequest: CallbackTo[ReplaceAllTextRequest],
    newRequest: CallbackTo[Request],
    newRgbColor: CallbackTo[RgbColor],
    newSectionBreak: CallbackTo[SectionBreak],
    newSectionColumnProperties: CallbackTo[SectionColumnProperties],
    newSectionStyle: CallbackTo[SectionStyle],
    newShading: CallbackTo[Shading],
    newSize: CallbackTo[Size],
    newStructuralElement: CallbackTo[StructuralElement],
    newSubstringMatchCriteria: CallbackTo[SubstringMatchCriteria],
    newTabStop: CallbackTo[TabStop],
    newTable: CallbackTo[Table],
    newTableCell: CallbackTo[TableCell],
    newTableCellBorder: CallbackTo[TableCellBorder],
    newTableCellLocation: CallbackTo[TableCellLocation],
    newTableCellStyle: CallbackTo[TableCellStyle],
    newTableColumnProperties: CallbackTo[TableColumnProperties],
    newTableOfContents: CallbackTo[TableOfContents],
    newTableRow: CallbackTo[TableRow],
    newTableRowStyle: CallbackTo[TableRowStyle],
    newTableStyle: CallbackTo[TableStyle],
    newTextRun: CallbackTo[TextRun],
    newTextStyle: CallbackTo[TextStyle],
    newUpdateParagraphStyleRequest: CallbackTo[UpdateParagraphStyleRequest],
    newUpdateTextStyleRequest: CallbackTo[UpdateTextStyleRequest],
    newWeightedFontFamily: CallbackTo[WeightedFontFamily],
    newWriteControl: CallbackTo[WriteControl],
    Documents: DocumentsCollection = null
  ): Docs_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAutoText")(newAutoText.toJsFn)
    __obj.updateDynamic("newBackground")(newBackground.toJsFn)
    __obj.updateDynamic("newBatchUpdateDocumentRequest")(newBatchUpdateDocumentRequest.toJsFn)
    __obj.updateDynamic("newBody")(newBody.toJsFn)
    __obj.updateDynamic("newBullet")(newBullet.toJsFn)
    __obj.updateDynamic("newColor")(newColor.toJsFn)
    __obj.updateDynamic("newColumnBreak")(newColumnBreak.toJsFn)
    __obj.updateDynamic("newCreateNamedRangeRequest")(newCreateNamedRangeRequest.toJsFn)
    __obj.updateDynamic("newCreateParagraphBulletsRequest")(newCreateParagraphBulletsRequest.toJsFn)
    __obj.updateDynamic("newDeleteContentRangeRequest")(newDeleteContentRangeRequest.toJsFn)
    __obj.updateDynamic("newDeleteNamedRangeRequest")(newDeleteNamedRangeRequest.toJsFn)
    __obj.updateDynamic("newDeleteParagraphBulletsRequest")(newDeleteParagraphBulletsRequest.toJsFn)
    __obj.updateDynamic("newDeletePositionedObjectRequest")(newDeletePositionedObjectRequest.toJsFn)
    __obj.updateDynamic("newDeleteTableColumnRequest")(newDeleteTableColumnRequest.toJsFn)
    __obj.updateDynamic("newDeleteTableRowRequest")(newDeleteTableRowRequest.toJsFn)
    __obj.updateDynamic("newDimension")(newDimension.toJsFn)
    __obj.updateDynamic("newDocument")(newDocument.toJsFn)
    __obj.updateDynamic("newDocumentStyle")(newDocumentStyle.toJsFn)
    __obj.updateDynamic("newEndOfSegmentLocation")(newEndOfSegmentLocation.toJsFn)
    __obj.updateDynamic("newEquation")(newEquation.toJsFn)
    __obj.updateDynamic("newFootnoteReference")(newFootnoteReference.toJsFn)
    __obj.updateDynamic("newHorizontalRule")(newHorizontalRule.toJsFn)
    __obj.updateDynamic("newInlineObjectElement")(newInlineObjectElement.toJsFn)
    __obj.updateDynamic("newInsertInlineImageRequest")(newInsertInlineImageRequest.toJsFn)
    __obj.updateDynamic("newInsertPageBreakRequest")(newInsertPageBreakRequest.toJsFn)
    __obj.updateDynamic("newInsertTableRequest")(newInsertTableRequest.toJsFn)
    __obj.updateDynamic("newInsertTableRowRequest")(newInsertTableRowRequest.toJsFn)
    __obj.updateDynamic("newInsertTextRequest")(newInsertTextRequest.toJsFn)
    __obj.updateDynamic("newLink")(newLink.toJsFn)
    __obj.updateDynamic("newLocation")(newLocation.toJsFn)
    __obj.updateDynamic("newNamedStyle")(newNamedStyle.toJsFn)
    __obj.updateDynamic("newNamedStyles")(newNamedStyles.toJsFn)
    __obj.updateDynamic("newOptionalColor")(newOptionalColor.toJsFn)
    __obj.updateDynamic("newPageBreak")(newPageBreak.toJsFn)
    __obj.updateDynamic("newParagraph")(newParagraph.toJsFn)
    __obj.updateDynamic("newParagraphBorder")(newParagraphBorder.toJsFn)
    __obj.updateDynamic("newParagraphElement")(newParagraphElement.toJsFn)
    __obj.updateDynamic("newParagraphStyle")(newParagraphStyle.toJsFn)
    __obj.updateDynamic("newRange")(newRange.toJsFn)
    __obj.updateDynamic("newReplaceAllTextRequest")(newReplaceAllTextRequest.toJsFn)
    __obj.updateDynamic("newRequest")(newRequest.toJsFn)
    __obj.updateDynamic("newRgbColor")(newRgbColor.toJsFn)
    __obj.updateDynamic("newSectionBreak")(newSectionBreak.toJsFn)
    __obj.updateDynamic("newSectionColumnProperties")(newSectionColumnProperties.toJsFn)
    __obj.updateDynamic("newSectionStyle")(newSectionStyle.toJsFn)
    __obj.updateDynamic("newShading")(newShading.toJsFn)
    __obj.updateDynamic("newSize")(newSize.toJsFn)
    __obj.updateDynamic("newStructuralElement")(newStructuralElement.toJsFn)
    __obj.updateDynamic("newSubstringMatchCriteria")(newSubstringMatchCriteria.toJsFn)
    __obj.updateDynamic("newTabStop")(newTabStop.toJsFn)
    __obj.updateDynamic("newTable")(newTable.toJsFn)
    __obj.updateDynamic("newTableCell")(newTableCell.toJsFn)
    __obj.updateDynamic("newTableCellBorder")(newTableCellBorder.toJsFn)
    __obj.updateDynamic("newTableCellLocation")(newTableCellLocation.toJsFn)
    __obj.updateDynamic("newTableCellStyle")(newTableCellStyle.toJsFn)
    __obj.updateDynamic("newTableColumnProperties")(newTableColumnProperties.toJsFn)
    __obj.updateDynamic("newTableOfContents")(newTableOfContents.toJsFn)
    __obj.updateDynamic("newTableRow")(newTableRow.toJsFn)
    __obj.updateDynamic("newTableRowStyle")(newTableRowStyle.toJsFn)
    __obj.updateDynamic("newTableStyle")(newTableStyle.toJsFn)
    __obj.updateDynamic("newTextRun")(newTextRun.toJsFn)
    __obj.updateDynamic("newTextStyle")(newTextStyle.toJsFn)
    __obj.updateDynamic("newUpdateParagraphStyleRequest")(newUpdateParagraphStyleRequest.toJsFn)
    __obj.updateDynamic("newUpdateTextStyleRequest")(newUpdateTextStyleRequest.toJsFn)
    __obj.updateDynamic("newWeightedFontFamily")(newWeightedFontFamily.toJsFn)
    __obj.updateDynamic("newWriteControl")(newWriteControl.toJsFn)
    if (Documents != null) __obj.updateDynamic("Documents")(Documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docs_]
  }
}

