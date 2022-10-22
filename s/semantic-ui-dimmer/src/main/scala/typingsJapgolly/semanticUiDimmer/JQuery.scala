package typingsJapgolly.semanticUiDimmer

import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer
import typingsJapgolly.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.create
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hide
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.setting
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.show
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def dimmer(): JQuery
  def dimmer(settings: DimmerSettings): JQuery
  @JSName("dimmer")
  var dimmer_Original: Dimmer
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: String): JQuery
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: JQuery): JQuery
  /**
    * Creates a new dimmer in dimmable context
    */
  @JSName("dimmer")
  def dimmer_create(behavior: create): JQuery
  @JSName("dimmer")
  def dimmer_destroy(behavior: destroy): JQuery
  /**
    * Returns DOM element for dimmer
    */
  @JSName("dimmer")
  def dimmer_getdimmer(behavior: `get dimmer`): JQuery
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  @JSName("dimmer")
  def dimmer_getduration(behavior: `get duration`): Double
  /**
    * Returns whether current dimmable has a dimmer
    */
  @JSName("dimmer")
  def dimmer_hasdimmer(behavior: `has dimmer`): Boolean
  /**
    * Hides dimmer
    */
  @JSName("dimmer")
  def dimmer_hide(behavior: hide): JQuery
  /**
    * Whether section's dimmer is active
    */
  @JSName("dimmer")
  def dimmer_isactive(behavior: `is active`): Boolean
  /**
    * Whether dimmer is animating
    */
  @JSName("dimmer")
  def dimmer_isanimating(behavior: `is animating`): Boolean
  /**
    * Whether current element is a dimmable section
    */
  @JSName("dimmer")
  def dimmer_isdimmable(behavior: `is dimmable`): Boolean
  /**
    * Whether current element is a dimmer
    */
  @JSName("dimmer")
  def dimmer_isdimmer(behavior: `is dimmer`): Boolean
  /**
    * Whether dimmer is disabled
    */
  @JSName("dimmer")
  def dimmer_isdisabled(behavior: `is disabled`): Boolean
  /**
    * Whether dimmer is not disabled
    */
  @JSName("dimmer")
  def dimmer_isenabled(behavior: `is enabled`): Boolean
  /**
    * Whether dimmable section is body
    */
  @JSName("dimmer")
  def dimmer_ispage(behavior: `is page`): Boolean
  /**
    * Whether dimmer is a page dimmer
    */
  @JSName("dimmer")
  def dimmer_ispagedimmer(behavior: `is page dimmer`): Boolean
  /**
    * Sets page dimmer to active
    */
  @JSName("dimmer")
  def dimmer_setactive(behavior: `set active`): JQuery
  /**
    * Sets an element as a dimmable section
    */
  @JSName("dimmer")
  def dimmer_setdimmable(behavior: `set dimmable`): JQuery
  /**
    * Sets a dimmable section as dimmed
    */
  @JSName("dimmer")
  def dimmer_setdimmed(behavior: `set dimmed`): JQuery
  /**
    * Sets a dimmer as disabled
    */
  @JSName("dimmer")
  def dimmer_setdisabled(behavior: `set disabled`): JQuery
  /**
    * Changes dimmer opacity
    */
  @JSName("dimmer")
  def dimmer_setopacity(behavior: `set opacity`, opacity: Double): JQuery
  /**
    * Sets current dimmer as a page dimmer
    */
  @JSName("dimmer")
  def dimmer_setpagedimmer(behavior: `set page dimmer`): JQuery
  @JSName("dimmer")
  def dimmer_setting(behavior: setting, value: DimmerSettings): JQuery
  @JSName("dimmer")
  def dimmer_setting[K /* <: /* keyof semantic-ui-dimmer.SemanticUI.DimmerSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("dimmer")
  def dimmer_setting[K /* <: /* keyof semantic-ui-dimmer.SemanticUI.DimmerSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  /**
    * Shows dimmer
    */
  @JSName("dimmer")
  def dimmer_show(behavior: show): JQuery
  /**
    * Toggles current dimmer visibility
    */
  @JSName("dimmer")
  def dimmer_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(dimmer: Dimmer): JQuery = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDimmer(value: Dimmer): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
  }
}
