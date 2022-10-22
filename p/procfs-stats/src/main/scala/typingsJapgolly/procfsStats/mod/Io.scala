package typingsJapgolly.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Io extends StObject {
  
  var cancelled_write_bytes: String
  
  var rchar: String
  
  var read_bytes: String
  
  var syscr: String
  
  var syscw: String
  
  var wchar: String
  
  var write_bytes: String
}
object Io {
  
  inline def apply(
    cancelled_write_bytes: String,
    rchar: String,
    read_bytes: String,
    syscr: String,
    syscw: String,
    wchar: String,
    write_bytes: String
  ): Io = {
    val __obj = js.Dynamic.literal(cancelled_write_bytes = cancelled_write_bytes.asInstanceOf[js.Any], rchar = rchar.asInstanceOf[js.Any], read_bytes = read_bytes.asInstanceOf[js.Any], syscr = syscr.asInstanceOf[js.Any], syscw = syscw.asInstanceOf[js.Any], wchar = wchar.asInstanceOf[js.Any], write_bytes = write_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Io]
  }
  
  extension [Self <: Io](x: Self) {
    
    inline def setCancelled_write_bytes(value: String): Self = StObject.set(x, "cancelled_write_bytes", value.asInstanceOf[js.Any])
    
    inline def setRchar(value: String): Self = StObject.set(x, "rchar", value.asInstanceOf[js.Any])
    
    inline def setRead_bytes(value: String): Self = StObject.set(x, "read_bytes", value.asInstanceOf[js.Any])
    
    inline def setSyscr(value: String): Self = StObject.set(x, "syscr", value.asInstanceOf[js.Any])
    
    inline def setSyscw(value: String): Self = StObject.set(x, "syscw", value.asInstanceOf[js.Any])
    
    inline def setWchar(value: String): Self = StObject.set(x, "wchar", value.asInstanceOf[js.Any])
    
    inline def setWrite_bytes(value: String): Self = StObject.set(x, "write_bytes", value.asInstanceOf[js.Any])
  }
}
