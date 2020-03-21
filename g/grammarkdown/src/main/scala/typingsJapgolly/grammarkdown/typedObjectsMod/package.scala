package typingsJapgolly.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typedObjectsMod {
  type TypeOfTypeHint[T /* <: typingsJapgolly.grammarkdown.typedObjectsMod.TypeHint */] = typingsJapgolly.grammarkdown.typedObjectsMod.TypedObject[T] | js.Object | scala.Null | java.lang.String | scala.Double
  type TypeOfTypeObject[T /* <: typingsJapgolly.grammarkdown.typedObjectsMod.TypeObject[
    typingsJapgolly.grammarkdown.typedObjectsMod.TypeHint, 
    typingsJapgolly.grammarkdown.typedObjectsMod.TypeOfTypeHint[typingsJapgolly.grammarkdown.typedObjectsMod.TypeHint]
  ] */] = typingsJapgolly.std.ReturnType[T]
  type TypedObject[T /* <: typingsJapgolly.grammarkdown.typedObjectsMod.StructureHint */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: grammarkdown.grammarkdown/dist/typedObjects.TypeOfTypeObject<T[K]>}
    */ typingsJapgolly.grammarkdown.grammarkdownStrings.TypedObject with T
}
