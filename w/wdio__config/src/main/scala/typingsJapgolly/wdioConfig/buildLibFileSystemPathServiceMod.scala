package typingsJapgolly.wdioConfig

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wdioConfig.buildTypesMod.PathService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibFileSystemPathServiceMod {
  
  @JSImport("@wdio/config/build/lib/FileSystemPathService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FileSystemPathService {
    
    /* CompleteClass */
    override def ensureAbsolutePath(path: String): String = js.native
    
    /* CompleteClass */
    override def getcwd(): String = js.native
    
    /* CompleteClass */
    override def glob(pattern: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def isFile(path: String): Boolean = js.native
    
    /* CompleteClass */
    override def loadFile[T](path: String): T = js.native
  }
  
  trait FileSystemPathService
    extends StObject
       with PathService
  object FileSystemPathService {
    
    inline def apply(
      ensureAbsolutePath: String => String,
      getcwd: CallbackTo[String],
      glob: String => js.Array[String],
      isFile: String => Boolean,
      loadFile: String => Any
    ): FileSystemPathService = {
      val __obj = js.Dynamic.literal(ensureAbsolutePath = js.Any.fromFunction1(ensureAbsolutePath), getcwd = getcwd.toJsFn, glob = js.Any.fromFunction1(glob), isFile = js.Any.fromFunction1(isFile), loadFile = js.Any.fromFunction1(loadFile))
      __obj.asInstanceOf[FileSystemPathService]
    }
  }
}
