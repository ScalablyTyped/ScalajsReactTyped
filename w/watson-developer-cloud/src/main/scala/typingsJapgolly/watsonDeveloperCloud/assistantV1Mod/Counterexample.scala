package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Counterexample. */
trait Counterexample extends StObject {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var text: String
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}
object Counterexample {
  
  inline def apply(text: String): Counterexample = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counterexample]
  }
  
  extension [Self <: Counterexample](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
