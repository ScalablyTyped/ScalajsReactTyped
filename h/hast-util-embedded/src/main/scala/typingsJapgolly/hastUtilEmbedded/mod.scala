package typingsJapgolly.hastUtilEmbedded

import typingsJapgolly.hast.mod.Element
import typingsJapgolly.hast.mod.ElementContent
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.`object`
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.audio
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.canvas
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.embed
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.iframe
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.img
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.math
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.picture
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.svg
import typingsJapgolly.hastUtilEmbedded.hastUtilEmbeddedStrings.video
import typingsJapgolly.hastUtilIsElement.mod.AssertPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-embedded", "embedded")
  @js.native
  val embedded: AssertEmbedded = js.native
  
  type AssertEmbedded = AssertPredicate[Embedded_]
  
  trait Embedded_
    extends StObject
       with Element {
    
    @JSName("tagName")
    var tagName_Embedded_ : audio | canvas | embed | iframe | img | math | `object` | picture | svg | video
  }
  object Embedded_ {
    
    inline def apply(
      children: js.Array[ElementContent],
      tagName: audio | canvas | embed | iframe | img | math | `object` | picture | svg | video
    ): Embedded_ = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Embedded_]
    }
    
    extension [Self <: Embedded_](x: Self) {
      
      inline def setTagName(value: audio | canvas | embed | iframe | img | math | `object` | picture | svg | video): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
