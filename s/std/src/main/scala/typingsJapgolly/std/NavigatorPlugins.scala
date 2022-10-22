package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorPlugins extends StObject {
  
  /** @deprecated */
  /* standard dom */
  def javaEnabled(): scala.Boolean
  
  /** @deprecated */
  /* standard dom */
  val mimeTypes: MimeTypeArray
  
  /* standard dom */
  val pdfViewerEnabled: scala.Boolean
  
  /** @deprecated */
  /* standard dom */
  val plugins: PluginArray
}
object NavigatorPlugins {
  
  inline def apply(
    javaEnabled: CallbackTo[scala.Boolean],
    mimeTypes: MimeTypeArray,
    pdfViewerEnabled: scala.Boolean,
    plugins: PluginArray
  ): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(javaEnabled = javaEnabled.toJsFn, mimeTypes = mimeTypes.asInstanceOf[js.Any], pdfViewerEnabled = pdfViewerEnabled.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorPlugins]
  }
  
  extension [Self <: NavigatorPlugins](x: Self) {
    
    inline def setJavaEnabled(value: CallbackTo[scala.Boolean]): Self = StObject.set(x, "javaEnabled", value.toJsFn)
    
    inline def setMimeTypes(value: MimeTypeArray): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    inline def setPdfViewerEnabled(value: scala.Boolean): Self = StObject.set(x, "pdfViewerEnabled", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: PluginArray): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
