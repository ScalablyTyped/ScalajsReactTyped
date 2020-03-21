package typingsJapgolly.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathVisitorMod {
  type Visitor = typingsJapgolly.astTypes.pathVisitorMod.PathVisitor
  type VisitorMethods = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* path */ typingsJapgolly.astTypes.nodePathMod.NodePath[js.Any, js.Any], js.Any]
  ]
}
