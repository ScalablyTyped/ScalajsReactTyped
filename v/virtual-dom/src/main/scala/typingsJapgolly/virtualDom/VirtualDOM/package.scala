package typingsJapgolly.virtualDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VirtualDOM {
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type PatchFn[T /* <: org.scalajs.dom.raw.Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[typingsJapgolly.virtualDom.VirtualDOM.VPatch], 
    /* renderOptions */ typingsJapgolly.virtualDom.VirtualDOM.VPatchOptions[T], 
    T
  ]
  type VChild = (js.Array[java.lang.String | typingsJapgolly.virtualDom.VirtualDOM.VTree]) | typingsJapgolly.virtualDom.VirtualDOM.VTree | java.lang.String
}
