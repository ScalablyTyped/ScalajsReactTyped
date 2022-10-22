package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropCap extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def Clear(): Unit
  
  val Creator: Double
  
  var DistanceFromText: Double
  
  def Enable(): Unit
  
  var FontName: String
  
  var LinesToDrop: Double
  
  val Parent: Any
  
  var Position: WdDropPosition
  
  /* private */ @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: DropCap
}
object DropCap {
  
  inline def apply(
    Application: Application,
    Clear: Callback,
    Creator: Double,
    DistanceFromText: Double,
    Enable: Callback,
    FontName: String,
    LinesToDrop: Double,
    Parent: Any,
    Position: WdDropPosition,
    WordDotDropCap_typekey: DropCap
  ): DropCap = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = Clear.toJsFn, Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Enable = Enable.toJsFn, FontName = FontName.asInstanceOf[js.Any], LinesToDrop = LinesToDrop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropCap_typekey")(WordDotDropCap_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCap]
  }
  
  extension [Self <: DropCap](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromText(value: Double): Self = StObject.set(x, "DistanceFromText", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "Enable", value.toJsFn)
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setLinesToDrop(value: Double): Self = StObject.set(x, "LinesToDrop", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: WdDropPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setWordDotDropCap_typekey(value: DropCap): Self = StObject.set(x, "Word.DropCap_typekey", value.asInstanceOf[js.Any])
  }
}
