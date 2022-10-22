package typingsJapgolly.reactMdIcon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextIconSpacingMod {
  
  @JSImport("@react-md/icon/types/TextIconSpacing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TextIconSpacing(
    hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TextIconSpacing")(hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TextIconSpacingProps extends StObject {
    
    /**
      * The class name to use for an icon that is placed before above the text.
      * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
      * disabled or omitted.
      */
    var aboveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed after text.
      */
    var afterClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed before text.
      */
    var beforeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed before above the text.
      * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
      * enabled.
      */
    var belowClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The children to render before or after the provided icon. This is defaulted
      * to `null` so that providing a `null` icon will correctly render without
      * React crashing.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional className to apply to the surrounding `<span>` when the
      * `forceIconWrap` prop is enabled or the icon is not a valid React Element.
      * If the `forceIconWrap` prop is not enabled, it will be cloned into the icon
      * instead.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the icon and content are in a `column-reverse` or `row-reverse`
      * `flex-direction`. This will swap the different classnames as needed.
      *
      * @remarks \@since 2.5.0
      */
    var flexReverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon should be forced into a `<span>` with the class names
      * applied instead of attempting to clone into the provided icon.
      */
    var forceIconWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional icon to display with a text button. This is invalid for icon
      * buttons. If this is a single element, a new class name will be cloned into
      * the element to get correct spacing so if you have a custom icon element,
      * you **must** also pass that class name down. If you are using one of the
      * react-md icon component packages, this is handled automatically.
      *
      * If this is not a valid react element, the icon will be wrapped in a
      * `<span>` instead with the class names applied.
      */
    var icon: js.UndefOr[Element | Node] = js.undefined
    
    /**
      * Boolean if the icon should appear after the text instead of before.
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon and text should be stacked instead of inline. Note:
      * You'll normally want to update the container element to have
      * `display: flex` and `flex-direction: column` for this to work.
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
  }
  object TextIconSpacingProps {
    
    inline def apply(): TextIconSpacingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextIconSpacingProps]
    }
    
    extension [Self <: TextIconSpacingProps](x: Self) {
      
      inline def setAboveClassName(value: String): Self = StObject.set(x, "aboveClassName", value.asInstanceOf[js.Any])
      
      inline def setAboveClassNameUndefined: Self = StObject.set(x, "aboveClassName", js.undefined)
      
      inline def setAfterClassName(value: String): Self = StObject.set(x, "afterClassName", value.asInstanceOf[js.Any])
      
      inline def setAfterClassNameUndefined: Self = StObject.set(x, "afterClassName", js.undefined)
      
      inline def setBeforeClassName(value: String): Self = StObject.set(x, "beforeClassName", value.asInstanceOf[js.Any])
      
      inline def setBeforeClassNameUndefined: Self = StObject.set(x, "beforeClassName", js.undefined)
      
      inline def setBelowClassName(value: String): Self = StObject.set(x, "belowClassName", value.asInstanceOf[js.Any])
      
      inline def setBelowClassNameUndefined: Self = StObject.set(x, "belowClassName", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFlexReverse(value: Boolean): Self = StObject.set(x, "flexReverse", value.asInstanceOf[js.Any])
      
      inline def setFlexReverseUndefined: Self = StObject.set(x, "flexReverse", js.undefined)
      
      inline def setForceIconWrap(value: Boolean): Self = StObject.set(x, "forceIconWrap", value.asInstanceOf[js.Any])
      
      inline def setForceIconWrapUndefined: Self = StObject.set(x, "forceIconWrap", js.undefined)
      
      inline def setIcon(value: Element | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
}
