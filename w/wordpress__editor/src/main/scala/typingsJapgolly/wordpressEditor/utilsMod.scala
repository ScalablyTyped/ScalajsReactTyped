package typingsJapgolly.wordpressEditor

import typingsJapgolly.wordpressMediaUtils.utilsUploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/editor/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanForSlug(slug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanForSlug")(slug.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mediaUpload(options: UploadMediaOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaUpload")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
