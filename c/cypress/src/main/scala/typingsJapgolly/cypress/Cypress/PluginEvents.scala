package typingsJapgolly.cypress.Cypress

import typingsJapgolly.cypress.CypressCommandLine.CypressFailedRunResult
import typingsJapgolly.cypress.CypressCommandLine.CypressRunResult
import typingsJapgolly.cypress.CypressCommandLine.RunResult
import typingsJapgolly.cypress.cypressStrings.`dev-serverColonstart`
import typingsJapgolly.cypress.cypressStrings.afterColonrun
import typingsJapgolly.cypress.cypressStrings.afterColonscreenshot
import typingsJapgolly.cypress.cypressStrings.afterColonspec
import typingsJapgolly.cypress.cypressStrings.beforeColonbrowserColonlaunch
import typingsJapgolly.cypress.cypressStrings.beforeColonrun
import typingsJapgolly.cypress.cypressStrings.beforeColonspec
import typingsJapgolly.cypress.cypressStrings.fileColonpreprocessor
import typingsJapgolly.cypress.cypressStrings.task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginEvents extends StObject {
  
  def apply(
    action: `dev-serverColonstart`,
    fn: js.Function1[/* file */ DevServerConfig, js.Promise[ResolvedDevServerConfig]]
  ): Unit = js.native
  def apply(
    action: afterColonrun,
    fn: js.Function1[/* results */ CypressRunResult | CypressFailedRunResult, Unit | js.Promise[Unit]]
  ): Unit = js.native
  def apply(
    action: afterColonscreenshot,
    fn: js.Function1[
      /* details */ ScreenshotDetails, 
      Unit | AfterScreenshotReturnObject | js.Promise[AfterScreenshotReturnObject]
    ]
  ): Unit = js.native
  def apply(
    action: afterColonspec,
    fn: js.Function2[/* spec */ Spec, /* results */ RunResult, Unit | js.Promise[Unit]]
  ): Unit = js.native
  def apply(
    action: beforeColonbrowserColonlaunch,
    fn: js.Function2[
      /* browser */ Browser, 
      /* browserLaunchOptions */ BrowserLaunchOptions, 
      Unit | BrowserLaunchOptions | js.Promise[BrowserLaunchOptions]
    ]
  ): Unit = js.native
  def apply(
    action: beforeColonrun,
    fn: js.Function1[/* runDetails */ BeforeRunDetails, Unit | js.Promise[Unit]]
  ): Unit = js.native
  def apply(action: beforeColonspec, fn: js.Function1[/* spec */ Spec, Unit | js.Promise[Unit]]): Unit = js.native
  def apply(
    action: fileColonpreprocessor,
    fn: js.Function1[/* file */ FileObject, String | js.Promise[String]]
  ): Unit = js.native
  def apply(action: task, tasks: Tasks): Unit = js.native
}
