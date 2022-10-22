package typingsJapgolly.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueHolder extends StObject {
  
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbMod.IonText] = js.undefined
}
object ValueHolder {
  
  inline def apply(): ValueHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueHolder]
  }
  
  extension [Self <: ValueHolder](x: Self) {
    
    inline def setIonText(value: IonText): Self = StObject.set(x, "IonText", value.asInstanceOf[js.Any])
    
    inline def setIonTextUndefined: Self = StObject.set(x, "IonText", js.undefined)
  }
}
