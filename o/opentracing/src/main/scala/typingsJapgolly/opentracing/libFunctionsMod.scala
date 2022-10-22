package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.libSpanContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionsMod {
  
  @JSImport("opentracing/lib/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def childOf(spanContext: default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("childOf")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  inline def childOf(spanContext: typingsJapgolly.opentracing.libSpanMod.default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("childOf")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  
  inline def followsFrom(spanContext: default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("followsFrom")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  inline def followsFrom(spanContext: typingsJapgolly.opentracing.libSpanMod.default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("followsFrom")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
}
