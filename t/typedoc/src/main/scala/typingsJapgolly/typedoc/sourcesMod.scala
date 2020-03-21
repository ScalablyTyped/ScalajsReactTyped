package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  @js.native
  class SourceDirectory ()
    extends typingsJapgolly.typedoc.directoryMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: String, parent: typingsJapgolly.typedoc.directoryMod.SourceDirectory) = this()
  }
  
  @js.native
  class SourceFile protected ()
    extends typingsJapgolly.typedoc.fileMod.SourceFile {
    def this(fullFileName: String) = this()
  }
  
}

