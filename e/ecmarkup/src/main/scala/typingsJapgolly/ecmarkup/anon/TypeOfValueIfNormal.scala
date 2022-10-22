package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.completion
import typingsJapgolly.ecmarkup.ecmarkupStrings.mixed
import typingsJapgolly.ecmarkup.ecmarkupStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeOfValueIfNormal
  extends StObject
     with typingsJapgolly.ecmarkup.libBiblioMod.Type {
  
  var completionType: normal | mixed
  
  var kind: completion
  
  var typeOfValueIfNormal: typingsJapgolly.ecmarkup.libBiblioMod.Type | Null
}
object TypeOfValueIfNormal {
  
  inline def apply(completionType: normal | mixed): TypeOfValueIfNormal = {
    val __obj = js.Dynamic.literal(completionType = completionType.asInstanceOf[js.Any], kind = "completion", typeOfValueIfNormal = null)
    __obj.asInstanceOf[TypeOfValueIfNormal]
  }
  
  extension [Self <: TypeOfValueIfNormal](x: Self) {
    
    inline def setCompletionType(value: normal | mixed): Self = StObject.set(x, "completionType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: completion): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeOfValueIfNormal(value: typingsJapgolly.ecmarkup.libBiblioMod.Type): Self = StObject.set(x, "typeOfValueIfNormal", value.asInstanceOf[js.Any])
    
    inline def setTypeOfValueIfNormalNull: Self = StObject.set(x, "typeOfValueIfNormal", null)
  }
}
