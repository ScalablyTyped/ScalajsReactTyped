package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.typedocStrings.both
import typingsJapgolly.typedoc.typedocStrings.docs
import typingsJapgolly.typedoc.typedocStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Both extends StObject {
  
  val both: typingsJapgolly.typedoc.typedocStrings.both
  
  val docs: typingsJapgolly.typedoc.typedocStrings.docs
  
  val none: typingsJapgolly.typedoc.typedocStrings.none
}
object Both {
  
  inline def apply(): Both = {
    val __obj = js.Dynamic.literal(both = "both", docs = "docs", none = "none")
    __obj.asInstanceOf[Both]
  }
  
  extension [Self <: Both](x: Self) {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: docs): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
