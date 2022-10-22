package typingsJapgolly.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRedEditorClient.anon.tmultieventsArrayHistoryE
  - typingsJapgolly.nodeRedEditorClient.anon.treplaceconfigobjectchang
  - typingsJapgolly.nodeRedEditorClient.anon.taddnodesArrayobjectundef
  - typingsJapgolly.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj
  - typingsJapgolly.nodeRedEditorClient.anon.tmovenodesArrayobjectlink
  - typingsJapgolly.nodeRedEditorClient.anon.teditnodeobjectchangesArr
  - typingsJapgolly.nodeRedEditorClient.anon.tcreateSubflownodesArrayo
  - typingsJapgolly.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje
  - typingsJapgolly.nodeRedEditorClient.anon.treorderorderobjectundefi
  - typingsJapgolly.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob
  - typingsJapgolly.nodeRedEditorClient.anon.tungroupgroupsArrayobject
  - typingsJapgolly.nodeRedEditorClient.anon.taddToGroupnodesArrayobje
  - typingsJapgolly.nodeRedEditorClient.anon.tremoveFromGroupnodesArra
*/
trait HistoryEvent extends StObject
object HistoryEvent {
  
  inline def taddToGroupnodesArrayobje(): typingsJapgolly.nodeRedEditorClient.anon.taddToGroupnodesArrayobje = {
    val __obj = js.Dynamic.literal(t = "addToGroup")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.taddToGroupnodesArrayobje]
  }
  
  inline def taddnodesArrayobjectundef(): typingsJapgolly.nodeRedEditorClient.anon.taddnodesArrayobjectundef = {
    val __obj = js.Dynamic.literal(t = "add")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.taddnodesArrayobjectundef]
  }
  
  inline def tcreateGroupgroupsArrayob(): typingsJapgolly.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob = {
    val __obj = js.Dynamic.literal(t = "createGroup")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob]
  }
  
  inline def tcreateSubflownodesArrayo(subflow: js.Object): typingsJapgolly.nodeRedEditorClient.anon.tcreateSubflownodesArrayo = {
    val __obj = js.Dynamic.literal(subflow = subflow.asInstanceOf[js.Any], t = "createSubflow")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tcreateSubflownodesArrayo]
  }
  
  inline def tdeleteSubflowsubflowobje(): typingsJapgolly.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje = {
    val __obj = js.Dynamic.literal(t = "deleteSubflow")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje]
  }
  
  inline def tdeleteworkspacesArrayobj(): typingsJapgolly.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj = {
    val __obj = js.Dynamic.literal(t = "delete")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj]
  }
  
  inline def teditnodeobjectchangesArr(changes: js.Array[js.Object], node: js.Object): typingsJapgolly.nodeRedEditorClient.anon.teditnodeobjectchangesArr = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], t = "edit")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.teditnodeobjectchangesArr]
  }
  
  inline def tmovenodesArrayobjectlink(nodes: js.Array[js.Object]): typingsJapgolly.nodeRedEditorClient.anon.tmovenodesArrayobjectlink = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], t = "move")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tmovenodesArrayobjectlink]
  }
  
  inline def tmultieventsArrayHistoryE(events: js.Array[HistoryEvent]): typingsJapgolly.nodeRedEditorClient.anon.tmultieventsArrayHistoryE = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], t = "multi")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tmultieventsArrayHistoryE]
  }
  
  inline def tremoveFromGroupnodesArra(): typingsJapgolly.nodeRedEditorClient.anon.tremoveFromGroupnodesArra = {
    val __obj = js.Dynamic.literal(t = "removeFromGroup")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tremoveFromGroupnodesArra]
  }
  
  inline def treorderorderobjectundefi(): typingsJapgolly.nodeRedEditorClient.anon.treorderorderobjectundefi = {
    val __obj = js.Dynamic.literal(t = "reorder")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.treorderorderobjectundefi]
  }
  
  inline def treplaceconfigobjectchang(changed: js.Object, config: js.Object, rev: String): typingsJapgolly.nodeRedEditorClient.anon.treplaceconfigobjectchang = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], t = "replace")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.treplaceconfigobjectchang]
  }
  
  inline def tungroupgroupsArrayobject(): typingsJapgolly.nodeRedEditorClient.anon.tungroupgroupsArrayobject = {
    val __obj = js.Dynamic.literal(t = "ungroup")
    __obj.asInstanceOf[typingsJapgolly.nodeRedEditorClient.anon.tungroupgroupsArrayobject]
  }
}
