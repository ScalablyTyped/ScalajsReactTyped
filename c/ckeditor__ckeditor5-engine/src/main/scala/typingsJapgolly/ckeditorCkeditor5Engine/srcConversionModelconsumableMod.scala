package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionModelconsumableMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/modelconsumable", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModelConsumable
  
  @js.native
  trait ModelConsumable extends StObject {
    
    def add(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default, `type`: String): Unit = js.native
    def add(item: Item, `type`: String): Unit = js.native
    def add(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, `type`: String): Unit = js.native
    def add(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default, `type`: String): Unit = js.native
    
    def consume(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default, `type`: String): Boolean = js.native
    def consume(item: Item, `type`: String): Boolean = js.native
    def consume(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, `type`: String): Boolean = js.native
    def consume(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default, `type`: String): Boolean = js.native
    
    def revert(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default, `type`: String): Null | Boolean = js.native
    def revert(item: Item, `type`: String): Null | Boolean = js.native
    def revert(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, `type`: String): Null | Boolean = js.native
    def revert(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default, `type`: String): Null | Boolean = js.native
    
    def test(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default, `type`: String): Null | Boolean = js.native
    def test(item: Item, `type`: String): Null | Boolean = js.native
    def test(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, `type`: String): Null | Boolean = js.native
    def test(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default, `type`: String): Null | Boolean = js.native
  }
}
