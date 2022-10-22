package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.reactNative.anon.ReadonlyNativeMethods
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.ComponentClass<P, react.react.ComponentState>, std.Exclude<keyof react.react.ComponentClass<P, react.react.ComponentState>, 'new'>> */
@js.native
trait HostComponent[P]
  extends StObject
     with Instantiable1[/* props */ P, (Component[P & js.Object, js.Object]) & ReadonlyNativeMethods]
     with Instantiable2[
      /* props */ P, 
      /* context */ Any, 
      (Component[P & js.Object, js.Object]) & ReadonlyNativeMethods
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[typingsJapgolly.reactNative.reactNativeStrings.defaultProps]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getDerivedStateFromError: js.UndefOr[
    GetDerivedStateFromError[typingsJapgolly.reactNative.reactNativeStrings.getDerivedStateFromError, js.Object]
  ] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[
    GetDerivedStateFromProps[typingsJapgolly.reactNative.reactNativeStrings.getDerivedStateFromProps, js.Object]
  ] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[typingsJapgolly.reactNative.reactNativeStrings.propTypes]] = js.native
}
