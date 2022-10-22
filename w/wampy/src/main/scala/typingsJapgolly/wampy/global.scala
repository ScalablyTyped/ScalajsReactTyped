package typingsJapgolly.wampy

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.wampy.mod.Wampy
import typingsJapgolly.wampy.mod.WampyOptions
import typingsJapgolly.wampy.mod.WampyStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wampy extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wampy")
    @js.native
    open class ^ ()
      extends StObject
         with Wampy {
      def this(options: WampyOptions) = this()
      def this(url: String) = this()
      def this(url: String, options: WampyOptions) = this()
    }
    
    @JSGlobal("wampy")
    @js.native
    val ^ : js.Object & WampyStatic = js.native
    
    type _To = js.Object & WampyStatic
    
    /* This means you don't have to write `^`, but can instead just say `wampy.foo` */
    override def _to: js.Object & WampyStatic = ^
  }
}
