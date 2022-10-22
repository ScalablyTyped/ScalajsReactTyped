package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientObjectList")
@js.native
open class ClientObjectList[T] protected ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ClientObjectList[T] {
  def this(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    objectPath: typingsJapgolly.sharepoint.SP.ObjectPath,
    childItemType: Any
  ) = this()
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
}
