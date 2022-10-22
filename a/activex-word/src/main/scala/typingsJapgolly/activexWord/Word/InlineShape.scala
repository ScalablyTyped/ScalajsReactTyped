package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.Script
import typingsJapgolly.activexOffice.Office.SmartArt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineShape extends StObject {
  
  def Activate(): Unit
  
  var AlternativeText: String
  
  val AnchorID: Double
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Borders: typingsJapgolly.activexWord.Word.Borders
  
  val Chart: typingsJapgolly.activexWord.Word.Chart
  
  def ConvertToShape(): Shape
  
  val Creator: Double
  
  def Delete(): Unit
  
  val EditID: Double
  
  val Field: typingsJapgolly.activexWord.Word.Field
  
  val Fill: FillFormat
  
  val Glow: GlowFormat
  
  val GroupItems: GroupShapes
  
  val HasChart: MsoTriState
  
  val HasSmartArt: MsoTriState
  
  var Height: Double
  
  val HorizontalLineFormat: typingsJapgolly.activexWord.Word.HorizontalLineFormat
  
  val Hyperlink: typingsJapgolly.activexWord.Word.Hyperlink
  
  val IsPictureBullet: Boolean
  
  val Line: LineFormat
  
  val LinkFormat: typingsJapgolly.activexWord.Word.LinkFormat
  
  var LockAspectRatio: MsoTriState
  
  val OLEFormat: typingsJapgolly.activexWord.Word.OLEFormat
  
  val OWSAnchor: Double
  
  val Parent: Any
  
  var PictureFormat: typingsJapgolly.activexWord.Word.PictureFormat
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  val Reflection: ReflectionFormat
  
  def Reset(): Unit
  
  var ScaleHeight: Double
  
  var ScaleWidth: Double
  
  val Script: typingsJapgolly.activexOffice.Office.Script
  
  def Select(): Unit
  
  val Shadow: ShadowFormat
  
  val SmartArt: typingsJapgolly.activexOffice.Office.SmartArt
  
  val SoftEdge: SoftEdgeFormat
  
  var TextEffect: TextEffectFormat
  
  var Title: String
  
  val Type: WdInlineShapeType
  
  var Width: Double
  
  /* private */ @JSName("Word.InlineShape_typekey")
  var WordDotInlineShape_typekey: InlineShape
}
object InlineShape {
  
  inline def apply(
    Activate: Callback,
    AlternativeText: String,
    AnchorID: Double,
    Application: Application,
    Borders: Borders,
    Chart: Chart,
    ConvertToShape: CallbackTo[Shape],
    Creator: Double,
    Delete: Callback,
    EditID: Double,
    Field: Field,
    Fill: FillFormat,
    Glow: GlowFormat,
    GroupItems: GroupShapes,
    HasChart: MsoTriState,
    HasSmartArt: MsoTriState,
    Height: Double,
    HorizontalLineFormat: HorizontalLineFormat,
    Hyperlink: Hyperlink,
    IsPictureBullet: Boolean,
    Line: LineFormat,
    LinkFormat: LinkFormat,
    LockAspectRatio: MsoTriState,
    OLEFormat: OLEFormat,
    OWSAnchor: Double,
    Parent: Any,
    PictureFormat: PictureFormat,
    Range: Range,
    Reflection: ReflectionFormat,
    Reset: Callback,
    ScaleHeight: Double,
    ScaleWidth: Double,
    Script: Script,
    Select: Callback,
    Shadow: ShadowFormat,
    SmartArt: SmartArt,
    SoftEdge: SoftEdgeFormat,
    TextEffect: TextEffectFormat,
    Title: String,
    Type: WdInlineShapeType,
    Width: Double,
    WordDotInlineShape_typekey: InlineShape
  ): InlineShape = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, AlternativeText = AlternativeText.asInstanceOf[js.Any], AnchorID = AnchorID.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Chart = Chart.asInstanceOf[js.Any], ConvertToShape = ConvertToShape.toJsFn, Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, EditID = EditID.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], GroupItems = GroupItems.asInstanceOf[js.Any], HasChart = HasChart.asInstanceOf[js.Any], HasSmartArt = HasSmartArt.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalLineFormat = HorizontalLineFormat.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], IsPictureBullet = IsPictureBullet.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], OWSAnchor = OWSAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Reset = Reset.toJsFn, ScaleHeight = ScaleHeight.asInstanceOf[js.Any], ScaleWidth = ScaleWidth.asInstanceOf[js.Any], Script = Script.asInstanceOf[js.Any], Select = Select.toJsFn, Shadow = Shadow.asInstanceOf[js.Any], SmartArt = SmartArt.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.InlineShape_typekey")(WordDotInlineShape_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineShape]
  }
  
  extension [Self <: InlineShape](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setAlternativeText(value: String): Self = StObject.set(x, "AlternativeText", value.asInstanceOf[js.Any])
    
    inline def setAnchorID(value: Double): Self = StObject.set(x, "AnchorID", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setChart(value: Chart): Self = StObject.set(x, "Chart", value.asInstanceOf[js.Any])
    
    inline def setConvertToShape(value: CallbackTo[Shape]): Self = StObject.set(x, "ConvertToShape", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEditID(value: Double): Self = StObject.set(x, "EditID", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    inline def setGroupItems(value: GroupShapes): Self = StObject.set(x, "GroupItems", value.asInstanceOf[js.Any])
    
    inline def setHasChart(value: MsoTriState): Self = StObject.set(x, "HasChart", value.asInstanceOf[js.Any])
    
    inline def setHasSmartArt(value: MsoTriState): Self = StObject.set(x, "HasSmartArt", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineFormat(value: HorizontalLineFormat): Self = StObject.set(x, "HorizontalLineFormat", value.asInstanceOf[js.Any])
    
    inline def setHyperlink(value: Hyperlink): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    inline def setIsPictureBullet(value: Boolean): Self = StObject.set(x, "IsPictureBullet", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setLinkFormat(value: LinkFormat): Self = StObject.set(x, "LinkFormat", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatio(value: MsoTriState): Self = StObject.set(x, "LockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setOLEFormat(value: OLEFormat): Self = StObject.set(x, "OLEFormat", value.asInstanceOf[js.Any])
    
    inline def setOWSAnchor(value: Double): Self = StObject.set(x, "OWSAnchor", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPictureFormat(value: PictureFormat): Self = StObject.set(x, "PictureFormat", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setScaleHeight(value: Double): Self = StObject.set(x, "ScaleHeight", value.asInstanceOf[js.Any])
    
    inline def setScaleWidth(value: Double): Self = StObject.set(x, "ScaleWidth", value.asInstanceOf[js.Any])
    
    inline def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSmartArt(value: SmartArt): Self = StObject.set(x, "SmartArt", value.asInstanceOf[js.Any])
    
    inline def setSoftEdge(value: SoftEdgeFormat): Self = StObject.set(x, "SoftEdge", value.asInstanceOf[js.Any])
    
    inline def setTextEffect(value: TextEffectFormat): Self = StObject.set(x, "TextEffect", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdInlineShapeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotInlineShape_typekey(value: InlineShape): Self = StObject.set(x, "Word.InlineShape_typekey", value.asInstanceOf[js.Any])
  }
}
