package typingsJapgolly.pgwmodal

import typingsJapgolly.pgwmodal.pgwmodalStrings.close
import typingsJapgolly.pgwmodal.pgwmodalStrings.getData
import typingsJapgolly.pgwmodal.pgwmodalStrings.isOpen
import typingsJapgolly.pgwmodal.pgwmodalStrings.reposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgwModalMethod extends StObject {
  
  def apply(action: String): Any = js.native
  def apply(action: close): Boolean = js.native
  def apply(action: getData): Any = js.native
  def apply(action: isOpen): Boolean = js.native
  def apply(action: reposition): Boolean = js.native
  def apply(option: PgwModalOption): Boolean = js.native
}
