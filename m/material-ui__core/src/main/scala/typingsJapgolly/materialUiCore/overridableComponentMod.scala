package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.materialUiCoreStrings.className
import typingsJapgolly.materialUiCore.materialUiCoreStrings.classes
import typingsJapgolly.materialUiCore.materialUiCoreStrings.innerRef
import typingsJapgolly.materialUiCore.materialUiCoreStrings.style
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overridableComponentMod {
  
  type BaseProps[M /* <: OverridableTypeMap */] = (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & CommonProps[M]
  
  trait CommonProps[M /* <: OverridableTypeMap */]
    extends StObject
       with StyledComponentProps[
          /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
        ] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CommonProps {
    
    inline def apply[M /* <: OverridableTypeMap */](): CommonProps[M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps[M]]
    }
    
    extension [Self <: CommonProps[?], M /* <: OverridableTypeMap */](x: Self & CommonProps[M]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type DefaultComponentProps[M /* <: OverridableTypeMap */] = BaseProps[M] & (Omit[
    ComponentPropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof @material-ui/core.@material-ui/core/OverridableComponent.BaseProps<M> */ className | style | classes | innerRef
  ])
  
  @js.native
  trait OverridableComponent[M /* <: OverridableTypeMap */] extends StObject {
    
    def apply(props: DefaultComponentProps[M]): Element = js.native
  }
  
  trait OverridableTypeMap extends StObject {
    
    var classKey: String
    
    var defaultComponent: ElementType
  }
  object OverridableTypeMap {
    
    inline def apply(classKey: String, defaultComponent: ElementType): OverridableTypeMap = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverridableTypeMap]
    }
    
    extension [Self <: OverridableTypeMap](x: Self) {
      
      inline def setClassKey(value: String): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: ElementType): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type OverrideProps[M /* <: OverridableTypeMap */, C /* <: ElementType */] = BaseProps[M] & (Omit[
    ComponentPropsWithRef[C], 
    /* keyof @material-ui/core.@material-ui/core/OverridableComponent.CommonProps<M> */ className | style | classes | innerRef
  ])
  
  type SimplifiedPropsOf[C /* <: ElementType */] = Simplify[ComponentProps[C]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? {[ K in keyof T ]: T[K]} : never
    }}}
    */
  @js.native
  trait Simplify[T] extends StObject
}
