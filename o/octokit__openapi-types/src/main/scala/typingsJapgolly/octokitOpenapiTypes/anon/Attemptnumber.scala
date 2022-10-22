package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attemptnumber extends StObject {
  
  /** The attempt number of the workflow run. */
  var attempt_number: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
  
  /** The unique identifier of the workflow run. */
  var run_id: Double
}
object Attemptnumber {
  
  inline def apply(attempt_number: Double, owner: String, repo: String, run_id: Double): Attemptnumber = {
    val __obj = js.Dynamic.literal(attempt_number = attempt_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attemptnumber]
  }
  
  extension [Self <: Attemptnumber](x: Self) {
    
    inline def setAttempt_number(value: Double): Self = StObject.set(x, "attempt_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}
