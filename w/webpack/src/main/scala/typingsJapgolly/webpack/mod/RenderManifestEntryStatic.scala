package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderManifestEntryStatic
  extends StObject
     with RenderManifestEntry {
  
  var auxiliary: js.UndefOr[Boolean] = js.undefined
  
  var filename: String
  
  var hash: js.UndefOr[String] = js.undefined
  
  var identifier: String
  
  var info: AssetInfo
  
  def render(): Source
}
object RenderManifestEntryStatic {
  
  inline def apply(filename: String, identifier: String, info: AssetInfo, render: CallbackTo[Source]): RenderManifestEntryStatic = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], render = render.toJsFn)
    __obj.asInstanceOf[RenderManifestEntryStatic]
  }
  
  extension [Self <: RenderManifestEntryStatic](x: Self) {
    
    inline def setAuxiliary(value: Boolean): Self = StObject.set(x, "auxiliary", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryUndefined: Self = StObject.set(x, "auxiliary", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setRender(value: CallbackTo[Source]): Self = StObject.set(x, "render", value.toJsFn)
  }
}
