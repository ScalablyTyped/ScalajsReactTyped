package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentationTimeTokenMod {
  
  @JSImport("babylonjs/Instrumentation/timeToken", "_TimeToken")
  @js.native
  open class TimeToken () extends StObject {
    
    var _endTimeQuery: Nullable[WebGLQuery] = js.native
    
    var _startTimeQuery: Nullable[WebGLQuery] = js.native
    
    var _timeElapsedQuery: Nullable[WebGLQuery] = js.native
    
    var _timeElapsedQueryEnded: Boolean = js.native
  }
}
