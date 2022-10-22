package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.abrupt
import typingsJapgolly.ecmarkup.ecmarkupStrings.completion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionType
  extends StObject
     with typingsJapgolly.ecmarkup.libBiblioMod.Type {
  
  var completionType: abrupt
  
  var kind: completion
}
object CompletionType {
  
  inline def apply(): CompletionType = {
    val __obj = js.Dynamic.literal(completionType = "abrupt", kind = "completion")
    __obj.asInstanceOf[CompletionType]
  }
  
  extension [Self <: CompletionType](x: Self) {
    
    inline def setCompletionType(value: abrupt): Self = StObject.set(x, "completionType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: completion): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
