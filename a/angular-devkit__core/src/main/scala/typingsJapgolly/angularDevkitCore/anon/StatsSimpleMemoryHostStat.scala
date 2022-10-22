package typingsJapgolly.angularDevkitCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular-devkit/core.@angular-devkit/core/src/virtual-fs/host/interface.Stats<@angular-devkit/core.@angular-devkit/core/src/virtual-fs/host/memory.SimpleMemoryHostStats> */
trait StatsSimpleMemoryHostStat extends StObject {
  
  val atime: js.Date
  
  val birthtime: js.Date
  
  val content: js.typedarray.ArrayBuffer | Null
  
  val ctime: js.Date
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
  
  val mtime: js.Date
  
  val size: Double
}
object StatsSimpleMemoryHostStat {
  
  inline def apply(
    atime: js.Date,
    birthtime: js.Date,
    ctime: js.Date,
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    mtime: js.Date,
    size: Double
  ): StatsSimpleMemoryHostStat = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], content = null)
    __obj.asInstanceOf[StatsSimpleMemoryHostStat]
  }
  
  extension [Self <: StatsSimpleMemoryHostStat](x: Self) {
    
    inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
    
    inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
