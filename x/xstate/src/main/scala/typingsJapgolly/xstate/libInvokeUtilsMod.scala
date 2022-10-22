package typingsJapgolly.xstate

import typingsJapgolly.xstate.anon.Src
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.InvokeConfig
import typingsJapgolly.xstate.libTypesMod.InvokeDefinition
import typingsJapgolly.xstate.libTypesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInvokeUtilsMod {
  
  @JSImport("xstate/lib/invokeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) & Src): InvokeDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeDefinition")(invokeConfig.asInstanceOf[js.Any]).asInstanceOf[InvokeDefinition[TContext, TEvent]]
  
  inline def toInvokeSource(src: String): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  inline def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
}
