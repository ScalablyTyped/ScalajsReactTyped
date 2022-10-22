package typingsJapgolly.sharedb.libSharedbMod

import typingsJapgolly.sharedb.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOp
  extends StObject
     with RawOp {
  
  var create: Data
  
  var del: Unit
  
  var op: Unit
}
object CreateOp {
  
  inline def apply(
    c: CollectionName,
    create: Data,
    d: DocumentID,
    del: Unit,
    m: Any,
    op: Unit,
    seq: Double,
    src: String,
    v: VersionNumber
  ): CreateOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOp]
  }
  
  extension [Self <: CreateOp](x: Self) {
    
    inline def setCreate(value: Data): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDel(value: Unit): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Unit): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
