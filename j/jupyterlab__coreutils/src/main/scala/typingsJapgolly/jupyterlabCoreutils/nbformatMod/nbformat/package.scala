package typingsJapgolly.jupyterlabCoreutils.nbformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nbformat {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  type ExecutionCount = scala.Double | scala.Null
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle]
  /**
    * A cell union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IRawCell
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMarkdownCell
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ICodeCell
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
  */
  type ICell = typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat._ICell | typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
  /**
    * An output union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IExecuteResult
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IDisplayData
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IStream
    - typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IError
  */
  type IOutput = typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat._IOutput | typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
  /**
    * An unrecognized cell.
    */
  type IUnrecognizedCell = typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCell
  /**
    * Unrecognized output.
    */
  type IUnrecognizedOutput = typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IBaseOutput
  /**
    * A multiline string.
    */
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  /**
    * Cell output metadata.
    */
  type OutputMetadata = typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
}
