package typingsJapgolly.egjsHammerjs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.hammerjs.AttrRecognizer
import typingsJapgolly.hammerjs.HammerManager
import typingsJapgolly.hammerjs.HammerOptions
import typingsJapgolly.hammerjs.HammerStatic
import typingsJapgolly.hammerjs.RecognizerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", JSImport.Default)
    @js.native
    open class ^ protected ()
      extends StObject
         with HammerManager {
      def this(element: HTMLElement) = this()
      def this(element: SVGElement) = this()
      def this(element: HTMLElement, options: HammerOptions) = this()
      def this(element: SVGElement, options: HammerOptions) = this()
    }
    
    @JSImport("@egjs/hammerjs", JSImport.Default)
    @js.native
    val ^ : js.Object & HammerStatic = js.native
    
    // DIRECTION_HORIZONTAL | DIRECTION_VERTICAL
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Manager")
    @js.native
    open class Manager protected ()
      extends StObject
         with HammerManager {
      def this(element: EventTarget) = this()
      def this(element: EventTarget, options: HammerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Pan")
    @js.native
    open class Pan ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Pinch")
    @js.native
    open class Pinch ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Press")
    @js.native
    open class Press ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Recognizer")
    @js.native
    open class Recognizer ()
      extends StObject
         with typingsJapgolly.hammerjs.Recognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Rotate")
    @js.native
    open class Rotate ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Swipe")
    @js.native
    open class Swipe ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@egjs/hammerjs", "default.Tap")
    @js.native
    open class Tap ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    type _To = js.Object & HammerStatic
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: js.Object & HammerStatic = ^
  }
}
