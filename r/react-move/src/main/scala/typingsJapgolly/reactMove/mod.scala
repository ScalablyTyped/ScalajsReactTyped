package typingsJapgolly.reactMove

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMove.animateMod.IAnimateProps
import typingsJapgolly.reactMove.nodeGroupMod.INodeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-move", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Animate ()
    extends Component[IAnimateProps, js.Object, js.Any]
  
  @js.native
  class NodeGroup ()
    extends Component[INodeGroupProps, js.Object, js.Any]
  
  type GetInterpolator = js.Function4[
    /* begValue */ js.UndefOr[js.Any], 
    /* endValue */ js.UndefOr[js.Any], 
    /* attr */ js.UndefOr[String], 
    /* namespace */ js.UndefOr[String], 
    js.Function1[/* t */ Double, js.Any]
  ]
  type HashMap = StringDictionary[js.Any]
}

