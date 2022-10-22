package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.materialUiCore.anon.TypographyClasses
import typingsJapgolly.materialUiCore.materialUiCoreStrings.a
import typingsJapgolly.materialUiCore.materialUiCoreStrings.component
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.materialUiCore.typographyTypographyMod.TypographyProps
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Links](https://mui.com/components/links/)
    *
    * API:
    *
    * - [Link API](https://mui.com/api/link/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/Link/Link", JSImport.Default)
  @js.native
  val default: OverridableComponent[LinkTypeMap[js.Object, a]] = js.native
  
  type LinkBaseProps = AnchorHTMLAttributes[HTMLAnchorElement] & (Omit[TypographyProps[span, js.Object], component])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineNone
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineHover
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineAlways
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.button
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
  */
  trait LinkClassKey extends StObject
  object LinkClassKey {
    
    inline def button: typingsJapgolly.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.button]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def underlineAlways: typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineAlways = "underlineAlways".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineAlways]
    
    inline def underlineHover: typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineHover = "underlineHover".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineHover]
    
    inline def underlineNone: typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineNone = "underlineNone".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.underlineNone]
  }
  
  type LinkProps[D /* <: ElementType */, P] = OverrideProps[LinkTypeMap[P, D], D]
  
  trait LinkTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: LinkClassKey
    
    var defaultComponent: D
    
    var props: P & LinkBaseProps & TypographyClasses
  }
  object LinkTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: LinkClassKey, defaultComponent: D, props: P & LinkBaseProps & TypographyClasses): LinkTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeMap[P, D]]
    }
    
    extension [Self <: LinkTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (LinkTypeMap[P, D])) {
      
      inline def setClassKey(value: LinkClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & LinkBaseProps & TypographyClasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[LinkTypeMap[js.Object, a]]
  
  /* This means you don't have to write `default`, but can instead just say `linkLinkMod.foo` */
  override def _to: OverridableComponent[LinkTypeMap[js.Object, a]] = default
}
