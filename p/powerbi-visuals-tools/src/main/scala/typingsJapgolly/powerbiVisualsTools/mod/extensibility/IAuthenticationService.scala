package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import typingsJapgolly.powerbiVisualsTools.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationService extends StObject {
  
  def getAADToken(): IPromise[String] = js.native
  def getAADToken(visualId: String): IPromise[String] = js.native
}
