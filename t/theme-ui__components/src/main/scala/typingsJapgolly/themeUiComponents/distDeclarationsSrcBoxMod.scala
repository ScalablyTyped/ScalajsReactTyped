package typingsJapgolly.themeUiComponents

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.emotionSerialize.mod.Interpolation
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTypesMod.Assign
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.div
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBoxMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/Box", "Box")
  @js.native
  val Box: ForwardRefExoticComponent[BoxProps & RefAttributes[Any]] = js.native
  
  inline def isBoxStyledSystemProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("__isBoxStyledSystemProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxSystemPropsKeys ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSProperties * / any[P]} */ trait BoxOwnProps extends StObject {
    
    var as: js.UndefOr[ElementType] = js.undefined
    
    var css: js.UndefOr[Interpolation[Any]] = js.undefined
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object BoxOwnProps {
    
    inline def apply(): BoxOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxOwnProps]
    }
    
    extension [Self <: BoxOwnProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCss(value: Interpolation[Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type BoxProps = Omit[Assign[ComponentPropsWithRef[div], BoxOwnProps], ref]
  
  type BoxSystemProps = Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSProperties */ Any, 
    BoxSystemPropsKeys
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.margin
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginTop
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginRight
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginBottom
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginLeft
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginX
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.marginY
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.m
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.mt
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.mr
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.mb
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.ml
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.mx
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.my
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.padding
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingTop
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingRight
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingBottom
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingLeft
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingX
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.paddingY
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.p
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.pt
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.pr
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.pb
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.pl
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.px
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.py
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.color
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.backgroundColor
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.bg
    - typingsJapgolly.themeUiComponents.themeUiComponentsStrings.opacity
  */
  trait BoxSystemPropsKeys extends StObject
}
