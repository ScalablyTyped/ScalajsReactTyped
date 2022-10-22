package typingsJapgolly.posterImage

import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(file: Blob): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def apply(file: File): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  
  @JSImport("poster-image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
