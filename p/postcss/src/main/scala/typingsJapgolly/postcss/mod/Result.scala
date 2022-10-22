package typingsJapgolly.postcss.mod

import typingsJapgolly.postcss.libResultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "Result")
@js.native
open class Result protected ()
  extends typingsJapgolly.postcss.libResultMod.default {
  def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Document, opts: ResultOptions) = this()
  /**
    * @param processor Processor used for this transformation.
    * @param root      Root node after all transformations.
    * @param opts      Options from the `Processor#process` or `Root#toResult`.
    */
  def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Root_, opts: ResultOptions) = this()
}
