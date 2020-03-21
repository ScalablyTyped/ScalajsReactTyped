package typingsJapgolly.draftConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContentStateConverter = js.Function1[/* contentState */ typingsJapgolly.draftJs.mod.ContentState, java.lang.String]
  type EntityKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.react.mod.ReactNode
    - typingsJapgolly.draftConvert.AnonEmpty
    - typingsJapgolly.draftConvert.AnonElement
  */
  type Tag = typingsJapgolly.draftConvert.mod._Tag | japgolly.scalajs.react.raw.React.Node
  type htmlConverter = js.Function1[/* html */ java.lang.String, typingsJapgolly.draftJs.mod.ContentState]
}
