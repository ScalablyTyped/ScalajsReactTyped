package typingsJapgolly.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T /* <: typingsJapgolly.write.mod.Data */] = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsJapgolly.write.mod.Result[T]], 
    js.Any
  ]
  type CreateWriteStreamOptions = typingsJapgolly.std.Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.FnCall>[1] */ js.Any, 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ]
  type Data = java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array
  type Options = (typingsJapgolly.std.Omit[
    typingsJapgolly.node.fsMod.WriteFileOptions, 
    typingsJapgolly.write.writeStrings.encoding
  ]) with typingsJapgolly.write.OmitMakeDirectoryOptionsr with typingsJapgolly.write.mod.CommonOptions
  type StreamOptions = (typingsJapgolly.std.Omit[
    typingsJapgolly.write.mod.CreateWriteStreamOptions, 
    typingsJapgolly.write.writeStrings.encoding
  ]) with typingsJapgolly.write.OmitMakeDirectoryOptionsr with typingsJapgolly.write.mod.CommonOptions
}
