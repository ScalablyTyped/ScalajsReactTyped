package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.transitionHookMod.ErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetErrorHandler
import typingsJapgolly.uirouterCore.transitionHookMod.GetResultHandler
import typingsJapgolly.uirouterCore.transitionHookMod.ResultHandler
import typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook
import typingsJapgolly.uirouterCore.transitionInterfaceMod.PathType
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/transitionEventType", JSImport.Namespace)
@js.native
object transitionEventTypeMod extends js.Object {
  @js.native
  class TransitionEventType protected () extends js.Object {
    def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    var criteriaMatchPath: PathType = js.native
    @JSName("getErrorHandler")
    var getErrorHandler_Original: GetErrorHandler = js.native
    @JSName("getResultHandler")
    var getResultHandler_Original: GetResultHandler = js.native
    var hookOrder: Double = js.native
    var hookPhase: TransitionHookPhase = js.native
    var name: String = js.native
    var reverseSort: Boolean = js.native
    var synchronous: Boolean = js.native
    def getErrorHandler(hook: TransitionHook): ErrorHandler = js.native
    def getResultHandler(hook: TransitionHook): ResultHandler = js.native
  }
  
}

