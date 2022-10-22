package typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleAccepted. */
trait IPickleAccepted extends StObject {
  
  /** PickleAccepted pickleId */
  var pickleId: js.UndefOr[String | Null] = js.undefined
}
object IPickleAccepted {
  
  inline def apply(): IPickleAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleAccepted]
  }
  
  extension [Self <: IPickleAccepted](x: Self) {
    
    inline def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    inline def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    inline def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
  }
}
