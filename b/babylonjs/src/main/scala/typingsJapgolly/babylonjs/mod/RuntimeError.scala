package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.miscErrorMod.ErrorCodesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RuntimeError")
@js.native
open class RuntimeError protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.RuntimeError {
  /**
    * Creates a new RuntimeError
    * @param message defines the message of the error
    * @param errorCode the error code
    * @param innerError the error that caused the outer error
    */
  def this(message: String, errorCode: ErrorCodesType) = this()
  def this(message: String, errorCode: ErrorCodesType, innerError: js.Error) = this()
}
