package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRawelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typingsJapgolly.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/rawelement", JSImport.Default)
  @js.native
  open class default () extends RawElement
  
  @js.native
  trait RawElement
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default {
    
    var render: js.UndefOr[
        js.ThisFunction2[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
      ] = js.native
  }
}
