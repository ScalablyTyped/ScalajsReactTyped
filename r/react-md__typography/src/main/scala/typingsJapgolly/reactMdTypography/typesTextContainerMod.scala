package typingsJapgolly.reactMdTypography

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTypography.anon.ClassName
import typingsJapgolly.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextContainerMod {
  
  @JSImport("@react-md/typography/types/TextContainer", "TextContainer")
  @js.native
  val TextContainer: ForwardRefExoticComponent[TextContainerProps & (RefAttributes[HTMLDivElement | ElementType])] = js.native
  
  trait TextContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Either a child render function or a react node. If this is not the child
      * render function, a different wrapper component can be provided using the
      * `component` prop.
      */
    @JSName("children")
    var children_TextContainerProps: js.UndefOr[Node | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction] = js.undefined
    
    /**
      * Boolean if the `className` should be cloned into the `children` for this
      * component.
      *
      * Note: This will only work if the child component passed the `className`
      * down to to the DOM element.
      */
    @JSName("clone")
    var clone_FTextContainerProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The component to render as. By default this will just be a div, but
      * anything can be provided.
      */
    var component: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The size for the text container. This can usually just be left at the
      * default of `"auto"` since it will automatically transition between
      * `"mobile"` and `"desktop"` based on media queries.  However, you can also
      * manually specify `"mobile"` or `"desktop"` if needed.
      */
    var size: js.UndefOr[TextContainerSize] = js.undefined
  }
  object TextContainerProps {
    
    inline def apply(): TextContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextContainerProps]
    }
    
    extension [Self <: TextContainerProps](x: Self) {
      
      inline def setChildren(value: Node | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ClassName => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setSize(value: TextContainerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type TextContainerRenderFunction = js.Function1[/* props */ ClassName, Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.auto
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.mobile
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.desktop
  */
  trait TextContainerSize extends StObject
  object TextContainerSize {
    
    inline def auto: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.auto = "auto".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.auto]
    
    inline def desktop: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.desktop = "desktop".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.desktop]
    
    inline def mobile: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.mobile]
  }
}
