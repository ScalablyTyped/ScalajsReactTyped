package typingsJapgolly.semanticUiModal

import typingsJapgolly.semanticUiModal.SemanticUI.Modal
import typingsJapgolly.semanticUiModal.SemanticUI.ModalSettings
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`attach events`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`can fit`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide all`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide others`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`is active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`set active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.destroy
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.hide
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.refresh
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.setting
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.show
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def modal(): JQuery
  def modal(settings: ModalSettings): JQuery
  @JSName("modal")
  var modal_Original: Modal
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String, event: String): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery
  /**
    * Caches current modal size
    */
  @JSName("modal")
  def modal_cachesizes(behavior: `cache sizes`): JQuery
  /**
    * Returns whether the modal can fit on the page
    */
  @JSName("modal")
  def modal_canfit(behavior: `can fit`): Boolean
  @JSName("modal")
  def modal_destroy(behavior: destroy): JQuery
  /**
    * Hides the modal
    */
  @JSName("modal")
  def modal_hide(behavior: hide): JQuery
  /**
    * Hides all visible modals in the same dimmer
    */
  @JSName("modal")
  def modal_hideall(behavior: `hide all`): JQuery
  /**
    * Hides associated page dimmer
    */
  @JSName("modal")
  def modal_hidedimmer(behavior: `hide dimmer`): JQuery
  /**
    * Hides all modals not selected modal in a dimmer
    */
  @JSName("modal")
  def modal_hideothers(behavior: `hide others`): JQuery
  /**
    * Returns whether the modal is active
    */
  @JSName("modal")
  def modal_isactive(behavior: `is active`): Boolean
  /**
    * Refreshes centering of modal on page
    */
  @JSName("modal")
  def modal_refresh(behavior: refresh): JQuery
  /**
    * Sets modal to active
    */
  @JSName("modal")
  def modal_setactive(behavior: `set active`): JQuery
  @JSName("modal")
  def modal_setting(behavior: setting, value: ModalSettings): JQuery
  @JSName("modal")
  def modal_setting[K /* <: /* keyof semantic-ui-modal.SemanticUI.ModalSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("modal")
  def modal_setting[K /* <: /* keyof semantic-ui-modal.SemanticUI.ModalSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
  /**
    * Shows the modal
    */
  @JSName("modal")
  def modal_show(behavior: show): JQuery
  /**
    * Shows associated page dimmer
    */
  @JSName("modal")
  def modal_showdimmer(behavior: `show dimmer`): JQuery
  /**
    * Toggles the modal
    */
  @JSName("modal")
  def modal_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(modal: Modal): JQuery = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setModal(value: Modal): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
  }
}
