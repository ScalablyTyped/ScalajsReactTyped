package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 描述文件状态的对象 */
trait Stats extends StObject {
  
  /** [boolean Stats.isDirectory()](Stats.isDirectory.md)
    *
    * 判断当前文件是否一个目录 */
  def isDirectory(): Boolean
  
  /** [boolean Stats.isFile()](Stats.isFile.md)
    *
    * 判断当前文件是否一个普通文件 */
  def isFile(): Boolean
  
  /** 文件最近一次被存取或被执行的时间，UNIX 时间戳，对应 POSIX stat.st_atime */
  var lastAccessedTime: Double
  
  /** 文件最后一次被修改的时间，UNIX 时间戳，对应 POSIX stat.st_mtime */
  var lastModifiedTime: Double
  
  /** 文件的类型和存取的权限，对应 POSIX stat.st_mode */
  var mode: String
  
  /** 文件大小，单位：B，对应 POSIX stat.st_size */
  var size: Double
}
object Stats {
  
  inline def apply(
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, lastAccessedTime = lastAccessedTime.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setLastAccessedTime(value: Double): Self = StObject.set(x, "lastAccessedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: Double): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
