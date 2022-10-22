package typingsJapgolly.listr2.anon

import typingsJapgolly.enquirer.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enquirer extends StObject {
  
  var enquirer: js.UndefOr[^[js.Object]] = js.undefined
}
object Enquirer {
  
  inline def apply(): Enquirer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enquirer]
  }
  
  extension [Self <: Enquirer](x: Self) {
    
    inline def setEnquirer(value: ^[js.Object]): Self = StObject.set(x, "enquirer", value.asInstanceOf[js.Any])
    
    inline def setEnquirerUndefined: Self = StObject.set(x, "enquirer", js.undefined)
  }
}
