package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var add: scala.Double
  
  var all: scala.Double
  
  var branch: scala.Double
  
  var delete: scala.Double
  
  var edit: scala.Double
  
  var encoding: scala.Double
  
  var lock: scala.Double
  
  var merge: scala.Double
  
  var none: scala.Double
  
  var property: scala.Double
  
  var rename: scala.Double
  
  var rollback: scala.Double
  
  var sourceRename: scala.Double
  
  var targetRename: scala.Double
  
  var undelete: scala.Double
}
object Encoding {
  
  inline def apply(
    add: scala.Double,
    all: scala.Double,
    branch: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    encoding: scala.Double,
    lock: scala.Double,
    merge: scala.Double,
    none: scala.Double,
    property: scala.Double,
    rename: scala.Double,
    rollback: scala.Double,
    sourceRename: scala.Double,
    targetRename: scala.Double,
    undelete: scala.Double
  ): Encoding = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], sourceRename = sourceRename.asInstanceOf[js.Any], targetRename = targetRename.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setAdd(value: scala.Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: scala.Double): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: scala.Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: scala.Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setLock(value: scala.Double): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: scala.Double): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: scala.Double): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setRename(value: scala.Double): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: scala.Double): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setSourceRename(value: scala.Double): Self = StObject.set(x, "sourceRename", value.asInstanceOf[js.Any])
    
    inline def setTargetRename(value: scala.Double): Self = StObject.set(x, "targetRename", value.asInstanceOf[js.Any])
    
    inline def setUndelete(value: scala.Double): Self = StObject.set(x, "undelete", value.asInstanceOf[js.Any])
  }
}
