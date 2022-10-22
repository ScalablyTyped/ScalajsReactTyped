package typingsJapgolly.reactMdTypography

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTypography.anon.ClassName
import typingsJapgolly.reactMdTypography.reactMdTypographyStrings.bottom
import typingsJapgolly.reactMdTypography.reactMdTypographyStrings.initial
import typingsJapgolly.reactMdTypography.reactMdTypographyStrings.none
import typingsJapgolly.reactMdTypography.reactMdTypographyStrings.top
import typingsJapgolly.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypographyMod {
  
  @JSImport("@react-md/typography/types/Typography", "Typography")
  @js.native
  val Typography: ForwardRefExoticComponent[TypographyProps & RefAttributes[TypographyHTMLElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.italic
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.oblique
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.normal
  */
  trait FontStyle extends StObject
  object FontStyle {
    
    inline def italic: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.italic = "italic".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.italic]
    
    inline def normal: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.normal = "normal".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.normal]
    
    inline def oblique: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.oblique = "oblique".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.oblique]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.left
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.center
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.right
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    inline def center: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.center = "center".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.center]
    
    inline def left: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.left = "left".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.left]
    
    inline def right: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.right = "right".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.secondary
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.hint
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-primary`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-secondary`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-warning`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-error`
  */
  trait TextColor extends StObject
  object TextColor {
    
    inline def hint: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.hint = "hint".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.hint]
    
    inline def secondary: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.secondary]
    
    inline def `theme-error`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-error` = "theme-error".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-error`]
    
    inline def `theme-primary`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-primary` = "theme-primary".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-primary`]
    
    inline def `theme-secondary`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-secondary` = "theme-secondary".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-secondary`]
    
    inline def `theme-warning`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-warning` = "theme-warning".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`theme-warning`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.underline
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`line-through`
  */
  trait TextDecoration extends StObject
  object TextDecoration {
    
    inline def `line-through`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`line-through` = "line-through".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`line-through`]
    
    inline def overline: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline]
    
    inline def underline: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.underline = "underline".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.underline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.capitalize
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.uppercase
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.lowercase
  */
  trait TextTransform extends StObject
  object TextTransform {
    
    inline def capitalize: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.capitalize = "capitalize".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.capitalize]
    
    inline def lowercase: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.lowercase = "lowercase".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.lowercase]
    
    inline def uppercase: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.uppercase = "uppercase".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.uppercase]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.thin
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.light
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.regular
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.medium
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.bold
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`semi-bold`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.black
  */
  trait TextWeight extends StObject
  object TextWeight {
    
    inline def black: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.black = "black".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.black]
    
    inline def bold: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.bold = "bold".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.bold]
    
    inline def light: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.light = "light".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.light]
    
    inline def medium: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.medium = "medium".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.medium]
    
    inline def regular: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.regular = "regular".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.regular]
    
    inline def `semi-bold`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`semi-bold` = "semi-bold".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`semi-bold`]
    
    inline def thin: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.thin = "thin".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.thin]
  }
  
  type TypographyHTMLElement = HTMLHeadingElement | HTMLParagraphElement | HTMLSpanElement | HTMLDivElement | HTMLButtonElement | HTMLAnchorElement | HTMLBodyElement | HTMLHtmlElement
  
  trait TypographyProps
    extends StObject
       with HTMLAttributes[TypographyHTMLElement] {
    
    /**
      * An optional text alignment to apply.
      */
    var align: js.UndefOr[TextAlign] = js.undefined
    
    /**
      * Either a child render function or a react node. If this is not the child
      * render function, a different wrapper component can be provided using the
      * `component` prop.
      */
    @JSName("children")
    var children_TypographyProps: js.UndefOr[Node | ClassNameCloneableChild[js.Object] | TypographyRenderFunction] = js.undefined
    
    /**
      * An optional text color to apply. Unlike normal theme colors, these will
      * reflect the `text-secondary-on-background` and `text-hint-on-background`
      * instead of the primary or secondary theme colors.
      */
    @JSName("color")
    var color_TypographyProps: js.UndefOr[TextColor] = js.undefined
    
    /**
      * The component to render as when the children are not a render function. If
      * this prop is omitted, the component will be determined by the `type` prop
      * where:
      *
      * - `"headline-1" -> <h1>`
      * - `"headline-2" -> <h2>`
      * - `"headline-3" -> <h3>`
      * - `"headline-4" -> <h4>`
      * - `"headline-5" -> <h5>`
      * - `"headline-6" -> <h6>`
      * - `"subtitle-1" -> <h5>`
      * - `"subtitle-2" -> <h6>`
      * - `"body-1"     -> <p>`
      * - `"body-2"     -> <p>`
      * - `"caption"    -> <caption>`
      * - `"overline"   -> <span>`
      * - `"button"     -> <button>`
      *
      */
    var component: js.UndefOr[ElementType | Null] = js.undefined
    
    /**
      * An optional text decoration to apply.
      */
    var decoration: js.UndefOr[TextDecoration] = js.undefined
    
    /**
      * An optional font-style to apply.
      */
    var fontStyle: js.UndefOr[FontStyle] = js.undefined
    
    /**
      * Since the typography within react-md tries to not modify base elements, the
      * default margin applied to heading tags (h1-h6) and paragraph (p) might have
      * large margin that you don't want applied when using this component. You can
      * disable:
      *
      * - only the top margin by setting this prop to `"bottom"`
      * - only the bottom margin by setting this prop to `"top"`
      * - top and bottom margin by setting this prop to `"none"`
      * - or keep the initial behavior: `"initial"`
      */
    var margin: js.UndefOr[initial | none | top | bottom] = js.undefined
    
    /**
      * An optional text transformation to apply.
      */
    var transform: js.UndefOr[TextTransform] = js.undefined
    
    /**
      * One of the material design typography text styles. This is used to generate
      * a className that can be applied to any element and have the correct
      * typography.
      */
    var `type`: js.UndefOr[TypographyType] = js.undefined
    
    /**
      * An optional font-weight to apply.
      */
    var weight: js.UndefOr[TextWeight] = js.undefined
  }
  object TypographyProps {
    
    inline def apply(): TypographyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyProps]
    }
    
    extension [Self <: TypographyProps](x: Self) {
      
      inline def setAlign(value: TextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: Node | ClassNameCloneableChild[js.Object] | TypographyRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ClassName => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: TextColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDecoration(value: TextDecoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setMargin(value: initial | none | top | bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setTransform(value: TextTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: TypographyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWeight(value: TextWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type TypographyRenderFunction = js.Function1[/* props */ ClassName, Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-1`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-2`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-3`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-4`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-5`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-6`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-1`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-2`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-1`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-2`
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.caption
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline
    - typingsJapgolly.reactMdTypography.reactMdTypographyStrings.button
  */
  trait TypographyType extends StObject
  object TypographyType {
    
    inline def `body-1`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-1` = "body-1".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-1`]
    
    inline def `body-2`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-2` = "body-2".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`body-2`]
    
    inline def button: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.button = "button".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.button]
    
    inline def caption: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.caption = "caption".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.caption]
    
    inline def `headline-1`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-1` = "headline-1".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-1`]
    
    inline def `headline-2`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-2` = "headline-2".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-2`]
    
    inline def `headline-3`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-3` = "headline-3".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-3`]
    
    inline def `headline-4`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-4` = "headline-4".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-4`]
    
    inline def `headline-5`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-5` = "headline-5".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-5`]
    
    inline def `headline-6`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-6` = "headline-6".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`headline-6`]
    
    inline def overline: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.overline]
    
    inline def `subtitle-1`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-1` = "subtitle-1".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-1`]
    
    inline def `subtitle-2`: typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-2` = "subtitle-2".asInstanceOf[typingsJapgolly.reactMdTypography.reactMdTypographyStrings.`subtitle-2`]
  }
}
