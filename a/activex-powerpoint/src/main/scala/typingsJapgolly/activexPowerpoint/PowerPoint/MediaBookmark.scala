package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaBookmark extends StObject {
  
  def Delete(): Unit
  
  val Index: Double
  
  val Name: String
  
  val Position: Double
  
  /* private */ @JSName("PowerPoint.MediaBookmark_typekey")
  var PowerPointDotMediaBookmark_typekey: MediaBookmark
}
object MediaBookmark {
  
  inline def apply(
    Delete: Callback,
    Index: Double,
    Name: String,
    Position: Double,
    PowerPointDotMediaBookmark_typekey: MediaBookmark
  ): MediaBookmark = {
    val __obj = js.Dynamic.literal(Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.MediaBookmark_typekey")(PowerPointDotMediaBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmark]
  }
  
  extension [Self <: MediaBookmark](x: Self) {
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotMediaBookmark_typekey(value: MediaBookmark): Self = StObject.set(x, "PowerPoint.MediaBookmark_typekey", value.asInstanceOf[js.Any])
  }
}
