package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.escape_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalConstantsMod {
  
  object CLOSE_SOURCE {
    
    @JSImport("baseui/modal/constants", "CLOSE_SOURCE.backdrop")
    @js.native
    val backdrop: typingsJapgolly.baseui.baseuiStrings.backdrop = js.native
    
    @JSImport("baseui/modal/constants", "CLOSE_SOURCE.closeButton")
    @js.native
    val closeButton: typingsJapgolly.baseui.baseuiStrings.closeButton = js.native
    
    @JSImport("baseui/modal/constants", "CLOSE_SOURCE.escape")
    @js.native
    val escape: escape_ = js.native
  }
  
  object ROLE {
    
    @JSImport("baseui/modal/constants", "ROLE.alertdialog")
    @js.native
    val alertdialog: typingsJapgolly.baseui.baseuiStrings.alertdialog = js.native
    
    @JSImport("baseui/modal/constants", "ROLE.dialog")
    @js.native
    val dialog: typingsJapgolly.baseui.baseuiStrings.dialog = js.native
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/modal/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/modal/constants", "SIZE.auto")
    @js.native
    val auto: typingsJapgolly.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/modal/constants", "SIZE.full")
    @js.native
    val full: typingsJapgolly.baseui.baseuiStrings.full = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE_WIDTHS {
    
    @JSImport("baseui/modal/constants", "SIZE_WIDTHS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/modal/constants", "SIZE_WIDTHS.default")
    @js.native
    def default: String = js.native
    
    @JSImport("baseui/modal/constants", "SIZE_WIDTHS.auto")
    @js.native
    def auto: String = js.native
    inline def auto_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/modal/constants", "SIZE_WIDTHS.full")
    @js.native
    def full: String = js.native
    inline def full_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
  }
}
