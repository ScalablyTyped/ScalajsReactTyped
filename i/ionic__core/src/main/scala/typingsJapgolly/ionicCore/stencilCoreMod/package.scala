package typingsJapgolly.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type ChildType = typingsJapgolly.ionicCore.stencilCoreMod.VNode | scala.Double | java.lang.String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsJapgolly.ionicCore.stencilCoreMod.VNode], 
    /* utils */ typingsJapgolly.ionicCore.stencilCoreMod.FunctionalUtilities, 
    typingsJapgolly.ionicCore.stencilCoreMod.VNode | js.Array[typingsJapgolly.ionicCore.stencilCoreMod.VNode]
  ]
  type PropsType = typingsJapgolly.ionicCore.stencilCoreMod.VNodeProdData | scala.Double | java.lang.String | scala.Null
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}
