package typingsJapgolly.simplePlist

import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.WriteFileOptions
import typingsJapgolly.simplePlist.distTypesMod.PlistJsObj
import typingsJapgolly.simplePlist.distTypesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWriteBinaryFileMod {
  
  @JSImport("simple-plist/dist/writeBinaryFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBinaryFile(aFile: PathOrFileDescriptor, anObject: PlistJsObj, callback: callbackFn[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeBinaryFile(
    aFile: PathOrFileDescriptor,
    anObject: PlistJsObj,
    options: WriteFileOptions,
    callback: callbackFn[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
