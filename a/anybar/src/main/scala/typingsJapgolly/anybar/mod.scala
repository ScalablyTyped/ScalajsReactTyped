package typingsJapgolly.anybar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(status: AnybarStatus): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(status.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(status: AnybarStatus, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.anybar.anybarStrings.white
    - typingsJapgolly.anybar.anybarStrings.red
    - typingsJapgolly.anybar.anybarStrings.orange
    - typingsJapgolly.anybar.anybarStrings.yellow
    - typingsJapgolly.anybar.anybarStrings.green
    - typingsJapgolly.anybar.anybarStrings.cyan
    - typingsJapgolly.anybar.anybarStrings.blue
    - typingsJapgolly.anybar.anybarStrings.purple
    - typingsJapgolly.anybar.anybarStrings.black
    - typingsJapgolly.anybar.anybarStrings.question
    - typingsJapgolly.anybar.anybarStrings.exclamation
    - typingsJapgolly.anybar.anybarStrings.quit
    - typingsJapgolly.anybar.anybarStrings.filled
    - typingsJapgolly.anybar.anybarStrings.hollow
  */
  trait AnybarStatus extends StObject
  object AnybarStatus {
    
    inline def black: typingsJapgolly.anybar.anybarStrings.black = "black".asInstanceOf[typingsJapgolly.anybar.anybarStrings.black]
    
    inline def blue: typingsJapgolly.anybar.anybarStrings.blue = "blue".asInstanceOf[typingsJapgolly.anybar.anybarStrings.blue]
    
    inline def cyan: typingsJapgolly.anybar.anybarStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.anybar.anybarStrings.cyan]
    
    inline def exclamation: typingsJapgolly.anybar.anybarStrings.exclamation = "exclamation".asInstanceOf[typingsJapgolly.anybar.anybarStrings.exclamation]
    
    inline def filled: typingsJapgolly.anybar.anybarStrings.filled = "filled".asInstanceOf[typingsJapgolly.anybar.anybarStrings.filled]
    
    inline def green: typingsJapgolly.anybar.anybarStrings.green = "green".asInstanceOf[typingsJapgolly.anybar.anybarStrings.green]
    
    inline def hollow: typingsJapgolly.anybar.anybarStrings.hollow = "hollow".asInstanceOf[typingsJapgolly.anybar.anybarStrings.hollow]
    
    inline def orange: typingsJapgolly.anybar.anybarStrings.orange = "orange".asInstanceOf[typingsJapgolly.anybar.anybarStrings.orange]
    
    inline def purple: typingsJapgolly.anybar.anybarStrings.purple = "purple".asInstanceOf[typingsJapgolly.anybar.anybarStrings.purple]
    
    inline def question: typingsJapgolly.anybar.anybarStrings.question = "question".asInstanceOf[typingsJapgolly.anybar.anybarStrings.question]
    
    inline def quit: typingsJapgolly.anybar.anybarStrings.quit = "quit".asInstanceOf[typingsJapgolly.anybar.anybarStrings.quit]
    
    inline def red: typingsJapgolly.anybar.anybarStrings.red = "red".asInstanceOf[typingsJapgolly.anybar.anybarStrings.red]
    
    inline def white: typingsJapgolly.anybar.anybarStrings.white = "white".asInstanceOf[typingsJapgolly.anybar.anybarStrings.white]
    
    inline def yellow: typingsJapgolly.anybar.anybarStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.anybar.anybarStrings.yellow]
  }
  
  trait Options extends StObject {
    
    /**
    	The port to communicate with the AnyBar app.
    	@default 1738
    	*/
    val port: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
