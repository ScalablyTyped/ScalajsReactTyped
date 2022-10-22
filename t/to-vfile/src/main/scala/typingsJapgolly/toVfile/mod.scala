package typingsJapgolly.toVfile

import typingsJapgolly.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("to-vfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(description: typingsJapgolly.toVfile.libMod.Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def read(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    callback: typingsJapgolly.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.ReadOptions
  ): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def read(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.ReadOptions,
    callback: typingsJapgolly.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readSync(description: typingsJapgolly.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def readSync(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.ReadOptions
  ): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def toVFile(): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")().asInstanceOf[VFile]
  inline def toVFile(options: typingsJapgolly.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")(options.asInstanceOf[js.Any]).asInstanceOf[VFile]
  
  inline def write(description: typingsJapgolly.toVfile.libMod.Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def write(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    callback: typingsJapgolly.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.WriteOptions
  ): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def write(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.WriteOptions,
    callback: typingsJapgolly.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(description: typingsJapgolly.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def writeSync(
    description: typingsJapgolly.toVfile.libMod.Compatible,
    options: typingsJapgolly.toVfile.libMod.WriteOptions
  ): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  type BufferEncoding = typingsJapgolly.toVfile.libMod.BufferEncoding
  
  type Callback = typingsJapgolly.toVfile.libMod.Callback
  
  type Compatible = typingsJapgolly.toVfile.libMod.Compatible
  
  type Mode = typingsJapgolly.toVfile.libMod.Mode
  
  type ReadOptions = typingsJapgolly.toVfile.libMod.ReadOptions
  
  type WriteOptions = typingsJapgolly.toVfile.libMod.WriteOptions
}
