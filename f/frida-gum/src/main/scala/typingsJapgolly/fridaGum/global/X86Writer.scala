package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.NativePointerValue
import typingsJapgolly.fridaGum.X86WriterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for x86.
  */
@JSGlobal("X86Writer")
@js.native
open class X86Writer protected ()
  extends StObject
     with typingsJapgolly.fridaGum.X86Writer {
  /**
    * Creates a new code writer for generating x86 machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: X86WriterOptions) = this()
}
