package typingsJapgolly.semanticUiProgress.anon

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, 'nonNumeric'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl>> */
trait PickImplnonNumericPartial
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var nonNumeric: String & js.UndefOr[String]
}
object PickImplnonNumericPartial {
  
  inline def apply(nonNumeric: String & js.UndefOr[String]): PickImplnonNumericPartial = {
    val __obj = js.Dynamic.literal(nonNumeric = nonNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnonNumericPartial]
  }
  
  extension [Self <: PickImplnonNumericPartial](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNonNumeric(value: String & js.UndefOr[String]): Self = StObject.set(x, "nonNumeric", value.asInstanceOf[js.Any])
  }
}
