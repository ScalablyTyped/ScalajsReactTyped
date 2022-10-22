package typingsJapgolly.semanticUiSticky

import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky
import typingsJapgolly.semanticUiSticky.SemanticUI.StickySettings
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.destroy
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.refresh
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def sticky(): JQuery
  def sticky(settings: StickySettings): JQuery
  @JSName("sticky")
  var sticky_Original: Sticky
  @JSName("sticky")
  def sticky_destroy(behavior: destroy): JQuery
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: refresh): JQuery
  @JSName("sticky")
  def sticky_setting(behavior: setting, value: StickySettings): JQuery
  @JSName("sticky")
  def sticky_setting[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("sticky")
  def sticky_setting[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(sticky: Sticky): JQuery = {
    val __obj = js.Dynamic.literal(sticky = sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSticky(value: Sticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
  }
}
