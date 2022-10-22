package typingsJapgolly.fetchBlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromMod {
  
  @JSImport("fetch-blob/from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: String): org.scalajs.dom.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Blob]
  inline def default(path: String, `type`: String): org.scalajs.dom.Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Blob]
  
  @JSImport("fetch-blob/from", "Blob")
  @js.native
  val Blob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.Blob */ Any = js.native
  
  @JSImport("fetch-blob/from", "File")
  @js.native
  val File: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.File */ Any = js.native
  
  inline def blobFrom(path: String): js.Promise[org.scalajs.dom.Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Blob]]
  inline def blobFrom(path: String, `type`: String): js.Promise[org.scalajs.dom.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Blob]]
  
  inline def blobFromSync(path: String): org.scalajs.dom.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Blob]
  inline def blobFromSync(path: String, `type`: String): org.scalajs.dom.Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Blob]
  
  inline def fileFrom(path: String): js.Promise[org.scalajs.dom.File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.File]]
  inline def fileFrom(path: String, `type`: String): js.Promise[org.scalajs.dom.File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.File]]
  
  inline def fileFromSync(path: String): org.scalajs.dom.File = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.File]
  inline def fileFromSync(path: String, `type`: String): org.scalajs.dom.File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.File]
}
