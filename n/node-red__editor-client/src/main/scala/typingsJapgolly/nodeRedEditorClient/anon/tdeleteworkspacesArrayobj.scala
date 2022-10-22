package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.mod.HistoryEvent
import typingsJapgolly.nodeRedEditorClient.nodeRedEditorClientStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'delete',   workspaces :std.Array<object> | undefined,   subflows :std.Array<object> | undefined,   subflowInputs :std.Array<object> | undefined,   subflowOutputs :std.Array<object> | undefined,   subflow :object | undefined,   groups :std.Array<object> | undefined,   nodes :std.Array<object> | undefined,   links :std.Array<object> | undefined,   createdLinks :std.Array<object> | undefined,   changes :std.Array<object> | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tdeleteworkspacesArrayobj
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var changes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflow: js.UndefOr[js.Object] = js.undefined
  
  var subflowInputs: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflowOutputs: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: delete
  
  var workspaces: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object tdeleteworkspacesArrayobj {
  
  inline def apply(): tdeleteworkspacesArrayobj = {
    val __obj = js.Dynamic.literal(t = "delete")
    __obj.asInstanceOf[tdeleteworkspacesArrayobj]
  }
  
  extension [Self <: tdeleteworkspacesArrayobj](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* ev */ HistoryEvent) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setChanges(value: js.Array[js.Object]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: js.Object*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    inline def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    inline def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value*))
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    inline def setSubflowInputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowInputs", value.asInstanceOf[js.Any])
    
    inline def setSubflowInputsUndefined: Self = StObject.set(x, "subflowInputs", js.undefined)
    
    inline def setSubflowInputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowInputs", js.Array(value*))
    
    inline def setSubflowOutputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowOutputs", value.asInstanceOf[js.Any])
    
    inline def setSubflowOutputsUndefined: Self = StObject.set(x, "subflowOutputs", js.undefined)
    
    inline def setSubflowOutputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowOutputs", js.Array(value*))
    
    inline def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    inline def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    inline def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    inline def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value*))
    
    inline def setT(value: delete): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setWorkspaces(value: js.Array[js.Object]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesVarargs(value: js.Object*): Self = StObject.set(x, "workspaces", js.Array(value*))
  }
}
