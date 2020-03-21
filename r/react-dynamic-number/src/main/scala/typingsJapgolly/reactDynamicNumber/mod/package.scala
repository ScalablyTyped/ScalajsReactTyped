package typingsJapgolly.reactDynamicNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseInputProps = typingsJapgolly.std.Partial[
    typingsJapgolly.reactDynamicNumber.mod.Omit[
      typingsJapgolly.react.mod.DetailedHTMLProps[
        typingsJapgolly.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ], 
      typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.ref | typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.value | typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.onChange | typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.placeholder
    ]
  ]
  type DynamicNumber = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactDynamicNumber.mod.DynamicNumberProps with js.Object, 
    js.Object
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
