package typingsJapgolly.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArchiverOptions = typingsJapgolly.archiver.mod.CoreOptions with typingsJapgolly.archiver.mod.TransformOptions with typingsJapgolly.archiver.mod.ZipOptions with typingsJapgolly.archiver.mod.TarOptions
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[
    /* entry */ typingsJapgolly.archiver.mod.EntryData, 
    typingsJapgolly.archiver.archiverBooleans.`false` | typingsJapgolly.archiver.mod.EntryData
  ]
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsJapgolly.archiver.archiverStrings.Partial with T
  type TarEntryData = typingsJapgolly.archiver.mod.EntryData
}
