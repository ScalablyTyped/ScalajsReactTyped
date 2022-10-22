package typingsJapgolly.googleCloudTextToSpeech.anon

import typingsJapgolly.protobufjs.mod.Codegen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcodegen extends StObject {
  
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(): Codegen = js.native
  def apply(functionName: String): Codegen = js.native
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(functionParams: js.Array[String]): Codegen = js.native
  def apply(functionParams: js.Array[String], functionName: String): Codegen = js.native
  
  /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
  var verbose: Boolean = js.native
}
