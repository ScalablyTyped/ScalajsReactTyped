package typingsJapgolly.pgwmodal

import typingsJapgolly.pgwmodal.pgwmodalStrings.close
import typingsJapgolly.pgwmodal.pgwmodalStrings.getData
import typingsJapgolly.pgwmodal.pgwmodalStrings.isOpen
import typingsJapgolly.pgwmodal.pgwmodalStrings.reposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoStatic extends StObject {
  
  def pgwModal(action: String): Any
  def pgwModal(option: PgwModalOption): Boolean
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod
  @JSName("pgwModal")
  def pgwModal_close(action: close): Boolean
  @JSName("pgwModal")
  def pgwModal_getData(action: getData): Any
  @JSName("pgwModal")
  def pgwModal_isOpen(action: isOpen): Boolean
  @JSName("pgwModal")
  def pgwModal_reposition(action: reposition): Boolean
}
object ZeptoStatic {
  
  inline def apply(pgwModal: PgwModalMethod): ZeptoStatic = {
    val __obj = js.Dynamic.literal(pgwModal = pgwModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoStatic]
  }
  
  extension [Self <: ZeptoStatic](x: Self) {
    
    inline def setPgwModal(value: PgwModalMethod): Self = StObject.set(x, "pgwModal", value.asInstanceOf[js.Any])
  }
}
