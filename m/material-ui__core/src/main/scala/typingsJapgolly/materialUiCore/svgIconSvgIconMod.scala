package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.HtmlColor
import typingsJapgolly.materialUiCore.materialUiCoreStrings.svg
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  @JSImport("@material-ui/core/SvgIcon/SvgIcon", JSImport.Default)
  @js.native
  val default: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorAction
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDisabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorError
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeInherit
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeSmall
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeLarge
  */
  trait SvgIconClassKey extends StObject
  object SvgIconClassKey {
    
    inline def colorAction: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorAction = "colorAction".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorAction]
    
    inline def colorDisabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDisabled = "colorDisabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDisabled]
    
    inline def colorError: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorError = "colorError".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorError]
    
    inline def colorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def fontSizeInherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeInherit = "fontSizeInherit".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeInherit]
    
    inline def fontSizeLarge: typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeLarge = "fontSizeLarge".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeLarge]
    
    inline def fontSizeSmall: typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeSmall = "fontSizeSmall".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fontSizeSmall]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type SvgIconProps[D /* <: ElementType */, P] = OverrideProps[SvgIconTypeMap[P, D], D]
  
  trait SvgIconTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: SvgIconClassKey
    
    var defaultComponent: D
    
    var props: P & HtmlColor
  }
  object SvgIconTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: SvgIconClassKey, defaultComponent: D, props: P & HtmlColor): SvgIconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconTypeMap[P, D]]
    }
    
    extension [Self <: SvgIconTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (SvgIconTypeMap[P, D])) {
      
      inline def setClassKey(value: SvgIconClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & HtmlColor): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, svg]]
  
  /* This means you don't have to write `default`, but can instead just say `svgIconSvgIconMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = default
}
