package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.gestalt.anon.AnimationState
import typingsJapgolly.gestalt.anon.OnDismissStart
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetProps extends StObject {
  
  var accessibilityDismissButtonLabel: String
  
  var accessibilitySheetLabel: String
  
  var children: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* args */ AnimationState, Unit]] = js.undefined
  
  def onDismiss(): Unit
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var subHeading: js.UndefOr[SheetNodeOrRenderProp] = js.undefined
}
object SheetProps {
  
  inline def apply(accessibilityDismissButtonLabel: String, accessibilitySheetLabel: String, onDismiss: Callback): SheetProps = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], accessibilitySheetLabel = accessibilitySheetLabel.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn)
    __obj.asInstanceOf[SheetProps]
  }
  
  extension [Self <: SheetProps](x: Self) {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilitySheetLabel(value: String): Self = StObject.set(x, "accessibilitySheetLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: SheetNodeOrRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setFooter(value: SheetNodeOrRenderProp): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setOnAnimationEnd(value: /* args */ AnimationState => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: /* args */ AnimationState) => value(t0).runNow()))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: SheetNodeOrRenderProp): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingFunction1(value: /* prop */ OnDismissStart => Node): Self = StObject.set(x, "subHeading", js.Any.fromFunction1(value))
    
    inline def setSubHeadingNull: Self = StObject.set(x, "subHeading", null)
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
    
    inline def setSubHeadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subHeading", js.Array(value*))
    
    inline def setSubHeadingVdomElement(value: VdomElement): Self = StObject.set(x, "subHeading", value.rawElement.asInstanceOf[js.Any])
  }
}
