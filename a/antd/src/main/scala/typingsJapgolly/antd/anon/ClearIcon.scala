package typingsJapgolly.antd.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libSelectUtilsIconUtilMod.RenderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIcon extends StObject {
  
  var clearIcon: js.UndefOr[RenderNode] = js.undefined
  
  var feedbackIcon: js.UndefOr[Node] = js.undefined
  
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var prefixCls: String
  
  var removeIcon: js.UndefOr[RenderNode] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var suffixIcon: js.UndefOr[Node] = js.undefined
}
object ClearIcon {
  
  inline def apply(prefixCls: String): ClearIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  
  extension [Self <: ClearIcon](x: Self) {
    
    inline def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
    
    inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFeedbackIcon(value: VdomNode): Self = StObject.set(x, "feedbackIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFeedbackIconNull: Self = StObject.set(x, "feedbackIcon", null)
    
    inline def setFeedbackIconUndefined: Self = StObject.set(x, "feedbackIcon", js.undefined)
    
    inline def setFeedbackIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "feedbackIcon", js.Array(value*))
    
    inline def setFeedbackIconVdomElement(value: VdomElement): Self = StObject.set(x, "feedbackIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
    
    inline def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    inline def setMenuItemSelectedIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
    
    inline def setMenuItemSelectedIconNull: Self = StObject.set(x, "menuItemSelectedIcon", null)
    
    inline def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
    
    inline def setMenuItemSelectedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menuItemSelectedIcon", js.Array(value*))
    
    inline def setMenuItemSelectedIconVdomElement(value: VdomElement): Self = StObject.set(x, "menuItemSelectedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    inline def setRemoveIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
    
    inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
    
    inline def setRemoveIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "removeIcon", js.Array(value*))
    
    inline def setRemoveIconVdomElement(value: VdomElement): Self = StObject.set(x, "removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setSuffixIcon(value: VdomNode): Self = StObject.set(x, "suffixIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    inline def setSuffixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffixIcon", js.Array(value*))
    
    inline def setSuffixIconVdomElement(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
  }
}
