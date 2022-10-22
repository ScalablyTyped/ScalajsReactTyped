package typingsJapgolly.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Request payload to classify. */
trait ClassifyInput extends StObject {
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: String
}
object ClassifyInput {
  
  inline def apply(text: String): ClassifyInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyInput]
  }
  
  extension [Self <: ClassifyInput](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
