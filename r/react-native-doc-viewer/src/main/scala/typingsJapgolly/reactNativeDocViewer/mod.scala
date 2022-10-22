package typingsJapgolly.reactNativeDocViewer

import typingsJapgolly.reactNativeDocViewer.anon.Base64
import typingsJapgolly.reactNativeDocViewer.anon.Cache
import typingsJapgolly.reactNativeDocViewer.anon.FileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-doc-viewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openDoc(files: js.Array[Cache], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openDoc")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openDocBinaryinUrl(files: js.Array[FileName], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocBinaryinUrl")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openDocb64(files: js.Array[Base64], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocb64")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def playMovie(path: String, callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("playMovie")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
