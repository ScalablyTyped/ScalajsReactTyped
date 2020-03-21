package typingsJapgolly.tensorflowTfjsCore.engineMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.WeakMap
import typingsJapgolly.tensorflowTfjsCore.AnonBackend
import typingsJapgolly.tensorflowTfjsCore.tapeMod.TapeNode
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedVariableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineState extends js.Object {
  var activeProfile: ProfileInfo
  var activeScope: ScopeState
  var activeTape: js.Array[TapeNode]
  var gradientDepth: Double
  var kernelDepth: Double
  var nextScopeId: Double
  var nextTapeNodeId: Double
  var numBytes: Double
  var numDataBuffers: Double
  /**
    * Keeps track of the number of data moves during a kernel execution. We
    * maintain a stack since kernels can call other kernels, recursively.
    */
  var numDataMovesStack: js.Array[Double]
  var numStringTensors: Double
  var numTensors: Double
  var profiling: Boolean
  var registeredVariables: NamedVariableMap
  var scopeStack: js.Array[ScopeState]
  var tensorInfo: WeakMap[js.Object, AnonBackend]
  def dispose(): Unit
}

object EngineState {
  @scala.inline
  def apply(
    activeProfile: ProfileInfo,
    activeScope: ScopeState,
    activeTape: js.Array[TapeNode],
    dispose: Callback,
    gradientDepth: Double,
    kernelDepth: Double,
    nextScopeId: Double,
    nextTapeNodeId: Double,
    numBytes: Double,
    numDataBuffers: Double,
    numDataMovesStack: js.Array[Double],
    numStringTensors: Double,
    numTensors: Double,
    profiling: Boolean,
    registeredVariables: NamedVariableMap,
    scopeStack: js.Array[ScopeState],
    tensorInfo: WeakMap[js.Object, AnonBackend]
  ): EngineState = {
    val __obj = js.Dynamic.literal(activeProfile = activeProfile.asInstanceOf[js.Any], activeScope = activeScope.asInstanceOf[js.Any], activeTape = activeTape.asInstanceOf[js.Any], gradientDepth = gradientDepth.asInstanceOf[js.Any], kernelDepth = kernelDepth.asInstanceOf[js.Any], nextScopeId = nextScopeId.asInstanceOf[js.Any], nextTapeNodeId = nextTapeNodeId.asInstanceOf[js.Any], numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numDataMovesStack = numDataMovesStack.asInstanceOf[js.Any], numStringTensors = numStringTensors.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], profiling = profiling.asInstanceOf[js.Any], registeredVariables = registeredVariables.asInstanceOf[js.Any], scopeStack = scopeStack.asInstanceOf[js.Any], tensorInfo = tensorInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[EngineState]
  }
}

