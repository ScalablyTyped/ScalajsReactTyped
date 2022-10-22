package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
open class RoleDefinitionBindingCollection protected ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.RoleDefinitionBindingCollection {
  def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext) = this()
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typingsJapgolly.sharepoint.SP.RoleDefinition] = js.native
}
object RoleDefinitionBindingCollection {
  
  @JSGlobal("SP.RoleDefinitionBindingCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.RoleDefinitionBindingCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.RoleDefinitionBindingCollection]
}
