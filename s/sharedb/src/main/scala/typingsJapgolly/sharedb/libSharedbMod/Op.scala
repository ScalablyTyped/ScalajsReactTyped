package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sharedb.libSharedbMod.AddNumOp
  - typingsJapgolly.sharedb.libSharedbMod.ListInsertOp
  - typingsJapgolly.sharedb.libSharedbMod.ListDeleteOp
  - typingsJapgolly.sharedb.libSharedbMod.ListReplaceOp
  - typingsJapgolly.sharedb.libSharedbMod.ListMoveOp
  - typingsJapgolly.sharedb.libSharedbMod.ObjectInsertOp
  - typingsJapgolly.sharedb.libSharedbMod.ObjectDeleteOp
  - typingsJapgolly.sharedb.libSharedbMod.ObjectReplaceOp
  - typingsJapgolly.sharedb.libSharedbMod.StringInsertOp
  - typingsJapgolly.sharedb.libSharedbMod.StringDeleteOp
  - typingsJapgolly.sharedb.libSharedbMod.SubtypeOp
*/
trait Op extends StObject
object Op {
  
  inline def AddNumOp(na: Double, p: Path): typingsJapgolly.sharedb.libSharedbMod.AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.AddNumOp]
  }
  
  inline def ListDeleteOp(ld: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ListDeleteOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ListDeleteOp]
  }
  
  inline def ListInsertOp(li: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ListInsertOp]
  }
  
  inline def ListMoveOp(lm: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ListMoveOp]
  }
  
  inline def ListReplaceOp(ld: Any, li: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ListReplaceOp]
  }
  
  inline def ObjectDeleteOp(od: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ObjectDeleteOp]
  }
  
  inline def ObjectInsertOp(oi: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ObjectInsertOp = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ObjectInsertOp]
  }
  
  inline def ObjectReplaceOp(od: Any, oi: Any, p: Path): typingsJapgolly.sharedb.libSharedbMod.ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.ObjectReplaceOp]
  }
  
  inline def StringDeleteOp(p: Path, sd: String): typingsJapgolly.sharedb.libSharedbMod.StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.StringDeleteOp]
  }
  
  inline def StringInsertOp(p: Path, si: String): typingsJapgolly.sharedb.libSharedbMod.StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.StringInsertOp]
  }
  
  inline def SubtypeOp(o: Any, p: Path, t: String): typingsJapgolly.sharedb.libSharedbMod.SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sharedb.libSharedbMod.SubtypeOp]
  }
}
