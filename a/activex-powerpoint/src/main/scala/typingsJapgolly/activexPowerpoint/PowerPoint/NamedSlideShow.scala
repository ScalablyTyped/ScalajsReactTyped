package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedSlideShow extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Delete(): Unit
  
  val Name: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.NamedSlideShow_typekey")
  var PowerPointDotNamedSlideShow_typekey: NamedSlideShow
  
  val SlideIDs: Any
}
object NamedSlideShow {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Delete: Callback,
    Name: String,
    Parent: Any,
    PowerPointDotNamedSlideShow_typekey: NamedSlideShow,
    SlideIDs: Any
  ): NamedSlideShow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = Delete.toJsFn, Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideIDs = SlideIDs.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShow_typekey")(PowerPointDotNamedSlideShow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShow]
  }
  
  extension [Self <: NamedSlideShow](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotNamedSlideShow_typekey(value: NamedSlideShow): Self = StObject.set(x, "PowerPoint.NamedSlideShow_typekey", value.asInstanceOf[js.Any])
    
    inline def setSlideIDs(value: Any): Self = StObject.set(x, "SlideIDs", value.asInstanceOf[js.Any])
  }
}
