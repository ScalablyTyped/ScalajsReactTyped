package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexOffice.Office.MsoThemeColorSchemeIndex
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.ThemeColor
import typingsJapgolly.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayout extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Background: ShapeRange
  
  def Copy(): Unit
  
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design
  
  var DisplayMasterShapes: MsoTriState
  
  def Duplicate(): CustomLayout
  
  var FollowMasterBackground: MsoTriState
  
  val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters
  
  val Height: Double
  
  val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks
  
  val Index: Double
  
  var MatchingName: String
  
  def MoveTo(toPos: Double): Unit
  
  var Name: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: CustomLayout
  
  var Preserved: MsoTriState
  
  def Select(): Unit
  
  val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes
  
  val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme
  
  val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine
  
  val Width: Double
}
object CustomLayout {
  
  inline def apply(
    Application: Application,
    Background: ShapeRange,
    Copy: Callback,
    CustomerData: CustomerData,
    Cut: Callback,
    Delete: Callback,
    Design: Design,
    DisplayMasterShapes: MsoTriState,
    Duplicate: CallbackTo[CustomLayout],
    FollowMasterBackground: MsoTriState,
    HeadersFooters: HeadersFooters,
    Height: Double,
    Hyperlinks: Hyperlinks,
    Index: Double,
    MatchingName: String,
    MoveTo: Double => Callback,
    Name: String,
    Parent: Any,
    PowerPointDotCustomLayout_typekey: CustomLayout,
    Preserved: MsoTriState,
    Select: Callback,
    Shapes: Shapes,
    SlideShowTransition: SlideShowTransition,
    ThemeColorScheme: ThemeColorScheme,
    TimeLine: TimeLine,
    Width: Double
  ): CustomLayout = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Copy = Copy.toJsFn, CustomerData = CustomerData.asInstanceOf[js.Any], Cut = Cut.toJsFn, Delete = Delete.toJsFn, Design = Design.asInstanceOf[js.Any], DisplayMasterShapes = DisplayMasterShapes.asInstanceOf[js.Any], Duplicate = Duplicate.toJsFn, FollowMasterBackground = FollowMasterBackground.asInstanceOf[js.Any], HeadersFooters = HeadersFooters.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hyperlinks = Hyperlinks.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MatchingName = MatchingName.asInstanceOf[js.Any], MoveTo = js.Any.fromFunction1((t0: Double) => MoveTo(t0).runNow()), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Preserved = Preserved.asInstanceOf[js.Any], Select = Select.toJsFn, Shapes = Shapes.asInstanceOf[js.Any], SlideShowTransition = SlideShowTransition.asInstanceOf[js.Any], ThemeColorScheme = ThemeColorScheme.asInstanceOf[js.Any], TimeLine = TimeLine.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomLayout_typekey")(PowerPointDotCustomLayout_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayout]
  }
  
  extension [Self <: CustomLayout](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: ShapeRange): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCustomerData(value: CustomerData): Self = StObject.set(x, "CustomerData", value.asInstanceOf[js.Any])
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDesign(value: Design): Self = StObject.set(x, "Design", value.asInstanceOf[js.Any])
    
    inline def setDisplayMasterShapes(value: MsoTriState): Self = StObject.set(x, "DisplayMasterShapes", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: CallbackTo[CustomLayout]): Self = StObject.set(x, "Duplicate", value.toJsFn)
    
    inline def setFollowMasterBackground(value: MsoTriState): Self = StObject.set(x, "FollowMasterBackground", value.asInstanceOf[js.Any])
    
    inline def setHeadersFooters(value: HeadersFooters): Self = StObject.set(x, "HeadersFooters", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHyperlinks(value: Hyperlinks): Self = StObject.set(x, "Hyperlinks", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMatchingName(value: String): Self = StObject.set(x, "MatchingName", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: Double => Callback): Self = StObject.set(x, "MoveTo", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCustomLayout_typekey(value: CustomLayout): Self = StObject.set(x, "PowerPoint.CustomLayout_typekey", value.asInstanceOf[js.Any])
    
    inline def setPreserved(value: MsoTriState): Self = StObject.set(x, "Preserved", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setShapes(value: Shapes): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    inline def setSlideShowTransition(value: SlideShowTransition): Self = StObject.set(x, "SlideShowTransition", value.asInstanceOf[js.Any])
    
    inline def setThemeColorScheme(value: ThemeColorScheme): Self = StObject.set(x, "ThemeColorScheme", value.asInstanceOf[js.Any])
    
    inline def setTimeLine(value: TimeLine): Self = StObject.set(x, "TimeLine", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
