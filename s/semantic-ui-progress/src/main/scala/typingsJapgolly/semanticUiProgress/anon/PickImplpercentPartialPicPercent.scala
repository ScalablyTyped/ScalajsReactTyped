package typingsJapgolly.semanticUiProgress.anon

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'percent'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl>> */
trait PickImplpercentPartialPicPercent
  extends StObject
     with Param {
  
  var percent: String & js.UndefOr[String]
  
  var total: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PickImplpercentPartialPicPercent {
  
  inline def apply(percent: String & js.UndefOr[String]): PickImplpercentPartialPicPercent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpercentPartialPicPercent]
  }
  
  extension [Self <: PickImplpercentPartialPicPercent](x: Self) {
    
    inline def setPercent(value: String & js.UndefOr[String]): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
