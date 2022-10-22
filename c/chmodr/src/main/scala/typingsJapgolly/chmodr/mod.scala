package typingsJapgolly.chmodr

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chmodr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(path: PathLike, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type PathLike = String | Buffer | URL_
}
