package typingsJapgolly.framesync

import typingsJapgolly.framesync.libTypesMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateRenderStepMod {
  
  @JSImport("framesync/lib/create-render-step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRenderStep(runNextFrame: js.Function0[Unit]): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderStep")(runNextFrame.asInstanceOf[js.Any]).asInstanceOf[Step]
}
