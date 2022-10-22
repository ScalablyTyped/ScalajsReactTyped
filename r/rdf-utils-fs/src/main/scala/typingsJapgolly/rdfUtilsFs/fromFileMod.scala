package typingsJapgolly.rdfUtilsFs

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.rdfUtilsFs.anon.Extensions
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromFileMod {
  
  inline def apply(filename: PathLike): Stream[Quad] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[Stream[Quad]]
  inline def apply(filename: PathLike, options: Options): Stream[Quad] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream[Quad]]
  
  @JSImport("rdf-utils-fs/fromFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = (Record[String, Any]) & Extensions
}
