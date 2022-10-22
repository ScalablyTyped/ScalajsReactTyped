package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.OutputFile")
@js.native
open class OutputFile protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsJapgolly.typescriptServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsJapgolly.typescriptServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typingsJapgolly.typescriptServices.TypeScript.SourceMapEntry]
  ) = this()
  
  /* CompleteClass */
  var fileType: typingsJapgolly.typescriptServices.TypeScript.OutputFileType = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var sourceMapEntries: js.Array[typingsJapgolly.typescriptServices.TypeScript.SourceMapEntry] = js.native
  
  /* CompleteClass */
  var text: String = js.native
  
  /* CompleteClass */
  var writeByteOrderMark: Boolean = js.native
}
