package typingsJapgolly.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // array.js
  type ArrayAlias = typingsJapgolly.svgJs.mod.Array | js.Array[scala.Double] | java.lang.String
  // line.js
  type ArrayPoint = js.Array[scala.Double]
  type ColorAlias = java.lang.String | typingsJapgolly.svgJs.mod.ColorLike
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.svgJs.mod.MatrixLike
    - js.Array[scala.Double]
    - typingsJapgolly.svgJs.mod.Element
    - java.lang.String
  */
  type MatrixAlias = typingsJapgolly.svgJs.mod._MatrixAlias | js.Array[scala.Double] | java.lang.String
  type NumberAlias = typingsJapgolly.svgJs.mod.Number | scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.svgJs.mod.Doc
    - typingsJapgolly.svgJs.mod.Nested
    - typingsJapgolly.svgJs.mod.G
  */
  type ParentTypeAlias = typingsJapgolly.svgJs.mod._ParentTypeAlias | java.lang.String
  type PathArrayAlias = typingsJapgolly.svgJs.mod.PathArray | (js.Array[scala.Double | typingsJapgolly.svgJs.mod.PathArrayPoint | java.lang.String]) | java.lang.String
  // path.js
  type PathArrayPoint = js.Array[scala.Double | java.lang.String]
  type PointArrayAlias = (js.Array[typingsJapgolly.svgJs.mod.ArrayPoint | scala.Double]) | typingsJapgolly.svgJs.mod.PointArray | java.lang.String
  // viewbox.js
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.svgJs.mod.ViewBoxLike
    - js.Array[scala.Double]
    - java.lang.String
    - typingsJapgolly.svgJs.mod.Element
  */
  type ViewBoxAlias = typingsJapgolly.svgJs.mod._ViewBoxAlias | js.Array[scala.Double] | java.lang.String
}
