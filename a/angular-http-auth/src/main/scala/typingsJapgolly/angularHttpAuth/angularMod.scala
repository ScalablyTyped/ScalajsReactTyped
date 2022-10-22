package typingsJapgolly.angularHttpAuth

import typingsJapgolly.angular.mod.IRequestConfig
import typingsJapgolly.angular.mod.global.Function
import typingsJapgolly.angularHttpAuth.anon.Reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object httpAuth {
    
    @js.native
    trait IAuthService extends StObject {
      
      def loginCancelled(): Unit = js.native
      def loginCancelled(data: Any): Unit = js.native
      def loginCancelled(data: Any, reason: Any): Unit = js.native
      def loginCancelled(data: Unit, reason: Any): Unit = js.native
      
      def loginConfirmed(): Unit = js.native
      def loginConfirmed(data: Any): Unit = js.native
      def loginConfirmed(data: Any, configUpdater: Function): Unit = js.native
      def loginConfirmed(data: Unit, configUpdater: Function): Unit = js.native
    }
    
    @js.native
    trait IHttpBuffer extends StObject {
      
      def append(config: IRequestConfig, deferred: Reject): Unit = js.native
      
      def rejectAll(): Unit = js.native
      def rejectAll(reason: Any): Unit = js.native
      
      def retryAll(): Unit = js.native
      def retryAll(updater: Function): Unit = js.native
    }
  }
}
