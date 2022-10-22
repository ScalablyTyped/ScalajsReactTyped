package typingsJapgolly.serverless

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesUtilsMod {
  
  @JSImport("serverless/classes/Utils", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Utils {
    def this(serverless: typingsJapgolly.serverless.mod.^) = this()
    
    /* CompleteClass */
    override def appendFileSync(filePath: String, contents: String): PromiseLike[js.Object] = js.native
    
    /* CompleteClass */
    override def copyDirContentsSync(srcDir: String, destDir: String): Unit = js.native
    
    /* CompleteClass */
    override def dirExistsSync(dirPath: String): Boolean = js.native
    
    /* CompleteClass */
    override def fileExistsSync(filePath: String): Boolean = js.native
    
    /* CompleteClass */
    override def findServicePath(): String = js.native
    
    /* CompleteClass */
    override def generateShortId(length: Double): String = js.native
    
    /* CompleteClass */
    override def getVersion(): String = js.native
    
    /* CompleteClass */
    override def logStat(serverless: typingsJapgolly.serverless.mod.^, context: String): PromiseLike[js.Object] = js.native
    
    /* CompleteClass */
    override def readFile(filePath: String): PromiseLike[js.Object] = js.native
    
    /* CompleteClass */
    override def readFileSync(filePath: String): js.Object = js.native
    
    /* CompleteClass */
    override def walkDirSync(dirPath: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def writeFile(filePath: String, contents: String): PromiseLike[js.Object] = js.native
    
    /* CompleteClass */
    override def writeFileDir(filePath: String): Unit = js.native
    
    /* CompleteClass */
    override def writeFileSync(filePath: String, contents: String): Unit = js.native
  }
  
  trait Utils extends StObject {
    
    def appendFileSync(filePath: String, contents: String): PromiseLike[js.Object]
    
    def copyDirContentsSync(srcDir: String, destDir: String): Unit
    
    def dirExistsSync(dirPath: String): Boolean
    
    def fileExistsSync(filePath: String): Boolean
    
    def findServicePath(): String
    
    def generateShortId(length: Double): String
    
    def getVersion(): String
    
    def logStat(serverless: typingsJapgolly.serverless.mod.^, context: String): PromiseLike[js.Object]
    
    def readFile(filePath: String): PromiseLike[js.Object]
    
    def readFileSync(filePath: String): js.Object
    
    def walkDirSync(dirPath: String): js.Array[String]
    
    def writeFile(filePath: String, contents: String): PromiseLike[js.Object]
    
    def writeFileDir(filePath: String): Unit
    
    def writeFileSync(filePath: String, contents: String): Unit
  }
  object Utils {
    
    inline def apply(
      appendFileSync: (String, String) => PromiseLike[js.Object],
      copyDirContentsSync: (String, String) => Callback,
      dirExistsSync: String => Boolean,
      fileExistsSync: String => Boolean,
      findServicePath: CallbackTo[String],
      generateShortId: Double => String,
      getVersion: CallbackTo[String],
      logStat: (typingsJapgolly.serverless.mod.^, String) => PromiseLike[js.Object],
      readFile: String => PromiseLike[js.Object],
      readFileSync: String => js.Object,
      walkDirSync: String => js.Array[String],
      writeFile: (String, String) => PromiseLike[js.Object],
      writeFileDir: String => Callback,
      writeFileSync: (String, String) => Callback
    ): Utils = {
      val __obj = js.Dynamic.literal(appendFileSync = js.Any.fromFunction2(appendFileSync), copyDirContentsSync = js.Any.fromFunction2((t0: String, t1: String) => (copyDirContentsSync(t0, t1)).runNow()), dirExistsSync = js.Any.fromFunction1(dirExistsSync), fileExistsSync = js.Any.fromFunction1(fileExistsSync), findServicePath = findServicePath.toJsFn, generateShortId = js.Any.fromFunction1(generateShortId), getVersion = getVersion.toJsFn, logStat = js.Any.fromFunction2(logStat), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), walkDirSync = js.Any.fromFunction1(walkDirSync), writeFile = js.Any.fromFunction2(writeFile), writeFileDir = js.Any.fromFunction1((t0: String) => writeFileDir(t0).runNow()), writeFileSync = js.Any.fromFunction2((t0: String, t1: String) => (writeFileSync(t0, t1)).runNow()))
      __obj.asInstanceOf[Utils]
    }
    
    extension [Self <: Utils](x: Self) {
      
      inline def setAppendFileSync(value: (String, String) => PromiseLike[js.Object]): Self = StObject.set(x, "appendFileSync", js.Any.fromFunction2(value))
      
      inline def setCopyDirContentsSync(value: (String, String) => Callback): Self = StObject.set(x, "copyDirContentsSync", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setDirExistsSync(value: String => Boolean): Self = StObject.set(x, "dirExistsSync", js.Any.fromFunction1(value))
      
      inline def setFileExistsSync(value: String => Boolean): Self = StObject.set(x, "fileExistsSync", js.Any.fromFunction1(value))
      
      inline def setFindServicePath(value: CallbackTo[String]): Self = StObject.set(x, "findServicePath", value.toJsFn)
      
      inline def setGenerateShortId(value: Double => String): Self = StObject.set(x, "generateShortId", js.Any.fromFunction1(value))
      
      inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
      
      inline def setLogStat(value: (typingsJapgolly.serverless.mod.^, String) => PromiseLike[js.Object]): Self = StObject.set(x, "logStat", js.Any.fromFunction2(value))
      
      inline def setReadFile(value: String => PromiseLike[js.Object]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: String => js.Object): Self = StObject.set(x, "readFileSync", js.Any.fromFunction1(value))
      
      inline def setWalkDirSync(value: String => js.Array[String]): Self = StObject.set(x, "walkDirSync", js.Any.fromFunction1(value))
      
      inline def setWriteFile(value: (String, String) => PromiseLike[js.Object]): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
      
      inline def setWriteFileDir(value: String => Callback): Self = StObject.set(x, "writeFileDir", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWriteFileSync(value: (String, String) => Callback): Self = StObject.set(x, "writeFileSync", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
