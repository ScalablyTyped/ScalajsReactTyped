package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coauthoring extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val CoauthorCount: Double
  
  def EndReview(): Unit
  
  var FavorServerEditsDuringMerge: Boolean
  
  val MergeMode: Boolean
  
  val Parent: Any
  
  val PendingUpdates: Boolean
  
  /* private */ @JSName("PowerPoint.Coauthoring_typekey")
  var PowerPointDotCoauthoring_typekey: Coauthoring
}
object Coauthoring {
  
  inline def apply(
    Application: Application,
    CoauthorCount: Double,
    EndReview: Callback,
    FavorServerEditsDuringMerge: Boolean,
    MergeMode: Boolean,
    Parent: Any,
    PendingUpdates: Boolean,
    PowerPointDotCoauthoring_typekey: Coauthoring
  ): Coauthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CoauthorCount = CoauthorCount.asInstanceOf[js.Any], EndReview = EndReview.toJsFn, FavorServerEditsDuringMerge = FavorServerEditsDuringMerge.asInstanceOf[js.Any], MergeMode = MergeMode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Coauthoring_typekey")(PowerPointDotCoauthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coauthoring]
  }
  
  extension [Self <: Coauthoring](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCoauthorCount(value: Double): Self = StObject.set(x, "CoauthorCount", value.asInstanceOf[js.Any])
    
    inline def setEndReview(value: Callback): Self = StObject.set(x, "EndReview", value.toJsFn)
    
    inline def setFavorServerEditsDuringMerge(value: Boolean): Self = StObject.set(x, "FavorServerEditsDuringMerge", value.asInstanceOf[js.Any])
    
    inline def setMergeMode(value: Boolean): Self = StObject.set(x, "MergeMode", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPendingUpdates(value: Boolean): Self = StObject.set(x, "PendingUpdates", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCoauthoring_typekey(value: Coauthoring): Self = StObject.set(x, "PowerPoint.Coauthoring_typekey", value.asInstanceOf[js.Any])
  }
}
