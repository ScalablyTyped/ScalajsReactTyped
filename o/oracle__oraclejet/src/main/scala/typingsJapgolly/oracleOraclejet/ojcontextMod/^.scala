package typingsJapgolly.oracleOraclejet.ojcontextMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
class ^ () extends Context {
  /* CompleteClass */
  override def getBusyContext(): BusyContext = js.native
}

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getContext(node: Element): Context = js.native
  def getPageContext(): Context = js.native
  def setBusyContextDefaultTimeout(timeout: Double): js.Any = js.native
}

