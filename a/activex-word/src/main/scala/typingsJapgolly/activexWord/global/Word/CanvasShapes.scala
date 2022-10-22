package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoCalloutType
import typingsJapgolly.activexOffice.Office.MsoConnectorType
import typingsJapgolly.activexOffice.Office.MsoEditingType
import typingsJapgolly.activexOffice.Office.MsoPresetTextEffect
import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.CanvasShapes")
@js.native
/* private */ open class CanvasShapes ()
  extends StObject
     with typingsJapgolly.activexWord.Word.CanvasShapes {
  
  /* CompleteClass */
  override def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddCurve(SafeArrayOfPoints: Any): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[Any],
    SaveWithDocument: js.UndefOr[Any],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any]
  ): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddPolyline(SafeArrayOfPoints: Any): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): typingsJapgolly.activexWord.Word.FreeformBuilder = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Range(Index: Any): typingsJapgolly.activexWord.Word.ShapeRange = js.native
  
  /* CompleteClass */
  override def SelectAll(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: typingsJapgolly.activexWord.Word.CanvasShapes = js.native
}
