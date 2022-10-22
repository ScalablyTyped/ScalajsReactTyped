package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Ui
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Collection.Presentations.PagesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Collection.PresentationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationResponse
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
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Thumbnail
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
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.EmbeddedChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slides extends StObject {
  
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
object Slides {
  
  inline def apply(
    newAffineTransform: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform],
    newAutoText: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText],
    newBatchUpdatePresentationRequest: CallbackTo[BatchUpdatePresentationRequest],
    newBullet: CallbackTo[Bullet],
    newColorScheme: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme],
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
    newGroup: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group],
    newGroupObjectsRequest: CallbackTo[GroupObjectsRequest],
    newImage: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image],
    newImageProperties: CallbackTo[ImageProperties],
    newInsertTableColumnsRequest: CallbackTo[InsertTableColumnsRequest],
    newInsertTableRowsRequest: CallbackTo[InsertTableRowsRequest],
    newInsertTextRequest: CallbackTo[InsertTextRequest],
    newLayoutPlaceholderIdMapping: CallbackTo[LayoutPlaceholderIdMapping],
    newLayoutProperties: CallbackTo[LayoutProperties],
    newLayoutReference: CallbackTo[LayoutReference],
    newLine: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line],
    newLineConnection: CallbackTo[LineConnection],
    newLineFill: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill],
    newLineProperties: CallbackTo[LineProperties],
    newLink: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link],
    newMasterProperties: CallbackTo[MasterProperties],
    newMergeTableCellsRequest: CallbackTo[MergeTableCellsRequest],
    newNotesProperties: CallbackTo[NotesProperties],
    newOpaqueColor: CallbackTo[OpaqueColor],
    newOptionalColor: CallbackTo[OptionalColor],
    newOutline: CallbackTo[Outline],
    newOutlineFill: CallbackTo[OutlineFill],
    newPage: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page],
    newPageBackgroundFill: CallbackTo[PageBackgroundFill],
    newPageElement: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement],
    newPageElementProperties: CallbackTo[PageElementProperties],
    newPageProperties: CallbackTo[PageProperties],
    newParagraphMarker: CallbackTo[ParagraphMarker],
    newParagraphStyle: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle],
    newPlaceholder: CallbackTo[Placeholder],
    newPresentation: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation],
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
    newShape: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape],
    newShapeBackgroundFill: CallbackTo[ShapeBackgroundFill],
    newShapeProperties: CallbackTo[ShapeProperties],
    newSheetsChart: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart],
    newSheetsChartProperties: CallbackTo[SheetsChartProperties],
    newSize: CallbackTo[Size],
    newSlideProperties: CallbackTo[SlideProperties],
    newSolidFill: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill],
    newStretchedPictureFill: CallbackTo[StretchedPictureFill],
    newSubstringMatchCriteria: CallbackTo[SubstringMatchCriteria],
    newTable: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table],
    newTableBorderCell: CallbackTo[TableBorderCell],
    newTableBorderFill: CallbackTo[TableBorderFill],
    newTableBorderProperties: CallbackTo[TableBorderProperties],
    newTableBorderRow: CallbackTo[TableBorderRow],
    newTableCell: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell],
    newTableCellBackgroundFill: CallbackTo[TableCellBackgroundFill],
    newTableCellLocation: CallbackTo[TableCellLocation],
    newTableCellProperties: CallbackTo[TableCellProperties],
    newTableColumnProperties: CallbackTo[TableColumnProperties],
    newTableRange: CallbackTo[TableRange],
    newTableRow: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow],
    newTableRowProperties: CallbackTo[TableRowProperties],
    newTextContent: CallbackTo[TextContent],
    newTextElement: CallbackTo[TextElement],
    newTextRun: CallbackTo[TextRun],
    newTextStyle: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle],
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
    newVideo: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video],
    newVideoProperties: CallbackTo[VideoProperties],
    newWeightedFontFamily: CallbackTo[WeightedFontFamily],
    newWordArt: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt],
    newWriteControl: CallbackTo[WriteControl]
  ): Slides = {
    val __obj = js.Dynamic.literal(newAffineTransform = newAffineTransform.toJsFn, newAutoText = newAutoText.toJsFn, newBatchUpdatePresentationRequest = newBatchUpdatePresentationRequest.toJsFn, newBullet = newBullet.toJsFn, newColorScheme = newColorScheme.toJsFn, newColorStop = newColorStop.toJsFn, newCreateImageRequest = newCreateImageRequest.toJsFn, newCreateLineRequest = newCreateLineRequest.toJsFn, newCreateParagraphBulletsRequest = newCreateParagraphBulletsRequest.toJsFn, newCreateShapeRequest = newCreateShapeRequest.toJsFn, newCreateSheetsChartRequest = newCreateSheetsChartRequest.toJsFn, newCreateSlideRequest = newCreateSlideRequest.toJsFn, newCreateTableRequest = newCreateTableRequest.toJsFn, newCreateVideoRequest = newCreateVideoRequest.toJsFn, newCropProperties = newCropProperties.toJsFn, newDeleteObjectRequest = newDeleteObjectRequest.toJsFn, newDeleteParagraphBulletsRequest = newDeleteParagraphBulletsRequest.toJsFn, newDeleteTableColumnRequest = newDeleteTableColumnRequest.toJsFn, newDeleteTableRowRequest = newDeleteTableRowRequest.toJsFn, newDeleteTextRequest = newDeleteTextRequest.toJsFn, newDimension = newDimension.toJsFn, newDuplicateObjectRequest = newDuplicateObjectRequest.toJsFn, newGroup = newGroup.toJsFn, newGroupObjectsRequest = newGroupObjectsRequest.toJsFn, newImage = newImage.toJsFn, newImageProperties = newImageProperties.toJsFn, newInsertTableColumnsRequest = newInsertTableColumnsRequest.toJsFn, newInsertTableRowsRequest = newInsertTableRowsRequest.toJsFn, newInsertTextRequest = newInsertTextRequest.toJsFn, newLayoutPlaceholderIdMapping = newLayoutPlaceholderIdMapping.toJsFn, newLayoutProperties = newLayoutProperties.toJsFn, newLayoutReference = newLayoutReference.toJsFn, newLine = newLine.toJsFn, newLineConnection = newLineConnection.toJsFn, newLineFill = newLineFill.toJsFn, newLineProperties = newLineProperties.toJsFn, newLink = newLink.toJsFn, newMasterProperties = newMasterProperties.toJsFn, newMergeTableCellsRequest = newMergeTableCellsRequest.toJsFn, newNotesProperties = newNotesProperties.toJsFn, newOpaqueColor = newOpaqueColor.toJsFn, newOptionalColor = newOptionalColor.toJsFn, newOutline = newOutline.toJsFn, newOutlineFill = newOutlineFill.toJsFn, newPage = newPage.toJsFn, newPageBackgroundFill = newPageBackgroundFill.toJsFn, newPageElement = newPageElement.toJsFn, newPageElementProperties = newPageElementProperties.toJsFn, newPageProperties = newPageProperties.toJsFn, newParagraphMarker = newParagraphMarker.toJsFn, newParagraphStyle = newParagraphStyle.toJsFn, newPlaceholder = newPlaceholder.toJsFn, newPresentation = newPresentation.toJsFn, newRange = newRange.toJsFn, newRecolor = newRecolor.toJsFn, newRefreshSheetsChartRequest = newRefreshSheetsChartRequest.toJsFn, newReplaceAllShapesWithImageRequest = newReplaceAllShapesWithImageRequest.toJsFn, newReplaceAllShapesWithSheetsChartRequest = newReplaceAllShapesWithSheetsChartRequest.toJsFn, newReplaceAllTextRequest = newReplaceAllTextRequest.toJsFn, newReplaceImageRequest = newReplaceImageRequest.toJsFn, newRequest = newRequest.toJsFn, newRerouteLineRequest = newRerouteLineRequest.toJsFn, newRgbColor = newRgbColor.toJsFn, newShadow = newShadow.toJsFn, newShape = newShape.toJsFn, newShapeBackgroundFill = newShapeBackgroundFill.toJsFn, newShapeProperties = newShapeProperties.toJsFn, newSheetsChart = newSheetsChart.toJsFn, newSheetsChartProperties = newSheetsChartProperties.toJsFn, newSize = newSize.toJsFn, newSlideProperties = newSlideProperties.toJsFn, newSolidFill = newSolidFill.toJsFn, newStretchedPictureFill = newStretchedPictureFill.toJsFn, newSubstringMatchCriteria = newSubstringMatchCriteria.toJsFn, newTable = newTable.toJsFn, newTableBorderCell = newTableBorderCell.toJsFn, newTableBorderFill = newTableBorderFill.toJsFn, newTableBorderProperties = newTableBorderProperties.toJsFn, newTableBorderRow = newTableBorderRow.toJsFn, newTableCell = newTableCell.toJsFn, newTableCellBackgroundFill = newTableCellBackgroundFill.toJsFn, newTableCellLocation = newTableCellLocation.toJsFn, newTableCellProperties = newTableCellProperties.toJsFn, newTableColumnProperties = newTableColumnProperties.toJsFn, newTableRange = newTableRange.toJsFn, newTableRow = newTableRow.toJsFn, newTableRowProperties = newTableRowProperties.toJsFn, newTextContent = newTextContent.toJsFn, newTextElement = newTextElement.toJsFn, newTextRun = newTextRun.toJsFn, newTextStyle = newTextStyle.toJsFn, newThemeColorPair = newThemeColorPair.toJsFn, newUngroupObjectsRequest = newUngroupObjectsRequest.toJsFn, newUnmergeTableCellsRequest = newUnmergeTableCellsRequest.toJsFn, newUpdateImagePropertiesRequest = newUpdateImagePropertiesRequest.toJsFn, newUpdateLineCategoryRequest = newUpdateLineCategoryRequest.toJsFn, newUpdateLinePropertiesRequest = newUpdateLinePropertiesRequest.toJsFn, newUpdatePageElementAltTextRequest = newUpdatePageElementAltTextRequest.toJsFn, newUpdatePageElementTransformRequest = newUpdatePageElementTransformRequest.toJsFn, newUpdatePageElementsZOrderRequest = newUpdatePageElementsZOrderRequest.toJsFn, newUpdatePagePropertiesRequest = newUpdatePagePropertiesRequest.toJsFn, newUpdateParagraphStyleRequest = newUpdateParagraphStyleRequest.toJsFn, newUpdateShapePropertiesRequest = newUpdateShapePropertiesRequest.toJsFn, newUpdateSlidesPositionRequest = newUpdateSlidesPositionRequest.toJsFn, newUpdateTableBorderPropertiesRequest = newUpdateTableBorderPropertiesRequest.toJsFn, newUpdateTableCellPropertiesRequest = newUpdateTableCellPropertiesRequest.toJsFn, newUpdateTableColumnPropertiesRequest = newUpdateTableColumnPropertiesRequest.toJsFn, newUpdateTableRowPropertiesRequest = newUpdateTableRowPropertiesRequest.toJsFn, newUpdateTextStyleRequest = newUpdateTextStyleRequest.toJsFn, newUpdateVideoPropertiesRequest = newUpdateVideoPropertiesRequest.toJsFn, newVideo = newVideo.toJsFn, newVideoProperties = newVideoProperties.toJsFn, newWeightedFontFamily = newWeightedFontFamily.toJsFn, newWordArt = newWordArt.toJsFn, newWriteControl = newWriteControl.toJsFn)
    __obj.asInstanceOf[Slides]
  }
  
  @js.native
  sealed trait AlignmentPosition extends StObject
  /**
    * The alignment position to apply.
    */
  @JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
  @js.native
  object AlignmentPosition extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with AlignmentPosition
    
    @js.native
    sealed trait HORIZONTAL_CENTER
      extends StObject
         with AlignmentPosition
    
    @js.native
    sealed trait VERTICAL_CENTER
      extends StObject
         with AlignmentPosition
  }
  
  @js.native
  sealed trait ArrowStyle extends StObject
  /**
    * The kinds of start and end forms with which linear geometry can be rendered.
    *
    * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
    * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
  @js.native
  object ArrowStyle extends StObject {
    
    @js.native
    sealed trait FILL_ARROW
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait FILL_CIRCLE
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait FILL_DIAMOND
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait FILL_SQUARE
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait NONE
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait OPEN_ARROW
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait OPEN_CIRCLE
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait OPEN_DIAMOND
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait OPEN_SQUARE
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait STEALTH_ARROW
      extends StObject
         with ArrowStyle
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with ArrowStyle
  }
  
  @js.native
  sealed trait AutoTextType extends StObject
  /**
    * The types of auto text.
    */
  @JSGlobal("GoogleAppsScript.Slides.AutoTextType")
  @js.native
  object AutoTextType extends StObject {
    
    @js.native
    sealed trait SLIDE_NUMBER
      extends StObject
         with AutoTextType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with AutoTextType
  }
  
  @js.native
  sealed trait CellMergeState extends StObject
  /**
    * The table cell merge states.
    */
  @JSGlobal("GoogleAppsScript.Slides.CellMergeState")
  @js.native
  object CellMergeState extends StObject {
    
    @js.native
    sealed trait HEAD
      extends StObject
         with CellMergeState
    
    @js.native
    sealed trait MERGED
      extends StObject
         with CellMergeState
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with CellMergeState
  }
  
  @js.native
  sealed trait ContentAlignment extends StObject
  /**
    * The content alignments for a Shape or TableCell. The supported alignments
    * correspond to predefined text anchoring types from the ECMA-376 standard.
    *
    * More information on those alignments can be found in the description of
    * the ST_TextAnchoringType simple type in section 20.1.10.59 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
  @js.native
  object ContentAlignment extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with ContentAlignment
    
    @js.native
    sealed trait MIDDLE
      extends StObject
         with ContentAlignment
    
    @js.native
    sealed trait TOP
      extends StObject
         with ContentAlignment
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with ContentAlignment
  }
  
  @js.native
  sealed trait DashStyle extends StObject
  /**
    * The kinds of dashes with which linear geometry can be rendered. These values are based on the
    * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.DashStyle")
  @js.native
  object DashStyle extends StObject {
    
    @js.native
    sealed trait DASH
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait DASH_DOT
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait DOT
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait LONG_DASH
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait LONG_DASH_DOT
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait SOLID
      extends StObject
         with DashStyle
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with DashStyle
  }
  
  @js.native
  sealed trait FillType extends StObject
  /**
    * The kinds of fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.FillType")
  @js.native
  object FillType extends StObject {
    
    @js.native
    sealed trait NONE
      extends StObject
         with FillType
    
    @js.native
    sealed trait SOLID
      extends StObject
         with FillType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with FillType
  }
  
  @js.native
  sealed trait LineCategory extends StObject
  /**
    * The line category.
    *
    * The exact LineType created is determined based on the category and how it's routed to
    * connect to other page elements.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineCategory")
  @js.native
  object LineCategory extends StObject {
    
    @js.native
    sealed trait BENT
      extends StObject
         with LineCategory
    
    @js.native
    sealed trait CURVED
      extends StObject
         with LineCategory
    
    @js.native
    sealed trait STRAIGHT
      extends StObject
         with LineCategory
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with LineCategory
  }
  
  @js.native
  sealed trait LineFillType extends StObject
  /**
    * The kinds of line fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineFillType")
  @js.native
  object LineFillType extends StObject {
    
    @js.native
    sealed trait NONE
      extends StObject
         with LineFillType
    
    @js.native
    sealed trait SOLID
      extends StObject
         with LineFillType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with LineFillType
  }
  
  @js.native
  sealed trait LineType extends StObject
  /**
    * The line types.
    *
    * Derived from a subset of the values of the "ST_ShapeType" simple type in section 20.1.10.55 of
    * "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineType")
  @js.native
  object LineType extends StObject {
    
    @js.native
    sealed trait BENT_CONNECTOR_2
      extends StObject
         with LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_3
      extends StObject
         with LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_4
      extends StObject
         with LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_5
      extends StObject
         with LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_2
      extends StObject
         with LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_3
      extends StObject
         with LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_4
      extends StObject
         with LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_5
      extends StObject
         with LineType
    
    @js.native
    sealed trait STRAIGHT_CONNECTOR_1
      extends StObject
         with LineType
    
    @js.native
    sealed trait STRAIGHT_LINE
      extends StObject
         with LineType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with LineType
  }
  
  @js.native
  sealed trait LinkType extends StObject
  /**
    * The types of a Link.
    */
  @JSGlobal("GoogleAppsScript.Slides.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @js.native
    sealed trait SLIDE_ID
      extends StObject
         with LinkType
    
    @js.native
    sealed trait SLIDE_INDEX
      extends StObject
         with LinkType
    
    @js.native
    sealed trait SLIDE_POSITION
      extends StObject
         with LinkType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with LinkType
    
    @js.native
    sealed trait URL
      extends StObject
         with LinkType
  }
  
  @js.native
  sealed trait ListPreset extends StObject
  /**
    * Preset patterns of glyphs for lists in text.
    *
    * These presets use these glyphs:
    *
    * ARROW: An arrow, ➔, corresponding to a Unicode U+2794 code point
    *
    * ARROW3D: An arrow with 3D shading, ➢, corresponding to a Unicode U+27a2 code point
    *
    * CHECKBOX: A hollow square, ❏, corresponding to a Unicode U+274f code point
    *
    * CIRCLE: A hollow circle, ○, corresponding to a Unicode U+25cb code point
    *
    * DIAMOND: A solid diamond, ◆, corresponding to a Unicode U+25c6 code point
    *
    * `DIAMONDX: A diamond with an 'x', ❖, corresponding to a Unicode U+2756 code point
    *
    * HOLLOWDIAMOND: A hollow diamond, ◇, corresponding to a Unicode U+25c7 code point
    *
    * DISC: A solid circle, ●, corresponding to a Unicode U+25cf code point
    *
    * SQUARE: A solid square, ■, corresponding to a Unicode U+25a0 code point
    *
    * STAR: A star, ★, corresponding to a Unicode U+2605 code point
    *
    * ALPHA: A lowercase letter, like 'a', 'b', or 'c'.
    *
    * UPPERALPHA: An uppercase letter, like 'A', 'B', or 'C'.
    *
    * DIGIT: A number, like '1', '2', or '3'.
    *
    * ZERODIGIT: A number where single digit numbers are prefixed with a zero, like '01', '02',
    *       or '03'. Numbers with more than one digit are not prefixed a zero.
    *
    * ROMAN: A lowercase roman numeral, like 'i', 'ii', or 'iii'.
    *
    * UPPERROMAN: A uppercase roman numeral, like 'I', 'II', or 'III'.
    *
    * LEFTTRIANGLE: A triangle pointing left, ◄, corresponding to a Unicode U+25c4 code
    *       point
    */
  @JSGlobal("GoogleAppsScript.Slides.ListPreset")
  @js.native
  object ListPreset extends StObject {
    
    @js.native
    sealed trait ARROW3D_CIRCLE_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait ARROW_DIAMOND_DISC
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait CHECKBOX
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIAMONDX_ARROW3D_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIAMONDX_HOLLOWDIAMOND_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIAMOND_CIRCLE_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIGIT_ALPHA_ROMAN
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIGIT_ALPHA_ROMAN_PARENS
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DIGIT_NESTED
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait DISC_CIRCLE_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait LEFTTRIANGLE_DIAMOND_DISC
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait STAR_CIRCLE_SQUARE
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait UPPERALPHA_ALPHA_ROMAN
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait UPPERROMAN_UPPERALPHA_DIGIT
      extends StObject
         with ListPreset
    
    @js.native
    sealed trait ZERODIGIT_ALPHA_ROMAN
      extends StObject
         with ListPreset
  }
  
  @js.native
  sealed trait PageBackgroundType extends StObject
  /**
    * The kinds of page backgrounds.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
  @js.native
  object PageBackgroundType extends StObject {
    
    @js.native
    sealed trait NONE
      extends StObject
         with PageBackgroundType
    
    @js.native
    sealed trait PICTURE
      extends StObject
         with PageBackgroundType
    
    @js.native
    sealed trait SOLID
      extends StObject
         with PageBackgroundType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with PageBackgroundType
  }
  
  @js.native
  sealed trait PageElementType extends StObject
  /**
    * The page element type.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageElementType")
  @js.native
  object PageElementType extends StObject {
    
    @js.native
    sealed trait GROUP
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait LINE
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait SHAPE
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait SHEETS_CHART
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait TABLE
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait VIDEO
      extends StObject
         with PageElementType
    
    @js.native
    sealed trait WORD_ART
      extends StObject
         with PageElementType
  }
  
  @js.native
  sealed trait PageType extends StObject
  /**
    * The page types.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageType")
  @js.native
  object PageType extends StObject {
    
    @js.native
    sealed trait LAYOUT
      extends StObject
         with PageType
    
    @js.native
    sealed trait MASTER
      extends StObject
         with PageType
    
    @js.native
    sealed trait SLIDE
      extends StObject
         with PageType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with PageType
  }
  
  @js.native
  sealed trait ParagraphAlignment extends StObject
  /**
    * The types of text alignment for a paragraph.
    */
  @JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with ParagraphAlignment
    
    @js.native
    sealed trait END
      extends StObject
         with ParagraphAlignment
    
    @js.native
    sealed trait JUSTIFIED
      extends StObject
         with ParagraphAlignment
    
    @js.native
    sealed trait START
      extends StObject
         with ParagraphAlignment
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with ParagraphAlignment
  }
  
  @js.native
  sealed trait PlaceholderType extends StObject
  /**
    * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
    * ECMA-376 standard. More information on those shapes can be found in the description of the
    * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
    * Markup Language Reference", part 1 of ECMA-376 5th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
  @js.native
  object PlaceholderType extends StObject {
    
    @js.native
    sealed trait BODY
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait CENTERED_TITLE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait CHART
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait CLIP_ART
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait DATE_AND_TIME
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait DIAGRAM
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait FOOTER
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait HEADER
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait MEDIA
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait NONE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait OBJECT
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait PICTURE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait SLIDE_IMAGE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait SLIDE_NUMBER
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait SUBTITLE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait TABLE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait TITLE
      extends StObject
         with PlaceholderType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with PlaceholderType
  }
  
  @js.native
  sealed trait PredefinedLayout extends StObject
  /**
    * Predefined layouts. These are commonly found layouts in presentations. However, there is no
    * guarantee that these layouts are present in the current master as they could have been deleted or
    * not part of the used theme. Additionally, the placeholders on each layout may have been changed.
    */
  @JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
  @js.native
  object PredefinedLayout extends StObject {
    
    @js.native
    sealed trait BIG_NUMBER
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait BLANK
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait CAPTION_ONLY
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait MAIN_POINT
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait ONE_COLUMN_TEXT
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait SECTION_HEADER
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait SECTION_TITLE_AND_DESCRIPTION
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait TITLE
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait TITLE_AND_BODY
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait TITLE_AND_TWO_COLUMNS
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait TITLE_ONLY
      extends StObject
         with PredefinedLayout
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with PredefinedLayout
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  /**
    * Type of Selection.
    *
    * The SelectionType represents the most specific type of one or more objects that are
    * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
    * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
    * using the Selection.getPageElementRange and the Page can be retrieved from the
    * Selection.getCurrentPage.
    */
  @JSGlobal("GoogleAppsScript.Slides.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @js.native
    sealed trait CURRENT_PAGE
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait NONE
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait PAGE
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait PAGE_ELEMENT
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait TABLE_CELL
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with SelectionType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait ShapeType extends StObject
  /**
    * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
    * More information on those shapes can be found in the description of the "ST_ShapeType" simple
    * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
    * Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @js.native
    sealed trait ARC
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ARROW_EAST
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ARROW_NORTH
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ARROW_NORTH_EAST
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BENT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BENT_UP_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BEVEL
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BLOCK_ARC
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BRACE_PAIR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait BRACKET_PAIR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CAN
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CHEVRON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CHORD
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CLOUD
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CLOUD_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CORNER
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CUBE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CURVED_DOWN_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CURVED_LEFT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CURVED_RIGHT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CURVED_UP_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DECAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DIAGONAL_STRIPE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DIAMOND
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DODECAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DONUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DOUBLE_WAVE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DOWN_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait DOWN_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ELLIPSE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ELLIPSE_RIBBON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ELLIPSE_RIBBON_2
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_ALTERNATE_PROCESS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_COLLATE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_CONNECTOR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DECISION
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DELAY
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DISPLAY
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DOCUMENT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_EXTRACT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_INPUT_OUTPUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_INTERNAL_STORAGE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_DISK
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_DRUM
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_TAPE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MANUAL_INPUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MANUAL_OPERATION
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MERGE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MULTIDOCUMENT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OFFLINE_STORAGE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OFFPAGE_CONNECTOR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_ONLINE_STORAGE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PREDEFINED_PROCESS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PREPARATION
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PROCESS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PUNCHED_CARD
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PUNCHED_TAPE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_SORT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_SUMMING_JUNCTION
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FLOW_CHART_TERMINATOR
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FOLDED_CORNER
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait FRAME
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HALF_FRAME
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HEART
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HEPTAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HEXAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HOME_PLATE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait HORIZONTAL_SCROLL
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait IRREGULAR_SEAL_1
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait IRREGULAR_SEAL_2
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_BRACE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_BRACKET
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_UP_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LEFT_UP_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait LIGHTNING_BOLT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_DIVIDE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_EQUAL
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_MINUS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_MULTIPLY
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_NOT_EQUAL
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MATH_PLUS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait MOON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait NOTCHED_RIGHT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait NO_SMOKING
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait OCTAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait PARALLELOGRAM
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait PENTAGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait PIE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait PLAQUE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait PLUS
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait QUAD_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait QUAD_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIBBON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIBBON_2
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIGHT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIGHT_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIGHT_BRACE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIGHT_BRACKET
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RIGHT_TRIANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ROUND_1_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ROUND_2_DIAGONAL_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ROUND_2_SAME_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait ROUND_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SMILEY_FACE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SNIP_1_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SNIP_2_DIAGONAL_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SNIP_2_SAME_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SNIP_ROUND_RECTANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SPEECH
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STARBURST
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_10
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_12
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_16
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_24
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_32
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_4
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_5
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_6
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_7
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STAR_8
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait STRIPED_RIGHT_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait SUN
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait TEARDROP
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait TEXT_BOX
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait TRAPEZOID
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait TRIANGLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait UP_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait UP_ARROW_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait UP_DOWN_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait UTURN_ARROW
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait VERTICAL_SCROLL
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait WAVE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait WEDGE_ELLIPSE_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait WEDGE_RECTANGLE_CALLOUT
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait WEDGE_ROUND_RECTANGLE_CALLOUT
      extends StObject
         with ShapeType
  }
  
  @js.native
  sealed trait SheetsChartEmbedType extends StObject
  /**
    * The Sheets chart's embed type.
    */
  @JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
  @js.native
  object SheetsChartEmbedType extends StObject {
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with SheetsChartEmbedType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with SheetsChartEmbedType
  }
  
  @js.native
  sealed trait SlideLinkingMode extends StObject
  /**
    * The mode of links between slides.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
  @js.native
  object SlideLinkingMode extends StObject {
    
    @js.native
    sealed trait LINKED
      extends StObject
         with SlideLinkingMode
    
    @js.native
    sealed trait NOT_LINKED
      extends StObject
         with SlideLinkingMode
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with SlideLinkingMode
  }
  
  @js.native
  sealed trait SlidePosition extends StObject
  /**
    * The relative position of a Slide.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlidePosition")
  @js.native
  object SlidePosition extends StObject {
    
    @js.native
    sealed trait FIRST_SLIDE
      extends StObject
         with SlidePosition
    
    @js.native
    sealed trait LAST_SLIDE
      extends StObject
         with SlidePosition
    
    @js.native
    sealed trait NEXT_SLIDE
      extends StObject
         with SlidePosition
    
    @js.native
    sealed trait PREVIOUS_SLIDE
      extends StObject
         with SlidePosition
  }
  
  @js.native
  sealed trait SpacingMode extends StObject
  /**
    * The different modes for paragraph spacing.
    */
  @JSGlobal("GoogleAppsScript.Slides.SpacingMode")
  @js.native
  object SpacingMode extends StObject {
    
    @js.native
    sealed trait COLLAPSE_LISTS
      extends StObject
         with SpacingMode
    
    @js.native
    sealed trait NEVER_COLLAPSE
      extends StObject
         with SpacingMode
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with SpacingMode
  }
  
  @js.native
  sealed trait TextBaselineOffset extends StObject
  /**
    * The text vertical offset from its normal position.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
  @js.native
  object TextBaselineOffset extends StObject {
    
    @js.native
    sealed trait NONE
      extends StObject
         with TextBaselineOffset
    
    @js.native
    sealed trait SUBSCRIPT
      extends StObject
         with TextBaselineOffset
    
    @js.native
    sealed trait SUPERSCRIPT
      extends StObject
         with TextBaselineOffset
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with TextBaselineOffset
  }
  
  @js.native
  sealed trait TextDirection extends StObject
  /**
    * The directions text can flow in.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @js.native
    sealed trait LEFT_TO_RIGHT
      extends StObject
         with TextDirection
    
    @js.native
    sealed trait RIGHT_TO_LEFT
      extends StObject
         with TextDirection
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with TextDirection
  }
  
  @js.native
  sealed trait ThemeColorType extends StObject
  /**
    * The name of an entry in the page's color scheme.
    */
  @JSGlobal("GoogleAppsScript.Slides.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @js.native
    sealed trait ACCENT1
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait ACCENT2
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait ACCENT3
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait ACCENT4
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait ACCENT5
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait ACCENT6
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait DARK1
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait DARK2
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait FOLLOWED_HYPERLINK
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait HYPERLINK
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait LIGHT1
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait LIGHT2
      extends StObject
         with ThemeColorType
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with ThemeColorType
  }
  
  @js.native
  sealed trait VideoSourceType extends StObject
  /**
    * The video source types.
    */
  @JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
  @js.native
  object VideoSourceType extends StObject {
    
    @js.native
    sealed trait UNSUPPORTED
      extends StObject
         with VideoSourceType
    
    @js.native
    sealed trait YOUTUBE
      extends StObject
         with VideoSourceType
  }
  
  /**
    * A 3x3 matrix used to transform source coordinates (x1, y1) into destination coordinates (x2, y2)
    * according to matrix multiplication:
    *
    *     [ x2 ]   [ scaleX shearX translateX ] [ x1 ]
    *     [ y2 ] = [ shearY scaleY translateY ] [ y1 ]
    *     [ 1  ]   [   0      0        1      ] [ 1  ]
    *
    * After transformation,
    *
    *     x2 = scaleX * x1 + shearX * y1 + translateX
    *     y2 = scaleY * y1 + shearY * x1 + translateY
    */
  trait AffineTransform extends StObject {
    
    def getScaleX(): Double
    
    def getScaleY(): Double
    
    def getShearX(): Double
    
    def getShearY(): Double
    
    def getTranslateX(): Double
    
    def getTranslateY(): Double
    
    def toBuilder(): AffineTransformBuilder
  }
  object AffineTransform {
    
    inline def apply(
      getScaleX: CallbackTo[Double],
      getScaleY: CallbackTo[Double],
      getShearX: CallbackTo[Double],
      getShearY: CallbackTo[Double],
      getTranslateX: CallbackTo[Double],
      getTranslateY: CallbackTo[Double],
      toBuilder: CallbackTo[AffineTransformBuilder]
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = {
      val __obj = js.Dynamic.literal(getScaleX = getScaleX.toJsFn, getScaleY = getScaleY.toJsFn, getShearX = getShearX.toJsFn, getShearY = getShearY.toJsFn, getTranslateX = getTranslateX.toJsFn, getTranslateY = getTranslateY.toJsFn, toBuilder = toBuilder.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform](x: Self) {
      
      inline def setGetScaleX(value: CallbackTo[Double]): Self = StObject.set(x, "getScaleX", value.toJsFn)
      
      inline def setGetScaleY(value: CallbackTo[Double]): Self = StObject.set(x, "getScaleY", value.toJsFn)
      
      inline def setGetShearX(value: CallbackTo[Double]): Self = StObject.set(x, "getShearX", value.toJsFn)
      
      inline def setGetShearY(value: CallbackTo[Double]): Self = StObject.set(x, "getShearY", value.toJsFn)
      
      inline def setGetTranslateX(value: CallbackTo[Double]): Self = StObject.set(x, "getTranslateX", value.toJsFn)
      
      inline def setGetTranslateY(value: CallbackTo[Double]): Self = StObject.set(x, "getTranslateY", value.toJsFn)
      
      inline def setToBuilder(value: CallbackTo[AffineTransformBuilder]): Self = StObject.set(x, "toBuilder", value.toJsFn)
    }
  }
  
  /**
    * A builder for AffineTransform objects. Defaults to the identity transform.
    *
    * Call AffineTransformBuilder#build() to get the AffineTransform object.
    *
    *     var transform =
    *         SlidesApp.newAffineTransformBuilder().setScaleX(2.0).setShearY(1.1).build();
    *
    *     The resulting transform matrix is
    *       [ 2.0   0.0   0.0 ]
    *       [ 1.1   1.0   0.0 ]
    *       [  0     0     1  ]
    */
  trait AffineTransformBuilder extends StObject {
    
    def build(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform
    
    def setScaleX(scaleX: Double): AffineTransformBuilder
    
    def setScaleY(scaleY: Double): AffineTransformBuilder
    
    def setShearX(shearX: Double): AffineTransformBuilder
    
    def setShearY(shearY: Double): AffineTransformBuilder
    
    def setTranslateX(translateX: Double): AffineTransformBuilder
    
    def setTranslateY(translateY: Double): AffineTransformBuilder
  }
  object AffineTransformBuilder {
    
    inline def apply(
      build: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform],
      setScaleX: Double => AffineTransformBuilder,
      setScaleY: Double => AffineTransformBuilder,
      setShearX: Double => AffineTransformBuilder,
      setShearY: Double => AffineTransformBuilder,
      setTranslateX: Double => AffineTransformBuilder,
      setTranslateY: Double => AffineTransformBuilder
    ): AffineTransformBuilder = {
      val __obj = js.Dynamic.literal(build = build.toJsFn, setScaleX = js.Any.fromFunction1(setScaleX), setScaleY = js.Any.fromFunction1(setScaleY), setShearX = js.Any.fromFunction1(setShearX), setShearY = js.Any.fromFunction1(setShearY), setTranslateX = js.Any.fromFunction1(setTranslateX), setTranslateY = js.Any.fromFunction1(setTranslateY))
      __obj.asInstanceOf[AffineTransformBuilder]
    }
    
    extension [Self <: AffineTransformBuilder](x: Self) {
      
      inline def setBuild(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform]): Self = StObject.set(x, "build", value.toJsFn)
      
      inline def setSetScaleX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setScaleX", js.Any.fromFunction1(value))
      
      inline def setSetScaleY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setScaleY", js.Any.fromFunction1(value))
      
      inline def setSetShearX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setShearX", js.Any.fromFunction1(value))
      
      inline def setSetShearY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setShearY", js.Any.fromFunction1(value))
      
      inline def setSetTranslateX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setTranslateX", js.Any.fromFunction1(value))
      
      inline def setSetTranslateY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setTranslateY", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An element of text that is dynamically replaced with content that can change over time, such as a
    * slide number.
    */
  trait AutoText extends StObject {
    
    def getAutoTextType(): AutoTextType
    
    def getIndex(): Integer
    
    def getRange(): TextRange
  }
  object AutoText {
    
    inline def apply(
      getAutoTextType: CallbackTo[AutoTextType],
      getIndex: CallbackTo[Integer],
      getRange: CallbackTo[TextRange]
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoText = {
      val __obj = js.Dynamic.literal(getAutoTextType = getAutoTextType.toJsFn, getIndex = getIndex.toJsFn, getRange = getRange.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoText]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoText](x: Self) {
      
      inline def setGetAutoTextType(value: CallbackTo[AutoTextType]): Self = StObject.set(x, "getAutoTextType", value.toJsFn)
      
      inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetRange(value: CallbackTo[TextRange]): Self = StObject.set(x, "getRange", value.toJsFn)
    }
  }
  
  /**
    * Describes the border around an element.
    */
  trait Border extends StObject {
    
    def getDashStyle(): DashStyle
    
    def getLineFill(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFill
    
    def getWeight(): Double
    
    def isVisible(): Boolean
    
    def setDashStyle(style: DashStyle): Border
    
    def setTransparent(): Border
    
    def setWeight(points: Double): Border
  }
  object Border {
    
    inline def apply(
      getDashStyle: CallbackTo[DashStyle],
      getLineFill: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFill],
      getWeight: CallbackTo[Double],
      isVisible: CallbackTo[Boolean],
      setDashStyle: DashStyle => Border,
      setTransparent: CallbackTo[Border],
      setWeight: Double => Border
    ): Border = {
      val __obj = js.Dynamic.literal(getDashStyle = getDashStyle.toJsFn, getLineFill = getLineFill.toJsFn, getWeight = getWeight.toJsFn, isVisible = isVisible.toJsFn, setDashStyle = js.Any.fromFunction1(setDashStyle), setTransparent = setTransparent.toJsFn, setWeight = js.Any.fromFunction1(setWeight))
      __obj.asInstanceOf[Border]
    }
    
    extension [Self <: Border](x: Self) {
      
      inline def setGetDashStyle(value: CallbackTo[DashStyle]): Self = StObject.set(x, "getDashStyle", value.toJsFn)
      
      inline def setGetLineFill(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFill]): Self = StObject.set(x, "getLineFill", value.toJsFn)
      
      inline def setGetWeight(value: CallbackTo[Double]): Self = StObject.set(x, "getWeight", value.toJsFn)
      
      inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
      
      inline def setSetDashStyle(value: DashStyle => Border): Self = StObject.set(x, "setDashStyle", js.Any.fromFunction1(value))
      
      inline def setSetTransparent(value: CallbackTo[Border]): Self = StObject.set(x, "setTransparent", value.toJsFn)
      
      inline def setSetWeight(value: Double => Border): Self = StObject.set(x, "setWeight", js.Any.fromFunction1(value))
    }
  }
  
  object Collection {
    
    object Presentations {
      
      @js.native
      trait PagesCollection extends StObject {
        
        // Gets the latest version of the specified page in the presentation.
        def get(presentationId: String, pageObjectId: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page = js.native
        
        // Generates a thumbnail of the latest version of the specified page in the
        // presentation and returns a URL to the thumbnail image.
        // This request counts as an [expensive read request](/slides/limits) for
        // quota purposes.
        def getThumbnail(presentationId: String, pageObjectId: String): Thumbnail = js.native
        // Generates a thumbnail of the latest version of the specified page in the
        // presentation and returns a URL to the thumbnail image.
        // This request counts as an [expensive read request](/slides/limits) for
        // quota purposes.
        def getThumbnail(presentationId: String, pageObjectId: String, optionalArgs: js.Object): Thumbnail = js.native
      }
    }
    
    trait PresentationsCollection extends StObject {
      
      var Pages: js.UndefOr[PagesCollection] = js.undefined
      
      // Applies one or more updates to the presentation.
      // Each request is validated before
      // being applied. If any request is not valid, then the entire request will
      // fail and nothing will be applied.
      // Some requests have replies to
      // give you some information about how they are applied. Other requests do
      // not need to return information; these each return an empty reply.
      // The order of replies matches that of the requests.
      // For example, suppose you call batchUpdate with four updates, and only the
      // third one returns information. The response would have two empty replies:
      // the reply to the third request, and another empty reply, in that order.
      // Because other users may be editing the presentation, the presentation
      // might not exactly reflect your changes: your changes may
      // be altered with respect to collaborator changes. If there are no
      // collaborators, the presentation should reflect your changes. In any case,
      // the updates in your request are guaranteed to be applied together
      // atomically.
      def batchUpdate(resource: BatchUpdatePresentationRequest, presentationId: String): BatchUpdatePresentationResponse
      
      // Creates a blank presentation using the title given in the request. If a
      // `presentationId` is provided, it is used as the ID of the new presentation.
      // Otherwise, a new ID is generated. Other fields in the request, including
      // any provided content, are ignored.
      // Returns the created presentation.
      def create(resource: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
      
      // Gets the latest version of the specified presentation.
      def get(presentationId: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
    }
    object PresentationsCollection {
      
      inline def apply(
        batchUpdate: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse,
        create: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation,
        get: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
      ): PresentationsCollection = {
        val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction2(batchUpdate), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[PresentationsCollection]
      }
      
      extension [Self <: PresentationsCollection](x: Self) {
        
        inline def setBatchUpdate(value: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse): Self = StObject.set(x, "batchUpdate", js.Any.fromFunction2(value))
        
        inline def setCreate(
          value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
        ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setGet(value: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setPages(value: PagesCollection): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
        
        inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
      }
    }
  }
  
  /**
    * An opaque color
    */
  trait Color extends StObject {
    
    def asRgbColor(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor
    
    def asThemeColor(): ThemeColor
    
    def getColorType(): ColorType
  }
  object Color {
    
    inline def apply(
      asRgbColor: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor],
      asThemeColor: CallbackTo[ThemeColor],
      getColorType: CallbackTo[ColorType]
    ): Color = {
      val __obj = js.Dynamic.literal(asRgbColor = asRgbColor.toJsFn, asThemeColor = asThemeColor.toJsFn, getColorType = getColorType.toJsFn)
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setAsRgbColor(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor]): Self = StObject.set(x, "asRgbColor", value.toJsFn)
      
      inline def setAsThemeColor(value: CallbackTo[ThemeColor]): Self = StObject.set(x, "asThemeColor", value.toJsFn)
      
      inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
    }
  }
  
  /**
    * A color scheme defines a mapping from members of ThemeColorType to the actual colors used
    * to render them.
    */
  @js.native
  trait ColorScheme extends StObject {
    
    def getConcreteColor(theme: ThemeColorType): Color = js.native
    
    def getThemeColors(): js.Array[ThemeColorType] = js.native
    
    def setConcreteColor(`type`: ThemeColorType, color: Color): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    def setConcreteColor(`type`: ThemeColorType, hexColor: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    def setConcreteColor(`type`: ThemeColorType, red: Integer, green: Integer, blue: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
  }
  
  /**
    * The connection site on a PageElement that can connect to a connector.
    */
  trait ConnectionSite extends StObject {
    
    def getIndex(): Integer
    
    def getPageElement(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement
  }
  object ConnectionSite {
    
    inline def apply(
      getIndex: CallbackTo[Integer],
      getPageElement: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]
    ): ConnectionSite = {
      val __obj = js.Dynamic.literal(getIndex = getIndex.toJsFn, getPageElement = getPageElement.toJsFn)
      __obj.asInstanceOf[ConnectionSite]
    }
    
    extension [Self <: ConnectionSite](x: Self) {
      
      inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetPageElement(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]): Self = StObject.set(x, "getPageElement", value.toJsFn)
    }
  }
  
  /**
    * Describes the page element's background
    */
  @js.native
  trait Fill extends StObject {
    
    def getSolidFill(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def getType(): FillType = js.native
    
    def isVisible(): Boolean = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
    
    def setTransparent(): Unit = js.native
  }
  
  /**
    * A collection of PageElements joined as a single unit.
    */
  @js.native
  trait Group extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getChildren(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def ungroup(): Unit = js.native
  }
  
  /**
    * A PageElement representing an image.
    */
  @js.native
  trait Image extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getContentUrl(): String = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSourceUrl(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def replace(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(blobSource: BlobSource, crop: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(imageUrl: String, crop: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
  }
  
  /**
    * A layout in a presentation.
    *
    * Each layout serves as a template for slides that inherit from it, determining how content on
    * those slides is arranged and styled.
    */
  @js.native
  trait Layout extends StObject {
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayoutName(): String = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getMaster(): Master = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * A PageElement representing a line.
    */
  @js.native
  trait Line extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDashStyle(): DashStyle = js.native
    
    def getDescription(): String = js.native
    
    def getEnd(): Point = js.native
    
    def getEndArrow(): ArrowStyle = js.native
    
    def getEndConnection(): ConnectionSite = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLineCategory(): LineCategory = js.native
    
    def getLineFill(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFill = js.native
    
    def getLineType(): LineType = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getStart(): Point = js.native
    
    def getStartArrow(): ArrowStyle = js.native
    
    def getStartConnection(): ConnectionSite = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def isConnector(): Boolean = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def reroute(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setDashStyle(style: DashStyle): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEnd(left: Double, top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def setEnd(point: Point): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEndArrow(style: ArrowStyle): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEndConnection(connectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLineCategory(lineCategory: LineCategory): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStart(left: Double, top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def setStart(point: Point): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStartArrow(style: ArrowStyle): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStartConnection(connectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setWeight(points: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
  }
  
  /**
    * Describes the fill of a line or outline
    */
  @js.native
  trait LineFill extends StObject {
    
    def getFillType(): LineFillType = js.native
    
    def getSolidFill(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  }
  
  /**
    * A hypertext link.
    */
  trait Link extends StObject {
    
    def getLinkType(): LinkType
    
    def getLinkedSlide(): Slide
    
    def getSlideId(): String
    
    def getSlideIndex(): Integer
    
    def getSlidePosition(): SlidePosition
    
    def getUrl(): String
  }
  object Link {
    
    inline def apply(
      getLinkType: CallbackTo[LinkType],
      getLinkedSlide: CallbackTo[Slide],
      getSlideId: CallbackTo[String],
      getSlideIndex: CallbackTo[Integer],
      getSlidePosition: CallbackTo[SlidePosition],
      getUrl: CallbackTo[String]
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = {
      val __obj = js.Dynamic.literal(getLinkType = getLinkType.toJsFn, getLinkedSlide = getLinkedSlide.toJsFn, getSlideId = getSlideId.toJsFn, getSlideIndex = getSlideIndex.toJsFn, getSlidePosition = getSlidePosition.toJsFn, getUrl = getUrl.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link](x: Self) {
      
      inline def setGetLinkType(value: CallbackTo[LinkType]): Self = StObject.set(x, "getLinkType", value.toJsFn)
      
      inline def setGetLinkedSlide(value: CallbackTo[Slide]): Self = StObject.set(x, "getLinkedSlide", value.toJsFn)
      
      inline def setGetSlideId(value: CallbackTo[String]): Self = StObject.set(x, "getSlideId", value.toJsFn)
      
      inline def setGetSlideIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getSlideIndex", value.toJsFn)
      
      inline def setGetSlidePosition(value: CallbackTo[SlidePosition]): Self = StObject.set(x, "getSlidePosition", value.toJsFn)
      
      inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    }
  }
  
  /**
    * A list in the text.
    */
  trait List extends StObject {
    
    def getListId(): String
    
    def getListParagraphs(): js.Array[Paragraph]
  }
  object List {
    
    inline def apply(getListId: CallbackTo[String], getListParagraphs: CallbackTo[js.Array[Paragraph]]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List = {
      val __obj = js.Dynamic.literal(getListId = getListId.toJsFn, getListParagraphs = getListParagraphs.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List](x: Self) {
      
      inline def setGetListId(value: CallbackTo[String]): Self = StObject.set(x, "getListId", value.toJsFn)
      
      inline def setGetListParagraphs(value: CallbackTo[js.Array[Paragraph]]): Self = StObject.set(x, "getListParagraphs", value.toJsFn)
    }
  }
  
  /**
    * The list styling for a range of text.
    */
  trait ListStyle extends StObject {
    
    def applyListPreset(listPreset: ListPreset): ListStyle
    
    def getGlyph(): String
    
    def getList(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List
    
    def getNestingLevel(): Integer
    
    def isInList(): Boolean
    
    def removeFromList(): ListStyle
  }
  object ListStyle {
    
    inline def apply(
      applyListPreset: ListPreset => ListStyle,
      getGlyph: CallbackTo[String],
      getList: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List],
      getNestingLevel: CallbackTo[Integer],
      isInList: CallbackTo[Boolean],
      removeFromList: CallbackTo[ListStyle]
    ): ListStyle = {
      val __obj = js.Dynamic.literal(applyListPreset = js.Any.fromFunction1(applyListPreset), getGlyph = getGlyph.toJsFn, getList = getList.toJsFn, getNestingLevel = getNestingLevel.toJsFn, isInList = isInList.toJsFn, removeFromList = removeFromList.toJsFn)
      __obj.asInstanceOf[ListStyle]
    }
    
    extension [Self <: ListStyle](x: Self) {
      
      inline def setApplyListPreset(value: ListPreset => ListStyle): Self = StObject.set(x, "applyListPreset", js.Any.fromFunction1(value))
      
      inline def setGetGlyph(value: CallbackTo[String]): Self = StObject.set(x, "getGlyph", value.toJsFn)
      
      inline def setGetList(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.List]): Self = StObject.set(x, "getList", value.toJsFn)
      
      inline def setGetNestingLevel(value: CallbackTo[Integer]): Self = StObject.set(x, "getNestingLevel", value.toJsFn)
      
      inline def setIsInList(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInList", value.toJsFn)
      
      inline def setRemoveFromList(value: CallbackTo[ListStyle]): Self = StObject.set(x, "removeFromList", value.toJsFn)
    }
  }
  
  /**
    * A master in a presentation.
    *
    * Masters contains all common page elements and the common properties for a set of layouts. They
    * serve three purposes:
    *
    * Placeholder shapes on a master contain the default text styles and shape properties of all
    *       placeholder shapes on pages that use that master.
    *
    * The properties of a master page define the common page properties inherited by its layouts.
    *
    * Any other shapes on the master slide appear on all slides using that master, regardless of
    *       their layout.
    */
  @js.native
  trait Master extends StObject {
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayouts(): js.Array[Layout] = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * A notes master in a presentation.
    *
    * Notes masters define the default text styles and page elements for all notes pages. Notes
    * masters are read-only.
    */
  @js.native
  trait NotesMaster extends StObject {
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
  }
  
  /**
    * A notes page in a presentation.
    *
    * These pages contain the content for presentation handouts, including a a shape that contains
    * the slide's speaker notes. Each slide has one corresponding notes page. Only the text in the
    * speaker notes shape can be modified.
    */
  @js.native
  trait NotesPage extends StObject {
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getSpeakerNotesShape(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  }
  
  /**
    * A page in a presentation.
    */
  @js.native
  trait Page extends StObject {
    
    def asLayout(): Layout = js.native
    
    def asMaster(): Master = js.native
    
    def asSlide(): Slide = js.native
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * Describes the page's background
    */
  @js.native
  trait PageBackground extends StObject {
    
    def getPictureFill(): PictureFill = js.native
    
    def getSolidFill(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def getType(): PageBackgroundType = js.native
    
    def isVisible(): Boolean = js.native
    
    def setPictureFill(blobSource: BlobSource): Unit = js.native
    def setPictureFill(imageUrl: String): Unit = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
    
    def setTransparent(): Unit = js.native
  }
  
  /**
    * A visual element rendered on a page.
    */
  @js.native
  trait PageElement extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def asGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def asImage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def asLine(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def asShape(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def asSheetsChart(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def asTable(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def asVideo(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def asWordArt(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
  }
  
  /**
    * A collection of one or more PageElement instances.
    */
  trait PageElementRange extends StObject {
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]
  }
  object PageElementRange {
    
    inline def apply(
      getPageElements: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]]
    ): PageElementRange = {
      val __obj = js.Dynamic.literal(getPageElements = getPageElements.toJsFn)
      __obj.asInstanceOf[PageElementRange]
    }
    
    extension [Self <: PageElementRange](x: Self) {
      
      inline def setGetPageElements(value: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]]): Self = StObject.set(x, "getPageElements", value.toJsFn)
    }
  }
  
  /**
    * A collection of one or more Page instances.
    */
  trait PageRange extends StObject {
    
    def getPages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page]
  }
  object PageRange {
    
    inline def apply(getPages: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page]]): PageRange = {
      val __obj = js.Dynamic.literal(getPages = getPages.toJsFn)
      __obj.asInstanceOf[PageRange]
    }
    
    extension [Self <: PageRange](x: Self) {
      
      inline def setGetPages(value: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page]]): Self = StObject.set(x, "getPages", value.toJsFn)
    }
  }
  
  /**
    * A segment of text terminated by a newline character.
    */
  trait Paragraph extends StObject {
    
    def getIndex(): Integer
    
    def getRange(): TextRange
  }
  object Paragraph {
    
    inline def apply(getIndex: CallbackTo[Integer], getRange: CallbackTo[TextRange]): Paragraph = {
      val __obj = js.Dynamic.literal(getIndex = getIndex.toJsFn, getRange = getRange.toJsFn)
      __obj.asInstanceOf[Paragraph]
    }
    
    extension [Self <: Paragraph](x: Self) {
      
      inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetRange(value: CallbackTo[TextRange]): Self = StObject.set(x, "getRange", value.toJsFn)
    }
  }
  
  /**
    * The styles of text that apply to entire paragraphs.
    *
    * Read methods in this class return null if the corresponding TextRange spans
    * multiple paragraphs, and those paragraphs have different values for the read method being called.
    * To avoid this, query for paragraph styles using the TextRange returned by the Paragraph.getRange() method.
    */
  trait ParagraphStyle extends StObject {
    
    def getIndentEnd(): Double
    
    def getIndentFirstLine(): Double
    
    def getIndentStart(): Double
    
    def getLineSpacing(): Double
    
    def getParagraphAlignment(): ParagraphAlignment
    
    def getSpaceAbove(): Double
    
    def getSpaceBelow(): Double
    
    def getSpacingMode(): SpacingMode
    
    def getTextDirection(): TextDirection
    
    def setIndentEnd(indent: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setIndentFirstLine(indent: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setIndentStart(indent: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setLineSpacing(spacing: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setParagraphAlignment(alignment: ParagraphAlignment): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setSpaceAbove(space: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setSpaceBelow(space: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setSpacingMode(mode: SpacingMode): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    
    def setTextDirection(direction: TextDirection): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
  }
  object ParagraphStyle {
    
    inline def apply(
      getIndentEnd: CallbackTo[Double],
      getIndentFirstLine: CallbackTo[Double],
      getIndentStart: CallbackTo[Double],
      getLineSpacing: CallbackTo[Double],
      getParagraphAlignment: CallbackTo[ParagraphAlignment],
      getSpaceAbove: CallbackTo[Double],
      getSpaceBelow: CallbackTo[Double],
      getSpacingMode: CallbackTo[SpacingMode],
      getTextDirection: CallbackTo[TextDirection],
      setIndentEnd: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setIndentFirstLine: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setIndentStart: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setLineSpacing: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setParagraphAlignment: ParagraphAlignment => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpaceAbove: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpaceBelow: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpacingMode: SpacingMode => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setTextDirection: TextDirection => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = {
      val __obj = js.Dynamic.literal(getIndentEnd = getIndentEnd.toJsFn, getIndentFirstLine = getIndentFirstLine.toJsFn, getIndentStart = getIndentStart.toJsFn, getLineSpacing = getLineSpacing.toJsFn, getParagraphAlignment = getParagraphAlignment.toJsFn, getSpaceAbove = getSpaceAbove.toJsFn, getSpaceBelow = getSpaceBelow.toJsFn, getSpacingMode = getSpacingMode.toJsFn, getTextDirection = getTextDirection.toJsFn, setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle](x: Self) {
      
      inline def setGetIndentEnd(value: CallbackTo[Double]): Self = StObject.set(x, "getIndentEnd", value.toJsFn)
      
      inline def setGetIndentFirstLine(value: CallbackTo[Double]): Self = StObject.set(x, "getIndentFirstLine", value.toJsFn)
      
      inline def setGetIndentStart(value: CallbackTo[Double]): Self = StObject.set(x, "getIndentStart", value.toJsFn)
      
      inline def setGetLineSpacing(value: CallbackTo[Double]): Self = StObject.set(x, "getLineSpacing", value.toJsFn)
      
      inline def setGetParagraphAlignment(value: CallbackTo[ParagraphAlignment]): Self = StObject.set(x, "getParagraphAlignment", value.toJsFn)
      
      inline def setGetSpaceAbove(value: CallbackTo[Double]): Self = StObject.set(x, "getSpaceAbove", value.toJsFn)
      
      inline def setGetSpaceBelow(value: CallbackTo[Double]): Self = StObject.set(x, "getSpaceBelow", value.toJsFn)
      
      inline def setGetSpacingMode(value: CallbackTo[SpacingMode]): Self = StObject.set(x, "getSpacingMode", value.toJsFn)
      
      inline def setGetTextDirection(value: CallbackTo[TextDirection]): Self = StObject.set(x, "getTextDirection", value.toJsFn)
      
      inline def setSetIndentEnd(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentEnd", js.Any.fromFunction1(value))
      
      inline def setSetIndentFirstLine(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentFirstLine", js.Any.fromFunction1(value))
      
      inline def setSetIndentStart(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentStart", js.Any.fromFunction1(value))
      
      inline def setSetLineSpacing(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setLineSpacing", js.Any.fromFunction1(value))
      
      inline def setSetParagraphAlignment(
        value: ParagraphAlignment => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
      ): Self = StObject.set(x, "setParagraphAlignment", js.Any.fromFunction1(value))
      
      inline def setSetSpaceAbove(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpaceAbove", js.Any.fromFunction1(value))
      
      inline def setSetSpaceBelow(value: Double => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpaceBelow", js.Any.fromFunction1(value))
      
      inline def setSetSpacingMode(value: SpacingMode => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpacingMode", js.Any.fromFunction1(value))
      
      inline def setSetTextDirection(value: TextDirection => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setTextDirection", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A fill that renders an image that's stretched to the dimensions of its container.
    */
  trait PictureFill extends StObject {
    
    def getAs(contentType: String): Blob
    
    def getBlob(): Blob
    
    def getContentUrl(): String
    
    def getSourceUrl(): String
  }
  object PictureFill {
    
    inline def apply(
      getAs: String => Blob,
      getBlob: CallbackTo[Blob],
      getContentUrl: CallbackTo[String],
      getSourceUrl: CallbackTo[String]
    ): PictureFill = {
      val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = getBlob.toJsFn, getContentUrl = getContentUrl.toJsFn, getSourceUrl = getSourceUrl.toJsFn)
      __obj.asInstanceOf[PictureFill]
    }
    
    extension [Self <: PictureFill](x: Self) {
      
      inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
      
      inline def setGetBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "getBlob", value.toJsFn)
      
      inline def setGetContentUrl(value: CallbackTo[String]): Self = StObject.set(x, "getContentUrl", value.toJsFn)
      
      inline def setGetSourceUrl(value: CallbackTo[String]): Self = StObject.set(x, "getSourceUrl", value.toJsFn)
    }
  }
  
  /**
    * A point representing a location.
    */
  trait Point extends StObject {
    
    def getX(): Double
    
    def getY(): Double
  }
  object Point {
    
    inline def apply(getX: CallbackTo[Double], getY: CallbackTo[Double]): Point = {
      val __obj = js.Dynamic.literal(getX = getX.toJsFn, getY = getY.toJsFn)
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
      
      inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
    }
  }
  
  /**
    * A presentation.
    */
  @js.native
  trait Presentation extends StObject {
    
    def addEditor(emailAddress: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def addEditor(user: User): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addEditors(emailAddresses: js.Array[String]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addViewer(emailAddress: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def addViewer(user: User): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addViewers(emailAddresses: js.Array[String]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def appendSlide(): Slide = js.native
    def appendSlide(layout: Layout): Slide = js.native
    def appendSlide(predefinedLayout: PredefinedLayout): Slide = js.native
    def appendSlide(slide: Slide): Slide = js.native
    def appendSlide(slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
    
    def getEditors(): js.Array[User] = js.native
    
    def getId(): String = js.native
    
    def getLayouts(): js.Array[Layout] = js.native
    
    def getMasters(): js.Array[Master] = js.native
    
    def getName(): String = js.native
    
    def getNotesMaster(): NotesMaster = js.native
    
    def getNotesPageHeight(): Double = js.native
    
    def getNotesPageWidth(): Double = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageHeight(): Double = js.native
    
    def getPageWidth(): Double = js.native
    
    def getSelection(): Selection = js.native
    
    def getSlideById(id: String): Slide = js.native
    
    def getSlides(): js.Array[Slide] = js.native
    
    def getUrl(): String = js.native
    
    def getViewers(): js.Array[User] = js.native
    
    def insertSlide(insertionIndex: Integer): Slide = js.native
    def insertSlide(insertionIndex: Integer, layout: Layout): Slide = js.native
    def insertSlide(insertionIndex: Integer, predefinedLayout: PredefinedLayout): Slide = js.native
    def insertSlide(insertionIndex: Integer, slide: Slide): Slide = js.native
    def insertSlide(insertionIndex: Integer, slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
    
    def removeEditor(emailAddress: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def removeEditor(user: User): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def removeViewer(emailAddress: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def removeViewer(user: User): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def saveAndClose(): Unit = js.native
    
    def setName(name: String): Unit = js.native
  }
  
  object Schema {
    
    trait AffineTransform extends StObject {
      
      var scaleX: js.UndefOr[Double] = js.undefined
      
      var scaleY: js.UndefOr[Double] = js.undefined
      
      var shearX: js.UndefOr[Double] = js.undefined
      
      var shearY: js.UndefOr[Double] = js.undefined
      
      var translateX: js.UndefOr[Double] = js.undefined
      
      var translateY: js.UndefOr[Double] = js.undefined
      
      var unit: js.UndefOr[String] = js.undefined
    }
    object AffineTransform {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform](x: Self) {
        
        inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
        
        inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
        
        inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
        
        inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
        
        inline def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
        
        inline def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
        
        inline def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
        
        inline def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
        
        inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
        
        inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
        
        inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
        
        inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
        
        inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
    
    trait AutoText extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var style: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AutoText {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait BatchUpdatePresentationRequest extends StObject {
      
      var requests: js.UndefOr[js.Array[Request]] = js.undefined
      
      var writeControl: js.UndefOr[WriteControl] = js.undefined
    }
    object BatchUpdatePresentationRequest {
      
      inline def apply(): BatchUpdatePresentationRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdatePresentationRequest]
      }
      
      extension [Self <: BatchUpdatePresentationRequest](x: Self) {
        
        inline def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
        
        inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
        
        inline def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value*))
        
        inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    trait BatchUpdatePresentationResponse extends StObject {
      
      var presentationId: js.UndefOr[String] = js.undefined
      
      var replies: js.UndefOr[js.Array[Response]] = js.undefined
      
      var writeControl: js.UndefOr[WriteControl] = js.undefined
    }
    object BatchUpdatePresentationResponse {
      
      inline def apply(): BatchUpdatePresentationResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdatePresentationResponse]
      }
      
      extension [Self <: BatchUpdatePresentationResponse](x: Self) {
        
        inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
        
        inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
        
        inline def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        inline def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value*))
        
        inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    trait Bullet extends StObject {
      
      var bulletStyle: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
      
      var glyph: js.UndefOr[String] = js.undefined
      
      var listId: js.UndefOr[String] = js.undefined
      
      var nestingLevel: js.UndefOr[Double] = js.undefined
    }
    object Bullet {
      
      inline def apply(): Bullet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Bullet]
      }
      
      extension [Self <: Bullet](x: Self) {
        
        inline def setBulletStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
        
        inline def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
        
        inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
        
        inline def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
      }
    }
    
    trait ColorScheme extends StObject {
      
      var colors: js.UndefOr[js.Array[ThemeColorPair]] = js.undefined
    }
    object ColorScheme {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme](x: Self) {
        
        inline def setColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value*))
      }
    }
    
    trait ColorStop extends StObject {
      
      var alpha: js.UndefOr[Double] = js.undefined
      
      var color: js.UndefOr[OpaqueColor] = js.undefined
      
      var position: js.UndefOr[Double] = js.undefined
    }
    object ColorStop {
      
      inline def apply(): ColorStop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColorStop]
      }
      
      extension [Self <: ColorStop](x: Self) {
        
        inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        inline def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    trait CreateImageRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object CreateImageRequest {
      
      inline def apply(): CreateImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateImageRequest]
      }
      
      extension [Self <: CreateImageRequest](x: Self) {
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait CreateImageResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateImageResponse {
      
      inline def apply(): CreateImageResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateImageResponse]
      }
      
      extension [Self <: CreateImageResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateLineRequest extends StObject {
      
      var category: js.UndefOr[String] = js.undefined
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var lineCategory: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateLineRequest {
      
      inline def apply(): CreateLineRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateLineRequest]
      }
      
      extension [Self <: CreateLineRequest](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateLineResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateLineResponse {
      
      inline def apply(): CreateLineResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateLineResponse]
      }
      
      extension [Self <: CreateLineResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateParagraphBulletsRequest extends StObject {
      
      var bulletPreset: js.UndefOr[String] = js.undefined
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var textRange: js.UndefOr[Range] = js.undefined
    }
    object CreateParagraphBulletsRequest {
      
      inline def apply(): CreateParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateParagraphBulletsRequest]
      }
      
      extension [Self <: CreateParagraphBulletsRequest](x: Self) {
        
        inline def setBulletPreset(value: String): Self = StObject.set(x, "bulletPreset", value.asInstanceOf[js.Any])
        
        inline def setBulletPresetUndefined: Self = StObject.set(x, "bulletPreset", js.undefined)
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    trait CreateShapeRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var shapeType: js.UndefOr[String] = js.undefined
    }
    object CreateShapeRequest {
      
      inline def apply(): CreateShapeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateShapeRequest]
      }
      
      extension [Self <: CreateShapeRequest](x: Self) {
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
        
        inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
      }
    }
    
    trait CreateShapeResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateShapeResponse {
      
      inline def apply(): CreateShapeResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateShapeResponse]
      }
      
      extension [Self <: CreateShapeResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateSheetsChartRequest extends StObject {
      
      var chartId: js.UndefOr[Double] = js.undefined
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var linkingMode: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var spreadsheetId: js.UndefOr[String] = js.undefined
    }
    object CreateSheetsChartRequest {
      
      inline def apply(): CreateSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSheetsChartRequest]
      }
      
      extension [Self <: CreateSheetsChartRequest](x: Self) {
        
        inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
        
        inline def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    trait CreateSheetsChartResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateSheetsChartResponse {
      
      inline def apply(): CreateSheetsChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSheetsChartResponse]
      }
      
      extension [Self <: CreateSheetsChartResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateSlideRequest extends StObject {
      
      var insertionIndex: js.UndefOr[Double] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.undefined
      
      var slideLayoutReference: js.UndefOr[LayoutReference] = js.undefined
    }
    object CreateSlideRequest {
      
      inline def apply(): CreateSlideRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSlideRequest]
      }
      
      extension [Self <: CreateSlideRequest](x: Self) {
        
        inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = StObject.set(x, "placeholderIdMappings", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderIdMappingsUndefined: Self = StObject.set(x, "placeholderIdMappings", js.undefined)
        
        inline def setPlaceholderIdMappingsVarargs(value: LayoutPlaceholderIdMapping*): Self = StObject.set(x, "placeholderIdMappings", js.Array(value*))
        
        inline def setSlideLayoutReference(value: LayoutReference): Self = StObject.set(x, "slideLayoutReference", value.asInstanceOf[js.Any])
        
        inline def setSlideLayoutReferenceUndefined: Self = StObject.set(x, "slideLayoutReference", js.undefined)
      }
    }
    
    trait CreateSlideResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateSlideResponse {
      
      inline def apply(): CreateSlideResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSlideResponse]
      }
      
      extension [Self <: CreateSlideResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateTableRequest extends StObject {
      
      var columns: js.UndefOr[Double] = js.undefined
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
    }
    object CreateTableRequest {
      
      inline def apply(): CreateTableRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateTableRequest]
      }
      
      extension [Self <: CreateTableRequest](x: Self) {
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      }
    }
    
    trait CreateTableResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateTableResponse {
      
      inline def apply(): CreateTableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateTableResponse]
      }
      
      extension [Self <: CreateTableResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CreateVideoRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var source: js.UndefOr[String] = js.undefined
    }
    object CreateVideoRequest {
      
      inline def apply(): CreateVideoRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateVideoRequest]
      }
      
      extension [Self <: CreateVideoRequest](x: Self) {
        
        inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    trait CreateVideoResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object CreateVideoResponse {
      
      inline def apply(): CreateVideoResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateVideoResponse]
      }
      
      extension [Self <: CreateVideoResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait CropProperties extends StObject {
      
      var angle: js.UndefOr[Double] = js.undefined
      
      var bottomOffset: js.UndefOr[Double] = js.undefined
      
      var leftOffset: js.UndefOr[Double] = js.undefined
      
      var rightOffset: js.UndefOr[Double] = js.undefined
      
      var topOffset: js.UndefOr[Double] = js.undefined
    }
    object CropProperties {
      
      inline def apply(): CropProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CropProperties]
      }
      
      extension [Self <: CropProperties](x: Self) {
        
        inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
        
        inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
        
        inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        inline def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
        
        inline def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
        
        inline def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
        
        inline def setRightOffset(value: Double): Self = StObject.set(x, "rightOffset", value.asInstanceOf[js.Any])
        
        inline def setRightOffsetUndefined: Self = StObject.set(x, "rightOffset", js.undefined)
        
        inline def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      }
    }
    
    trait DeleteObjectRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object DeleteObjectRequest {
      
      inline def apply(): DeleteObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteObjectRequest]
      }
      
      extension [Self <: DeleteObjectRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait DeleteParagraphBulletsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var textRange: js.UndefOr[Range] = js.undefined
    }
    object DeleteParagraphBulletsRequest {
      
      inline def apply(): DeleteParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteParagraphBulletsRequest]
      }
      
      extension [Self <: DeleteParagraphBulletsRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    trait DeleteTableColumnRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var tableObjectId: js.UndefOr[String] = js.undefined
    }
    object DeleteTableColumnRequest {
      
      inline def apply(): DeleteTableColumnRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableColumnRequest]
      }
      
      extension [Self <: DeleteTableColumnRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    trait DeleteTableRowRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var tableObjectId: js.UndefOr[String] = js.undefined
    }
    object DeleteTableRowRequest {
      
      inline def apply(): DeleteTableRowRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableRowRequest]
      }
      
      extension [Self <: DeleteTableRowRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    trait DeleteTextRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var textRange: js.UndefOr[Range] = js.undefined
    }
    object DeleteTextRequest {
      
      inline def apply(): DeleteTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTextRequest]
      }
      
      extension [Self <: DeleteTextRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    trait Dimension extends StObject {
      
      var magnitude: js.UndefOr[Double] = js.undefined
      
      var unit: js.UndefOr[String] = js.undefined
    }
    object Dimension {
      
      inline def apply(): Dimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dimension]
      }
      
      extension [Self <: Dimension](x: Self) {
        
        inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
        
        inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
        
        inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
    
    trait DuplicateObjectRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var objectIds: js.UndefOr[js.Object] = js.undefined
    }
    object DuplicateObjectRequest {
      
      inline def apply(): DuplicateObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateObjectRequest]
      }
      
      extension [Self <: DuplicateObjectRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setObjectIds(value: js.Object): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
        
        inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
      }
    }
    
    trait DuplicateObjectResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object DuplicateObjectResponse {
      
      inline def apply(): DuplicateObjectResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateObjectResponse]
      }
      
      extension [Self <: DuplicateObjectResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait Group extends StObject {
      
      var children: js.UndefOr[
            js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
          ] = js.undefined
    }
    object Group {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group](x: Self) {
        
        inline def setChildren(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement*): Self = StObject.set(x, "children", js.Array(value*))
      }
    }
    
    trait GroupObjectsRequest extends StObject {
      
      var childrenObjectIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var groupObjectId: js.UndefOr[String] = js.undefined
    }
    object GroupObjectsRequest {
      
      inline def apply(): GroupObjectsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupObjectsRequest]
      }
      
      extension [Self <: GroupObjectsRequest](x: Self) {
        
        inline def setChildrenObjectIds(value: js.Array[String]): Self = StObject.set(x, "childrenObjectIds", value.asInstanceOf[js.Any])
        
        inline def setChildrenObjectIdsUndefined: Self = StObject.set(x, "childrenObjectIds", js.undefined)
        
        inline def setChildrenObjectIdsVarargs(value: String*): Self = StObject.set(x, "childrenObjectIds", js.Array(value*))
        
        inline def setGroupObjectId(value: String): Self = StObject.set(x, "groupObjectId", value.asInstanceOf[js.Any])
        
        inline def setGroupObjectIdUndefined: Self = StObject.set(x, "groupObjectId", js.undefined)
      }
    }
    
    trait GroupObjectsResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object GroupObjectsResponse {
      
      inline def apply(): GroupObjectsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupObjectsResponse]
      }
      
      extension [Self <: GroupObjectsResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait Image extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.undefined
      
      var imageProperties: js.UndefOr[ImageProperties] = js.undefined
      
      var sourceUrl: js.UndefOr[String] = js.undefined
    }
    object Image {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image](x: Self) {
        
        inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        inline def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
        
        inline def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
        
        inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
        
        inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
      }
    }
    
    trait ImageProperties extends StObject {
      
      var brightness: js.UndefOr[Double] = js.undefined
      
      var contrast: js.UndefOr[Double] = js.undefined
      
      var cropProperties: js.UndefOr[CropProperties] = js.undefined
      
      var link: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.undefined
      
      var outline: js.UndefOr[Outline] = js.undefined
      
      var recolor: js.UndefOr[Recolor] = js.undefined
      
      var shadow: js.UndefOr[Shadow] = js.undefined
      
      var transparency: js.UndefOr[Double] = js.undefined
    }
    object ImageProperties {
      
      inline def apply(): ImageProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageProperties]
      }
      
      extension [Self <: ImageProperties](x: Self) {
        
        inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
        
        inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
        
        inline def setCropProperties(value: CropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
        
        inline def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
        
        inline def setLink(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        inline def setRecolor(value: Recolor): Self = StObject.set(x, "recolor", value.asInstanceOf[js.Any])
        
        inline def setRecolorUndefined: Self = StObject.set(x, "recolor", js.undefined)
        
        inline def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
        
        inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
        
        inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
        
        inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      }
    }
    
    trait InsertTableColumnsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var insertRight: js.UndefOr[Boolean] = js.undefined
      
      var number: js.UndefOr[Double] = js.undefined
      
      var tableObjectId: js.UndefOr[String] = js.undefined
    }
    object InsertTableColumnsRequest {
      
      inline def apply(): InsertTableColumnsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableColumnsRequest]
      }
      
      extension [Self <: InsertTableColumnsRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
        
        inline def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
        
        inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
        
        inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    trait InsertTableRowsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var insertBelow: js.UndefOr[Boolean] = js.undefined
      
      var number: js.UndefOr[Double] = js.undefined
      
      var tableObjectId: js.UndefOr[String] = js.undefined
    }
    object InsertTableRowsRequest {
      
      inline def apply(): InsertTableRowsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableRowsRequest]
      }
      
      extension [Self <: InsertTableRowsRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
        
        inline def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
        
        inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
        
        inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    trait InsertTextRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var insertionIndex: js.UndefOr[Double] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object InsertTextRequest {
      
      inline def apply(): InsertTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTextRequest]
      }
      
      extension [Self <: InsertTextRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait LayoutPlaceholderIdMapping extends StObject {
      
      var layoutPlaceholder: js.UndefOr[Placeholder] = js.undefined
      
      var layoutPlaceholderObjectId: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object LayoutPlaceholderIdMapping {
      
      inline def apply(): LayoutPlaceholderIdMapping = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutPlaceholderIdMapping]
      }
      
      extension [Self <: LayoutPlaceholderIdMapping](x: Self) {
        
        inline def setLayoutPlaceholder(value: Placeholder): Self = StObject.set(x, "layoutPlaceholder", value.asInstanceOf[js.Any])
        
        inline def setLayoutPlaceholderObjectId(value: String): Self = StObject.set(x, "layoutPlaceholderObjectId", value.asInstanceOf[js.Any])
        
        inline def setLayoutPlaceholderObjectIdUndefined: Self = StObject.set(x, "layoutPlaceholderObjectId", js.undefined)
        
        inline def setLayoutPlaceholderUndefined: Self = StObject.set(x, "layoutPlaceholder", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait LayoutProperties extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var masterObjectId: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object LayoutProperties {
      
      inline def apply(): LayoutProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutProperties]
      }
      
      extension [Self <: LayoutProperties](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
        
        inline def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait LayoutReference extends StObject {
      
      var layoutId: js.UndefOr[String] = js.undefined
      
      var predefinedLayout: js.UndefOr[String] = js.undefined
    }
    object LayoutReference {
      
      inline def apply(): LayoutReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutReference]
      }
      
      extension [Self <: LayoutReference](x: Self) {
        
        inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
        
        inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
        
        inline def setPredefinedLayout(value: String): Self = StObject.set(x, "predefinedLayout", value.asInstanceOf[js.Any])
        
        inline def setPredefinedLayoutUndefined: Self = StObject.set(x, "predefinedLayout", js.undefined)
      }
    }
    
    trait Line extends StObject {
      
      var lineCategory: js.UndefOr[String] = js.undefined
      
      var lineProperties: js.UndefOr[LineProperties] = js.undefined
      
      var lineType: js.UndefOr[String] = js.undefined
    }
    object Line {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line](x: Self) {
        
        inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        inline def setLineProperties(value: LineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
        
        inline def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
        
        inline def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
        
        inline def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
      }
    }
    
    trait LineConnection extends StObject {
      
      var connectedObjectId: js.UndefOr[String] = js.undefined
      
      var connectionSiteIndex: js.UndefOr[Double] = js.undefined
    }
    object LineConnection {
      
      inline def apply(): LineConnection = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LineConnection]
      }
      
      extension [Self <: LineConnection](x: Self) {
        
        inline def setConnectedObjectId(value: String): Self = StObject.set(x, "connectedObjectId", value.asInstanceOf[js.Any])
        
        inline def setConnectedObjectIdUndefined: Self = StObject.set(x, "connectedObjectId", js.undefined)
        
        inline def setConnectionSiteIndex(value: Double): Self = StObject.set(x, "connectionSiteIndex", value.asInstanceOf[js.Any])
        
        inline def setConnectionSiteIndexUndefined: Self = StObject.set(x, "connectionSiteIndex", js.undefined)
      }
    }
    
    trait LineFill extends StObject {
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
    }
    object LineFill {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill](x: Self) {
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    trait LineProperties extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var endArrow: js.UndefOr[String] = js.undefined
      
      var endConnection: js.UndefOr[LineConnection] = js.undefined
      
      var lineFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill] = js.undefined
      
      var link: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.undefined
      
      var startArrow: js.UndefOr[String] = js.undefined
      
      var startConnection: js.UndefOr[LineConnection] = js.undefined
      
      var weight: js.UndefOr[Dimension] = js.undefined
    }
    object LineProperties {
      
      inline def apply(): LineProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LineProperties]
      }
      
      extension [Self <: LineProperties](x: Self) {
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
        
        inline def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
        
        inline def setEndConnection(value: LineConnection): Self = StObject.set(x, "endConnection", value.asInstanceOf[js.Any])
        
        inline def setEndConnectionUndefined: Self = StObject.set(x, "endConnection", js.undefined)
        
        inline def setLineFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill): Self = StObject.set(x, "lineFill", value.asInstanceOf[js.Any])
        
        inline def setLineFillUndefined: Self = StObject.set(x, "lineFill", js.undefined)
        
        inline def setLink(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
        
        inline def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
        
        inline def setStartConnection(value: LineConnection): Self = StObject.set(x, "startConnection", value.asInstanceOf[js.Any])
        
        inline def setStartConnectionUndefined: Self = StObject.set(x, "startConnection", js.undefined)
        
        inline def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait Link extends StObject {
      
      var pageObjectId: js.UndefOr[String] = js.undefined
      
      var relativeLink: js.UndefOr[String] = js.undefined
      
      var slideIndex: js.UndefOr[Double] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Link {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link](x: Self) {
        
        inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
        
        inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
        
        inline def setRelativeLink(value: String): Self = StObject.set(x, "relativeLink", value.asInstanceOf[js.Any])
        
        inline def setRelativeLinkUndefined: Self = StObject.set(x, "relativeLink", js.undefined)
        
        inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
        
        inline def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait List extends StObject {
      
      var listId: js.UndefOr[String] = js.undefined
      
      var nestingLevel: js.UndefOr[js.Object] = js.undefined
    }
    object List {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.List = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.List]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.List](x: Self) {
        
        inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
        
        inline def setNestingLevel(value: js.Object): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
      }
    }
    
    trait MasterProperties extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
    }
    object MasterProperties {
      
      inline def apply(): MasterProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MasterProperties]
      }
      
      extension [Self <: MasterProperties](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      }
    }
    
    trait MergeTableCellsRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var tableRange: js.UndefOr[TableRange] = js.undefined
    }
    object MergeTableCellsRequest {
      
      inline def apply(): MergeTableCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MergeTableCellsRequest]
      }
      
      extension [Self <: MergeTableCellsRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    trait NestingLevel extends StObject {
      
      var bulletStyle: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
    }
    object NestingLevel {
      
      inline def apply(): NestingLevel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NestingLevel]
      }
      
      extension [Self <: NestingLevel](x: Self) {
        
        inline def setBulletStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
        
        inline def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
      }
    }
    
    trait NotesProperties extends StObject {
      
      var speakerNotesObjectId: js.UndefOr[String] = js.undefined
    }
    object NotesProperties {
      
      inline def apply(): NotesProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NotesProperties]
      }
      
      extension [Self <: NotesProperties](x: Self) {
        
        inline def setSpeakerNotesObjectId(value: String): Self = StObject.set(x, "speakerNotesObjectId", value.asInstanceOf[js.Any])
        
        inline def setSpeakerNotesObjectIdUndefined: Self = StObject.set(x, "speakerNotesObjectId", js.undefined)
      }
    }
    
    trait OpaqueColor extends StObject {
      
      var rgbColor: js.UndefOr[RgbColor] = js.undefined
      
      var themeColor: js.UndefOr[String] = js.undefined
    }
    object OpaqueColor {
      
      inline def apply(): OpaqueColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OpaqueColor]
      }
      
      extension [Self <: OpaqueColor](x: Self) {
        
        inline def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
        
        inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
        
        inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
        
        inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
      }
    }
    
    trait OptionalColor extends StObject {
      
      var opaqueColor: js.UndefOr[OpaqueColor] = js.undefined
    }
    object OptionalColor {
      
      inline def apply(): OptionalColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OptionalColor]
      }
      
      extension [Self <: OptionalColor](x: Self) {
        
        inline def setOpaqueColor(value: OpaqueColor): Self = StObject.set(x, "opaqueColor", value.asInstanceOf[js.Any])
        
        inline def setOpaqueColorUndefined: Self = StObject.set(x, "opaqueColor", js.undefined)
      }
    }
    
    trait Outline extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var outlineFill: js.UndefOr[OutlineFill] = js.undefined
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var weight: js.UndefOr[Dimension] = js.undefined
    }
    object Outline {
      
      inline def apply(): Outline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Outline]
      }
      
      extension [Self <: Outline](x: Self) {
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setOutlineFill(value: OutlineFill): Self = StObject.set(x, "outlineFill", value.asInstanceOf[js.Any])
        
        inline def setOutlineFillUndefined: Self = StObject.set(x, "outlineFill", js.undefined)
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait OutlineFill extends StObject {
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
    }
    object OutlineFill {
      
      inline def apply(): OutlineFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OutlineFill]
      }
      
      extension [Self <: OutlineFill](x: Self) {
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    trait Page extends StObject {
      
      var layoutProperties: js.UndefOr[LayoutProperties] = js.undefined
      
      var masterProperties: js.UndefOr[MasterProperties] = js.undefined
      
      var notesProperties: js.UndefOr[NotesProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var pageElements: js.UndefOr[
            js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
          ] = js.undefined
      
      var pageProperties: js.UndefOr[PageProperties] = js.undefined
      
      var pageType: js.UndefOr[String] = js.undefined
      
      var revisionId: js.UndefOr[String] = js.undefined
      
      var slideProperties: js.UndefOr[SlideProperties] = js.undefined
    }
    object Page {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page](x: Self) {
        
        inline def setLayoutProperties(value: LayoutProperties): Self = StObject.set(x, "layoutProperties", value.asInstanceOf[js.Any])
        
        inline def setLayoutPropertiesUndefined: Self = StObject.set(x, "layoutProperties", js.undefined)
        
        inline def setMasterProperties(value: MasterProperties): Self = StObject.set(x, "masterProperties", value.asInstanceOf[js.Any])
        
        inline def setMasterPropertiesUndefined: Self = StObject.set(x, "masterProperties", js.undefined)
        
        inline def setNotesProperties(value: NotesProperties): Self = StObject.set(x, "notesProperties", value.asInstanceOf[js.Any])
        
        inline def setNotesPropertiesUndefined: Self = StObject.set(x, "notesProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setPageElements(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]): Self = StObject.set(x, "pageElements", value.asInstanceOf[js.Any])
        
        inline def setPageElementsUndefined: Self = StObject.set(x, "pageElements", js.undefined)
        
        inline def setPageElementsVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement*): Self = StObject.set(x, "pageElements", js.Array(value*))
        
        inline def setPageProperties(value: PageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
        
        inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
        
        inline def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
        
        inline def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
        
        inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
        
        inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
        
        inline def setSlideProperties(value: SlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
        
        inline def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
      }
    }
    
    trait PageBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
      
      var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.undefined
    }
    object PageBackgroundFill {
      
      inline def apply(): PageBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageBackgroundFill]
      }
      
      extension [Self <: PageBackgroundFill](x: Self) {
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
        
        inline def setStretchedPictureFill(value: StretchedPictureFill): Self = StObject.set(x, "stretchedPictureFill", value.asInstanceOf[js.Any])
        
        inline def setStretchedPictureFillUndefined: Self = StObject.set(x, "stretchedPictureFill", js.undefined)
      }
    }
    
    trait PageElement extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var elementGroup: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group] = js.undefined
      
      var image: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image] = js.undefined
      
      var line: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var shape: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape] = js.undefined
      
      var sheetsChart: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart] = js.undefined
      
      var size: js.UndefOr[Size] = js.undefined
      
      var table: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var transform: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
      
      var video: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video] = js.undefined
      
      var wordArt: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt] = js.undefined
    }
    object PageElement {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setElementGroup(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
        
        inline def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
        
        inline def setImage(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setLine(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setShape(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        inline def setSheetsChart(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
        
        inline def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
        
        inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setTable(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTransform(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        inline def setVideo(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
        
        inline def setWordArt(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
        
        inline def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
      }
    }
    
    trait PageElementProperties extends StObject {
      
      var pageObjectId: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Size] = js.undefined
      
      var transform: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
    }
    object PageElementProperties {
      
      inline def apply(): PageElementProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageElementProperties]
      }
      
      extension [Self <: PageElementProperties](x: Self) {
        
        inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
        
        inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
        
        inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setTransform(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    trait PageProperties extends StObject {
      
      var colorScheme: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme] = js.undefined
      
      var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.undefined
    }
    object PageProperties {
      
      inline def apply(): PageProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageProperties]
      }
      
      extension [Self <: PageProperties](x: Self) {
        
        inline def setColorScheme(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
        
        inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
        
        inline def setPageBackgroundFill(value: PageBackgroundFill): Self = StObject.set(x, "pageBackgroundFill", value.asInstanceOf[js.Any])
        
        inline def setPageBackgroundFillUndefined: Self = StObject.set(x, "pageBackgroundFill", js.undefined)
      }
    }
    
    trait ParagraphMarker extends StObject {
      
      var bullet: js.UndefOr[Bullet] = js.undefined
      
      var style: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.undefined
    }
    object ParagraphMarker {
      
      inline def apply(): ParagraphMarker = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphMarker]
      }
      
      extension [Self <: ParagraphMarker](x: Self) {
        
        inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
        
        inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
        
        inline def setStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    trait ParagraphStyle extends StObject {
      
      var alignment: js.UndefOr[String] = js.undefined
      
      var direction: js.UndefOr[String] = js.undefined
      
      var indentEnd: js.UndefOr[Dimension] = js.undefined
      
      var indentFirstLine: js.UndefOr[Dimension] = js.undefined
      
      var indentStart: js.UndefOr[Dimension] = js.undefined
      
      var lineSpacing: js.UndefOr[Double] = js.undefined
      
      var spaceAbove: js.UndefOr[Dimension] = js.undefined
      
      var spaceBelow: js.UndefOr[Dimension] = js.undefined
      
      var spacingMode: js.UndefOr[String] = js.undefined
    }
    object ParagraphStyle {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle](x: Self) {
        
        inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        inline def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
        
        inline def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
        
        inline def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
        
        inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
        
        inline def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
        
        inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
        
        inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
        
        inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
        
        inline def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
        
        inline def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
        
        inline def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
        
        inline def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
        
        inline def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
        
        inline def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
      }
    }
    
    trait Placeholder extends StObject {
      
      var index: js.UndefOr[Double] = js.undefined
      
      var parentObjectId: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Placeholder {
      
      inline def apply(): Placeholder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Placeholder]
      }
      
      extension [Self <: Placeholder](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setParentObjectId(value: String): Self = StObject.set(x, "parentObjectId", value.asInstanceOf[js.Any])
        
        inline def setParentObjectIdUndefined: Self = StObject.set(x, "parentObjectId", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Presentation extends StObject {
      
      var layouts: js.UndefOr[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
      
      var locale: js.UndefOr[String] = js.undefined
      
      var masters: js.UndefOr[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
      
      var notesMaster: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page] = js.undefined
      
      var pageSize: js.UndefOr[Size] = js.undefined
      
      var presentationId: js.UndefOr[String] = js.undefined
      
      var revisionId: js.UndefOr[String] = js.undefined
      
      var slides: js.UndefOr[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Presentation {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation](x: Self) {
        
        inline def setLayouts(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
        
        inline def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
        
        inline def setLayoutsVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "layouts", js.Array(value*))
        
        inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setMasters(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "masters", value.asInstanceOf[js.Any])
        
        inline def setMastersUndefined: Self = StObject.set(x, "masters", js.undefined)
        
        inline def setMastersVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "masters", js.Array(value*))
        
        inline def setNotesMaster(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page): Self = StObject.set(x, "notesMaster", value.asInstanceOf[js.Any])
        
        inline def setNotesMasterUndefined: Self = StObject.set(x, "notesMaster", js.undefined)
        
        inline def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
        
        inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
        
        inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
        
        inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
        
        inline def setSlides(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
        
        inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
        
        inline def setSlidesVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "slides", js.Array(value*))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait Range extends StObject {
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Range {
      
      inline def apply(): Range = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Range]
      }
      
      extension [Self <: Range](x: Self) {
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Recolor extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.undefined
    }
    object Recolor {
      
      inline def apply(): Recolor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Recolor]
      }
      
      extension [Self <: Recolor](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRecolorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "recolorStops", value.asInstanceOf[js.Any])
        
        inline def setRecolorStopsUndefined: Self = StObject.set(x, "recolorStops", js.undefined)
        
        inline def setRecolorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "recolorStops", js.Array(value*))
      }
    }
    
    trait RefreshSheetsChartRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object RefreshSheetsChartRequest {
      
      inline def apply(): RefreshSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RefreshSheetsChartRequest]
      }
      
      extension [Self <: RefreshSheetsChartRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait ReplaceAllShapesWithImageRequest extends StObject {
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
      
      var imageReplaceMethod: js.UndefOr[String] = js.undefined
      
      var imageUrl: js.UndefOr[String] = js.undefined
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var replaceMethod: js.UndefOr[String] = js.undefined
    }
    object ReplaceAllShapesWithImageRequest {
      
      inline def apply(): ReplaceAllShapesWithImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
      }
      
      extension [Self <: ReplaceAllShapesWithImageRequest](x: Self) {
        
        inline def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        inline def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
        
        inline def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        inline def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        inline def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value*))
        
        inline def setReplaceMethod(value: String): Self = StObject.set(x, "replaceMethod", value.asInstanceOf[js.Any])
        
        inline def setReplaceMethodUndefined: Self = StObject.set(x, "replaceMethod", js.undefined)
      }
    }
    
    trait ReplaceAllShapesWithImageResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.undefined
    }
    object ReplaceAllShapesWithImageResponse {
      
      inline def apply(): ReplaceAllShapesWithImageResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
      }
      
      extension [Self <: ReplaceAllShapesWithImageResponse](x: Self) {
        
        inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    trait ReplaceAllShapesWithSheetsChartRequest extends StObject {
      
      var chartId: js.UndefOr[Double] = js.undefined
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
      
      var linkingMode: js.UndefOr[String] = js.undefined
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var spreadsheetId: js.UndefOr[String] = js.undefined
    }
    object ReplaceAllShapesWithSheetsChartRequest {
      
      inline def apply(): ReplaceAllShapesWithSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
      }
      
      extension [Self <: ReplaceAllShapesWithSheetsChartRequest](x: Self) {
        
        inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        inline def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        inline def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
        
        inline def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
        
        inline def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        inline def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        inline def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value*))
        
        inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    trait ReplaceAllShapesWithSheetsChartResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.undefined
    }
    object ReplaceAllShapesWithSheetsChartResponse {
      
      inline def apply(): ReplaceAllShapesWithSheetsChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
      }
      
      extension [Self <: ReplaceAllShapesWithSheetsChartResponse](x: Self) {
        
        inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    trait ReplaceAllTextRequest extends StObject {
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var replaceText: js.UndefOr[String] = js.undefined
    }
    object ReplaceAllTextRequest {
      
      inline def apply(): ReplaceAllTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextRequest]
      }
      
      extension [Self <: ReplaceAllTextRequest](x: Self) {
        
        inline def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        inline def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        inline def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        inline def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value*))
        
        inline def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
        
        inline def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
      }
    }
    
    trait ReplaceAllTextResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.undefined
    }
    object ReplaceAllTextResponse {
      
      inline def apply(): ReplaceAllTextResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextResponse]
      }
      
      extension [Self <: ReplaceAllTextResponse](x: Self) {
        
        inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    trait ReplaceImageRequest extends StObject {
      
      var imageObjectId: js.UndefOr[String] = js.undefined
      
      var imageReplaceMethod: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object ReplaceImageRequest {
      
      inline def apply(): ReplaceImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceImageRequest]
      }
      
      extension [Self <: ReplaceImageRequest](x: Self) {
        
        inline def setImageObjectId(value: String): Self = StObject.set(x, "imageObjectId", value.asInstanceOf[js.Any])
        
        inline def setImageObjectIdUndefined: Self = StObject.set(x, "imageObjectId", js.undefined)
        
        inline def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
        
        inline def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait Request extends StObject {
      
      var createImage: js.UndefOr[CreateImageRequest] = js.undefined
      
      var createLine: js.UndefOr[CreateLineRequest] = js.undefined
      
      var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
      
      var createShape: js.UndefOr[CreateShapeRequest] = js.undefined
      
      var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.undefined
      
      var createSlide: js.UndefOr[CreateSlideRequest] = js.undefined
      
      var createTable: js.UndefOr[CreateTableRequest] = js.undefined
      
      var createVideo: js.UndefOr[CreateVideoRequest] = js.undefined
      
      var deleteObject: js.UndefOr[DeleteObjectRequest] = js.undefined
      
      var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
      
      var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
      
      var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
      
      var deleteText: js.UndefOr[DeleteTextRequest] = js.undefined
      
      var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.undefined
      
      var groupObjects: js.UndefOr[GroupObjectsRequest] = js.undefined
      
      var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.undefined
      
      var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.undefined
      
      var insertText: js.UndefOr[InsertTextRequest] = js.undefined
      
      var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.undefined
      
      var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.undefined
      
      var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.undefined
      
      var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.undefined
      
      var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
      
      var replaceImage: js.UndefOr[ReplaceImageRequest] = js.undefined
      
      var rerouteLine: js.UndefOr[RerouteLineRequest] = js.undefined
      
      var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.undefined
      
      var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.undefined
      
      var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.undefined
      
      var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.undefined
      
      var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.undefined
      
      var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.undefined
      
      var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.undefined
      
      var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.undefined
      
      var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.undefined
      
      var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
      
      var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.undefined
      
      var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.undefined
      
      var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.undefined
      
      var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.undefined
      
      var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.undefined
      
      var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.undefined
      
      var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
      
      var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.undefined
    }
    object Request {
      
      inline def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setCreateImage(value: CreateImageRequest): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
        
        inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
        
        inline def setCreateLine(value: CreateLineRequest): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
        
        inline def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
        
        inline def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
        
        inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
        
        inline def setCreateShape(value: CreateShapeRequest): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
        
        inline def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
        
        inline def setCreateSheetsChart(value: CreateSheetsChartRequest): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
        
        inline def setCreateSlide(value: CreateSlideRequest): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
        
        inline def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
        
        inline def setCreateTable(value: CreateTableRequest): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
        
        inline def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
        
        inline def setCreateVideo(value: CreateVideoRequest): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
        
        inline def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
        
        inline def setDeleteObject(value: DeleteObjectRequest): Self = StObject.set(x, "deleteObject", value.asInstanceOf[js.Any])
        
        inline def setDeleteObjectUndefined: Self = StObject.set(x, "deleteObject", js.undefined)
        
        inline def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
        
        inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
        
        inline def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
        
        inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
        
        inline def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
        
        inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
        
        inline def setDeleteText(value: DeleteTextRequest): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
        
        inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
        
        inline def setDuplicateObject(value: DuplicateObjectRequest): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
        
        inline def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
        
        inline def setGroupObjects(value: GroupObjectsRequest): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
        
        inline def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
        
        inline def setInsertTableColumns(value: InsertTableColumnsRequest): Self = StObject.set(x, "insertTableColumns", value.asInstanceOf[js.Any])
        
        inline def setInsertTableColumnsUndefined: Self = StObject.set(x, "insertTableColumns", js.undefined)
        
        inline def setInsertTableRows(value: InsertTableRowsRequest): Self = StObject.set(x, "insertTableRows", value.asInstanceOf[js.Any])
        
        inline def setInsertTableRowsUndefined: Self = StObject.set(x, "insertTableRows", js.undefined)
        
        inline def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
        
        inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
        
        inline def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
        
        inline def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
        
        inline def setRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = StObject.set(x, "refreshSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setRefreshSheetsChartUndefined: Self = StObject.set(x, "refreshSheetsChart", js.undefined)
        
        inline def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
        
        inline def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
        
        inline def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
        
        inline def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
        
        inline def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
        
        inline def setRerouteLine(value: RerouteLineRequest): Self = StObject.set(x, "rerouteLine", value.asInstanceOf[js.Any])
        
        inline def setRerouteLineUndefined: Self = StObject.set(x, "rerouteLine", js.undefined)
        
        inline def setUngroupObjects(value: UngroupObjectsRequest): Self = StObject.set(x, "ungroupObjects", value.asInstanceOf[js.Any])
        
        inline def setUngroupObjectsUndefined: Self = StObject.set(x, "ungroupObjects", js.undefined)
        
        inline def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
        
        inline def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
        
        inline def setUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = StObject.set(x, "updateImageProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateImagePropertiesUndefined: Self = StObject.set(x, "updateImageProperties", js.undefined)
        
        inline def setUpdateLineCategory(value: UpdateLineCategoryRequest): Self = StObject.set(x, "updateLineCategory", value.asInstanceOf[js.Any])
        
        inline def setUpdateLineCategoryUndefined: Self = StObject.set(x, "updateLineCategory", js.undefined)
        
        inline def setUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = StObject.set(x, "updateLineProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateLinePropertiesUndefined: Self = StObject.set(x, "updateLineProperties", js.undefined)
        
        inline def setUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = StObject.set(x, "updatePageElementAltText", value.asInstanceOf[js.Any])
        
        inline def setUpdatePageElementAltTextUndefined: Self = StObject.set(x, "updatePageElementAltText", js.undefined)
        
        inline def setUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = StObject.set(x, "updatePageElementTransform", value.asInstanceOf[js.Any])
        
        inline def setUpdatePageElementTransformUndefined: Self = StObject.set(x, "updatePageElementTransform", js.undefined)
        
        inline def setUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = StObject.set(x, "updatePageElementsZOrder", value.asInstanceOf[js.Any])
        
        inline def setUpdatePageElementsZOrderUndefined: Self = StObject.set(x, "updatePageElementsZOrder", js.undefined)
        
        inline def setUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = StObject.set(x, "updatePageProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdatePagePropertiesUndefined: Self = StObject.set(x, "updatePageProperties", js.undefined)
        
        inline def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
        
        inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
        
        inline def setUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = StObject.set(x, "updateShapeProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateShapePropertiesUndefined: Self = StObject.set(x, "updateShapeProperties", js.undefined)
        
        inline def setUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = StObject.set(x, "updateSlidesPosition", value.asInstanceOf[js.Any])
        
        inline def setUpdateSlidesPositionUndefined: Self = StObject.set(x, "updateSlidesPosition", js.undefined)
        
        inline def setUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = StObject.set(x, "updateTableBorderProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateTableBorderPropertiesUndefined: Self = StObject.set(x, "updateTableBorderProperties", js.undefined)
        
        inline def setUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = StObject.set(x, "updateTableCellProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateTableCellPropertiesUndefined: Self = StObject.set(x, "updateTableCellProperties", js.undefined)
        
        inline def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
        
        inline def setUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = StObject.set(x, "updateTableRowProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateTableRowPropertiesUndefined: Self = StObject.set(x, "updateTableRowProperties", js.undefined)
        
        inline def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
        
        inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
        
        inline def setUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = StObject.set(x, "updateVideoProperties", value.asInstanceOf[js.Any])
        
        inline def setUpdateVideoPropertiesUndefined: Self = StObject.set(x, "updateVideoProperties", js.undefined)
      }
    }
    
    trait RerouteLineRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object RerouteLineRequest {
      
      inline def apply(): RerouteLineRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RerouteLineRequest]
      }
      
      extension [Self <: RerouteLineRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait Response extends StObject {
      
      var createImage: js.UndefOr[CreateImageResponse] = js.undefined
      
      var createLine: js.UndefOr[CreateLineResponse] = js.undefined
      
      var createShape: js.UndefOr[CreateShapeResponse] = js.undefined
      
      var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.undefined
      
      var createSlide: js.UndefOr[CreateSlideResponse] = js.undefined
      
      var createTable: js.UndefOr[CreateTableResponse] = js.undefined
      
      var createVideo: js.UndefOr[CreateVideoResponse] = js.undefined
      
      var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.undefined
      
      var groupObjects: js.UndefOr[GroupObjectsResponse] = js.undefined
      
      var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.undefined
      
      var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.undefined
      
      var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
    }
    object Response {
      
      inline def apply(): Response = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setCreateImage(value: CreateImageResponse): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
        
        inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
        
        inline def setCreateLine(value: CreateLineResponse): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
        
        inline def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
        
        inline def setCreateShape(value: CreateShapeResponse): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
        
        inline def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
        
        inline def setCreateSheetsChart(value: CreateSheetsChartResponse): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
        
        inline def setCreateSlide(value: CreateSlideResponse): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
        
        inline def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
        
        inline def setCreateTable(value: CreateTableResponse): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
        
        inline def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
        
        inline def setCreateVideo(value: CreateVideoResponse): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
        
        inline def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
        
        inline def setDuplicateObject(value: DuplicateObjectResponse): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
        
        inline def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
        
        inline def setGroupObjects(value: GroupObjectsResponse): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
        
        inline def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
        
        inline def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
        
        inline def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
        
        inline def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
      }
    }
    
    trait RgbColor extends StObject {
      
      var blue: js.UndefOr[Double] = js.undefined
      
      var green: js.UndefOr[Double] = js.undefined
      
      var red: js.UndefOr[Double] = js.undefined
    }
    object RgbColor {
      
      inline def apply(): RgbColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RgbColor]
      }
      
      extension [Self <: RgbColor](x: Self) {
        
        inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
        
        inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
        
        inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
        
        inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      }
    }
    
    trait Shadow extends StObject {
      
      var alignment: js.UndefOr[String] = js.undefined
      
      var alpha: js.UndefOr[Double] = js.undefined
      
      var blurRadius: js.UndefOr[Dimension] = js.undefined
      
      var color: js.UndefOr[OpaqueColor] = js.undefined
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var rotateWithShape: js.UndefOr[Boolean] = js.undefined
      
      var transform: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Shadow {
      
      inline def apply(): Shadow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Shadow]
      }
      
      extension [Self <: Shadow](x: Self) {
        
        inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        inline def setBlurRadius(value: Dimension): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
        
        inline def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
        
        inline def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setRotateWithShape(value: Boolean): Self = StObject.set(x, "rotateWithShape", value.asInstanceOf[js.Any])
        
        inline def setRotateWithShapeUndefined: Self = StObject.set(x, "rotateWithShape", js.undefined)
        
        inline def setTransform(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Shape extends StObject {
      
      var placeholder: js.UndefOr[Placeholder] = js.undefined
      
      var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
      
      var shapeType: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[TextContent] = js.undefined
    }
    object Shape {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape](x: Self) {
        
        inline def setPlaceholder(value: Placeholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
        
        inline def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
        
        inline def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
        
        inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
        
        inline def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait ShapeBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
    }
    object ShapeBackgroundFill {
      
      inline def apply(): ShapeBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShapeBackgroundFill]
      }
      
      extension [Self <: ShapeBackgroundFill](x: Self) {
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    trait ShapeProperties extends StObject {
      
      var contentAlignment: js.UndefOr[String] = js.undefined
      
      var link: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.undefined
      
      var outline: js.UndefOr[Outline] = js.undefined
      
      var shadow: js.UndefOr[Shadow] = js.undefined
      
      var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.undefined
    }
    object ShapeProperties {
      
      inline def apply(): ShapeProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShapeProperties]
      }
      
      extension [Self <: ShapeProperties](x: Self) {
        
        inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
        
        inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
        
        inline def setLink(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        inline def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
        
        inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
        
        inline def setShapeBackgroundFill(value: ShapeBackgroundFill): Self = StObject.set(x, "shapeBackgroundFill", value.asInstanceOf[js.Any])
        
        inline def setShapeBackgroundFillUndefined: Self = StObject.set(x, "shapeBackgroundFill", js.undefined)
      }
    }
    
    trait SheetsChart extends StObject {
      
      var chartId: js.UndefOr[Double] = js.undefined
      
      var contentUrl: js.UndefOr[String] = js.undefined
      
      var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.undefined
      
      var spreadsheetId: js.UndefOr[String] = js.undefined
    }
    object SheetsChart {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart](x: Self) {
        
        inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        inline def setSheetsChartProperties(value: SheetsChartProperties): Self = StObject.set(x, "sheetsChartProperties", value.asInstanceOf[js.Any])
        
        inline def setSheetsChartPropertiesUndefined: Self = StObject.set(x, "sheetsChartProperties", js.undefined)
        
        inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    trait SheetsChartProperties extends StObject {
      
      var chartImageProperties: js.UndefOr[ImageProperties] = js.undefined
    }
    object SheetsChartProperties {
      
      inline def apply(): SheetsChartProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SheetsChartProperties]
      }
      
      extension [Self <: SheetsChartProperties](x: Self) {
        
        inline def setChartImageProperties(value: ImageProperties): Self = StObject.set(x, "chartImageProperties", value.asInstanceOf[js.Any])
        
        inline def setChartImagePropertiesUndefined: Self = StObject.set(x, "chartImageProperties", js.undefined)
      }
    }
    
    trait Size extends StObject {
      
      var height: js.UndefOr[Dimension] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object Size {
      
      inline def apply(): Size = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Size]
      }
      
      extension [Self <: Size](x: Self) {
        
        inline def setHeight(value: Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait SlideProperties extends StObject {
      
      var layoutObjectId: js.UndefOr[String] = js.undefined
      
      var masterObjectId: js.UndefOr[String] = js.undefined
      
      var notesPage: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page] = js.undefined
    }
    object SlideProperties {
      
      inline def apply(): SlideProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SlideProperties]
      }
      
      extension [Self <: SlideProperties](x: Self) {
        
        inline def setLayoutObjectId(value: String): Self = StObject.set(x, "layoutObjectId", value.asInstanceOf[js.Any])
        
        inline def setLayoutObjectIdUndefined: Self = StObject.set(x, "layoutObjectId", js.undefined)
        
        inline def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
        
        inline def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
        
        inline def setNotesPage(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page): Self = StObject.set(x, "notesPage", value.asInstanceOf[js.Any])
        
        inline def setNotesPageUndefined: Self = StObject.set(x, "notesPage", js.undefined)
      }
    }
    
    trait SolidFill extends StObject {
      
      var alpha: js.UndefOr[Double] = js.undefined
      
      var color: js.UndefOr[OpaqueColor] = js.undefined
    }
    object SolidFill {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill](x: Self) {
        
        inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        inline def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      }
    }
    
    trait StretchedPictureFill extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Size] = js.undefined
    }
    object StretchedPictureFill {
      
      inline def apply(): StretchedPictureFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StretchedPictureFill]
      }
      
      extension [Self <: StretchedPictureFill](x: Self) {
        
        inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    trait SubstringMatchCriteria extends StObject {
      
      var matchCase: js.UndefOr[Boolean] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object SubstringMatchCriteria {
      
      inline def apply(): SubstringMatchCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubstringMatchCriteria]
      }
      
      extension [Self <: SubstringMatchCriteria](x: Self) {
        
        inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
        
        inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait Table extends StObject {
      
      var columns: js.UndefOr[Double] = js.undefined
      
      var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
      
      var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
      
      var tableRows: js.UndefOr[
            js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]
          ] = js.undefined
      
      var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.undefined
    }
    object Table {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table](x: Self) {
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setHorizontalBorderRows(value: js.Array[TableBorderRow]): Self = StObject.set(x, "horizontalBorderRows", value.asInstanceOf[js.Any])
        
        inline def setHorizontalBorderRowsUndefined: Self = StObject.set(x, "horizontalBorderRows", js.undefined)
        
        inline def setHorizontalBorderRowsVarargs(value: TableBorderRow*): Self = StObject.set(x, "horizontalBorderRows", js.Array(value*))
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setTableColumns(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
        
        inline def setTableColumnsUndefined: Self = StObject.set(x, "tableColumns", js.undefined)
        
        inline def setTableColumnsVarargs(value: TableColumnProperties*): Self = StObject.set(x, "tableColumns", js.Array(value*))
        
        inline def setTableRows(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
        
        inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
        
        inline def setTableRowsVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow*): Self = StObject.set(x, "tableRows", js.Array(value*))
        
        inline def setVerticalBorderRows(value: js.Array[TableBorderRow]): Self = StObject.set(x, "verticalBorderRows", value.asInstanceOf[js.Any])
        
        inline def setVerticalBorderRowsUndefined: Self = StObject.set(x, "verticalBorderRows", js.undefined)
        
        inline def setVerticalBorderRowsVarargs(value: TableBorderRow*): Self = StObject.set(x, "verticalBorderRows", js.Array(value*))
      }
    }
    
    trait TableBorderCell extends StObject {
      
      var location: js.UndefOr[TableCellLocation] = js.undefined
      
      var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
    }
    object TableBorderCell {
      
      inline def apply(): TableBorderCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderCell]
      }
      
      extension [Self <: TableBorderCell](x: Self) {
        
        inline def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
        
        inline def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
      }
    }
    
    trait TableBorderFill extends StObject {
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
    }
    object TableBorderFill {
      
      inline def apply(): TableBorderFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderFill]
      }
      
      extension [Self <: TableBorderFill](x: Self) {
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    trait TableBorderProperties extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var tableBorderFill: js.UndefOr[TableBorderFill] = js.undefined
      
      var weight: js.UndefOr[Dimension] = js.undefined
    }
    object TableBorderProperties {
      
      inline def apply(): TableBorderProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderProperties]
      }
      
      extension [Self <: TableBorderProperties](x: Self) {
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setTableBorderFill(value: TableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
        
        inline def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
        
        inline def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait TableBorderRow extends StObject {
      
      var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.undefined
    }
    object TableBorderRow {
      
      inline def apply(): TableBorderRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderRow]
      }
      
      extension [Self <: TableBorderRow](x: Self) {
        
        inline def setTableBorderCells(value: js.Array[TableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
        
        inline def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
        
        inline def setTableBorderCellsVarargs(value: TableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value*))
      }
    }
    
    trait TableCell extends StObject {
      
      var columnSpan: js.UndefOr[Double] = js.undefined
      
      var location: js.UndefOr[TableCellLocation] = js.undefined
      
      var rowSpan: js.UndefOr[Double] = js.undefined
      
      var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
      
      var text: js.UndefOr[TextContent] = js.undefined
    }
    object TableCell {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell](x: Self) {
        
        inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
        
        inline def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        inline def setTableCellProperties(value: TableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
        
        inline def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
        
        inline def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait TableCellBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var solidFill: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
    }
    object TableCellBackgroundFill {
      
      inline def apply(): TableCellBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellBackgroundFill]
      }
      
      extension [Self <: TableCellBackgroundFill](x: Self) {
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setSolidFill(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    trait TableCellLocation extends StObject {
      
      var columnIndex: js.UndefOr[Double] = js.undefined
      
      var rowIndex: js.UndefOr[Double] = js.undefined
    }
    object TableCellLocation {
      
      inline def apply(): TableCellLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellLocation]
      }
      
      extension [Self <: TableCellLocation](x: Self) {
        
        inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
        
        inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
        
        inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
        
        inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      }
    }
    
    trait TableCellProperties extends StObject {
      
      var contentAlignment: js.UndefOr[String] = js.undefined
      
      var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.undefined
    }
    object TableCellProperties {
      
      inline def apply(): TableCellProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellProperties]
      }
      
      extension [Self <: TableCellProperties](x: Self) {
        
        inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
        
        inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
        
        inline def setTableCellBackgroundFill(value: TableCellBackgroundFill): Self = StObject.set(x, "tableCellBackgroundFill", value.asInstanceOf[js.Any])
        
        inline def setTableCellBackgroundFillUndefined: Self = StObject.set(x, "tableCellBackgroundFill", js.undefined)
      }
    }
    
    trait TableColumnProperties extends StObject {
      
      var columnWidth: js.UndefOr[Dimension] = js.undefined
    }
    object TableColumnProperties {
      
      inline def apply(): TableColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableColumnProperties]
      }
      
      extension [Self <: TableColumnProperties](x: Self) {
        
        inline def setColumnWidth(value: Dimension): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
        
        inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      }
    }
    
    trait TableRange extends StObject {
      
      var columnSpan: js.UndefOr[Double] = js.undefined
      
      var location: js.UndefOr[TableCellLocation] = js.undefined
      
      var rowSpan: js.UndefOr[Double] = js.undefined
    }
    object TableRange {
      
      inline def apply(): TableRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRange]
      }
      
      extension [Self <: TableRange](x: Self) {
        
        inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
        
        inline def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      }
    }
    
    trait TableRow extends StObject {
      
      var rowHeight: js.UndefOr[Dimension] = js.undefined
      
      var tableCells: js.UndefOr[
            js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]
          ] = js.undefined
      
      var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
    }
    object TableRow {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow](x: Self) {
        
        inline def setRowHeight(value: Dimension): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
        
        inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
        
        inline def setTableCells(value: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
        
        inline def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
        
        inline def setTableCellsVarargs(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell*): Self = StObject.set(x, "tableCells", js.Array(value*))
        
        inline def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
        
        inline def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
      }
    }
    
    trait TableRowProperties extends StObject {
      
      var minRowHeight: js.UndefOr[Dimension] = js.undefined
    }
    object TableRowProperties {
      
      inline def apply(): TableRowProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRowProperties]
      }
      
      extension [Self <: TableRowProperties](x: Self) {
        
        inline def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
        
        inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
      }
    }
    
    trait TextContent extends StObject {
      
      var lists: js.UndefOr[js.Object] = js.undefined
      
      var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
    }
    object TextContent {
      
      inline def apply(): TextContent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextContent]
      }
      
      extension [Self <: TextContent](x: Self) {
        
        inline def setLists(value: js.Object): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
        
        inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
        
        inline def setTextElements(value: js.Array[TextElement]): Self = StObject.set(x, "textElements", value.asInstanceOf[js.Any])
        
        inline def setTextElementsUndefined: Self = StObject.set(x, "textElements", js.undefined)
        
        inline def setTextElementsVarargs(value: TextElement*): Self = StObject.set(x, "textElements", js.Array(value*))
      }
    }
    
    trait TextElement extends StObject {
      
      var autoText: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText] = js.undefined
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var textRun: js.UndefOr[TextRun] = js.undefined
    }
    object TextElement {
      
      inline def apply(): TextElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextElement]
      }
      
      extension [Self <: TextElement](x: Self) {
        
        inline def setAutoText(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
        
        inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setParagraphMarker(value: ParagraphMarker): Self = StObject.set(x, "paragraphMarker", value.asInstanceOf[js.Any])
        
        inline def setParagraphMarkerUndefined: Self = StObject.set(x, "paragraphMarker", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
        
        inline def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
      }
    }
    
    trait TextRun extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var style: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
    }
    object TextRun {
      
      inline def apply(): TextRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextRun]
      }
      
      extension [Self <: TextRun](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    trait TextStyle extends StObject {
      
      var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
      
      var baselineOffset: js.UndefOr[String] = js.undefined
      
      var bold: js.UndefOr[Boolean] = js.undefined
      
      var fontFamily: js.UndefOr[String] = js.undefined
      
      var fontSize: js.UndefOr[Dimension] = js.undefined
      
      var foregroundColor: js.UndefOr[OptionalColor] = js.undefined
      
      var italic: js.UndefOr[Boolean] = js.undefined
      
      var link: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.undefined
      
      var smallCaps: js.UndefOr[Boolean] = js.undefined
      
      var strikethrough: js.UndefOr[Boolean] = js.undefined
      
      var underline: js.UndefOr[Boolean] = js.undefined
      
      var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.undefined
    }
    object TextStyle {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle](x: Self) {
        
        inline def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setBaselineOffset(value: String): Self = StObject.set(x, "baselineOffset", value.asInstanceOf[js.Any])
        
        inline def setBaselineOffsetUndefined: Self = StObject.set(x, "baselineOffset", js.undefined)
        
        inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
        
        inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
        
        inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        inline def setFontSize(value: Dimension): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        inline def setForegroundColor(value: OptionalColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
        
        inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
        
        inline def setLink(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setSmallCaps(value: Boolean): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
        
        inline def setSmallCapsUndefined: Self = StObject.set(x, "smallCaps", js.undefined)
        
        inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
        
        inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
        
        inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
        
        inline def setWeightedFontFamily(value: WeightedFontFamily): Self = StObject.set(x, "weightedFontFamily", value.asInstanceOf[js.Any])
        
        inline def setWeightedFontFamilyUndefined: Self = StObject.set(x, "weightedFontFamily", js.undefined)
      }
    }
    
    trait ThemeColorPair extends StObject {
      
      var color: js.UndefOr[RgbColor] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ThemeColorPair {
      
      inline def apply(): ThemeColorPair = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThemeColorPair]
      }
      
      extension [Self <: ThemeColorPair](x: Self) {
        
        inline def setColor(value: RgbColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Thumbnail extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object Thumbnail {
      
      inline def apply(): Thumbnail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Thumbnail]
      }
      
      extension [Self <: Thumbnail](x: Self) {
        
        inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait UngroupObjectsRequest extends StObject {
      
      var objectIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object UngroupObjectsRequest {
      
      inline def apply(): UngroupObjectsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UngroupObjectsRequest]
      }
      
      extension [Self <: UngroupObjectsRequest](x: Self) {
        
        inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
        
        inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
        
        inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
      }
    }
    
    trait UnmergeTableCellsRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var tableRange: js.UndefOr[TableRange] = js.undefined
    }
    object UnmergeTableCellsRequest {
      
      inline def apply(): UnmergeTableCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnmergeTableCellsRequest]
      }
      
      extension [Self <: UnmergeTableCellsRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    trait UpdateImagePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var imageProperties: js.UndefOr[ImageProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object UpdateImagePropertiesRequest {
      
      inline def apply(): UpdateImagePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateImagePropertiesRequest]
      }
      
      extension [Self <: UpdateImagePropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
        
        inline def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait UpdateLineCategoryRequest extends StObject {
      
      var lineCategory: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object UpdateLineCategoryRequest {
      
      inline def apply(): UpdateLineCategoryRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateLineCategoryRequest]
      }
      
      extension [Self <: UpdateLineCategoryRequest](x: Self) {
        
        inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait UpdateLinePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var lineProperties: js.UndefOr[LineProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object UpdateLinePropertiesRequest {
      
      inline def apply(): UpdateLinePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateLinePropertiesRequest]
      }
      
      extension [Self <: UpdateLinePropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setLineProperties(value: LineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
        
        inline def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait UpdatePageElementAltTextRequest extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object UpdatePageElementAltTextRequest {
      
      inline def apply(): UpdatePageElementAltTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementAltTextRequest]
      }
      
      extension [Self <: UpdatePageElementAltTextRequest](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait UpdatePageElementTransformRequest extends StObject {
      
      var applyMode: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var transform: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
    }
    object UpdatePageElementTransformRequest {
      
      inline def apply(): UpdatePageElementTransformRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementTransformRequest]
      }
      
      extension [Self <: UpdatePageElementTransformRequest](x: Self) {
        
        inline def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
        
        inline def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTransform(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    trait UpdatePageElementsZOrderRequest extends StObject {
      
      var operation: js.UndefOr[String] = js.undefined
      
      var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object UpdatePageElementsZOrderRequest {
      
      inline def apply(): UpdatePageElementsZOrderRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
      }
      
      extension [Self <: UpdatePageElementsZOrderRequest](x: Self) {
        
        inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        inline def setPageElementObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageElementObjectIds", value.asInstanceOf[js.Any])
        
        inline def setPageElementObjectIdsUndefined: Self = StObject.set(x, "pageElementObjectIds", js.undefined)
        
        inline def setPageElementObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageElementObjectIds", js.Array(value*))
      }
    }
    
    trait UpdatePagePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var pageProperties: js.UndefOr[PageProperties] = js.undefined
    }
    object UpdatePagePropertiesRequest {
      
      inline def apply(): UpdatePagePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePagePropertiesRequest]
      }
      
      extension [Self <: UpdatePagePropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setPageProperties(value: PageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
        
        inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
      }
    }
    
    trait UpdateParagraphStyleRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var style: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.undefined
      
      var textRange: js.UndefOr[Range] = js.undefined
    }
    object UpdateParagraphStyleRequest {
      
      inline def apply(): UpdateParagraphStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateParagraphStyleRequest]
      }
      
      extension [Self <: UpdateParagraphStyleRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    trait UpdateShapePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
    }
    object UpdateShapePropertiesRequest {
      
      inline def apply(): UpdateShapePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateShapePropertiesRequest]
      }
      
      extension [Self <: UpdateShapePropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
        
        inline def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
      }
    }
    
    trait UpdateSlidesPositionRequest extends StObject {
      
      var insertionIndex: js.UndefOr[Double] = js.undefined
      
      var slideObjectIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object UpdateSlidesPositionRequest {
      
      inline def apply(): UpdateSlidesPositionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSlidesPositionRequest]
      }
      
      extension [Self <: UpdateSlidesPositionRequest](x: Self) {
        
        inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        inline def setSlideObjectIds(value: js.Array[String]): Self = StObject.set(x, "slideObjectIds", value.asInstanceOf[js.Any])
        
        inline def setSlideObjectIdsUndefined: Self = StObject.set(x, "slideObjectIds", js.undefined)
        
        inline def setSlideObjectIdsVarargs(value: String*): Self = StObject.set(x, "slideObjectIds", js.Array(value*))
      }
    }
    
    trait UpdateTableBorderPropertiesRequest extends StObject {
      
      var borderPosition: js.UndefOr[String] = js.undefined
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
      
      var tableRange: js.UndefOr[TableRange] = js.undefined
    }
    object UpdateTableBorderPropertiesRequest {
      
      inline def apply(): UpdateTableBorderPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
      }
      
      extension [Self <: UpdateTableBorderPropertiesRequest](x: Self) {
        
        inline def setBorderPosition(value: String): Self = StObject.set(x, "borderPosition", value.asInstanceOf[js.Any])
        
        inline def setBorderPositionUndefined: Self = StObject.set(x, "borderPosition", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
        
        inline def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
        
        inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    trait UpdateTableCellPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
      
      var tableRange: js.UndefOr[TableRange] = js.undefined
    }
    object UpdateTableCellPropertiesRequest {
      
      inline def apply(): UpdateTableCellPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
      }
      
      extension [Self <: UpdateTableCellPropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTableCellProperties(value: TableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
        
        inline def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
        
        inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    trait UpdateTableColumnPropertiesRequest extends StObject {
      
      var columnIndices: js.UndefOr[js.Array[Double]] = js.undefined
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.undefined
    }
    object UpdateTableColumnPropertiesRequest {
      
      inline def apply(): UpdateTableColumnPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
      }
      
      extension [Self <: UpdateTableColumnPropertiesRequest](x: Self) {
        
        inline def setColumnIndices(value: js.Array[Double]): Self = StObject.set(x, "columnIndices", value.asInstanceOf[js.Any])
        
        inline def setColumnIndicesUndefined: Self = StObject.set(x, "columnIndices", js.undefined)
        
        inline def setColumnIndicesVarargs(value: Double*): Self = StObject.set(x, "columnIndices", js.Array(value*))
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setTableColumnProperties(value: TableColumnProperties): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
        
        inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
      }
    }
    
    trait UpdateTableRowPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var rowIndices: js.UndefOr[js.Array[Double]] = js.undefined
      
      var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
    }
    object UpdateTableRowPropertiesRequest {
      
      inline def apply(): UpdateTableRowPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
      }
      
      extension [Self <: UpdateTableRowPropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
        
        inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
        
        inline def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value*))
        
        inline def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
        
        inline def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
      }
    }
    
    trait UpdateTextStyleRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var style: js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
      
      var textRange: js.UndefOr[Range] = js.undefined
    }
    object UpdateTextStyleRequest {
      
      inline def apply(): UpdateTextStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTextStyleRequest]
      }
      
      extension [Self <: UpdateTextStyleRequest](x: Self) {
        
        inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setStyle(value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    trait UpdateVideoPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var videoProperties: js.UndefOr[VideoProperties] = js.undefined
    }
    object UpdateVideoPropertiesRequest {
      
      inline def apply(): UpdateVideoPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateVideoPropertiesRequest]
      }
      
      extension [Self <: UpdateVideoPropertiesRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
        
        inline def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
      }
    }
    
    trait Video extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var source: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
      
      var videoProperties: js.UndefOr[VideoProperties] = js.undefined
    }
    object Video {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
        
        inline def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
      }
    }
    
    trait VideoProperties extends StObject {
      
      var autoPlay: js.UndefOr[Boolean] = js.undefined
      
      var end: js.UndefOr[Double] = js.undefined
      
      var mute: js.UndefOr[Boolean] = js.undefined
      
      var outline: js.UndefOr[Outline] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
    }
    object VideoProperties {
      
      inline def apply(): VideoProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoProperties]
      }
      
      extension [Self <: VideoProperties](x: Self) {
        
        inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
        
        inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
        
        inline def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait WeightedFontFamily extends StObject {
      
      var fontFamily: js.UndefOr[String] = js.undefined
      
      var weight: js.UndefOr[Double] = js.undefined
    }
    object WeightedFontFamily {
      
      inline def apply(): WeightedFontFamily = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WeightedFontFamily]
      }
      
      extension [Self <: WeightedFontFamily](x: Self) {
        
        inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait WordArt extends StObject {
      
      var renderedText: js.UndefOr[String] = js.undefined
    }
    object WordArt {
      
      inline def apply(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt]
      }
      
      extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt](x: Self) {
        
        inline def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
        
        inline def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
      }
    }
    
    trait WriteControl extends StObject {
      
      var requiredRevisionId: js.UndefOr[String] = js.undefined
    }
    object WriteControl {
      
      inline def apply(): WriteControl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WriteControl]
      }
      
      extension [Self <: WriteControl](x: Self) {
        
        inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
        
        inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
      }
    }
  }
  
  /**
    * The user's selection in the active presentation.
    *
    *     var selection = SlidesApp.getActivePresentation().getSelection();
    *     var currentPage = selection.getCurrentPage();
    *     var selectionType = selection.getSelectionType();
    *     }
    */
  trait Selection extends StObject {
    
    def getCurrentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page
    
    def getPageElementRange(): PageElementRange
    
    def getPageRange(): PageRange
    
    def getSelectionType(): SelectionType
    
    def getTableCellRange(): TableCellRange
    
    def getTextRange(): TextRange
  }
  object Selection {
    
    inline def apply(
      getCurrentPage: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page],
      getPageElementRange: CallbackTo[PageElementRange],
      getPageRange: CallbackTo[PageRange],
      getSelectionType: CallbackTo[SelectionType],
      getTableCellRange: CallbackTo[TableCellRange],
      getTextRange: CallbackTo[TextRange]
    ): Selection = {
      val __obj = js.Dynamic.literal(getCurrentPage = getCurrentPage.toJsFn, getPageElementRange = getPageElementRange.toJsFn, getPageRange = getPageRange.toJsFn, getSelectionType = getSelectionType.toJsFn, getTableCellRange = getTableCellRange.toJsFn, getTextRange = getTextRange.toJsFn)
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setGetCurrentPage(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page]): Self = StObject.set(x, "getCurrentPage", value.toJsFn)
      
      inline def setGetPageElementRange(value: CallbackTo[PageElementRange]): Self = StObject.set(x, "getPageElementRange", value.toJsFn)
      
      inline def setGetPageRange(value: CallbackTo[PageRange]): Self = StObject.set(x, "getPageRange", value.toJsFn)
      
      inline def setGetSelectionType(value: CallbackTo[SelectionType]): Self = StObject.set(x, "getSelectionType", value.toJsFn)
      
      inline def setGetTableCellRange(value: CallbackTo[TableCellRange]): Self = StObject.set(x, "getTableCellRange", value.toJsFn)
      
      inline def setGetTextRange(value: CallbackTo[TextRange]): Self = StObject.set(x, "getTextRange", value.toJsFn)
    }
  }
  
  /**
    * A PageElement representing a generic shape that does not have a more specific
    * classification. Includes text boxes, rectangles, and other predefined shapes.
    */
  @js.native
  trait Shape extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getContentAlignment(): ContentAlignment = js.native
    
    def getDescription(): String = js.native
    
    def getFill(): Fill = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getParentPlaceholder(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholderIndex(): Integer = js.native
    
    def getPlaceholderType(): PlaceholderType = js.native
    
    def getRotation(): Double = js.native
    
    def getShapeType(): ShapeType = js.native
    
    def getText(): TextRange = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def replaceWithImage(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(blobSource: BlobSource, crop: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(imageUrl: String, crop: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def replaceWithSheetsChart(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def replaceWithSheetsChartAsImage(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setContentAlignment(contentAlignment: ContentAlignment): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
  }
  
  /**
    * A PageElement representing a linked chart embedded from Google Sheets.
    */
  @js.native
  trait SheetsChart extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def asImage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getChartId(): Integer = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getEmbedType(): SheetsChartEmbedType = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSpreadsheetId(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def refresh(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
  }
  
  /**
    * A slide in a presentation.
    *
    * These pages contain the content you are presenting to your audience. Most slides are based on
    * a master and a layout. You can specify which layout to use for each slide when it is created.
    */
  @js.native
  trait Slide extends StObject {
    
    def duplicate(): Slide = js.native
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayout(): Layout = js.native
    
    def getLines(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getNotesPage(): NotesPage = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getSlideLinkingMode(): SlideLinkingMode = js.native
    
    def getSourcePresentationId(): String = js.native
    
    def getSourceSlideObjectId(): String = js.native
    
    def getTables(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def move(index: Integer): Unit = js.native
    
    def refreshSlide(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
    
    def setSkipped(isSkipped: Boolean): Unit = js.native
    
    def unlink(): Unit = js.native
  }
  
  /**
    * Creates and opens Presentations that can be edited.
    *
    *     // Open a presentation by ID.
    *     var preso = SlidesApp.openById('PRESENTATION_ID_GOES_HERE');
    *
    *     // Create and open a presentation.
    *     preso = SlidesApp.create('Presentation Name');
    */
  trait SlidesApp extends StObject {
    
    var AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ Any
    
    var ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ Any
    
    var AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ Any
    
    var CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ Any
    
    var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ Any
    
    var ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ Any
    
    var DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ Any
    
    var FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ Any
    
    var LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ Any
    
    var LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ Any
    
    var LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ Any
    
    var LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ Any
    
    var ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ Any
    
    var PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ Any
    
    var PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ Any
    
    var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ Any
    
    var ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ Any
    
    var PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ Any
    
    var PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ Any
    
    var SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ Any
    
    var ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ Any
    
    var SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ Any
    
    var SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ Any
    
    var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ Any
    
    var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ Any
    
    var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ Any
    
    var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ Any
    
    var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ Any
    
    var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ Any
    
    def create(name: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation
    
    def getActivePresentation(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation
    
    def getUi(): Ui
    
    def newAffineTransformBuilder(): AffineTransformBuilder
    
    def openById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation
    
    def openByUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation
  }
  object SlidesApp {
    
    inline def apply(
      AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ Any,
      ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ Any,
      AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ Any,
      CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ Any,
      ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ Any,
      ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ Any,
      DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ Any,
      FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ Any,
      LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ Any,
      LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ Any,
      LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ Any,
      LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ Any,
      ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ Any,
      PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ Any,
      PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ Any,
      PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ Any,
      ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ Any,
      PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ Any,
      PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ Any,
      SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ Any,
      ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ Any,
      SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ Any,
      SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ Any,
      SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ Any,
      SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ Any,
      TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ Any,
      TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ Any,
      ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ Any,
      VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ Any,
      create: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation,
      getActivePresentation: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation],
      getUi: CallbackTo[Ui],
      newAffineTransformBuilder: CallbackTo[AffineTransformBuilder],
      openById: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation,
      openByUrl: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation
    ): SlidesApp = {
      val __obj = js.Dynamic.literal(AlignmentPosition = AlignmentPosition.asInstanceOf[js.Any], ArrowStyle = ArrowStyle.asInstanceOf[js.Any], AutoTextType = AutoTextType.asInstanceOf[js.Any], CellMergeState = CellMergeState.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], ContentAlignment = ContentAlignment.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], FillType = FillType.asInstanceOf[js.Any], LineCategory = LineCategory.asInstanceOf[js.Any], LineFillType = LineFillType.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], LinkType = LinkType.asInstanceOf[js.Any], ListPreset = ListPreset.asInstanceOf[js.Any], PageBackgroundType = PageBackgroundType.asInstanceOf[js.Any], PageElementType = PageElementType.asInstanceOf[js.Any], PageType = PageType.asInstanceOf[js.Any], ParagraphAlignment = ParagraphAlignment.asInstanceOf[js.Any], PlaceholderType = PlaceholderType.asInstanceOf[js.Any], PredefinedLayout = PredefinedLayout.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], SheetsChartEmbedType = SheetsChartEmbedType.asInstanceOf[js.Any], SlideLinkingMode = SlideLinkingMode.asInstanceOf[js.Any], SlidePosition = SlidePosition.asInstanceOf[js.Any], SpacingMode = SpacingMode.asInstanceOf[js.Any], TextBaselineOffset = TextBaselineOffset.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], ThemeColorType = ThemeColorType.asInstanceOf[js.Any], VideoSourceType = VideoSourceType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActivePresentation = getActivePresentation.toJsFn, getUi = getUi.toJsFn, newAffineTransformBuilder = newAffineTransformBuilder.toJsFn, openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
      __obj.asInstanceOf[SlidesApp]
    }
    
    extension [Self <: SlidesApp](x: Self) {
      
      inline def setAlignmentPosition(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ Any
      ): Self = StObject.set(x, "AlignmentPosition", value.asInstanceOf[js.Any])
      
      inline def setArrowStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ Any): Self = StObject.set(x, "ArrowStyle", value.asInstanceOf[js.Any])
      
      inline def setAutoTextType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ Any): Self = StObject.set(x, "AutoTextType", value.asInstanceOf[js.Any])
      
      inline def setCellMergeState(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ Any): Self = StObject.set(x, "CellMergeState", value.asInstanceOf[js.Any])
      
      inline def setColorType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ Any): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
      
      inline def setContentAlignment(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ Any
      ): Self = StObject.set(x, "ContentAlignment", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDashStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ Any): Self = StObject.set(x, "DashStyle", value.asInstanceOf[js.Any])
      
      inline def setFillType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ Any): Self = StObject.set(x, "FillType", value.asInstanceOf[js.Any])
      
      inline def setGetActivePresentation(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation]): Self = StObject.set(x, "getActivePresentation", value.toJsFn)
      
      inline def setGetUi(value: CallbackTo[Ui]): Self = StObject.set(x, "getUi", value.toJsFn)
      
      inline def setLineCategory(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ Any): Self = StObject.set(x, "LineCategory", value.asInstanceOf[js.Any])
      
      inline def setLineFillType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ Any): Self = StObject.set(x, "LineFillType", value.asInstanceOf[js.Any])
      
      inline def setLineType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ Any): Self = StObject.set(x, "LineType", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ Any): Self = StObject.set(x, "LinkType", value.asInstanceOf[js.Any])
      
      inline def setListPreset(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ Any): Self = StObject.set(x, "ListPreset", value.asInstanceOf[js.Any])
      
      inline def setNewAffineTransformBuilder(value: CallbackTo[AffineTransformBuilder]): Self = StObject.set(x, "newAffineTransformBuilder", value.toJsFn)
      
      inline def setOpenById(value: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
      
      inline def setOpenByUrl(value: String => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
      
      inline def setPageBackgroundType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ Any
      ): Self = StObject.set(x, "PageBackgroundType", value.asInstanceOf[js.Any])
      
      inline def setPageElementType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ Any
      ): Self = StObject.set(x, "PageElementType", value.asInstanceOf[js.Any])
      
      inline def setPageType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ Any): Self = StObject.set(x, "PageType", value.asInstanceOf[js.Any])
      
      inline def setParagraphAlignment(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ Any
      ): Self = StObject.set(x, "ParagraphAlignment", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ Any
      ): Self = StObject.set(x, "PlaceholderType", value.asInstanceOf[js.Any])
      
      inline def setPredefinedLayout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ Any
      ): Self = StObject.set(x, "PredefinedLayout", value.asInstanceOf[js.Any])
      
      inline def setSelectionType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ Any): Self = StObject.set(x, "SelectionType", value.asInstanceOf[js.Any])
      
      inline def setShapeType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ Any): Self = StObject.set(x, "ShapeType", value.asInstanceOf[js.Any])
      
      inline def setSheetsChartEmbedType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ Any
      ): Self = StObject.set(x, "SheetsChartEmbedType", value.asInstanceOf[js.Any])
      
      inline def setSlideLinkingMode(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ Any
      ): Self = StObject.set(x, "SlideLinkingMode", value.asInstanceOf[js.Any])
      
      inline def setSlidePosition(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ Any): Self = StObject.set(x, "SlidePosition", value.asInstanceOf[js.Any])
      
      inline def setSpacingMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ Any): Self = StObject.set(x, "SpacingMode", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineOffset(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ Any
      ): Self = StObject.set(x, "TextBaselineOffset", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ Any): Self = StObject.set(x, "TextDirection", value.asInstanceOf[js.Any])
      
      inline def setThemeColorType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ Any): Self = StObject.set(x, "ThemeColorType", value.asInstanceOf[js.Any])
      
      inline def setVideoSourceType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ Any
      ): Self = StObject.set(x, "VideoSourceType", value.asInstanceOf[js.Any])
    }
  }
  
  extension [Self <: Slides](x: Self) {
    
    inline def setNewAffineTransform(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform]): Self = StObject.set(x, "newAffineTransform", value.toJsFn)
    
    inline def setNewAutoText(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText]): Self = StObject.set(x, "newAutoText", value.toJsFn)
    
    inline def setNewBatchUpdatePresentationRequest(value: CallbackTo[BatchUpdatePresentationRequest]): Self = StObject.set(x, "newBatchUpdatePresentationRequest", value.toJsFn)
    
    inline def setNewBullet(value: CallbackTo[Bullet]): Self = StObject.set(x, "newBullet", value.toJsFn)
    
    inline def setNewColorScheme(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme]): Self = StObject.set(x, "newColorScheme", value.toJsFn)
    
    inline def setNewColorStop(value: CallbackTo[ColorStop]): Self = StObject.set(x, "newColorStop", value.toJsFn)
    
    inline def setNewCreateImageRequest(value: CallbackTo[CreateImageRequest]): Self = StObject.set(x, "newCreateImageRequest", value.toJsFn)
    
    inline def setNewCreateLineRequest(value: CallbackTo[CreateLineRequest]): Self = StObject.set(x, "newCreateLineRequest", value.toJsFn)
    
    inline def setNewCreateParagraphBulletsRequest(value: CallbackTo[CreateParagraphBulletsRequest]): Self = StObject.set(x, "newCreateParagraphBulletsRequest", value.toJsFn)
    
    inline def setNewCreateShapeRequest(value: CallbackTo[CreateShapeRequest]): Self = StObject.set(x, "newCreateShapeRequest", value.toJsFn)
    
    inline def setNewCreateSheetsChartRequest(value: CallbackTo[CreateSheetsChartRequest]): Self = StObject.set(x, "newCreateSheetsChartRequest", value.toJsFn)
    
    inline def setNewCreateSlideRequest(value: CallbackTo[CreateSlideRequest]): Self = StObject.set(x, "newCreateSlideRequest", value.toJsFn)
    
    inline def setNewCreateTableRequest(value: CallbackTo[CreateTableRequest]): Self = StObject.set(x, "newCreateTableRequest", value.toJsFn)
    
    inline def setNewCreateVideoRequest(value: CallbackTo[CreateVideoRequest]): Self = StObject.set(x, "newCreateVideoRequest", value.toJsFn)
    
    inline def setNewCropProperties(value: CallbackTo[CropProperties]): Self = StObject.set(x, "newCropProperties", value.toJsFn)
    
    inline def setNewDeleteObjectRequest(value: CallbackTo[DeleteObjectRequest]): Self = StObject.set(x, "newDeleteObjectRequest", value.toJsFn)
    
    inline def setNewDeleteParagraphBulletsRequest(value: CallbackTo[DeleteParagraphBulletsRequest]): Self = StObject.set(x, "newDeleteParagraphBulletsRequest", value.toJsFn)
    
    inline def setNewDeleteTableColumnRequest(value: CallbackTo[DeleteTableColumnRequest]): Self = StObject.set(x, "newDeleteTableColumnRequest", value.toJsFn)
    
    inline def setNewDeleteTableRowRequest(value: CallbackTo[DeleteTableRowRequest]): Self = StObject.set(x, "newDeleteTableRowRequest", value.toJsFn)
    
    inline def setNewDeleteTextRequest(value: CallbackTo[DeleteTextRequest]): Self = StObject.set(x, "newDeleteTextRequest", value.toJsFn)
    
    inline def setNewDimension(value: CallbackTo[Dimension]): Self = StObject.set(x, "newDimension", value.toJsFn)
    
    inline def setNewDuplicateObjectRequest(value: CallbackTo[DuplicateObjectRequest]): Self = StObject.set(x, "newDuplicateObjectRequest", value.toJsFn)
    
    inline def setNewGroup(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Group]): Self = StObject.set(x, "newGroup", value.toJsFn)
    
    inline def setNewGroupObjectsRequest(value: CallbackTo[GroupObjectsRequest]): Self = StObject.set(x, "newGroupObjectsRequest", value.toJsFn)
    
    inline def setNewImage(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Image]): Self = StObject.set(x, "newImage", value.toJsFn)
    
    inline def setNewImageProperties(value: CallbackTo[ImageProperties]): Self = StObject.set(x, "newImageProperties", value.toJsFn)
    
    inline def setNewInsertTableColumnsRequest(value: CallbackTo[InsertTableColumnsRequest]): Self = StObject.set(x, "newInsertTableColumnsRequest", value.toJsFn)
    
    inline def setNewInsertTableRowsRequest(value: CallbackTo[InsertTableRowsRequest]): Self = StObject.set(x, "newInsertTableRowsRequest", value.toJsFn)
    
    inline def setNewInsertTextRequest(value: CallbackTo[InsertTextRequest]): Self = StObject.set(x, "newInsertTextRequest", value.toJsFn)
    
    inline def setNewLayoutPlaceholderIdMapping(value: CallbackTo[LayoutPlaceholderIdMapping]): Self = StObject.set(x, "newLayoutPlaceholderIdMapping", value.toJsFn)
    
    inline def setNewLayoutProperties(value: CallbackTo[LayoutProperties]): Self = StObject.set(x, "newLayoutProperties", value.toJsFn)
    
    inline def setNewLayoutReference(value: CallbackTo[LayoutReference]): Self = StObject.set(x, "newLayoutReference", value.toJsFn)
    
    inline def setNewLine(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Line]): Self = StObject.set(x, "newLine", value.toJsFn)
    
    inline def setNewLineConnection(value: CallbackTo[LineConnection]): Self = StObject.set(x, "newLineConnection", value.toJsFn)
    
    inline def setNewLineFill(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill]): Self = StObject.set(x, "newLineFill", value.toJsFn)
    
    inline def setNewLineProperties(value: CallbackTo[LineProperties]): Self = StObject.set(x, "newLineProperties", value.toJsFn)
    
    inline def setNewLink(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Link]): Self = StObject.set(x, "newLink", value.toJsFn)
    
    inline def setNewMasterProperties(value: CallbackTo[MasterProperties]): Self = StObject.set(x, "newMasterProperties", value.toJsFn)
    
    inline def setNewMergeTableCellsRequest(value: CallbackTo[MergeTableCellsRequest]): Self = StObject.set(x, "newMergeTableCellsRequest", value.toJsFn)
    
    inline def setNewNotesProperties(value: CallbackTo[NotesProperties]): Self = StObject.set(x, "newNotesProperties", value.toJsFn)
    
    inline def setNewOpaqueColor(value: CallbackTo[OpaqueColor]): Self = StObject.set(x, "newOpaqueColor", value.toJsFn)
    
    inline def setNewOptionalColor(value: CallbackTo[OptionalColor]): Self = StObject.set(x, "newOptionalColor", value.toJsFn)
    
    inline def setNewOutline(value: CallbackTo[Outline]): Self = StObject.set(x, "newOutline", value.toJsFn)
    
    inline def setNewOutlineFill(value: CallbackTo[OutlineFill]): Self = StObject.set(x, "newOutlineFill", value.toJsFn)
    
    inline def setNewPage(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "newPage", value.toJsFn)
    
    inline def setNewPageBackgroundFill(value: CallbackTo[PageBackgroundFill]): Self = StObject.set(x, "newPageBackgroundFill", value.toJsFn)
    
    inline def setNewPageElement(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]): Self = StObject.set(x, "newPageElement", value.toJsFn)
    
    inline def setNewPageElementProperties(value: CallbackTo[PageElementProperties]): Self = StObject.set(x, "newPageElementProperties", value.toJsFn)
    
    inline def setNewPageProperties(value: CallbackTo[PageProperties]): Self = StObject.set(x, "newPageProperties", value.toJsFn)
    
    inline def setNewParagraphMarker(value: CallbackTo[ParagraphMarker]): Self = StObject.set(x, "newParagraphMarker", value.toJsFn)
    
    inline def setNewParagraphStyle(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle]): Self = StObject.set(x, "newParagraphStyle", value.toJsFn)
    
    inline def setNewPlaceholder(value: CallbackTo[Placeholder]): Self = StObject.set(x, "newPlaceholder", value.toJsFn)
    
    inline def setNewPresentation(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation]): Self = StObject.set(x, "newPresentation", value.toJsFn)
    
    inline def setNewRange(value: CallbackTo[Range]): Self = StObject.set(x, "newRange", value.toJsFn)
    
    inline def setNewRecolor(value: CallbackTo[Recolor]): Self = StObject.set(x, "newRecolor", value.toJsFn)
    
    inline def setNewRefreshSheetsChartRequest(value: CallbackTo[RefreshSheetsChartRequest]): Self = StObject.set(x, "newRefreshSheetsChartRequest", value.toJsFn)
    
    inline def setNewReplaceAllShapesWithImageRequest(value: CallbackTo[ReplaceAllShapesWithImageRequest]): Self = StObject.set(x, "newReplaceAllShapesWithImageRequest", value.toJsFn)
    
    inline def setNewReplaceAllShapesWithSheetsChartRequest(value: CallbackTo[ReplaceAllShapesWithSheetsChartRequest]): Self = StObject.set(x, "newReplaceAllShapesWithSheetsChartRequest", value.toJsFn)
    
    inline def setNewReplaceAllTextRequest(value: CallbackTo[ReplaceAllTextRequest]): Self = StObject.set(x, "newReplaceAllTextRequest", value.toJsFn)
    
    inline def setNewReplaceImageRequest(value: CallbackTo[ReplaceImageRequest]): Self = StObject.set(x, "newReplaceImageRequest", value.toJsFn)
    
    inline def setNewRequest(value: CallbackTo[Request]): Self = StObject.set(x, "newRequest", value.toJsFn)
    
    inline def setNewRerouteLineRequest(value: CallbackTo[RerouteLineRequest]): Self = StObject.set(x, "newRerouteLineRequest", value.toJsFn)
    
    inline def setNewRgbColor(value: CallbackTo[RgbColor]): Self = StObject.set(x, "newRgbColor", value.toJsFn)
    
    inline def setNewShadow(value: CallbackTo[Shadow]): Self = StObject.set(x, "newShadow", value.toJsFn)
    
    inline def setNewShape(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape]): Self = StObject.set(x, "newShape", value.toJsFn)
    
    inline def setNewShapeBackgroundFill(value: CallbackTo[ShapeBackgroundFill]): Self = StObject.set(x, "newShapeBackgroundFill", value.toJsFn)
    
    inline def setNewShapeProperties(value: CallbackTo[ShapeProperties]): Self = StObject.set(x, "newShapeProperties", value.toJsFn)
    
    inline def setNewSheetsChart(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart]): Self = StObject.set(x, "newSheetsChart", value.toJsFn)
    
    inline def setNewSheetsChartProperties(value: CallbackTo[SheetsChartProperties]): Self = StObject.set(x, "newSheetsChartProperties", value.toJsFn)
    
    inline def setNewSize(value: CallbackTo[Size]): Self = StObject.set(x, "newSize", value.toJsFn)
    
    inline def setNewSlideProperties(value: CallbackTo[SlideProperties]): Self = StObject.set(x, "newSlideProperties", value.toJsFn)
    
    inline def setNewSolidFill(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill]): Self = StObject.set(x, "newSolidFill", value.toJsFn)
    
    inline def setNewStretchedPictureFill(value: CallbackTo[StretchedPictureFill]): Self = StObject.set(x, "newStretchedPictureFill", value.toJsFn)
    
    inline def setNewSubstringMatchCriteria(value: CallbackTo[SubstringMatchCriteria]): Self = StObject.set(x, "newSubstringMatchCriteria", value.toJsFn)
    
    inline def setNewTable(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Table]): Self = StObject.set(x, "newTable", value.toJsFn)
    
    inline def setNewTableBorderCell(value: CallbackTo[TableBorderCell]): Self = StObject.set(x, "newTableBorderCell", value.toJsFn)
    
    inline def setNewTableBorderFill(value: CallbackTo[TableBorderFill]): Self = StObject.set(x, "newTableBorderFill", value.toJsFn)
    
    inline def setNewTableBorderProperties(value: CallbackTo[TableBorderProperties]): Self = StObject.set(x, "newTableBorderProperties", value.toJsFn)
    
    inline def setNewTableBorderRow(value: CallbackTo[TableBorderRow]): Self = StObject.set(x, "newTableBorderRow", value.toJsFn)
    
    inline def setNewTableCell(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]): Self = StObject.set(x, "newTableCell", value.toJsFn)
    
    inline def setNewTableCellBackgroundFill(value: CallbackTo[TableCellBackgroundFill]): Self = StObject.set(x, "newTableCellBackgroundFill", value.toJsFn)
    
    inline def setNewTableCellLocation(value: CallbackTo[TableCellLocation]): Self = StObject.set(x, "newTableCellLocation", value.toJsFn)
    
    inline def setNewTableCellProperties(value: CallbackTo[TableCellProperties]): Self = StObject.set(x, "newTableCellProperties", value.toJsFn)
    
    inline def setNewTableColumnProperties(value: CallbackTo[TableColumnProperties]): Self = StObject.set(x, "newTableColumnProperties", value.toJsFn)
    
    inline def setNewTableRange(value: CallbackTo[TableRange]): Self = StObject.set(x, "newTableRange", value.toJsFn)
    
    inline def setNewTableRow(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]): Self = StObject.set(x, "newTableRow", value.toJsFn)
    
    inline def setNewTableRowProperties(value: CallbackTo[TableRowProperties]): Self = StObject.set(x, "newTableRowProperties", value.toJsFn)
    
    inline def setNewTextContent(value: CallbackTo[TextContent]): Self = StObject.set(x, "newTextContent", value.toJsFn)
    
    inline def setNewTextElement(value: CallbackTo[TextElement]): Self = StObject.set(x, "newTextElement", value.toJsFn)
    
    inline def setNewTextRun(value: CallbackTo[TextRun]): Self = StObject.set(x, "newTextRun", value.toJsFn)
    
    inline def setNewTextStyle(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle]): Self = StObject.set(x, "newTextStyle", value.toJsFn)
    
    inline def setNewThemeColorPair(value: CallbackTo[ThemeColorPair]): Self = StObject.set(x, "newThemeColorPair", value.toJsFn)
    
    inline def setNewUngroupObjectsRequest(value: CallbackTo[UngroupObjectsRequest]): Self = StObject.set(x, "newUngroupObjectsRequest", value.toJsFn)
    
    inline def setNewUnmergeTableCellsRequest(value: CallbackTo[UnmergeTableCellsRequest]): Self = StObject.set(x, "newUnmergeTableCellsRequest", value.toJsFn)
    
    inline def setNewUpdateImagePropertiesRequest(value: CallbackTo[UpdateImagePropertiesRequest]): Self = StObject.set(x, "newUpdateImagePropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateLineCategoryRequest(value: CallbackTo[UpdateLineCategoryRequest]): Self = StObject.set(x, "newUpdateLineCategoryRequest", value.toJsFn)
    
    inline def setNewUpdateLinePropertiesRequest(value: CallbackTo[UpdateLinePropertiesRequest]): Self = StObject.set(x, "newUpdateLinePropertiesRequest", value.toJsFn)
    
    inline def setNewUpdatePageElementAltTextRequest(value: CallbackTo[UpdatePageElementAltTextRequest]): Self = StObject.set(x, "newUpdatePageElementAltTextRequest", value.toJsFn)
    
    inline def setNewUpdatePageElementTransformRequest(value: CallbackTo[UpdatePageElementTransformRequest]): Self = StObject.set(x, "newUpdatePageElementTransformRequest", value.toJsFn)
    
    inline def setNewUpdatePageElementsZOrderRequest(value: CallbackTo[UpdatePageElementsZOrderRequest]): Self = StObject.set(x, "newUpdatePageElementsZOrderRequest", value.toJsFn)
    
    inline def setNewUpdatePagePropertiesRequest(value: CallbackTo[UpdatePagePropertiesRequest]): Self = StObject.set(x, "newUpdatePagePropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateParagraphStyleRequest(value: CallbackTo[UpdateParagraphStyleRequest]): Self = StObject.set(x, "newUpdateParagraphStyleRequest", value.toJsFn)
    
    inline def setNewUpdateShapePropertiesRequest(value: CallbackTo[UpdateShapePropertiesRequest]): Self = StObject.set(x, "newUpdateShapePropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateSlidesPositionRequest(value: CallbackTo[UpdateSlidesPositionRequest]): Self = StObject.set(x, "newUpdateSlidesPositionRequest", value.toJsFn)
    
    inline def setNewUpdateTableBorderPropertiesRequest(value: CallbackTo[UpdateTableBorderPropertiesRequest]): Self = StObject.set(x, "newUpdateTableBorderPropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateTableCellPropertiesRequest(value: CallbackTo[UpdateTableCellPropertiesRequest]): Self = StObject.set(x, "newUpdateTableCellPropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateTableColumnPropertiesRequest(value: CallbackTo[UpdateTableColumnPropertiesRequest]): Self = StObject.set(x, "newUpdateTableColumnPropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateTableRowPropertiesRequest(value: CallbackTo[UpdateTableRowPropertiesRequest]): Self = StObject.set(x, "newUpdateTableRowPropertiesRequest", value.toJsFn)
    
    inline def setNewUpdateTextStyleRequest(value: CallbackTo[UpdateTextStyleRequest]): Self = StObject.set(x, "newUpdateTextStyleRequest", value.toJsFn)
    
    inline def setNewUpdateVideoPropertiesRequest(value: CallbackTo[UpdateVideoPropertiesRequest]): Self = StObject.set(x, "newUpdateVideoPropertiesRequest", value.toJsFn)
    
    inline def setNewVideo(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Video]): Self = StObject.set(x, "newVideo", value.toJsFn)
    
    inline def setNewVideoProperties(value: CallbackTo[VideoProperties]): Self = StObject.set(x, "newVideoProperties", value.toJsFn)
    
    inline def setNewWeightedFontFamily(value: CallbackTo[WeightedFontFamily]): Self = StObject.set(x, "newWeightedFontFamily", value.toJsFn)
    
    inline def setNewWordArt(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt]): Self = StObject.set(x, "newWordArt", value.toJsFn)
    
    inline def setNewWriteControl(value: CallbackTo[WriteControl]): Self = StObject.set(x, "newWriteControl", value.toJsFn)
    
    inline def setPresentations(value: PresentationsCollection): Self = StObject.set(x, "Presentations", value.asInstanceOf[js.Any])
    
    inline def setPresentationsUndefined: Self = StObject.set(x, "Presentations", js.undefined)
  }
  
  /**
    * A solid color fill.
    *
    * SolidFill objects are detached and immutable, so do not reflect changes made after
    * they have been created.
    */
  trait SolidFill extends StObject {
    
    def getAlpha(): Double
    
    def getColor(): Color
  }
  object SolidFill {
    
    inline def apply(getAlpha: CallbackTo[Double], getColor: CallbackTo[Color]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill = {
      val __obj = js.Dynamic.literal(getAlpha = getAlpha.toJsFn, getColor = getColor.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SolidFill](x: Self) {
      
      inline def setGetAlpha(value: CallbackTo[Double]): Self = StObject.set(x, "getAlpha", value.toJsFn)
      
      inline def setGetColor(value: CallbackTo[Color]): Self = StObject.set(x, "getColor", value.toJsFn)
    }
  }
  
  /**
    * A PageElement representing a table.
    */
  @js.native
  trait Table extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def appendColumn(): TableColumn = js.native
    
    def appendRow(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getCell(rowIndex: Integer, columnIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
    
    def getColumn(columnIndex: Integer): TableColumn = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getNumColumns(): Integer = js.native
    
    def getNumRows(): Integer = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getRow(rowIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def insertColumn(index: Integer): TableColumn = js.native
    
    def insertRow(index: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
  }
  
  /**
    * A cell in a table.
    */
  trait TableCell extends StObject {
    
    def getColumnIndex(): Integer
    
    def getColumnSpan(): Integer
    
    def getContentAlignment(): ContentAlignment
    
    def getFill(): Fill
    
    def getHeadCell(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell
    
    def getMergeState(): CellMergeState
    
    def getParentColumn(): TableColumn
    
    def getParentRow(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow
    
    def getParentTable(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table
    
    def getRowIndex(): Integer
    
    def getRowSpan(): Integer
    
    def getText(): TextRange
    
    def setContentAlignment(contentAlignment: ContentAlignment): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell
  }
  object TableCell {
    
    inline def apply(
      getColumnIndex: CallbackTo[Integer],
      getColumnSpan: CallbackTo[Integer],
      getContentAlignment: CallbackTo[ContentAlignment],
      getFill: CallbackTo[Fill],
      getHeadCell: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell],
      getMergeState: CallbackTo[CellMergeState],
      getParentColumn: CallbackTo[TableColumn],
      getParentRow: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow],
      getParentTable: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table],
      getRowIndex: CallbackTo[Integer],
      getRowSpan: CallbackTo[Integer],
      getText: CallbackTo[TextRange],
      setContentAlignment: ContentAlignment => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell = {
      val __obj = js.Dynamic.literal(getColumnIndex = getColumnIndex.toJsFn, getColumnSpan = getColumnSpan.toJsFn, getContentAlignment = getContentAlignment.toJsFn, getFill = getFill.toJsFn, getHeadCell = getHeadCell.toJsFn, getMergeState = getMergeState.toJsFn, getParentColumn = getParentColumn.toJsFn, getParentRow = getParentRow.toJsFn, getParentTable = getParentTable.toJsFn, getRowIndex = getRowIndex.toJsFn, getRowSpan = getRowSpan.toJsFn, getText = getText.toJsFn, setContentAlignment = js.Any.fromFunction1(setContentAlignment))
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell](x: Self) {
      
      inline def setGetColumnIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getColumnIndex", value.toJsFn)
      
      inline def setGetColumnSpan(value: CallbackTo[Integer]): Self = StObject.set(x, "getColumnSpan", value.toJsFn)
      
      inline def setGetContentAlignment(value: CallbackTo[ContentAlignment]): Self = StObject.set(x, "getContentAlignment", value.toJsFn)
      
      inline def setGetFill(value: CallbackTo[Fill]): Self = StObject.set(x, "getFill", value.toJsFn)
      
      inline def setGetHeadCell(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell]): Self = StObject.set(x, "getHeadCell", value.toJsFn)
      
      inline def setGetMergeState(value: CallbackTo[CellMergeState]): Self = StObject.set(x, "getMergeState", value.toJsFn)
      
      inline def setGetParentColumn(value: CallbackTo[TableColumn]): Self = StObject.set(x, "getParentColumn", value.toJsFn)
      
      inline def setGetParentRow(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow]): Self = StObject.set(x, "getParentRow", value.toJsFn)
      
      inline def setGetParentTable(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table]): Self = StObject.set(x, "getParentTable", value.toJsFn)
      
      inline def setGetRowIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getRowIndex", value.toJsFn)
      
      inline def setGetRowSpan(value: CallbackTo[Integer]): Self = StObject.set(x, "getRowSpan", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[TextRange]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setSetContentAlignment(value: ContentAlignment => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "setContentAlignment", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A collection of one or more TableCell instances.
    */
  trait TableCellRange extends StObject {
    
    def getTableCells(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell]
  }
  object TableCellRange {
    
    inline def apply(
      getTableCells: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell]]
    ): TableCellRange = {
      val __obj = js.Dynamic.literal(getTableCells = getTableCells.toJsFn)
      __obj.asInstanceOf[TableCellRange]
    }
    
    extension [Self <: TableCellRange](x: Self) {
      
      inline def setGetTableCells(value: CallbackTo[js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell]]): Self = StObject.set(x, "getTableCells", value.toJsFn)
    }
  }
  
  /**
    * A column in a table. A column consists of a list of table cells. A column is identified by the
    * column index.
    */
  trait TableColumn extends StObject {
    
    def getCell(cellIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell
    
    def getIndex(): Integer
    
    def getNumCells(): Integer
    
    def getParentTable(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table
    
    def getWidth(): Double
    
    def remove(): Unit
  }
  object TableColumn {
    
    inline def apply(
      getCell: Integer => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell,
      getIndex: CallbackTo[Integer],
      getNumCells: CallbackTo[Integer],
      getParentTable: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table],
      getWidth: CallbackTo[Double],
      remove: Callback
    ): TableColumn = {
      val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = getIndex.toJsFn, getNumCells = getNumCells.toJsFn, getParentTable = getParentTable.toJsFn, getWidth = getWidth.toJsFn, remove = remove.toJsFn)
      __obj.asInstanceOf[TableColumn]
    }
    
    extension [Self <: TableColumn](x: Self) {
      
      inline def setGetCell(value: Integer => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
      
      inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetNumCells(value: CallbackTo[Integer]): Self = StObject.set(x, "getNumCells", value.toJsFn)
      
      inline def setGetParentTable(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table]): Self = StObject.set(x, "getParentTable", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
  
  /**
    * A row in a table. A row consists of a list of table cells. A row is identified by the row index.
    */
  trait TableRow extends StObject {
    
    def getCell(cellIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell
    
    def getIndex(): Integer
    
    def getMinimumHeight(): Double
    
    def getNumCells(): Integer
    
    def getParentTable(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table
    
    def remove(): Unit
  }
  object TableRow {
    
    inline def apply(
      getCell: Integer => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell,
      getIndex: CallbackTo[Integer],
      getMinimumHeight: CallbackTo[Double],
      getNumCells: CallbackTo[Integer],
      getParentTable: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table],
      remove: Callback
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow = {
      val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = getIndex.toJsFn, getMinimumHeight = getMinimumHeight.toJsFn, getNumCells = getNumCells.toJsFn, getParentTable = getParentTable.toJsFn, remove = remove.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableRow](x: Self) {
      
      inline def setGetCell(value: Integer => typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
      
      inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetMinimumHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getMinimumHeight", value.toJsFn)
      
      inline def setGetNumCells(value: CallbackTo[Integer]): Self = StObject.set(x, "getNumCells", value.toJsFn)
      
      inline def setGetParentTable(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Table]): Self = StObject.set(x, "getParentTable", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
  
  /**
    * A segment of the text contents of a Shape or a TableCell.
    */
  @js.native
  trait TextRange extends StObject {
    
    def appendParagraph(text: String): Paragraph = js.native
    
    def appendRange(textRange: TextRange): TextRange = js.native
    def appendRange(textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
    
    def appendText(text: String): TextRange = js.native
    
    def asRenderedString(): String = js.native
    
    def asString(): String = js.native
    
    def clear(): Unit = js.native
    def clear(startOffset: Integer, endOffset: Integer): Unit = js.native
    
    def find(pattern: String): js.Array[TextRange] = js.native
    def find(pattern: String, startOffset: Integer): js.Array[TextRange] = js.native
    
    def getAutoTexts(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoText] = js.native
    
    def getEndIndex(): Integer = js.native
    
    def getLength(): Integer = js.native
    
    def getLinks(): js.Array[TextRange] = js.native
    
    def getListParagraphs(): js.Array[Paragraph] = js.native
    
    def getListStyle(): ListStyle = js.native
    
    def getParagraphStyle(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def getParagraphs(): js.Array[Paragraph] = js.native
    
    def getRange(startOffset: Integer, endOffset: Integer): TextRange = js.native
    
    def getRuns(): js.Array[TextRange] = js.native
    
    def getStartIndex(): Integer = js.native
    
    def getTextStyle(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def insertParagraph(startOffset: Integer, text: String): Paragraph = js.native
    
    def insertRange(startOffset: Integer, textRange: TextRange): TextRange = js.native
    def insertRange(startOffset: Integer, textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
    
    def insertText(startOffset: Integer, text: String): TextRange = js.native
    
    def isEmpty(): Boolean = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def select(): Unit = js.native
    
    def setText(newText: String): TextRange = js.native
  }
  
  /**
    * The style of text.
    *
    * Read methods in this class return null if the corresponding TextRange spans
    * multiple text runs, and those runs have different values for the read method being called. To
    * avoid this, query for text styles using the TextRanges returned by the TextRange.getRuns() method.
    */
  @js.native
  trait TextStyle extends StObject {
    
    def getBackgroundColor(): Color = js.native
    
    def getBaselineOffset(): TextBaselineOffset = js.native
    
    def getFontFamily(): String = js.native
    
    def getFontSize(): Double = js.native
    
    def getFontWeight(): Integer = js.native
    
    def getForegroundColor(): Color = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def hasLink(): Boolean = js.native
    
    def isBackgroundTransparent(): Boolean = js.native
    
    def isBold(): Boolean = js.native
    
    def isItalic(): Boolean = js.native
    
    def isSmallCaps(): Boolean = js.native
    
    def isStrikethrough(): Boolean = js.native
    
    def isUnderline(): Boolean = js.native
    
    def removeLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBackgroundColor(color: Color): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(color: ThemeColorType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(hexColor: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(red: Integer, green: Integer, blue: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBackgroundColorTransparent(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBaselineOffset(offset: TextBaselineOffset): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBold(bold: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontFamily(fontFamily: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontFamilyAndWeight(fontFamily: String, fontWeight: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontSize(fontSize: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setForegroundColor(color: ThemeColorType): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(foregroundColor: Color): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(hexColor: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(red: Integer, green: Integer, blue: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setItalic(italic: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setSmallCaps(smallCaps: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setStrikethrough(strikethrough: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setUnderline(underline: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
  }
  
  /**
    * A color that refers to an entry in the page's ColorScheme.
    */
  trait ThemeColor extends StObject {
    
    def getColorType(): ColorType
    
    def getThemeColorType(): ThemeColorType
  }
  object ThemeColor {
    
    inline def apply(getColorType: CallbackTo[ColorType], getThemeColorType: CallbackTo[ThemeColorType]): ThemeColor = {
      val __obj = js.Dynamic.literal(getColorType = getColorType.toJsFn, getThemeColorType = getThemeColorType.toJsFn)
      __obj.asInstanceOf[ThemeColor]
    }
    
    extension [Self <: ThemeColor](x: Self) {
      
      inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
      
      inline def setGetThemeColorType(value: CallbackTo[ThemeColorType]): Self = StObject.set(x, "getThemeColorType", value.toJsFn)
    }
  }
  
  /**
    * A PageElement representing a video.
    */
  @js.native
  trait Video extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSource(): VideoSourceType = js.native
    
    def getThumbnailUrl(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getUrl(): String = js.native
    
    def getVideoId(): String = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
  }
  
  /**
    * A PageElement representing word art.
    */
  @js.native
  trait WordArt extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringForward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringToFront(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def duplicate(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRenderedText(): String = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def scaleWidth(ratio: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def sendToBack(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setHeight(height: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setLeft(left: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTitle(title: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTop(top: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTransform(transform: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setWidth(width: Double): typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
  }
}
