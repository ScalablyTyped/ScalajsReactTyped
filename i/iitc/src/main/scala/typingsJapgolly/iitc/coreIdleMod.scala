package typingsJapgolly.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreIdleMod {
  
  object global {
    
    @JSGlobal("IDLE_POLL_TIME")
    @js.native
    def IDLE_POLL_TIME: Double = js.native
    inline def IDLE_POLL_TIME_=(x: Double): Unit = js.Dynamic.global.updateDynamic("IDLE_POLL_TIME")(x.asInstanceOf[js.Any])
    
    /**
      * add your function here if you want to be notified when the user
      * resumes from being idle
      */
    inline def addResumeFunction(fct: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("addResumeFunction")(fct.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def idlePoll(): Unit = js.Dynamic.global.applyDynamic("idlePoll")().asInstanceOf[Unit]
    
    inline def idleReset(): Unit = js.Dynamic.global.applyDynamic("idleReset")().asInstanceOf[Unit]
    
    inline def idleSet(): Unit = js.Dynamic.global.applyDynamic("idleSet")().asInstanceOf[Unit]
    
    @JSGlobal("idleTime")
    @js.native
    def idleTime: Double = js.native
    
    // in seconds
    /** default MAX_IDLE_TIME */
    @JSGlobal("_idleTimeLimit")
    @js.native
    def idleTimeLimit: Double = js.native
    
    inline def idleTimeLimit_=(x: Double): Unit = js.Dynamic.global.updateDynamic("_idleTimeLimit")(x.asInstanceOf[js.Any])
    
    inline def idleTime_=(x: Double): Unit = js.Dynamic.global.updateDynamic("idleTime")(x.asInstanceOf[js.Any])
    
    inline def setupIdle(): Unit = js.Dynamic.global.applyDynamic("setupIdle")().asInstanceOf[Unit]
  }
}
