package typingsJapgolly.nodelibFsWalk

import typingsJapgolly.nodelibFsWalk.outProvidersAsyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersMod {
  
  @JSImport("@nodelib/fs.walk/out/providers", "AsyncProvider")
  @js.native
  open class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "StreamProvider")
  @js.native
  open class StreamProvider protected ()
    extends typingsJapgolly.nodelibFsWalk.outProvidersStreamMod.default {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "SyncProvider")
  @js.native
  open class SyncProvider protected ()
    extends typingsJapgolly.nodelibFsWalk.outProvidersSyncMod.default {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
  }
}
