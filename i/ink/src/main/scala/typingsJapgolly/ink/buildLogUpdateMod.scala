package typingsJapgolly.ink

import typingsJapgolly.ink.anon.ShowCursor
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLogUpdateMod {
  
  object default {
    
    @JSImport("ink/build/log-update", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(stream: Writable): LogUpdate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stream.asInstanceOf[js.Any]).asInstanceOf[LogUpdate]
    inline def create(stream: Writable, hasShowCursor: ShowCursor): LogUpdate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(stream.asInstanceOf[js.Any], hasShowCursor.asInstanceOf[js.Any])).asInstanceOf[LogUpdate]
  }
  
  @js.native
  trait LogUpdate extends StObject {
    
    def apply(str: String): Unit = js.native
    
    def clear(): Unit = js.native
    
    def done(): Unit = js.native
  }
}
