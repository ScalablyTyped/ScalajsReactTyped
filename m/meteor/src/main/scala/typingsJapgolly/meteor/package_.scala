package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  type EJSON = typingsJapgolly.meteor.EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.meteor.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | js.Date | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.meteor.EJSONableCustomType | scala.Null
  ]
  type Header = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | scala.Null
    ]
  ]
  type UnionOmit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type globalError = js.Error
}
