package typingsJapgolly.semanticUiPopup

import typingsJapgolly.semanticUiPopup.SemanticUI.Popup
import typingsJapgolly.semanticUiPopup.SemanticUI.PopupSettings
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`change content`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`set position`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.destroy
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.exists
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hide
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.reposition
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.setting
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.show
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def popup(): JQuery
  def popup(settings: PopupSettings): JQuery
  @JSName("popup")
  var popup_Original: Popup
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindclickaway(behavior: `bind clickaway`): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindcloseonscroll(behavior: `bind close on scroll`): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindtouchclose(behavior: `bind touch close`): JQuery
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def popup_changecontent(behavior: `change content`, html: String): JQuery
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: destroy): JQuery
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: exists): Boolean
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def popup_getpopup(behavior: `get popup`): JQuery
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: hide): JQuery
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def popup_hideall(behavior: `hide all`): JQuery
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def popup_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def popup_isvisible(behavior: `is visible`): Boolean
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def popup_removepopup(behavior: `remove popup`): JQuery
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: reposition): JQuery
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def popup_setposition(behavior: `set position`, position: String): JQuery
  @JSName("popup")
  def popup_setting(behavior: setting, value: PopupSettings): JQuery
  @JSName("popup")
  def popup_setting[K /* <: /* keyof semantic-ui-popup.SemanticUI.PopupSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("popup")
  def popup_setting[K /* <: /* keyof semantic-ui-popup.SemanticUI.PopupSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: show): JQuery
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(popup: Popup): JQuery = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setPopup(value: Popup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
