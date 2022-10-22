package typingsJapgolly.yandexMaps.global.ymaps

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("ymaps.util.Storage")
  @js.native
  open class Storage ()
    extends typingsJapgolly.yandexMaps.mod.util.Storage
  
  object cursor {
    
    @JSGlobal("ymaps.util.cursor.Accessor")
    @js.native
    open class Accessor protected ()
      extends typingsJapgolly.yandexMaps.mod.util.cursor.Accessor {
      def this(key: String) = this()
    }
    
    @JSGlobal("ymaps.util.cursor.Manager")
    @js.native
    open class Manager protected ()
      extends typingsJapgolly.yandexMaps.mod.util.cursor.Manager {
      def this(element: HTMLElement) = this()
    }
  }
}
