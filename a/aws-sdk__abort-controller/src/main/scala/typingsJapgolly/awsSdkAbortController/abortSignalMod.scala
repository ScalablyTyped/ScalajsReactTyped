package typingsJapgolly.awsSdkAbortController

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/abort-controller/build/AbortSignal", JSImport.Namespace)
@js.native
object abortSignalMod extends js.Object {
  @js.native
  class AbortSignal ()
    extends typingsJapgolly.awsSdkTypes.abortMod.AbortSignal {
    var _aborted: js.Any = js.native
    /**
      * Whether the action represented by this signal has been cancelled.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
  }
  
}

