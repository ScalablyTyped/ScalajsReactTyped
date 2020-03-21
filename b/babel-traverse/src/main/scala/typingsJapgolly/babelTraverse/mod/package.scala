package typingsJapgolly.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typingsJapgolly.babelTypes.mod.Node
  type VisitNode[T, P] = (typingsJapgolly.babelTraverse.mod.VisitNodeFunction[T, P]) | typingsJapgolly.babelTraverse.mod.VisitNodeObject[T]
  type VisitNodeFunction[T, P] = js.ThisFunction2[
    /* this */ T, 
    /* path */ typingsJapgolly.babelTraverse.mod.NodePath[P], 
    /* state */ js.Any, 
    scala.Unit
  ]
}
