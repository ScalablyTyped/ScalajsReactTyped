package typingsJapgolly.wordpressCustomizeBrowser

import typingsJapgolly.wordpressCustomizeBrowser.anon.PartialSettingOptions
import typingsJapgolly.wordpressCustomizeBrowser.controlMod.Control
import typingsJapgolly.wordpressCustomizeBrowser.previewerMod.Previewer
import typingsJapgolly.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingMod {
  
  @JSImport("@wordpress/customize-browser/Setting", "Setting")
  @js.native
  open class Setting[T] protected () extends Value[T] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var defaults: SettingOptions = js.native
    
    def findControls(): js.Array[Control] = js.native
    
    def initialize(id: String, value: Any): Unit = js.native
    def initialize(id: String, value: Any, options: PartialSettingOptions): Unit = js.native
    def initialize(id: String, value: Unit, options: PartialSettingOptions): Unit = js.native
    def initialize(id: Unit, value: Any): Unit = js.native
    def initialize(id: Unit, value: Any, options: PartialSettingOptions): Unit = js.native
    def initialize(id: Unit, value: Unit, options: PartialSettingOptions): Unit = js.native
    
    def preview(): Unit = js.native
  }
  
  trait SettingOptions extends StObject {
    
    var dirty: Boolean
    
    var previewer: Previewer[String]
    
    var transport: String
  }
  object SettingOptions {
    
    inline def apply(dirty: Boolean, previewer: Previewer[String], transport: String): SettingOptions = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], previewer = previewer.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingOptions]
    }
    
    extension [Self <: SettingOptions](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setPreviewer(value: Previewer[String]): Self = StObject.set(x, "previewer", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
