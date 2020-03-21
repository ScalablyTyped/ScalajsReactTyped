package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type PyJson[Keys /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    */ typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PyJson with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typingsJapgolly.tensorflowTfjsLayers.typesMod.PyJsonArray
    - typingsJapgolly.tensorflowTfjsLayers.typesMod.PyJsonDict
  */
  type PyJsonValue = typingsJapgolly.tensorflowTfjsLayers.typesMod._PyJsonValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
}
