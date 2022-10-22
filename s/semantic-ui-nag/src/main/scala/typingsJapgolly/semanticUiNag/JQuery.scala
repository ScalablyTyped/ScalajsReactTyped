package typingsJapgolly.semanticUiNag

import typingsJapgolly.semanticUiNag.SemanticUI.Nag
import typingsJapgolly.semanticUiNag.SemanticUI.NagSettings
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.clear
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.destroy
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.hide
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.setting
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def nag(): JQuery
  def nag(settings: NagSettings): JQuery
  @JSName("nag")
  var nag_Original: Nag
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: clear): JQuery
  @JSName("nag")
  def nag_destroy(behavior: destroy): JQuery
  @JSName("nag")
  def nag_hide(behavior: hide): JQuery
  @JSName("nag")
  def nag_setting(behavior: setting, value: NagSettings): JQuery
  @JSName("nag")
  def nag_setting[K /* <: /* keyof semantic-ui-nag.SemanticUI.NagSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("nag")
  def nag_setting[K /* <: /* keyof semantic-ui-nag.SemanticUI.NagSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  @JSName("nag")
  def nag_show(behavior: show): JQuery
}
object JQuery {
  
  inline def apply(nag: Nag): JQuery = {
    val __obj = js.Dynamic.literal(nag = nag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setNag(value: Nag): Self = StObject.set(x, "nag", value.asInstanceOf[js.Any])
  }
}
