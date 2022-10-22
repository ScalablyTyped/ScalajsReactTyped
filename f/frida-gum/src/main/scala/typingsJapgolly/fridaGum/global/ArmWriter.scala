package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.ArmWriterOptions
import typingsJapgolly.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for arm.
  */
@JSGlobal("ArmWriter")
@js.native
open class ArmWriter protected ()
  extends StObject
     with typingsJapgolly.fridaGum.ArmWriter {
  /**
    * Creates a new code writer for generating ARM machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: ArmWriterOptions) = this()
}
