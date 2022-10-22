package typingsJapgolly.simplePlist

import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.WriteFileOptions
import typingsJapgolly.simplePlist.distTypesMod.PlistJsObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWriteFileSyncMod {
  
  @JSImport("simple-plist/dist/writeFileSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeFileSync(aFile: PathOrFileDescriptor, anObject: PlistJsObj): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(aFile: PathOrFileDescriptor, anObject: PlistJsObj, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
