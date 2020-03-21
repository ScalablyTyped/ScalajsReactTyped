package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers", JSImport.Namespace)
@js.native
object readersMod extends js.Object {
  @js.native
  class ArgumentsReader ()
    extends typingsJapgolly.typedoc.argumentsMod.ArgumentsReader
  
  @js.native
  class TSConfigReader ()
    extends typingsJapgolly.typedoc.tsconfigMod.TSConfigReader
  
  @js.native
  class TypedocReader ()
    extends typingsJapgolly.typedoc.typedocMod.TypedocReader
  
  /* static members */
  @js.native
  object TSConfigReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
    var PROJECT_KEY: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TypedocReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
  }
  
}

