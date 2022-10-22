package typingsJapgolly.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InterceptResolutionAction extends StObject
@JSImport("puppeteer-core", "InterceptResolutionAction")
@js.native
object InterceptResolutionAction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InterceptResolutionAction & String] = js.native
  
  @js.native
  sealed trait Abort
    extends StObject
       with InterceptResolutionAction
  /* "abort" */ val Abort: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.Abort & String = js.native
  
  @js.native
  sealed trait AlreadyHandled
    extends StObject
       with InterceptResolutionAction
  /* "already-handled" */ val AlreadyHandled: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.AlreadyHandled & String = js.native
  
  @js.native
  sealed trait Continue
    extends StObject
       with InterceptResolutionAction
  /* "continue" */ val Continue: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.Continue & String = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with InterceptResolutionAction
  /* "disabled" */ val Disabled: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.Disabled & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with InterceptResolutionAction
  /* "none" */ val None: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.None & String = js.native
  
  @js.native
  sealed trait Respond
    extends StObject
       with InterceptResolutionAction
  /* "respond" */ val Respond: typingsJapgolly.puppeteerCore.mod.InterceptResolutionAction.Respond & String = js.native
}
