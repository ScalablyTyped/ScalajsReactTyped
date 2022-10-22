package typingsJapgolly.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveContest extends StObject {
  
  var appeal: Double
  
  var condition: String
  
  var contest: String
  
  var jam: Double
}
object MoveContest {
  
  inline def apply(appeal: Double, condition: String, contest: String, jam: Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], contest = contest.asInstanceOf[js.Any], jam = jam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContest]
  }
  
  extension [Self <: MoveContest](x: Self) {
    
    inline def setAppeal(value: Double): Self = StObject.set(x, "appeal", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setContest(value: String): Self = StObject.set(x, "contest", value.asInstanceOf[js.Any])
    
    inline def setJam(value: Double): Self = StObject.set(x, "jam", value.asInstanceOf[js.Any])
  }
}
