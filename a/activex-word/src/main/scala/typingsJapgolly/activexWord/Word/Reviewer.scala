package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reviewer extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val Parent: Any
  
  var Visible: Boolean
  
  /* private */ @JSName("Word.Reviewer_typekey")
  var WordDotReviewer_typekey: Reviewer
}
object Reviewer {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Parent: Any,
    Visible: Boolean,
    WordDotReviewer_typekey: Reviewer
  ): Reviewer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Reviewer_typekey")(WordDotReviewer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewer]
  }
  
  extension [Self <: Reviewer](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWordDotReviewer_typekey(value: Reviewer): Self = StObject.set(x, "Word.Reviewer_typekey", value.asInstanceOf[js.Any])
  }
}
