package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esFormInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.antd.Anon_WrappedComponent
  import typingsJapgolly.antd.antdNumbers.`true`
  import typingsJapgolly.antd.esFormFormMod.WrappedFormInternalProps
  import typingsJapgolly.antd.esUnderscoreUtilTypeMod.Omit
  import typingsJapgolly.react.reactMod.ComponentClass
  import typingsJapgolly.react.reactMod.ComponentState
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.react.reactMod._Global_.JSX.LibraryManagedAttributes

  type ConnectedComponentClass[C /* <: ComponentType[_] */, P] = (ComponentClass[LibraryManagedAttributes[C, P], ComponentState]) with (NonReactStatics[C, js.Object]) with Anon_WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: WrappedFormInternalProps[_] */] = js.Function1[/* component */ js.Any, ConnectedComponentClass[js.Any, Omit[TOwnProps, String]]]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsJapgolly.antd.antdStrings.Matching with js.Any
  type NonReactStatics[S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends / * Inlined react.react.MemoExoticComponent<any> * /
  {  displayName? :string,  readonly $$typeof  :symbol, None (props : react.react.ComponentPropsWithRef<any>): react.react.ReactElement | null,  readonly type  :any}? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ typingsJapgolly.antd.antdStrings.NonReactStatics with S
}
