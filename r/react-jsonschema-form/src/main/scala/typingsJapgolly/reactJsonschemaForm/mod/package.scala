package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactJsonschemaForm.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def withTheme[T](themeProps: ThemeProps[T]): (ComponentClassP[FormProps[T] & js.Object]) | FunctionComponent[FormProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(themeProps.asInstanceOf[js.Any]).asInstanceOf[(ComponentClassP[FormProps[T] & js.Object]) | FunctionComponent[FormProps[T]]]

type Field = FunctionComponent[FieldProps[Any]] | (ComponentClassP[FieldProps[Any] & js.Object])

type FieldError = String

type ISubmitEvent[T] = IChangeEvent[T]

type IdSchema[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: react-jsonschema-form.react-jsonschema-form.IdSchema<T[key]>} */ js.Any) & FieldId

type PathSchema[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: react-jsonschema-form.react-jsonschema-form.PathSchema<T[key]>} */ js.Any) & FieldPath

type Widget = FunctionComponent[WidgetProps] | (ComponentClassP[WidgetProps & js.Object])
