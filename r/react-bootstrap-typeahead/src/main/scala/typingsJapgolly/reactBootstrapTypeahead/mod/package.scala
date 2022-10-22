package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactBootstrapTypeahead.anon.Active
import typingsJapgolly.reactBootstrapTypeahead.anon.CustomOption
import typingsJapgolly.reactBootstrapTypeahead.anon.OnBlur
import typingsJapgolly.reactBootstrapTypeahead.mod.^
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ClearButton: FunctionComponent[ClearButtonProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("ClearButton").asInstanceOf[FunctionComponent[ClearButtonProps]]

inline def Loader: FunctionComponent[LoaderProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Loader").asInstanceOf[FunctionComponent[LoaderProps]]

inline def useToken(props: OnBlur): Active = ^.asInstanceOf[js.Dynamic].applyDynamic("useToken")(props.asInstanceOf[js.Any]).asInstanceOf[Active]

type EventHandler[T] = js.Function1[/* e */ ReactEventFrom[T & Element], Unit]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type Option = String | StringDictionary[Any]

type ShouldSelect = js.Function2[
/* shouldSelect */ Boolean, 
/* e */ ReactKeyboardEventFrom[HTMLInputElement], 
Boolean]

type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any

type TypeaheadModel = String | js.Object

type TypeaheadResult[T /* <: TypeaheadModel */] = T & CustomOption
