package typingsJapgolly.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilMod {
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ js.Array[String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...keyof object][number]> ]: object[K2]}
    */ typingsJapgolly.rcDashMentions.rcDashMentionsStrings.OmitFunc with js.Object
  ]
}
