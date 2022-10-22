package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcSizeMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptSize[T /* <: Size */](size: Size, adapter: SizeAdapter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptSize")(size.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createSizeAdapter[T /* <: Size */](adapter: SizeAdapter[T]): js.Function1[/* size */ Size, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSizeAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ Size, T]]
  
  inline def normalizeSize[T /* <: Size */](): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")().asInstanceOf[md | T]
  inline def normalizeSize[T /* <: Size */](size: T): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")(size.asInstanceOf[js.Any]).asInstanceOf[md | T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
  */
  trait Size extends StObject
  object Size {
    
    inline def `2xl`: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl` = "2xl".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`]
    
    inline def `2xs`: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs` = "2xs".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`]
    
    inline def `3xl`: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl` = "3xl".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`]
    
    inline def `4xl`: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl` = "4xl".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`]
    
    inline def `5xl`: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl` = "5xl".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`]
    
    inline def inherit: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit = "inherit".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit]
    
    inline def lg: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg = "lg".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg]
    
    inline def md: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md = "md".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md]
    
    inline def sm: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm = "sm".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm]
    
    inline def xl: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl = "xl".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl]
    
    inline def xs: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs = "xs".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs]
  }
  
  /* Inlined std.Partial<std.Record<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/size.Size, T>> */
  trait SizeAdapter[T /* <: Size */] extends StObject {
    
    var `2xl`: js.UndefOr[T] = js.undefined
    
    var `2xs`: js.UndefOr[T] = js.undefined
    
    var `3xl`: js.UndefOr[T] = js.undefined
    
    var `4xl`: js.UndefOr[T] = js.undefined
    
    var `5xl`: js.UndefOr[T] = js.undefined
    
    var inherit: js.UndefOr[T] = js.undefined
    
    var lg: js.UndefOr[T] = js.undefined
    
    var md: js.UndefOr[T] = js.undefined
    
    var sm: js.UndefOr[T] = js.undefined
    
    var xl: js.UndefOr[T] = js.undefined
    
    var xs: js.UndefOr[T] = js.undefined
  }
  object SizeAdapter {
    
    inline def apply[T /* <: Size */](): SizeAdapter[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAdapter[T]]
    }
    
    extension [Self <: SizeAdapter[?], T /* <: Size */](x: Self & SizeAdapter[T]) {
      
      inline def set2xl(value: T): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
      
      inline def set2xlUndefined: Self = StObject.set(x, "2xl", js.undefined)
      
      inline def set2xs(value: T): Self = StObject.set(x, "2xs", value.asInstanceOf[js.Any])
      
      inline def set2xsUndefined: Self = StObject.set(x, "2xs", js.undefined)
      
      inline def set3xl(value: T): Self = StObject.set(x, "3xl", value.asInstanceOf[js.Any])
      
      inline def set3xlUndefined: Self = StObject.set(x, "3xl", js.undefined)
      
      inline def set4xl(value: T): Self = StObject.set(x, "4xl", value.asInstanceOf[js.Any])
      
      inline def set4xlUndefined: Self = StObject.set(x, "4xl", js.undefined)
      
      inline def set5xl(value: T): Self = StObject.set(x, "5xl", value.asInstanceOf[js.Any])
      
      inline def set5xlUndefined: Self = StObject.set(x, "5xl", js.undefined)
      
      inline def setInherit(value: T): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      inline def setLg(value: T): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: T): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: T): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: T): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: T): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
}
