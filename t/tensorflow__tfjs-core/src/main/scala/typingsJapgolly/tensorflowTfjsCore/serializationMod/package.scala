package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serializationMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDictArray
    - typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
  */
  type ConfigDictValue = typingsJapgolly.tensorflowTfjsCore.serializationMod._ConfigDictValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
  type FromConfigMethod[T /* <: typingsJapgolly.tensorflowTfjsCore.serializationMod.Serializable */] = js.Function2[
    /* cls */ typingsJapgolly.tensorflowTfjsCore.serializationMod.SerializableConstructor[T], 
    /* config */ typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict, 
    T
  ]
}
