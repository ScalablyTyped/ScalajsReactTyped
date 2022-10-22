package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMerged extends StObject {
  
  var autoMerged: scala.Double
  
  var takeSourceContent: scala.Double
  
  var takeTargetContent: scala.Double
  
  var undecided: scala.Double
  
  var userMerged: scala.Double
}
object AutoMerged {
  
  inline def apply(
    autoMerged: scala.Double,
    takeSourceContent: scala.Double,
    takeTargetContent: scala.Double,
    undecided: scala.Double,
    userMerged: scala.Double
  ): AutoMerged = {
    val __obj = js.Dynamic.literal(autoMerged = autoMerged.asInstanceOf[js.Any], takeSourceContent = takeSourceContent.asInstanceOf[js.Any], takeTargetContent = takeTargetContent.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any], userMerged = userMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerged]
  }
  
  extension [Self <: AutoMerged](x: Self) {
    
    inline def setAutoMerged(value: scala.Double): Self = StObject.set(x, "autoMerged", value.asInstanceOf[js.Any])
    
    inline def setTakeSourceContent(value: scala.Double): Self = StObject.set(x, "takeSourceContent", value.asInstanceOf[js.Any])
    
    inline def setTakeTargetContent(value: scala.Double): Self = StObject.set(x, "takeTargetContent", value.asInstanceOf[js.Any])
    
    inline def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
    
    inline def setUserMerged(value: scala.Double): Self = StObject.set(x, "userMerged", value.asInstanceOf[js.Any])
  }
}
