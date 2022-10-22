package typingsJapgolly.semanticUiNag.anon

import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noStorage'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl>> */
trait PickImplnoStoragePartialP
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noCookieStorage: js.UndefOr[String] = js.undefined
  
  var noStorage: String & js.UndefOr[String]
}
object PickImplnoStoragePartialP {
  
  inline def apply(noStorage: String & js.UndefOr[String]): PickImplnoStoragePartialP = {
    val __obj = js.Dynamic.literal(noStorage = noStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoStoragePartialP]
  }
  
  extension [Self <: PickImplnoStoragePartialP](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
    
    inline def setNoCookieStorageUndefined: Self = StObject.set(x, "noCookieStorage", js.undefined)
    
    inline def setNoStorage(value: String & js.UndefOr[String]): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
  }
}
