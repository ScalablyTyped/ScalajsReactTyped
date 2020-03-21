package typingsJapgolly.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = typingsJapgolly.styledComponents.styledComponentsMod.StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type Attrs[P, A /* <: typingsJapgolly.std.Partial[P] */, T] = (js.Function1[
    /* props */ typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledProps[P, T], 
    A
  ]) | A
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = japgolly.scalajs.react.raw.React.ComponentClassP[
    (typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps[T, U]) with js.Object
  ]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[js.Any], 
    typingsJapgolly.react.mod.ForwardRefExoticComponent[
      typingsJapgolly.styledComponents.styledComponentsMod.WithOptionalTheme[
        typingsJapgolly.react.mod.ComponentPropsWithRef[typingsJapgolly.react.mod.ComponentType[js.Any]], 
        T
      ]
    ]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[typingsJapgolly.styledComponents.styledComponentsMod.CSSObject]
  type CSSProp[T] = java.lang.String | typingsJapgolly.styledComponents.styledComponentsMod.CSSObject | typingsJapgolly.styledComponents.styledComponentsMod.FlattenInterpolation[typingsJapgolly.styledComponents.styledComponentsMod.ThemeProps[T]]
  type CSSProperties = typingsJapgolly.csstype.mod.Properties[java.lang.String | scala.Double]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typingsJapgolly.std.Pick[P, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]) with (typingsJapgolly.std.Partial[
    typingsJapgolly.std.Pick[P, typingsJapgolly.std.Extract[java.lang.String, java.lang.String]]
  ]) with (typingsJapgolly.std.Partial[
    typingsJapgolly.std.Pick[D, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]
  ])) | P
  type FalseyValue = js.UndefOr[scala.Null | typingsJapgolly.styledComponents.styledComponentsBooleans.`false`]
  type GlobalStyleComponent[P, T] = japgolly.scalajs.react.raw.React.ComponentClassP[
    (typingsJapgolly.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps[P, T]) with js.Object
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.styledComponentsMod.InterpolationValue
    - typingsJapgolly.styledComponents.styledComponentsMod.FlattenInterpolation[P]
    - typingsJapgolly.styledComponents.styledComponentsMod.InterpolationFunction[P]
  */
  type Interpolation[P] = typingsJapgolly.styledComponents.styledComponentsMod._Interpolation[P] | java.lang.String | scala.Double | typingsJapgolly.styledComponents.styledComponentsMod.FalseyValue
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsJapgolly.styledComponents.styledComponentsMod.FalseyValue
    - typingsJapgolly.styledComponents.styledComponentsMod.Keyframes_
    - typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInterpolation
    - typingsJapgolly.styledComponents.styledComponentsMod.CSSObject
  */
  type InterpolationValue = typingsJapgolly.styledComponents.styledComponentsMod._InterpolationValue | java.lang.String | scala.Double | typingsJapgolly.styledComponents.styledComponentsMod.FalseyValue
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (typingsJapgolly.styledComponents.styledComponentsMod.Defaultize[P, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.styledComponentsMod.InterpolationValue
    - typingsJapgolly.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
  */
  type SimpleInterpolation = typingsJapgolly.styledComponents.styledComponentsMod._SimpleInterpolation | java.lang.String | scala.Double | typingsJapgolly.styledComponents.styledComponentsMod.FalseyValue
  type StyledComponent[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentBase[C, T, O, A]) with (typingsJapgolly.hoistNonReactStatics.mod.NonReactStatics[C, js.Object])
  type StyledComponentInnerAttrs[C /* <: typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: typingsJapgolly.react.mod.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = (typingsJapgolly.styledComponents.styledComponentsMod.WithOptionalTheme[
    (typingsJapgolly.styledComponents.styledComponentsMod.Omit[
      (typingsJapgolly.styledComponents.styledComponentsMod.ReactDefaultizedProps[C, typingsJapgolly.react.mod.ComponentPropsWithRef[C]]) with O, 
      A
    ]) with (typingsJapgolly.std.Partial[
      typingsJapgolly.std.Pick[typingsJapgolly.react.mod.ComponentPropsWithRef[C] with O, A]
    ]), 
    T
  ]) with typingsJapgolly.styledComponents.styledComponentsMod.WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentProps[C, T, O, A]) with typingsJapgolly.styledComponents.AnonForwardedAs[C]
  type StyledComponentPropsWithRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = typingsJapgolly.react.mod.ComponentPropsWithRef[
    C | typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerComponent[C]
  ]
  type StyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledProps[P] = typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledProps[
    P, 
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
  ]
  type StylisPlugin = js.Function7[
    /* context */ scala.Double, 
    /* selector */ js.Array[java.lang.String], 
    /* parent */ js.Array[java.lang.String], 
    /* content */ java.lang.String, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    java.lang.String | scala.Unit
  ]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = japgolly.scalajs.react.raw.React.ComponentClassP[
    (typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps[
      typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
      typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[U]
    ]) with js.Object
  ]
  type ThemedCssFunction[T /* <: js.Object */] = typingsJapgolly.styledComponents.styledComponentsMod.BaseThemedCssFunction[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (typingsJapgolly.styledComponents.styledComponentsMod.WithOptionalTheme[P, T]) with typingsJapgolly.styledComponents.AnonSuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = typingsJapgolly.styledComponents.styledComponentsMod.ThemedBaseStyledInterface[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with typingsJapgolly.styledComponents.styledComponentsMod.ThemeProps[T]
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = js.Object | typingsJapgolly.styledComponents.AnonChildren
  type WithOptionalTheme[P /* <: typingsJapgolly.styledComponents.AnonThemeT[T] */, T] = P with typingsJapgolly.styledComponents.AnonThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = typingsJapgolly.styledComponents.styledComponentsMod.BaseWithThemeFnInterface[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
}
