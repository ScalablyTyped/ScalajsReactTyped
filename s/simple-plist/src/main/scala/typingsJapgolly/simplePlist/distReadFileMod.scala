package typingsJapgolly.simplePlist

import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.simplePlist.distTypesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReadFileMod {
  
  @JSImport("simple-plist/dist/readFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile[T](aFile: PathOrFileDescriptor, callback: callbackFn[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(aFile.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
