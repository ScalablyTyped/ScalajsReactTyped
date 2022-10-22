package typingsJapgolly.winrtUwp.global.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the step in the progress for an HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpProgressStage")
@js.native
object HttpProgressStage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage & Double] = js.native
  
  /* 3 */ val connectingToServer: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.connectingToServer & Double = js.native
  
  /* 1 */ val detectingProxy: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.detectingProxy & Double = js.native
  
  /* 4 */ val negotiatingSsl: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.negotiatingSsl & Double = js.native
  
  /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.none & Double = js.native
  
  /* 9 */ val receivingContent: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.receivingContent & Double = js.native
  
  /* 8 */ val receivingHeaders: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.receivingHeaders & Double = js.native
  
  /* 2 */ val resolvingName: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.resolvingName & Double = js.native
  
  /* 6 */ val sendingContent: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.sendingContent & Double = js.native
  
  /* 5 */ val sendingHeaders: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.sendingHeaders & Double = js.native
  
  /* 7 */ val waitingForResponse: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgressStage.waitingForResponse & Double = js.native
}
