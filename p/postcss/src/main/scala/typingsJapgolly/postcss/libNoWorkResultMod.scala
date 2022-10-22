package typingsJapgolly.postcss

import typingsJapgolly.postcss.libResultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoWorkResultMod {
  
  @JSImport("postcss/lib/no-work-result", JSImport.Default)
  @js.native
  open class default protected () extends NoWorkResult {
    def this(processor: typingsJapgolly.postcss.libProcessorMod.default, css: String, opts: ResultOptions) = this()
  }
  
  @js.native
  trait NoWorkResult
    extends typingsJapgolly.postcss.libLazyResultMod.default
}
