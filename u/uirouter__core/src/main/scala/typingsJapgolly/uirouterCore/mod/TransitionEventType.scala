package typingsJapgolly.uirouterCore.mod

import typingsJapgolly.uirouterCore.transitionHookMod.GetErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetResultHandler
import typingsJapgolly.uirouterCore.transitionInterfaceMod.PathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "TransitionEventType")
@js.native
class TransitionEventType protected ()
  extends typingsJapgolly.uirouterCore.transitionMod.TransitionEventType {
  def this(
    name: String,
    hookPhase: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType
  ) = this()
  def this(
    name: String,
    hookPhase: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
}

