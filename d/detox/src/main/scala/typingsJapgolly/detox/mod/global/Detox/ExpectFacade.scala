package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpectFacade extends StObject {
  
  def apply(element: NativeElement): Expect[js.Promise[Unit]] = js.native
  def apply(webElement: WebElement): WebExpect[js.Promise[Unit]] = js.native
}
