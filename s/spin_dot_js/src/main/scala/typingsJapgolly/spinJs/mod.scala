package typingsJapgolly.spinJs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.spinJs.spinnerOptionsMod.SpinnerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spin.js", "Spinner")
  @js.native
  open class Spinner () extends StObject {
    def this(opts: SpinnerOptions) = this()
    
    /* private */ var animateId: Any = js.native
    
    /**
      * The Spinner's HTML element - can be used to manually insert the spinner into the DOM
      */
    var el: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var opts: Any = js.native
    
    /**
      * Adds the spinner to the given target element. If this instance is already
      * spinning, it is automatically removed from its previous target by calling
      * stop() internally.
      */
    def spin(): this.type = js.native
    def spin(target: HTMLElement): this.type = js.native
    
    /**
      * Stops and removes the Spinner.
      * Stopped spinners may be reused by calling spin() again.
      */
    def stop(): this.type = js.native
  }
}
