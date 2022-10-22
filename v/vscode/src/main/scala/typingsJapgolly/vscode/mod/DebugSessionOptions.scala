package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSessionOptions extends StObject {
  
  /**
    * Controls if the debug session's parent session is shown in the CALL STACK view even if it has only a single child.
    * By default, the debug session will never hide its parent.
    * If compact is true, debug sessions with a single child are hidden in the CALL STACK view to make the tree more compact.
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether this session should have a separate debug console or share it
    * with the parent session. Has no effect for sessions which do not have a parent session.
    * Defaults to Separate.
    */
  var consoleMode: js.UndefOr[DebugConsoleMode] = js.undefined
  
  /**
    * Controls whether lifecycle requests like 'restart' are sent to the newly created session or its parent session.
    * By default (if the property is false or missing), lifecycle requests are sent to the new session.
    * This property is ignored if the session has no parent session.
    */
  var lifecycleManagedByParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether this session should run without debugging, thus ignoring breakpoints.
    * When this property is not specified, the value from the parent session (if there is one) is used.
    */
  var noDebug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When specified the newly created debug session is registered as a "child" session of this
    * "parent" debug session.
    */
  var parentSession: js.UndefOr[DebugSession] = js.undefined
}
object DebugSessionOptions {
  
  inline def apply(): DebugSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSessionOptions]
  }
  
  extension [Self <: DebugSessionOptions](x: Self) {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConsoleMode(value: DebugConsoleMode): Self = StObject.set(x, "consoleMode", value.asInstanceOf[js.Any])
    
    inline def setConsoleModeUndefined: Self = StObject.set(x, "consoleMode", js.undefined)
    
    inline def setLifecycleManagedByParent(value: Boolean): Self = StObject.set(x, "lifecycleManagedByParent", value.asInstanceOf[js.Any])
    
    inline def setLifecycleManagedByParentUndefined: Self = StObject.set(x, "lifecycleManagedByParent", js.undefined)
    
    inline def setNoDebug(value: Boolean): Self = StObject.set(x, "noDebug", value.asInstanceOf[js.Any])
    
    inline def setNoDebugUndefined: Self = StObject.set(x, "noDebug", js.undefined)
    
    inline def setParentSession(value: DebugSession): Self = StObject.set(x, "parentSession", value.asInstanceOf[js.Any])
    
    inline def setParentSessionUndefined: Self = StObject.set(x, "parentSession", js.undefined)
  }
}
