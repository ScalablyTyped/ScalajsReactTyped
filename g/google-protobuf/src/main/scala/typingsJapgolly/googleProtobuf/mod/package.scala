package typingsJapgolly.googleProtobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyFieldType = typingsJapgolly.googleProtobuf.mod.ScalarFieldType | typingsJapgolly.googleProtobuf.mod.RepeatedFieldType | scala.scalajs.js.typedarray.Uint8Array
  type BinaryRead = js.Function2[
    /* msg */ js.Any, 
    /* reader */ typingsJapgolly.googleProtobuf.mod.BinaryReadReader, 
    scala.Unit
  ]
  type BinaryReadReader = js.Function2[
    /* msg */ js.Any, 
    /* binaryReader */ typingsJapgolly.googleProtobuf.mod.BinaryReader, 
    scala.Unit
  ]
  type BinaryWrite = js.Function3[
    /* fieldNumber */ scala.Double, 
    /* value */ js.Any, 
    /* writerCallback */ typingsJapgolly.googleProtobuf.mod.BinaryWriteCallback, 
    scala.Unit
  ]
  type BinaryWriteCallback = js.Function2[
    /* value */ js.Any, 
    /* binaryWriter */ typingsJapgolly.googleProtobuf.mod.BinaryWriter, 
    scala.Unit
  ]
  type ByteSource = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array | js.Array[scala.Double] | java.lang.String
  type FieldValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.googleProtobuf.mod.FieldValueArray
  ]
  type Map[K, V] = typingsJapgolly.googleProtobuf.mod.Map_[K, V]
  type RepeatedFieldType = js.Array[
    typingsJapgolly.googleProtobuf.mod.ScalarFieldType | scala.scalajs.js.typedarray.Uint8Array
  ]
  type ScalarFieldType = scala.Boolean | scala.Double | java.lang.String
}
