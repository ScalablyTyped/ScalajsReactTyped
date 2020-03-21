package typingsJapgolly.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsonMod {
  type EJSON = typingsJapgolly.meteor.ejsonMod.EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.meteor.ejsonMod.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | js.Date | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.meteor.ejsonMod.EJSONableCustomType | scala.Null
  ]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | scala.Null
    ]
  ]
}
