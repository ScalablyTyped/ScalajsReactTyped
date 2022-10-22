package typingsJapgolly.prettier.docMod.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label_
  extends StObject
     with DocCommand {
  
  var `type`: typingsJapgolly.prettier.prettierStrings.label
}
object Label_ {
  
  inline def apply(): Label_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[Label_]
  }
  
  extension [Self <: Label_](x: Self) {
    
    inline def setType(value: typingsJapgolly.prettier.prettierStrings.label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
