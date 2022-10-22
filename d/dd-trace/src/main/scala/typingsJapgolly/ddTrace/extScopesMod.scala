package typingsJapgolly.ddTrace

import typingsJapgolly.ddTrace.ddTraceStrings.async_hooks
import typingsJapgolly.ddTrace.ddTraceStrings.async_local_storage
import typingsJapgolly.ddTrace.ddTraceStrings.async_resource
import typingsJapgolly.ddTrace.ddTraceStrings.noop
import typingsJapgolly.ddTrace.ddTraceStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extScopesMod {
  
  @JSImport("dd-trace/ext/scopes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_HOOKS")
  @js.native
  def ASYNC_HOOKS: async_hooks = js.native
  inline def ASYNC_HOOKS_=(x: async_hooks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_HOOKS")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_LOCAL_STORAGE")
  @js.native
  def ASYNC_LOCAL_STORAGE: async_local_storage = js.native
  inline def ASYNC_LOCAL_STORAGE_=(x: async_local_storage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_LOCAL_STORAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "ASYNC_RESOURCE")
  @js.native
  def ASYNC_RESOURCE: async_resource = js.native
  inline def ASYNC_RESOURCE_=(x: async_resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASYNC_RESOURCE")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "NOOP")
  @js.native
  def NOOP: noop = js.native
  inline def NOOP_=(x: noop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/scopes", "SYNC")
  @js.native
  def SYNC: sync = js.native
  inline def SYNC_=(x: sync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNC")(x.asInstanceOf[js.Any])
}
