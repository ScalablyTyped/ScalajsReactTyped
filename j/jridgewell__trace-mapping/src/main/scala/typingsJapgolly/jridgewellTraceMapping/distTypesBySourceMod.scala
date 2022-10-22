package typingsJapgolly.jridgewellTraceMapping

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.jridgewellTraceMapping.distTypesBinarySearchMod.MemoState
import typingsJapgolly.jridgewellTraceMapping.distTypesSourcemapSegmentMod.ReverseSegment
import typingsJapgolly.jridgewellTraceMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBySourceMod {
  
  @JSImport("@jridgewell/trace-mapping/dist/types/by-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(decoded: js.Array[js.Array[SourceMapSegment]], memos: js.Array[MemoState]): js.Array[Source] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(decoded.asInstanceOf[js.Any], memos.asInstanceOf[js.Any])).asInstanceOf[js.Array[Source]]
  
  trait Source
    extends StObject
       with /* line */ NumberDictionary[js.Array[Exclude[ReverseSegment, js.Array[Double]]]] {
    
    var __proto__ : Null
  }
  object Source {
    
    inline def apply(__proto__ : Null): Source = {
      val __obj = js.Dynamic.literal(__proto__ = __proto__.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def set__proto__(value: Null): Self = StObject.set(x, "__proto__", value.asInstanceOf[js.Any])
    }
  }
}
