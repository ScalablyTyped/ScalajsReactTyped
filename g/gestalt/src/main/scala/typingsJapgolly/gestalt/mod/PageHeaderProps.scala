package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.gestalt.anon.OnClick
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderProps extends StObject {
  
  var badge: js.UndefOr[PageHeaderBadge] = js.undefined
  
  var borderStyle: js.UndefOr[sm | none] = js.undefined
  
  var dropdownAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var helperIconButton: js.UndefOr[PageHeaderHelperIconButton] = js.undefined
  
  var helperLink: js.UndefOr[OnClick] = js.undefined
  
  var items: js.UndefOr[js.Array[Node]] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var primaryAction: js.UndefOr[PageHeaderAction] = js.undefined
  
  var secondaryAction: js.UndefOr[PageHeaderAction] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var thumbnail: js.UndefOr[Element] = js.undefined
  
  var title: String
}
object PageHeaderProps {
  
  inline def apply(title: String): PageHeaderProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
  
  extension [Self <: PageHeaderProps](x: Self) {
    
    inline def setBadge(value: PageHeaderBadge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBorderStyle(value: sm | none): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setDropdownAccessibilityLabel(value: String): Self = StObject.set(x, "dropdownAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setDropdownAccessibilityLabelUndefined: Self = StObject.set(x, "dropdownAccessibilityLabel", js.undefined)
    
    inline def setHelperIconButton(value: PageHeaderHelperIconButton): Self = StObject.set(x, "helperIconButton", value.asInstanceOf[js.Any])
    
    inline def setHelperIconButtonUndefined: Self = StObject.set(x, "helperIconButton", js.undefined)
    
    inline def setHelperLink(value: OnClick): Self = StObject.set(x, "helperLink", value.asInstanceOf[js.Any])
    
    inline def setHelperLinkUndefined: Self = StObject.set(x, "helperLink", js.undefined)
    
    inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPrimaryAction(value: PageHeaderAction): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setSecondaryAction(value: PageHeaderAction): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
    
    inline def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    inline def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    inline def setThumbnail(value: VdomElement): Self = StObject.set(x, "thumbnail", value.rawElement.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
