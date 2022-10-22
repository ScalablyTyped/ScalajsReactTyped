package typingsJapgolly.splashy

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: ImageSource): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("splashy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ImageSource = String | HTMLImageElement | Buffer
}
