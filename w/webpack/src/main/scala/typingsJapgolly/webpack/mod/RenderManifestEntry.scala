package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.mod.RenderManifestEntryTemplated
  - typingsJapgolly.webpack.mod.RenderManifestEntryStatic
*/
trait RenderManifestEntry extends StObject
object RenderManifestEntry {
  
  inline def RenderManifestEntryStatic(filename: String, identifier: String, info: AssetInfo, render: CallbackTo[Source]): typingsJapgolly.webpack.mod.RenderManifestEntryStatic = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], render = render.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.RenderManifestEntryStatic]
  }
  
  inline def RenderManifestEntryTemplated(
    filenameTemplate: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]),
    identifier: String,
    render: CallbackTo[Source]
  ): typingsJapgolly.webpack.mod.RenderManifestEntryTemplated = {
    val __obj = js.Dynamic.literal(filenameTemplate = filenameTemplate.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], render = render.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.RenderManifestEntryTemplated]
  }
}
