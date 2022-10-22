package typingsJapgolly.tmpPromise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tmp.mod.DirOptions
import typingsJapgolly.tmp.mod.DirResult
import typingsJapgolly.tmp.mod.FileOptions
import typingsJapgolly.tmp.mod.FileOptionsDiscardFd
import typingsJapgolly.tmp.mod.FileResultNoFd
import typingsJapgolly.tmp.mod.TmpNameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dir(): js.Promise[DirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")().asInstanceOf[js.Promise[DirectoryResult]]
  inline def dir(options: DirOptions): js.Promise[DirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DirectoryResult]]
  
  inline def dirSync(): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")().asInstanceOf[DirResult]
  inline def dirSync(options: DirOptions): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(options.asInstanceOf[js.Any]).asInstanceOf[DirResult]
  
  inline def file(): js.Promise[FileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Promise[FileResult]]
  inline def file(options: FileOptions): js.Promise[FileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileResult]]
  
  inline def fileSync(): typingsJapgolly.tmp.mod.FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")().asInstanceOf[typingsJapgolly.tmp.mod.FileResult]
  inline def fileSync(options: FileOptions): typingsJapgolly.tmp.mod.FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tmp.mod.FileResult]
  inline def fileSync(options: FileOptionsDiscardFd): FileResultNoFd = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[FileResultNoFd]
  
  inline def setGracefulCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGracefulCleanup")().asInstanceOf[Unit]
  
  inline def tmpName(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")().asInstanceOf[js.Promise[String]]
  inline def tmpName(options: TmpNameOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def tmpNameSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")().asInstanceOf[String]
  inline def tmpNameSync(options: TmpNameOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withDir[T](fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDir")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def withDir[T](fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]], options: DirOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDir")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def withFile[T](fn: js.Function1[/* result */ FileResult, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFile")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def withFile[T](fn: js.Function1[/* result */ FileResult, js.Promise[T]], options: FileOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withFile")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait DirectoryResult extends StObject {
    
    def cleanup(): js.Promise[Unit]
    
    var path: String
  }
  object DirectoryResult {
    
    inline def apply(cleanup: CallbackTo[js.Promise[Unit]], path: String): DirectoryResult = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.toJsFn, path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryResult]
    }
    
    extension [Self <: DirectoryResult](x: Self) {
      
      inline def setCleanup(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cleanup", value.toJsFn)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileResult
    extends StObject
       with DirectoryResult {
    
    var fd: Double
  }
  object FileResult {
    
    inline def apply(cleanup: CallbackTo[js.Promise[Unit]], fd: Double, path: String): FileResult = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.toJsFn, fd = fd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileResult]
    }
    
    extension [Self <: FileResult](x: Self) {
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    }
  }
}
