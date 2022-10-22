package typingsJapgolly.jupyterlabNbformat

import typingsJapgolly.jupyterlabNbformat.mod.CellType
import typingsJapgolly.jupyterlabNbformat.mod.OutputType
import typingsJapgolly.jupyterlabNbformat.mod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabNbformatStrings {
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait code
    extends StObject
       with CellType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait display_data
    extends StObject
       with OutputType
  inline def display_data: display_data = "display_data".asInstanceOf[display_data]
  
  @js.native
  sealed trait error
    extends StObject
       with OutputType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait execute_result
    extends StObject
       with OutputType
  inline def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  
  @js.native
  sealed trait markdown
    extends StObject
       with CellType
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait raw
    extends StObject
       with CellType
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait stderr
    extends StObject
       with StreamType
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdout
    extends StObject
       with StreamType
  inline def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait stream
    extends StObject
       with OutputType
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait update_display_data
    extends StObject
       with OutputType
  inline def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
}
