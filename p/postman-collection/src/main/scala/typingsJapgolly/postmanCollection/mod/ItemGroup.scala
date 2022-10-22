package typingsJapgolly.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "ItemGroup")
@js.native
open class ItemGroup[TItem] () extends Property[ItemGroupDefinition] {
  def this(definition: ItemGroupDefinition) = this()
  
  var auth: js.UndefOr[RequestAuth] = js.native
  
  def authorizeRequestsUsing(`type`: String): Unit = js.native
  def authorizeRequestsUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  
  var events: EventList = js.native
  
  def forEachItem(callback: js.Function1[/* el */ TItem, Unit]): Unit = js.native
  
  def forEachItemGroup(callback: js.Function1[/* el */ ItemGroup[TItem], Unit]): Unit = js.native
  
  var items: PropertyList[TItem | ItemGroup[TItem]] = js.native
  
  def oneDeep(idOrName: String): TItem = js.native
}
/* static members */
object ItemGroup {
  
  @JSImport("postman-collection", "ItemGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isItemGroup(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItemGroup")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
