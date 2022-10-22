package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Avatar
import typingsJapgolly.materialUiCore.anon.Component
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderCardHeaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardHeader API](https://mui.com/api/card-header/)
    */
  @JSImport("@material-ui/core/CardHeader/CardHeader", JSImport.Default)
  @js.native
  val default: OverridableCardHeader = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.avatar
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.action
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.content
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.title
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader
  */
  trait CardHeaderClassKey extends StObject
  object CardHeaderClassKey {
    
    inline def action: typingsJapgolly.materialUiCore.materialUiCoreStrings.action = "action".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.action]
    
    inline def avatar: typingsJapgolly.materialUiCore.materialUiCoreStrings.avatar = "avatar".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.avatar]
    
    inline def content: typingsJapgolly.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.content]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def subheader: typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader = "subheader".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader]
    
    inline def title: typingsJapgolly.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.title]
  }
  
  type CardHeaderProps[DefaultComponent /* <: ElementType */, Props, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] = OverrideProps[
    CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent], 
    DefaultComponent
  ]
  
  type CardHeaderPropsWithComponent[DefaultComponent /* <: ElementType */, Props, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] = Component[DefaultComponent] & (CardHeaderProps[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent])
  
  trait CardHeaderTypeMap[Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] extends StObject {
    
    var classKey: CardHeaderClassKey
    
    var defaultComponent: DefaultComponent
    
    var props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
  }
  object CardHeaderTypeMap {
    
    inline def apply[Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */](
      classKey: CardHeaderClassKey,
      defaultComponent: DefaultComponent,
      props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
    ): CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent]]
    }
    
    extension [Self <: CardHeaderTypeMap[?, ?, ?, ?], Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */](x: Self & (CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent])) {
      
      inline def setClassKey(value: CardHeaderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: DefaultComponent): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverridableCardHeader
    extends StObject
       with OverridableComponent[CardHeaderTypeMap[js.Object, div, span, span]]
  
  type _To = OverridableCardHeader
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderCardHeaderMod.foo` */
  override def _to: OverridableCardHeader = default
}
