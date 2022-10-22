package typingsJapgolly.puppeteerCore

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonEventEmitterMod.EventEmitter
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetAvailable
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetChanged
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetDiscovered
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetGone
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonTargetManagerMod {
  
  type TargetFactory = js.Function2[/* targetInfo */ TargetInfo, /* session */ js.UndefOr[CDPSession], Target]
  
  type TargetInterceptor = js.Function2[/* createdTarget */ Target, /* parentTarget */ Target | Null, js.Promise[Unit]]
  
  @js.native
  trait TargetManager extends EventEmitter {
    
    def addTargetInterceptor(session: CDPSession, interceptor: TargetInterceptor): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getAvailableTargets(): Map[String, Target] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def removeTargetInterceptor(session: CDPSession, interceptor: TargetInterceptor): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetDiscovered
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetAvailable
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetGone
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetChanged
  */
  trait TargetManagerEmittedEvents extends StObject
  object TargetManagerEmittedEvents {
    
    inline def TargetAvailable: targetAvailable = "targetAvailable".asInstanceOf[targetAvailable]
    
    inline def TargetChanged: targetChanged = "targetChanged".asInstanceOf[targetChanged]
    
    inline def TargetDiscovered: targetDiscovered = "targetDiscovered".asInstanceOf[targetDiscovered]
    
    inline def TargetGone: targetGone = "targetGone".asInstanceOf[targetGone]
  }
}
