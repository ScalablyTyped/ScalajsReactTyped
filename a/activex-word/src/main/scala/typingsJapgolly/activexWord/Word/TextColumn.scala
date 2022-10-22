package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColumn extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val Parent: Any
  
  var SpaceAfter: Double
  
  var Width: Double
  
  /* private */ @JSName("Word.TextColumn_typekey")
  var WordDotTextColumn_typekey: TextColumn
}
object TextColumn {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Parent: Any,
    SpaceAfter: Double,
    Width: Double,
    WordDotTextColumn_typekey: TextColumn
  ): TextColumn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextColumn_typekey")(WordDotTextColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
  
  extension [Self <: TextColumn](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "SpaceAfter", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotTextColumn_typekey(value: TextColumn): Self = StObject.set(x, "Word.TextColumn_typekey", value.asInstanceOf[js.Any])
  }
}
