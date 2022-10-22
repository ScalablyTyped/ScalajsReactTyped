package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCharacters extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var Caption: String
  
  val Count: Double
  
  val Creator: Double
  
  def Delete(): Any
  
  val Font: ChartFont
  
  def Insert(String: String): Any
  
  val Parent: Any
  
  var PhoneticCharacters: String
  
  /* private */ @JSName("PowerPoint.ChartCharacters_typekey")
  var PowerPointDotChartCharacters_typekey: ChartCharacters
  
  var Text: String
}
object ChartCharacters {
  
  inline def apply(
    Application: Application,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: CallbackTo[Any],
    Font: ChartFont,
    Insert: String => Any,
    Parent: Any,
    PhoneticCharacters: String,
    PowerPointDotChartCharacters_typekey: ChartCharacters,
    Text: String
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartCharacters_typekey")(PowerPointDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
  
  extension [Self <: ChartCharacters](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setInsert(value: String => Any): Self = StObject.set(x, "Insert", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPhoneticCharacters(value: String): Self = StObject.set(x, "PhoneticCharacters", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartCharacters_typekey(value: ChartCharacters): Self = StObject.set(x, "PowerPoint.ChartCharacters_typekey", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
