package typingsJapgolly.diff2html

import typingsJapgolly.diff2html.libHoganjsUtilsMod.default
import typingsJapgolly.diff2html.libTypesMod.DiffFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileListRendererMod {
  
  @JSImport("diff2html/lib/file-list-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(diffFiles: js.Array[DiffFile], hoganUtils: default): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(diffFiles.asInstanceOf[js.Any], hoganUtils.asInstanceOf[js.Any])).asInstanceOf[String]
}
