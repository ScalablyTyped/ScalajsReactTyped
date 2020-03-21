package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Collection.PresentationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Bullet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorStop
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateImageRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateLineRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateParagraphBulletsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateShapeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateSheetsChartRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateSlideRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateTableRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateVideoRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.CropProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteObjectRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteParagraphBulletsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTableColumnRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTableRowRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Dimension
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.DuplicateObjectRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.GroupObjectsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ImageProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTableColumnsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTableRowsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutPlaceholderIdMapping
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineConnection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.MasterProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.MergeTableCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.NotesProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.OpaqueColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.OptionalColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Outline
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.OutlineFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageBackgroundFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElementProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphMarker
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Placeholder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Range
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Recolor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.RefreshSheetsChartRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllShapesWithImageRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllShapesWithSheetsChartRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceImageRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Request
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.RerouteLineRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.RgbColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shadow
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ShapeBackgroundFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ShapeProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChartProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Size
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SlideProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.StretchedPictureFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SubstringMatchCriteria
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderCell
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderRow
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellBackgroundFill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellLocation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableColumnProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRowProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextContent
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextElement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextRun
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ThemeColorPair
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UngroupObjectsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UnmergeTableCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateImagePropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateLineCategoryRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateLinePropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementAltTextRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementTransformRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementsZOrderRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePagePropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateParagraphStyleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateShapePropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateSlidesPositionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableBorderPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableCellPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableColumnPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableRowPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTextStyleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateVideoPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.VideoProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WeightedFontFamily
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WriteControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slides_ extends js.Object {
  var Presentations: js.UndefOr[PresentationsCollection] = js.undefined
  // Create a new instance of AffineTransform
  def newAffineTransform(): AffineTransform
  // Create a new instance of AutoText
  def newAutoText(): AutoText
  // Create a new instance of BatchUpdatePresentationRequest
  def newBatchUpdatePresentationRequest(): BatchUpdatePresentationRequest
  // Create a new instance of Bullet
  def newBullet(): Bullet
  // Create a new instance of ColorScheme
  def newColorScheme(): ColorScheme
  // Create a new instance of ColorStop
  def newColorStop(): ColorStop
  // Create a new instance of CreateImageRequest
  def newCreateImageRequest(): CreateImageRequest
  // Create a new instance of CreateLineRequest
  def newCreateLineRequest(): CreateLineRequest
  // Create a new instance of CreateParagraphBulletsRequest
  def newCreateParagraphBulletsRequest(): CreateParagraphBulletsRequest
  // Create a new instance of CreateShapeRequest
  def newCreateShapeRequest(): CreateShapeRequest
  // Create a new instance of CreateSheetsChartRequest
  def newCreateSheetsChartRequest(): CreateSheetsChartRequest
  // Create a new instance of CreateSlideRequest
  def newCreateSlideRequest(): CreateSlideRequest
  // Create a new instance of CreateTableRequest
  def newCreateTableRequest(): CreateTableRequest
  // Create a new instance of CreateVideoRequest
  def newCreateVideoRequest(): CreateVideoRequest
  // Create a new instance of CropProperties
  def newCropProperties(): CropProperties
  // Create a new instance of DeleteObjectRequest
  def newDeleteObjectRequest(): DeleteObjectRequest
  // Create a new instance of DeleteParagraphBulletsRequest
  def newDeleteParagraphBulletsRequest(): DeleteParagraphBulletsRequest
  // Create a new instance of DeleteTableColumnRequest
  def newDeleteTableColumnRequest(): DeleteTableColumnRequest
  // Create a new instance of DeleteTableRowRequest
  def newDeleteTableRowRequest(): DeleteTableRowRequest
  // Create a new instance of DeleteTextRequest
  def newDeleteTextRequest(): DeleteTextRequest
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of DuplicateObjectRequest
  def newDuplicateObjectRequest(): DuplicateObjectRequest
  // Create a new instance of Group
  def newGroup(): Group
  // Create a new instance of GroupObjectsRequest
  def newGroupObjectsRequest(): GroupObjectsRequest
  // Create a new instance of Image
  def newImage(): Image
  // Create a new instance of ImageProperties
  def newImageProperties(): ImageProperties
  // Create a new instance of InsertTableColumnsRequest
  def newInsertTableColumnsRequest(): InsertTableColumnsRequest
  // Create a new instance of InsertTableRowsRequest
  def newInsertTableRowsRequest(): InsertTableRowsRequest
  // Create a new instance of InsertTextRequest
  def newInsertTextRequest(): InsertTextRequest
  // Create a new instance of LayoutPlaceholderIdMapping
  def newLayoutPlaceholderIdMapping(): LayoutPlaceholderIdMapping
  // Create a new instance of LayoutProperties
  def newLayoutProperties(): LayoutProperties
  // Create a new instance of LayoutReference
  def newLayoutReference(): LayoutReference
  // Create a new instance of Line
  def newLine(): Line
  // Create a new instance of LineConnection
  def newLineConnection(): LineConnection
  // Create a new instance of LineFill
  def newLineFill(): LineFill
  // Create a new instance of LineProperties
  def newLineProperties(): LineProperties
  // Create a new instance of Link
  def newLink(): Link
  // Create a new instance of MasterProperties
  def newMasterProperties(): MasterProperties
  // Create a new instance of MergeTableCellsRequest
  def newMergeTableCellsRequest(): MergeTableCellsRequest
  // Create a new instance of NotesProperties
  def newNotesProperties(): NotesProperties
  // Create a new instance of OpaqueColor
  def newOpaqueColor(): OpaqueColor
  // Create a new instance of OptionalColor
  def newOptionalColor(): OptionalColor
  // Create a new instance of Outline
  def newOutline(): Outline
  // Create a new instance of OutlineFill
  def newOutlineFill(): OutlineFill
  // Create a new instance of Page
  def newPage(): Page
  // Create a new instance of PageBackgroundFill
  def newPageBackgroundFill(): PageBackgroundFill
  // Create a new instance of PageElement
  def newPageElement(): PageElement
  // Create a new instance of PageElementProperties
  def newPageElementProperties(): PageElementProperties
  // Create a new instance of PageProperties
  def newPageProperties(): PageProperties
  // Create a new instance of ParagraphMarker
  def newParagraphMarker(): ParagraphMarker
  // Create a new instance of ParagraphStyle
  def newParagraphStyle(): ParagraphStyle
  // Create a new instance of Placeholder
  def newPlaceholder(): Placeholder
  // Create a new instance of Presentation
  def newPresentation(): Presentation
  // Create a new instance of Range
  def newRange(): Range
  // Create a new instance of Recolor
  def newRecolor(): Recolor
  // Create a new instance of RefreshSheetsChartRequest
  def newRefreshSheetsChartRequest(): RefreshSheetsChartRequest
  // Create a new instance of ReplaceAllShapesWithImageRequest
  def newReplaceAllShapesWithImageRequest(): ReplaceAllShapesWithImageRequest
  // Create a new instance of ReplaceAllShapesWithSheetsChartRequest
  def newReplaceAllShapesWithSheetsChartRequest(): ReplaceAllShapesWithSheetsChartRequest
  // Create a new instance of ReplaceAllTextRequest
  def newReplaceAllTextRequest(): ReplaceAllTextRequest
  // Create a new instance of ReplaceImageRequest
  def newReplaceImageRequest(): ReplaceImageRequest
  // Create a new instance of Request
  def newRequest(): Request
  // Create a new instance of RerouteLineRequest
  def newRerouteLineRequest(): RerouteLineRequest
  // Create a new instance of RgbColor
  def newRgbColor(): RgbColor
  // Create a new instance of Shadow
  def newShadow(): Shadow
  // Create a new instance of Shape
  def newShape(): Shape
  // Create a new instance of ShapeBackgroundFill
  def newShapeBackgroundFill(): ShapeBackgroundFill
  // Create a new instance of ShapeProperties
  def newShapeProperties(): ShapeProperties
  // Create a new instance of SheetsChart
  def newSheetsChart(): SheetsChart
  // Create a new instance of SheetsChartProperties
  def newSheetsChartProperties(): SheetsChartProperties
  // Create a new instance of Size
  def newSize(): Size
  // Create a new instance of SlideProperties
  def newSlideProperties(): SlideProperties
  // Create a new instance of SolidFill
  def newSolidFill(): SolidFill
  // Create a new instance of StretchedPictureFill
  def newStretchedPictureFill(): StretchedPictureFill
  // Create a new instance of SubstringMatchCriteria
  def newSubstringMatchCriteria(): SubstringMatchCriteria
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TableBorderCell
  def newTableBorderCell(): TableBorderCell
  // Create a new instance of TableBorderFill
  def newTableBorderFill(): TableBorderFill
  // Create a new instance of TableBorderProperties
  def newTableBorderProperties(): TableBorderProperties
  // Create a new instance of TableBorderRow
  def newTableBorderRow(): TableBorderRow
  // Create a new instance of TableCell
  def newTableCell(): TableCell
  // Create a new instance of TableCellBackgroundFill
  def newTableCellBackgroundFill(): TableCellBackgroundFill
  // Create a new instance of TableCellLocation
  def newTableCellLocation(): TableCellLocation
  // Create a new instance of TableCellProperties
  def newTableCellProperties(): TableCellProperties
  // Create a new instance of TableColumnProperties
  def newTableColumnProperties(): TableColumnProperties
  // Create a new instance of TableRange
  def newTableRange(): TableRange
  // Create a new instance of TableRow
  def newTableRow(): TableRow
  // Create a new instance of TableRowProperties
  def newTableRowProperties(): TableRowProperties
  // Create a new instance of TextContent
  def newTextContent(): TextContent
  // Create a new instance of TextElement
  def newTextElement(): TextElement
  // Create a new instance of TextRun
  def newTextRun(): TextRun
  // Create a new instance of TextStyle
  def newTextStyle(): TextStyle
  // Create a new instance of ThemeColorPair
  def newThemeColorPair(): ThemeColorPair
  // Create a new instance of UngroupObjectsRequest
  def newUngroupObjectsRequest(): UngroupObjectsRequest
  // Create a new instance of UnmergeTableCellsRequest
  def newUnmergeTableCellsRequest(): UnmergeTableCellsRequest
  // Create a new instance of UpdateImagePropertiesRequest
  def newUpdateImagePropertiesRequest(): UpdateImagePropertiesRequest
  // Create a new instance of UpdateLineCategoryRequest
  def newUpdateLineCategoryRequest(): UpdateLineCategoryRequest
  // Create a new instance of UpdateLinePropertiesRequest
  def newUpdateLinePropertiesRequest(): UpdateLinePropertiesRequest
  // Create a new instance of UpdatePageElementAltTextRequest
  def newUpdatePageElementAltTextRequest(): UpdatePageElementAltTextRequest
  // Create a new instance of UpdatePageElementTransformRequest
  def newUpdatePageElementTransformRequest(): UpdatePageElementTransformRequest
  // Create a new instance of UpdatePageElementsZOrderRequest
  def newUpdatePageElementsZOrderRequest(): UpdatePageElementsZOrderRequest
  // Create a new instance of UpdatePagePropertiesRequest
  def newUpdatePagePropertiesRequest(): UpdatePagePropertiesRequest
  // Create a new instance of UpdateParagraphStyleRequest
  def newUpdateParagraphStyleRequest(): UpdateParagraphStyleRequest
  // Create a new instance of UpdateShapePropertiesRequest
  def newUpdateShapePropertiesRequest(): UpdateShapePropertiesRequest
  // Create a new instance of UpdateSlidesPositionRequest
  def newUpdateSlidesPositionRequest(): UpdateSlidesPositionRequest
  // Create a new instance of UpdateTableBorderPropertiesRequest
  def newUpdateTableBorderPropertiesRequest(): UpdateTableBorderPropertiesRequest
  // Create a new instance of UpdateTableCellPropertiesRequest
  def newUpdateTableCellPropertiesRequest(): UpdateTableCellPropertiesRequest
  // Create a new instance of UpdateTableColumnPropertiesRequest
  def newUpdateTableColumnPropertiesRequest(): UpdateTableColumnPropertiesRequest
  // Create a new instance of UpdateTableRowPropertiesRequest
  def newUpdateTableRowPropertiesRequest(): UpdateTableRowPropertiesRequest
  // Create a new instance of UpdateTextStyleRequest
  def newUpdateTextStyleRequest(): UpdateTextStyleRequest
  // Create a new instance of UpdateVideoPropertiesRequest
  def newUpdateVideoPropertiesRequest(): UpdateVideoPropertiesRequest
  // Create a new instance of Video
  def newVideo(): Video
  // Create a new instance of VideoProperties
  def newVideoProperties(): VideoProperties
  // Create a new instance of WeightedFontFamily
  def newWeightedFontFamily(): WeightedFontFamily
  // Create a new instance of WordArt
  def newWordArt(): WordArt
  // Create a new instance of WriteControl
  def newWriteControl(): WriteControl
}

object Slides_ {
  @scala.inline
  def apply(
    newAffineTransform: CallbackTo[AffineTransform],
    newAutoText: CallbackTo[AutoText],
    newBatchUpdatePresentationRequest: CallbackTo[BatchUpdatePresentationRequest],
    newBullet: CallbackTo[Bullet],
    newColorScheme: CallbackTo[ColorScheme],
    newColorStop: CallbackTo[ColorStop],
    newCreateImageRequest: CallbackTo[CreateImageRequest],
    newCreateLineRequest: CallbackTo[CreateLineRequest],
    newCreateParagraphBulletsRequest: CallbackTo[CreateParagraphBulletsRequest],
    newCreateShapeRequest: CallbackTo[CreateShapeRequest],
    newCreateSheetsChartRequest: CallbackTo[CreateSheetsChartRequest],
    newCreateSlideRequest: CallbackTo[CreateSlideRequest],
    newCreateTableRequest: CallbackTo[CreateTableRequest],
    newCreateVideoRequest: CallbackTo[CreateVideoRequest],
    newCropProperties: CallbackTo[CropProperties],
    newDeleteObjectRequest: CallbackTo[DeleteObjectRequest],
    newDeleteParagraphBulletsRequest: CallbackTo[DeleteParagraphBulletsRequest],
    newDeleteTableColumnRequest: CallbackTo[DeleteTableColumnRequest],
    newDeleteTableRowRequest: CallbackTo[DeleteTableRowRequest],
    newDeleteTextRequest: CallbackTo[DeleteTextRequest],
    newDimension: CallbackTo[Dimension],
    newDuplicateObjectRequest: CallbackTo[DuplicateObjectRequest],
    newGroup: CallbackTo[Group],
    newGroupObjectsRequest: CallbackTo[GroupObjectsRequest],
    newImage: CallbackTo[Image],
    newImageProperties: CallbackTo[ImageProperties],
    newInsertTableColumnsRequest: CallbackTo[InsertTableColumnsRequest],
    newInsertTableRowsRequest: CallbackTo[InsertTableRowsRequest],
    newInsertTextRequest: CallbackTo[InsertTextRequest],
    newLayoutPlaceholderIdMapping: CallbackTo[LayoutPlaceholderIdMapping],
    newLayoutProperties: CallbackTo[LayoutProperties],
    newLayoutReference: CallbackTo[LayoutReference],
    newLine: CallbackTo[Line],
    newLineConnection: CallbackTo[LineConnection],
    newLineFill: CallbackTo[LineFill],
    newLineProperties: CallbackTo[LineProperties],
    newLink: CallbackTo[Link],
    newMasterProperties: CallbackTo[MasterProperties],
    newMergeTableCellsRequest: CallbackTo[MergeTableCellsRequest],
    newNotesProperties: CallbackTo[NotesProperties],
    newOpaqueColor: CallbackTo[OpaqueColor],
    newOptionalColor: CallbackTo[OptionalColor],
    newOutline: CallbackTo[Outline],
    newOutlineFill: CallbackTo[OutlineFill],
    newPage: CallbackTo[Page],
    newPageBackgroundFill: CallbackTo[PageBackgroundFill],
    newPageElement: CallbackTo[PageElement],
    newPageElementProperties: CallbackTo[PageElementProperties],
    newPageProperties: CallbackTo[PageProperties],
    newParagraphMarker: CallbackTo[ParagraphMarker],
    newParagraphStyle: CallbackTo[ParagraphStyle],
    newPlaceholder: CallbackTo[Placeholder],
    newPresentation: CallbackTo[Presentation],
    newRange: CallbackTo[Range],
    newRecolor: CallbackTo[Recolor],
    newRefreshSheetsChartRequest: CallbackTo[RefreshSheetsChartRequest],
    newReplaceAllShapesWithImageRequest: CallbackTo[ReplaceAllShapesWithImageRequest],
    newReplaceAllShapesWithSheetsChartRequest: CallbackTo[ReplaceAllShapesWithSheetsChartRequest],
    newReplaceAllTextRequest: CallbackTo[ReplaceAllTextRequest],
    newReplaceImageRequest: CallbackTo[ReplaceImageRequest],
    newRequest: CallbackTo[Request],
    newRerouteLineRequest: CallbackTo[RerouteLineRequest],
    newRgbColor: CallbackTo[RgbColor],
    newShadow: CallbackTo[Shadow],
    newShape: CallbackTo[Shape],
    newShapeBackgroundFill: CallbackTo[ShapeBackgroundFill],
    newShapeProperties: CallbackTo[ShapeProperties],
    newSheetsChart: CallbackTo[SheetsChart],
    newSheetsChartProperties: CallbackTo[SheetsChartProperties],
    newSize: CallbackTo[Size],
    newSlideProperties: CallbackTo[SlideProperties],
    newSolidFill: CallbackTo[SolidFill],
    newStretchedPictureFill: CallbackTo[StretchedPictureFill],
    newSubstringMatchCriteria: CallbackTo[SubstringMatchCriteria],
    newTable: CallbackTo[Table],
    newTableBorderCell: CallbackTo[TableBorderCell],
    newTableBorderFill: CallbackTo[TableBorderFill],
    newTableBorderProperties: CallbackTo[TableBorderProperties],
    newTableBorderRow: CallbackTo[TableBorderRow],
    newTableCell: CallbackTo[TableCell],
    newTableCellBackgroundFill: CallbackTo[TableCellBackgroundFill],
    newTableCellLocation: CallbackTo[TableCellLocation],
    newTableCellProperties: CallbackTo[TableCellProperties],
    newTableColumnProperties: CallbackTo[TableColumnProperties],
    newTableRange: CallbackTo[TableRange],
    newTableRow: CallbackTo[TableRow],
    newTableRowProperties: CallbackTo[TableRowProperties],
    newTextContent: CallbackTo[TextContent],
    newTextElement: CallbackTo[TextElement],
    newTextRun: CallbackTo[TextRun],
    newTextStyle: CallbackTo[TextStyle],
    newThemeColorPair: CallbackTo[ThemeColorPair],
    newUngroupObjectsRequest: CallbackTo[UngroupObjectsRequest],
    newUnmergeTableCellsRequest: CallbackTo[UnmergeTableCellsRequest],
    newUpdateImagePropertiesRequest: CallbackTo[UpdateImagePropertiesRequest],
    newUpdateLineCategoryRequest: CallbackTo[UpdateLineCategoryRequest],
    newUpdateLinePropertiesRequest: CallbackTo[UpdateLinePropertiesRequest],
    newUpdatePageElementAltTextRequest: CallbackTo[UpdatePageElementAltTextRequest],
    newUpdatePageElementTransformRequest: CallbackTo[UpdatePageElementTransformRequest],
    newUpdatePageElementsZOrderRequest: CallbackTo[UpdatePageElementsZOrderRequest],
    newUpdatePagePropertiesRequest: CallbackTo[UpdatePagePropertiesRequest],
    newUpdateParagraphStyleRequest: CallbackTo[UpdateParagraphStyleRequest],
    newUpdateShapePropertiesRequest: CallbackTo[UpdateShapePropertiesRequest],
    newUpdateSlidesPositionRequest: CallbackTo[UpdateSlidesPositionRequest],
    newUpdateTableBorderPropertiesRequest: CallbackTo[UpdateTableBorderPropertiesRequest],
    newUpdateTableCellPropertiesRequest: CallbackTo[UpdateTableCellPropertiesRequest],
    newUpdateTableColumnPropertiesRequest: CallbackTo[UpdateTableColumnPropertiesRequest],
    newUpdateTableRowPropertiesRequest: CallbackTo[UpdateTableRowPropertiesRequest],
    newUpdateTextStyleRequest: CallbackTo[UpdateTextStyleRequest],
    newUpdateVideoPropertiesRequest: CallbackTo[UpdateVideoPropertiesRequest],
    newVideo: CallbackTo[Video],
    newVideoProperties: CallbackTo[VideoProperties],
    newWeightedFontFamily: CallbackTo[WeightedFontFamily],
    newWordArt: CallbackTo[WordArt],
    newWriteControl: CallbackTo[WriteControl],
    Presentations: PresentationsCollection = null
  ): Slides_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAffineTransform")(newAffineTransform.toJsFn)
    __obj.updateDynamic("newAutoText")(newAutoText.toJsFn)
    __obj.updateDynamic("newBatchUpdatePresentationRequest")(newBatchUpdatePresentationRequest.toJsFn)
    __obj.updateDynamic("newBullet")(newBullet.toJsFn)
    __obj.updateDynamic("newColorScheme")(newColorScheme.toJsFn)
    __obj.updateDynamic("newColorStop")(newColorStop.toJsFn)
    __obj.updateDynamic("newCreateImageRequest")(newCreateImageRequest.toJsFn)
    __obj.updateDynamic("newCreateLineRequest")(newCreateLineRequest.toJsFn)
    __obj.updateDynamic("newCreateParagraphBulletsRequest")(newCreateParagraphBulletsRequest.toJsFn)
    __obj.updateDynamic("newCreateShapeRequest")(newCreateShapeRequest.toJsFn)
    __obj.updateDynamic("newCreateSheetsChartRequest")(newCreateSheetsChartRequest.toJsFn)
    __obj.updateDynamic("newCreateSlideRequest")(newCreateSlideRequest.toJsFn)
    __obj.updateDynamic("newCreateTableRequest")(newCreateTableRequest.toJsFn)
    __obj.updateDynamic("newCreateVideoRequest")(newCreateVideoRequest.toJsFn)
    __obj.updateDynamic("newCropProperties")(newCropProperties.toJsFn)
    __obj.updateDynamic("newDeleteObjectRequest")(newDeleteObjectRequest.toJsFn)
    __obj.updateDynamic("newDeleteParagraphBulletsRequest")(newDeleteParagraphBulletsRequest.toJsFn)
    __obj.updateDynamic("newDeleteTableColumnRequest")(newDeleteTableColumnRequest.toJsFn)
    __obj.updateDynamic("newDeleteTableRowRequest")(newDeleteTableRowRequest.toJsFn)
    __obj.updateDynamic("newDeleteTextRequest")(newDeleteTextRequest.toJsFn)
    __obj.updateDynamic("newDimension")(newDimension.toJsFn)
    __obj.updateDynamic("newDuplicateObjectRequest")(newDuplicateObjectRequest.toJsFn)
    __obj.updateDynamic("newGroup")(newGroup.toJsFn)
    __obj.updateDynamic("newGroupObjectsRequest")(newGroupObjectsRequest.toJsFn)
    __obj.updateDynamic("newImage")(newImage.toJsFn)
    __obj.updateDynamic("newImageProperties")(newImageProperties.toJsFn)
    __obj.updateDynamic("newInsertTableColumnsRequest")(newInsertTableColumnsRequest.toJsFn)
    __obj.updateDynamic("newInsertTableRowsRequest")(newInsertTableRowsRequest.toJsFn)
    __obj.updateDynamic("newInsertTextRequest")(newInsertTextRequest.toJsFn)
    __obj.updateDynamic("newLayoutPlaceholderIdMapping")(newLayoutPlaceholderIdMapping.toJsFn)
    __obj.updateDynamic("newLayoutProperties")(newLayoutProperties.toJsFn)
    __obj.updateDynamic("newLayoutReference")(newLayoutReference.toJsFn)
    __obj.updateDynamic("newLine")(newLine.toJsFn)
    __obj.updateDynamic("newLineConnection")(newLineConnection.toJsFn)
    __obj.updateDynamic("newLineFill")(newLineFill.toJsFn)
    __obj.updateDynamic("newLineProperties")(newLineProperties.toJsFn)
    __obj.updateDynamic("newLink")(newLink.toJsFn)
    __obj.updateDynamic("newMasterProperties")(newMasterProperties.toJsFn)
    __obj.updateDynamic("newMergeTableCellsRequest")(newMergeTableCellsRequest.toJsFn)
    __obj.updateDynamic("newNotesProperties")(newNotesProperties.toJsFn)
    __obj.updateDynamic("newOpaqueColor")(newOpaqueColor.toJsFn)
    __obj.updateDynamic("newOptionalColor")(newOptionalColor.toJsFn)
    __obj.updateDynamic("newOutline")(newOutline.toJsFn)
    __obj.updateDynamic("newOutlineFill")(newOutlineFill.toJsFn)
    __obj.updateDynamic("newPage")(newPage.toJsFn)
    __obj.updateDynamic("newPageBackgroundFill")(newPageBackgroundFill.toJsFn)
    __obj.updateDynamic("newPageElement")(newPageElement.toJsFn)
    __obj.updateDynamic("newPageElementProperties")(newPageElementProperties.toJsFn)
    __obj.updateDynamic("newPageProperties")(newPageProperties.toJsFn)
    __obj.updateDynamic("newParagraphMarker")(newParagraphMarker.toJsFn)
    __obj.updateDynamic("newParagraphStyle")(newParagraphStyle.toJsFn)
    __obj.updateDynamic("newPlaceholder")(newPlaceholder.toJsFn)
    __obj.updateDynamic("newPresentation")(newPresentation.toJsFn)
    __obj.updateDynamic("newRange")(newRange.toJsFn)
    __obj.updateDynamic("newRecolor")(newRecolor.toJsFn)
    __obj.updateDynamic("newRefreshSheetsChartRequest")(newRefreshSheetsChartRequest.toJsFn)
    __obj.updateDynamic("newReplaceAllShapesWithImageRequest")(newReplaceAllShapesWithImageRequest.toJsFn)
    __obj.updateDynamic("newReplaceAllShapesWithSheetsChartRequest")(newReplaceAllShapesWithSheetsChartRequest.toJsFn)
    __obj.updateDynamic("newReplaceAllTextRequest")(newReplaceAllTextRequest.toJsFn)
    __obj.updateDynamic("newReplaceImageRequest")(newReplaceImageRequest.toJsFn)
    __obj.updateDynamic("newRequest")(newRequest.toJsFn)
    __obj.updateDynamic("newRerouteLineRequest")(newRerouteLineRequest.toJsFn)
    __obj.updateDynamic("newRgbColor")(newRgbColor.toJsFn)
    __obj.updateDynamic("newShadow")(newShadow.toJsFn)
    __obj.updateDynamic("newShape")(newShape.toJsFn)
    __obj.updateDynamic("newShapeBackgroundFill")(newShapeBackgroundFill.toJsFn)
    __obj.updateDynamic("newShapeProperties")(newShapeProperties.toJsFn)
    __obj.updateDynamic("newSheetsChart")(newSheetsChart.toJsFn)
    __obj.updateDynamic("newSheetsChartProperties")(newSheetsChartProperties.toJsFn)
    __obj.updateDynamic("newSize")(newSize.toJsFn)
    __obj.updateDynamic("newSlideProperties")(newSlideProperties.toJsFn)
    __obj.updateDynamic("newSolidFill")(newSolidFill.toJsFn)
    __obj.updateDynamic("newStretchedPictureFill")(newStretchedPictureFill.toJsFn)
    __obj.updateDynamic("newSubstringMatchCriteria")(newSubstringMatchCriteria.toJsFn)
    __obj.updateDynamic("newTable")(newTable.toJsFn)
    __obj.updateDynamic("newTableBorderCell")(newTableBorderCell.toJsFn)
    __obj.updateDynamic("newTableBorderFill")(newTableBorderFill.toJsFn)
    __obj.updateDynamic("newTableBorderProperties")(newTableBorderProperties.toJsFn)
    __obj.updateDynamic("newTableBorderRow")(newTableBorderRow.toJsFn)
    __obj.updateDynamic("newTableCell")(newTableCell.toJsFn)
    __obj.updateDynamic("newTableCellBackgroundFill")(newTableCellBackgroundFill.toJsFn)
    __obj.updateDynamic("newTableCellLocation")(newTableCellLocation.toJsFn)
    __obj.updateDynamic("newTableCellProperties")(newTableCellProperties.toJsFn)
    __obj.updateDynamic("newTableColumnProperties")(newTableColumnProperties.toJsFn)
    __obj.updateDynamic("newTableRange")(newTableRange.toJsFn)
    __obj.updateDynamic("newTableRow")(newTableRow.toJsFn)
    __obj.updateDynamic("newTableRowProperties")(newTableRowProperties.toJsFn)
    __obj.updateDynamic("newTextContent")(newTextContent.toJsFn)
    __obj.updateDynamic("newTextElement")(newTextElement.toJsFn)
    __obj.updateDynamic("newTextRun")(newTextRun.toJsFn)
    __obj.updateDynamic("newTextStyle")(newTextStyle.toJsFn)
    __obj.updateDynamic("newThemeColorPair")(newThemeColorPair.toJsFn)
    __obj.updateDynamic("newUngroupObjectsRequest")(newUngroupObjectsRequest.toJsFn)
    __obj.updateDynamic("newUnmergeTableCellsRequest")(newUnmergeTableCellsRequest.toJsFn)
    __obj.updateDynamic("newUpdateImagePropertiesRequest")(newUpdateImagePropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateLineCategoryRequest")(newUpdateLineCategoryRequest.toJsFn)
    __obj.updateDynamic("newUpdateLinePropertiesRequest")(newUpdateLinePropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdatePageElementAltTextRequest")(newUpdatePageElementAltTextRequest.toJsFn)
    __obj.updateDynamic("newUpdatePageElementTransformRequest")(newUpdatePageElementTransformRequest.toJsFn)
    __obj.updateDynamic("newUpdatePageElementsZOrderRequest")(newUpdatePageElementsZOrderRequest.toJsFn)
    __obj.updateDynamic("newUpdatePagePropertiesRequest")(newUpdatePagePropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateParagraphStyleRequest")(newUpdateParagraphStyleRequest.toJsFn)
    __obj.updateDynamic("newUpdateShapePropertiesRequest")(newUpdateShapePropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateSlidesPositionRequest")(newUpdateSlidesPositionRequest.toJsFn)
    __obj.updateDynamic("newUpdateTableBorderPropertiesRequest")(newUpdateTableBorderPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateTableCellPropertiesRequest")(newUpdateTableCellPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateTableColumnPropertiesRequest")(newUpdateTableColumnPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateTableRowPropertiesRequest")(newUpdateTableRowPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateTextStyleRequest")(newUpdateTextStyleRequest.toJsFn)
    __obj.updateDynamic("newUpdateVideoPropertiesRequest")(newUpdateVideoPropertiesRequest.toJsFn)
    __obj.updateDynamic("newVideo")(newVideo.toJsFn)
    __obj.updateDynamic("newVideoProperties")(newVideoProperties.toJsFn)
    __obj.updateDynamic("newWeightedFontFamily")(newWeightedFontFamily.toJsFn)
    __obj.updateDynamic("newWordArt")(newWordArt.toJsFn)
    __obj.updateDynamic("newWriteControl")(newWriteControl.toJsFn)
    if (Presentations != null) __obj.updateDynamic("Presentations")(Presentations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slides_]
  }
}

