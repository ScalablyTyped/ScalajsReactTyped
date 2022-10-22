package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.anon.Number
import typingsJapgolly.gestalt.gestaltStrings.expandable
import typingsJapgolly.gestalt.gestaltStrings.static
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedGroupProps extends StObject {
  
  /**
    * When supplied, will display a
    * [Badge](https://gestalt.pinterest.systems/badge) next to the item's label.
    * See the [Badges](https://gestalt.pinterest.systems/SideNavigation#Badge) variant to learn more.
    */
  var badge: js.UndefOr[FunctionComponent[BadgeProps]] = js.undefined
  
  /**
    * Content of the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var children: Node
  
  /**
    * When supplied, will display a counter. See the [Counter](https://gestalt.pinterest.systems/SideNavigation#Counter) variant to learn more.
    */
  var counter: js.UndefOr[Number] = js.undefined
  
  /**
    * Nested directories can be static or expandable. See [nested directory](#Nested-directory) variant for more information.
    */
  var display: js.UndefOr[expandable | static] = js.undefined
  
  /**
    * When supplied, will display Icon. See the [Icon](https://gestalt.pinterest.systems/SideNavigation#Icon) variant to learn more.
    */
  var icon: js.UndefOr[Icons] = js.undefined
  
  /**
    * Label for the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var label: String
  
  /**
    *  When supplied, will display a notification dot. See the [Notification](https://gestalt.pinterest.systems/SideNavigation#Notification) variant to learn more.
    */
  var notificationAccessibilityLabel: js.UndefOr[String] = js.undefined
}
object SideNavigationNestedGroupProps {
  
  inline def apply(label: String): SideNavigationNestedGroupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[SideNavigationNestedGroupProps]
  }
  
  extension [Self <: SideNavigationNestedGroupProps](x: Self) {
    
    inline def setBadge(value: FunctionComponent[BadgeProps]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCounter(value: Number): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDisplay(value: expandable | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabel(value: String): Self = StObject.set(x, "notificationAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabelUndefined: Self = StObject.set(x, "notificationAccessibilityLabel", js.undefined)
  }
}
