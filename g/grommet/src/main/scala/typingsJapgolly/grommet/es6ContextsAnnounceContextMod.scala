package typingsJapgolly.grommet

import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ContextsAnnounceContextMod {
  
  @JSImport("grommet/es6/contexts/AnnounceContext", "AnnounceContext")
  @js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  
  type AnnounceMessage = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.off
    - typingsJapgolly.grommet.grommetStrings.polite
    - typingsJapgolly.grommet.grommetStrings.assertive
  */
  trait AnnounceMode extends StObject
  object AnnounceMode {
    
    inline def assertive: typingsJapgolly.grommet.grommetStrings.assertive = "assertive".asInstanceOf[typingsJapgolly.grommet.grommetStrings.assertive]
    
    inline def off: typingsJapgolly.grommet.grommetStrings.off = "off".asInstanceOf[typingsJapgolly.grommet.grommetStrings.off]
    
    inline def polite: typingsJapgolly.grommet.grommetStrings.polite = "polite".asInstanceOf[typingsJapgolly.grommet.grommetStrings.polite]
  }
  
  type AnnounceValue = js.Function3[/* message */ AnnounceMessage, /* mode */ AnnounceMode, /* timeout */ Timeout, Unit]
  
  type Timeout = Double
}
