package typingsJapgolly.lineNavigator

import org.scalajs.dom.File
import typingsJapgolly.lineNavigator.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LineNavigator {
    
    @JSGlobal("LineNavigator")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.lineNavigator.mod.^ {
      def this(file: String) = this()
      /**
        * Creates an instance of LineNavigator.
        * @param file HTML5 File for client side or a string with file path for server side.
        * @param [options]
        */
      def this(file: File) = this()
      def this(file: String, options: Options) = this()
      def this(file: File, options: Options) = this()
    }
  }
}
