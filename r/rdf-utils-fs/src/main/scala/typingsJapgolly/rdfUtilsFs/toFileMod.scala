package typingsJapgolly.rdfUtilsFs

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.rdfUtilsFs.anon.Extensions
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toFileMod {
  
  inline def apply(stream: Stream[Quad], filename: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(stream: Stream[Quad], filename: PathLike, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("rdf-utils-fs/toFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = (Record[String, Any]) & Extensions
}
