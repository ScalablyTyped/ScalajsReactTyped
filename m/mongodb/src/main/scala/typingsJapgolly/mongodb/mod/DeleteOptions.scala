package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Specify that the update query should only consider plans using the hinted index */
  var hint: js.UndefOr[String | Document] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  /** If true, when an insert fails, don't execute the remaining writes. If false, continue with remaining inserts when one fails. */
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated use `removeOne` or `removeMany` to implicitly specify the limit */
  var single: js.UndefOr[Boolean] = js.undefined
}
object DeleteOptions {
  
  inline def apply(): DeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOptions]
  }
  
  extension [Self <: DeleteOptions](x: Self) {
    
    inline def setHint(value: String | Document): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
  }
}
