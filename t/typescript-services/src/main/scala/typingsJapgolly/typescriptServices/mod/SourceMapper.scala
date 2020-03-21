package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typingsJapgolly.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typingsJapgolly.typescriptServices.TypeScript.TextWriter,
    document: typingsJapgolly.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typingsJapgolly.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

