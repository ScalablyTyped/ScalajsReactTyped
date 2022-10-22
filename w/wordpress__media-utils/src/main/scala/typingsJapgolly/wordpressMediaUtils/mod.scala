package typingsJapgolly.wordpressMediaUtils

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props
import typingsJapgolly.wordpressMediaUtils.utilsUploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/media-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MediaUpload[T /* <: Boolean */](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadMedia")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
