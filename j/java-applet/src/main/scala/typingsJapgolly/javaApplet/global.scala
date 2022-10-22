package typingsJapgolly.javaApplet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * @summary Java applet Status. More details: {@link http://docs.oracle.com/javase/8/docs/technotes/guides/deploy/applet_dev_guide.html#JSDPG719|Applet Status And Event Handlers}
    */
  @JSGlobal("JavaAppletStatus")
  @js.native
  object JavaAppletStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.javaApplet.JavaAppletStatus & Double] = js.native
    
    /* 3 */ val Error: typingsJapgolly.javaApplet.JavaAppletStatus.Error & Double = js.native
    
    /* 1 */ val Loading: typingsJapgolly.javaApplet.JavaAppletStatus.Loading & Double = js.native
    
    /* 2 */ val Ready: typingsJapgolly.javaApplet.JavaAppletStatus.Ready & Double = js.native
  }
}
