package typingsJapgolly.semanticUiNag.anon

import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl>> */
trait PickImplfixedPartialPickI
  extends StObject
     with Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var fixed: String & js.UndefOr[String]
}
object PickImplfixedPartialPickI {
  
  inline def apply(fixed: String & js.UndefOr[String]): PickImplfixedPartialPickI = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfixedPartialPickI]
  }
  
  extension [Self <: PickImplfixedPartialPickI](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setFixed(value: String & js.UndefOr[String]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
  }
}
