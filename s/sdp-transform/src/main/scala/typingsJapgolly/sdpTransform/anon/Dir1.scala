package typingsJapgolly.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir1 extends StObject {
  
  var dir1: String
  
  var dir2: js.UndefOr[String] = js.undefined
  
  var list1: String
  
  var list2: js.UndefOr[String] = js.undefined
}
object Dir1 {
  
  inline def apply(dir1: String, list1: String): Dir1 = {
    val __obj = js.Dynamic.literal(dir1 = dir1.asInstanceOf[js.Any], list1 = list1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir1]
  }
  
  extension [Self <: Dir1](x: Self) {
    
    inline def setDir1(value: String): Self = StObject.set(x, "dir1", value.asInstanceOf[js.Any])
    
    inline def setDir2(value: String): Self = StObject.set(x, "dir2", value.asInstanceOf[js.Any])
    
    inline def setDir2Undefined: Self = StObject.set(x, "dir2", js.undefined)
    
    inline def setList1(value: String): Self = StObject.set(x, "list1", value.asInstanceOf[js.Any])
    
    inline def setList2(value: String): Self = StObject.set(x, "list2", value.asInstanceOf[js.Any])
    
    inline def setList2Undefined: Self = StObject.set(x, "list2", js.undefined)
  }
}
