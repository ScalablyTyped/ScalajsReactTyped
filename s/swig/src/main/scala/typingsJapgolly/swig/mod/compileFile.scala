package typingsJapgolly.swig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "compileFile")
@js.native
object compileFile extends js.Object {
  def apply(pathname: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  def apply(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  def apply(
    pathname: String,
    options: SwigOptions,
    cb: js.Function2[
      /* err */ js.Error, 
      /* compiledRender */ js.Function1[/* locals */ js.UndefOr[js.Any], String], 
      Unit
    ]
  ): Unit = js.native
}

