package typingsJapgolly.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeMod {
  type TreeEventHandler[T] = js.Function3[
    /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], 
    /* nodePath */ js.Array[scala.Double], 
    /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
}
