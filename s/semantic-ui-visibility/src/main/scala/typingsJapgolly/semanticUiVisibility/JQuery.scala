package typingsJapgolly.semanticUiVisibility

import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typingsJapgolly.semanticUiVisibility.SemanticUI.VisibilitySettings
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def visibility(): JQuery
  def visibility(settings: VisibilitySettings): JQuery
  @JSName("visibility")
  var visibility_Original: Visibility
  @JSName("visibility")
  def visibility_destroy(behavior: destroy): JQuery
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  @JSName("visibility")
  def visibility_disablecallbacks(behavior: `disable callbacks`): JQuery
  /**
    * Re-enable callbacks
    */
  @JSName("visibility")
  def visibility_enablecallbacks(behavior: `enable callbacks`): JQuery
  /**
    * Returns element calculations as object
    */
  @JSName("visibility")
  def visibility_getelementcalculations(behavior: `get element calculations`): ElementCalculations
  /**
    * Returns number of pixels passed in current element from top of element
    */
  @JSName("visibility")
  def visibility_getpixelspassed(behavior: `get pixels passed`): Double
  /**
    * Returns screen calculations as object
    */
  @JSName("visibility")
  def visibility_getscreencalculations(behavior: `get screen calculations`): ScreenCalculations
  /**
    * Returns screen size as object
    */
  @JSName("visibility")
  def visibility_getscreensize(behavior: `get screen size`): ScreenSize
  /**
    * Returns whether element is off screen
    */
  @JSName("visibility")
  def visibility_isoffscreen(behavior: `is off screen`): Boolean
  /**
    * Returns whether element is on screen
    */
  @JSName("visibility")
  def visibility_isonscreen(behavior: `is on screen`): Boolean
  @JSName("visibility")
  def visibility_setting(behavior: setting, value: VisibilitySettings): JQuery
  @JSName("visibility")
  def visibility_setting[K /* <: /* keyof semantic-ui-visibility.SemanticUI.VisibilitySettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("visibility")
  def visibility_setting[K /* <: /* keyof semantic-ui-visibility.SemanticUI.VisibilitySettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(visibility: Visibility): JQuery = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
