package typingsJapgolly.next

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.anon.ParentId
import typingsJapgolly.next.distTraceSharedMod.SpanId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceMod {
  
  @JSImport("next/dist/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/trace", "Span")
  @js.native
  open class Span protected ()
    extends typingsJapgolly.next.distTraceTraceMod.Span {
    def this(hasNameParentIdAttrsStartTime: ParentId) = this()
  }
  
  @JSImport("next/dist/trace", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.next.distTraceTraceMod.SpanStatus & Double] = js.native
    
    /* 0 */ val Started: typingsJapgolly.next.distTraceTraceMod.SpanStatus.Started & Double = js.native
    
    /* 1 */ val Stopped: typingsJapgolly.next.distTraceTraceMod.SpanStatus.Stopped & Double = js.native
  }
  
  inline def flushAllTraces(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllTraces")().asInstanceOf[js.Promise[Unit]]
  
  inline def setGlobal(key: Any, `val`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trace(name: String): typingsJapgolly.next.distTraceTraceMod.Span = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: Unit, attrs: StringDictionary[String]): typingsJapgolly.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: SpanId): typingsJapgolly.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: SpanId, attrs: StringDictionary[String]): typingsJapgolly.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distTraceTraceMod.Span]
}
