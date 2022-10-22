package typingsJapgolly.reactSpringNative

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.reactNative.mod.ImageProps
import typingsJapgolly.reactNative.mod.MatrixTransform
import typingsJapgolly.reactNative.mod.PerpectiveTransform
import typingsJapgolly.reactNative.mod.RotateTransform
import typingsJapgolly.reactNative.mod.RotateXTransform
import typingsJapgolly.reactNative.mod.RotateYTransform
import typingsJapgolly.reactNative.mod.RotateZTransform
import typingsJapgolly.reactNative.mod.ScaleTransform
import typingsJapgolly.reactNative.mod.ScaleXTransform
import typingsJapgolly.reactNative.mod.ScaleYTransform
import typingsJapgolly.reactNative.mod.SkewXTransform
import typingsJapgolly.reactNative.mod.SkewYTransform
import typingsJapgolly.reactNative.mod.TranslateXTransform
import typingsJapgolly.reactNative.mod.TranslateYTransform
import typingsJapgolly.reactSpringNative.anon.Children
import typingsJapgolly.reactSpringNative.anon.TextPropschildrenReactNod
import typingsJapgolly.reactSpringNative.anon.ViewPropschildrenReactNod
import typingsJapgolly.reactSpringTypes.utilMod.ComponentPropsWithRef
import typingsJapgolly.reactSpringTypes.utilMod.ElementType
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any}
    }}}
    */
  @js.native
  trait AnimatedArray[T /* <: js.Array[Double | String] */] extends StObject
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]] & Children]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Exclude<T, object | void> | std.Extract<T, std.ReadonlyArray<number | string>> extends infer U ? [U] extends [never] ? never : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<U | Exclude<T, object | void>> * / any : never
    }}}
    */
  @js.native
  trait AnimatedLeaf[T] extends StObject
  
  /* Inlined {[ P in keyof @react-spring/native.@react-spring/native/dist/declarations/src/animated.Primitives ]: @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedComponent<@react-spring/native.@react-spring/native/dist/declarations/src/animated.Primitives[P]>} */
  trait AnimatedPrimitives extends StObject {
    
    var Image: AnimatedComponent[ComponentClassP[ImageProps & js.Object]]
    
    var Text: AnimatedComponent[ComponentClassP[TextPropschildrenReactNod & js.Object]]
    
    var View: AnimatedComponent[ComponentClassP[ViewPropschildrenReactNod & js.Object]]
  }
  object AnimatedPrimitives {
    
    inline def apply(
      Image: AnimatedComponent[ComponentClassP[ImageProps & js.Object]],
      Text: AnimatedComponent[ComponentClassP[TextPropschildrenReactNod & js.Object]],
      View: AnimatedComponent[ComponentClassP[ViewPropschildrenReactNod & js.Object]]
    ): AnimatedPrimitives = {
      val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedPrimitives]
    }
    
    extension [Self <: AnimatedPrimitives](x: Self) {
      
      inline def setImage(value: AnimatedComponent[ComponentClassP[ImageProps & js.Object]]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setText(value: AnimatedComponent[ComponentClassP[TextPropschildrenReactNod & js.Object]]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setView(value: AnimatedComponent[ComponentClassP[ViewPropschildrenReactNod & js.Object]]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends std.ReadonlyArray<number | string> ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedArray<DT> | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : DT extends std.ReadonlyArray<any> ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.TransformArray extends DT ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedTransform : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyles<DT> : [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react-native.react-native.ViewStyle>] extends [never] ? DT | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyle<DT> : never
    }}}
    */
  @js.native
  trait AnimatedProp[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends object ? {[ P in keyof T ]: P extends 'transform'? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedTransform : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyle<T[P]>} : DT | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  @js.native
  trait AnimatedStyle[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    unknown & T extends react-native.react-native.RecursiveArray<infer U> ? {[ P in keyof T ]: react-native.react-native.RecursiveArray<@react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<U>>}[keyof T] : {[ P in keyof T ]: [T[P]] extends [infer DT]? DT extends std.ReadonlyArray<any>? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyles<DT> : DT extends object? [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react-native.react-native.ViewStyle>] extends [never]? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<DT> : {[ P in keyof DT ]: @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<DT[P]>} : DT : never}
    }}}
    */
  @js.native
  trait AnimatedStyles[T /* <: js.Array[Any] */] extends StObject
  
  type AnimatedTransform = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/native.@react-spring/native/dist/declarations/src/animated.TransformArray[number] extends infer T ? {[ P in keyof T ]: T[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any} : never */ js.Any
  ]
  
  trait Primitives extends StObject {
    
    var Image: ComponentClassP[ImageProps & js.Object]
    
    var Text: ComponentClassP[TextPropschildrenReactNod & js.Object]
    
    var View: ComponentClassP[ViewPropschildrenReactNod & js.Object]
  }
  object Primitives {
    
    inline def apply(
      Image: ComponentClassP[ImageProps & js.Object],
      Text: ComponentClassP[TextPropschildrenReactNod & js.Object],
      View: ComponentClassP[ViewPropschildrenReactNod & js.Object]
    ): Primitives = {
      val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
      __obj.asInstanceOf[Primitives]
    }
    
    extension [Self <: Primitives](x: Self) {
      
      inline def setImage(value: ComponentClassP[ImageProps & js.Object]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setText(value: ComponentClassP[TextPropschildrenReactNod & js.Object]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setView(value: ComponentClassP[ViewPropschildrenReactNod & js.Object]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformArray = Exclude[
    js.UndefOr[
      js.Array[
        PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
      ]
    ], 
    Unit
  ]
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
