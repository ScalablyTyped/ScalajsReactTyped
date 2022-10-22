package typingsJapgolly.googleOneTap

import org.scalajs.dom.HTMLElement
import typingsJapgolly.googleOneTap.mod.GsiButtonConfiguration
import typingsJapgolly.googleOneTap.mod.IdConfiguration
import typingsJapgolly.googleOneTap.mod.PromptMomentNotification
import typingsJapgolly.googleOneTap.mod.RevocationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
    
    def disableAutoSelect(): Unit = js.native
    
    def initialize(idConfiguration: IdConfiguration): Unit = js.native
    
    def prompt(): Unit = js.native
    def prompt(momentListener: js.Function1[/* promptMomentNotification */ PromptMomentNotification, Unit]): Unit = js.native
    
    def renderButton(parent: HTMLElement, options: GsiButtonConfiguration): Unit = js.native
    def renderButton(parent: HTMLElement, options: GsiButtonConfiguration, clickHandler: js.Function0[Unit]): Unit = js.native
    
    def revoke(hint: String): Unit = js.native
    def revoke(hint: String, callback: js.Function1[/* response */ RevocationResponse, Unit]): Unit = js.native
    
    def storeCredential(): Unit = js.native
    def storeCredential(credential: String): Unit = js.native
    def storeCredential(credential: String, callback: js.Function0[Unit]): Unit = js.native
    def storeCredential(credential: Unit, callback: js.Function0[Unit]): Unit = js.native
  }
}
