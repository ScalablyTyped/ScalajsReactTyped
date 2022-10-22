package typingsJapgolly.firebaseAuth.distRnTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UiFunction extends StObject
@JSImport("@firebase/auth/dist/rn/test/integration/webdriver/util/functions", "UiFunction")
@js.native
object UiFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UiFunction & String] = js.native
  
  @js.native
  sealed trait LOAD
    extends StObject
       with UiFunction
  /* "ui.loadUiCode" */ val LOAD: typingsJapgolly.firebaseAuth.distRnTestIntegrationWebdriverUtilFunctionsMod.UiFunction.LOAD & String = js.native
  
  @js.native
  sealed trait START
    extends StObject
       with UiFunction
  /* "ui.startUi" */ val START: typingsJapgolly.firebaseAuth.distRnTestIntegrationWebdriverUtilFunctionsMod.UiFunction.START & String = js.native
}
