package typingsJapgolly.semanticUiSidebar

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar
import typingsJapgolly.semanticUiSidebar.SemanticUI.SidebarSettings
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.hide
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.setting
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.show
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def sidebar(): JQuery
  def sidebar(settings: SidebarSettings): JQuery
  @JSName("sidebar")
  var sidebar_Original: Sidebar
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def sidebar_addbodyCSS(behavior: `add body CSS`): JQuery
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String, event: String): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery
  @JSName("sidebar")
  def sidebar_destroy(behavior: destroy): JQuery
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def sidebar_getdirection(behavior: `get direction`): String
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def sidebar_gettransitionevent(behavior: `get transition event`): String
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: hide): JQuery
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def sidebar_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def sidebar_isvisible(behavior: `is visible`): Boolean
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def sidebar_pullpage(behavior: `pull page`): JQuery
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def sidebar_pushpage(behavior: `push page`): JQuery
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def sidebar_removebodyCSS(behavior: `remove body CSS`): JQuery
  @JSName("sidebar")
  def sidebar_setting(behavior: setting, value: SidebarSettings): JQuery
  @JSName("sidebar")
  def sidebar_setting[K /* <: /* keyof semantic-ui-sidebar.SemanticUI.SidebarSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("sidebar")
  def sidebar_setting[K /* <: /* keyof semantic-ui-sidebar.SemanticUI.SidebarSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: show): JQuery
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(sidebar: Sidebar): JQuery = {
    val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSidebar(value: Sidebar): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
  }
}
