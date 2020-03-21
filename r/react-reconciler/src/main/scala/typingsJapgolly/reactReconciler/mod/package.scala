package typingsJapgolly.reactReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = scala.Double
  type FiberRoot = typingsJapgolly.reactReconciler.mod.BaseFiberRootProperties with typingsJapgolly.reactReconciler.mod.ProfilingOnlyFiberRootProperties
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = typingsJapgolly.reactReconciler.mod.Fiber
  type OpaqueRoot = typingsJapgolly.reactReconciler.mod.FiberRoot
  type PendingInteractionMap = typingsJapgolly.std.Map[
    typingsJapgolly.reactReconciler.mod.ExpirationTime, 
    typingsJapgolly.std.Set[typingsJapgolly.reactReconciler.mod.Interaction]
  ]
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]
  type ReactNodeList = typingsJapgolly.reactReconciler.mod.ReactEmpty | japgolly.scalajs.react.raw.React.Node
  // shared/ReactSideEffectTags
  type SideEffectTag = scala.Double
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = scala.Double
}
