package typingsJapgolly.vivus

import org.scalajs.dom.HTMLElement
import typingsJapgolly.vivus.mod.TimingFunction
import typingsJapgolly.vivus.mod.VivusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Vivus {
    
    /**
      * Take any SVG and make the animation
      * to give give the impression of live drawing
      */
    @JSGlobal("Vivus")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.vivus.mod.^ {
      /**
        * @param element Dom element of the SVG or id of it
        * @param options Options about the animation
        * @param callback Callback for the end of the animation
        */
      def this(element: String) = this()
      def this(element: HTMLElement) = this()
      def this(element: String, options: VivusOptions) = this()
      def this(element: HTMLElement, options: VivusOptions) = this()
      def this(
        element: String,
        options: Unit,
        callback: js.Function1[/* vivusInstance */ typingsJapgolly.vivus.mod.Vivus, Unit]
      ) = this()
      def this(
        element: String,
        options: VivusOptions,
        callback: js.Function1[/* vivusInstance */ typingsJapgolly.vivus.mod.Vivus, Unit]
      ) = this()
      def this(
        element: HTMLElement,
        options: Unit,
        callback: js.Function1[/* vivusInstance */ typingsJapgolly.vivus.mod.Vivus, Unit]
      ) = this()
      def this(
        element: HTMLElement,
        options: VivusOptions,
        callback: js.Function1[/* vivusInstance */ typingsJapgolly.vivus.mod.Vivus, Unit]
      ) = this()
    }
    
    @JSGlobal("Vivus")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Vivus.EASE")
    @js.native
    def EASE: TimingFunction = js.native
    inline def EASE_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Vivus.EASE_IN")
    @js.native
    def EASE_IN: TimingFunction = js.native
    inline def EASE_IN_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_IN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Vivus.EASE_OUT")
    @js.native
    def EASE_OUT: TimingFunction = js.native
    inline def EASE_OUT_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_OUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Vivus.EASE_OUT_BOUNCE")
    @js.native
    def EASE_OUT_BOUNCE: TimingFunction = js.native
    inline def EASE_OUT_BOUNCE_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_OUT_BOUNCE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Vivus.LINEAR")
    @js.native
    def LINEAR: TimingFunction = js.native
    inline def LINEAR_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  }
}
