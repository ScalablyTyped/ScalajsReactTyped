package typingsJapgolly.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object irvisitorMod {
  type NodeVisitor = typingsJapgolly.relayCompiler.irvisitorMod.EnterLeave[typingsJapgolly.relayCompiler.AnonArgument] | typingsJapgolly.relayCompiler.AnonClientExtension
  type NodeVisitorObject[T /* <: typingsJapgolly.relayCompiler.irvisitorMod.VisitNode */] = typingsJapgolly.relayCompiler.irvisitorMod.EnterLeave[typingsJapgolly.relayCompiler.irvisitorMod.VisitFn[T]] | typingsJapgolly.relayCompiler.irvisitorMod.VisitFn[T]
  type VisitFn[T /* <: typingsJapgolly.relayCompiler.irvisitorMod.VisitNode */] = js.Function5[
    /* node */ T, 
    /* key */ js.UndefOr[js.Any], 
    /* parent */ js.UndefOr[
      scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
    ], 
    /* path */ js.UndefOr[js.Array[js.Any]], 
    /* ancestors */ js.UndefOr[
      js.Array[
        typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
      ]
    ], 
    // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
  ]
}
