package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.badgeBadgeMod.BadgeOrigin
import typingsJapgolly.materialUiCore.materialUiCoreStrings.circle
import typingsJapgolly.materialUiCore.materialUiCoreStrings.circular
import typingsJapgolly.materialUiCore.materialUiCoreStrings.default
import typingsJapgolly.materialUiCore.materialUiCoreStrings.dot
import typingsJapgolly.materialUiCore.materialUiCoreStrings.error
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.rectangle
import typingsJapgolly.materialUiCore.materialUiCoreStrings.rectangular
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorOrigin extends StObject {
  
  /**
    * The anchor of the badge.
    */
  var anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined
  
  /**
    * The content rendered within the badge.
    */
  var badgeContent: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[primary | secondary | default | error] = js.undefined
  
  /**
    * If `true`, the badge will be invisible.
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max count to show.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Wrapped shape the badge should overlap.
    */
  var overlap: js.UndefOr[rectangle | circle | rectangular | circular] = js.undefined
  
  /**
    * Controls whether the badge is hidden when `badgeContent` is zero.
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr[standard | dot] = js.undefined
}
object AnchorOrigin {
  
  inline def apply(): AnchorOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOrigin]
  }
  
  extension [Self <: AnchorOrigin](x: Self) {
    
    inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setBadgeContent(value: VdomNode): Self = StObject.set(x, "badgeContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBadgeContentNull: Self = StObject.set(x, "badgeContent", null)
    
    inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    inline def setBadgeContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badgeContent", js.Array(value*))
    
    inline def setBadgeContentVdomElement(value: VdomElement): Self = StObject.set(x, "badgeContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: primary | secondary | default | error): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setOverlap(value: rectangle | circle | rectangular | circular): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setVariant(value: standard | dot): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
