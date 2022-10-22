package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLogLevelsMod {
  
  @js.native
  sealed trait Levels extends StObject
  @JSImport("sip.js/lib/core/log/levels", "Levels")
  @js.native
  object Levels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with Levels
    /* 3 */ val debug: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with Levels
    /* 0 */ val error: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.error & Double = js.native
    
    @js.native
    sealed trait log
      extends StObject
         with Levels
    /* 2 */ val log: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.log & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with Levels
    /* 1 */ val warn: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.warn & Double = js.native
  }
}
