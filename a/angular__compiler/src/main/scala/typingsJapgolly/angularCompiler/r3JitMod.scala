package typingsJapgolly.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_jit", JSImport.Namespace)
@js.native
object r3JitMod extends js.Object {
  @js.native
  class R3JitReflector protected () extends CompileReflector {
    def this(context: StringDictionary[js.Any]) = this()
    var context: js.Any = js.native
    def componentModuleUrl(`type`: js.Any, cmpMetadata: js.Any): String = js.native
  }
  
}

