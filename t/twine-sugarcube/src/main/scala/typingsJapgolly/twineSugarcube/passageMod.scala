package typingsJapgolly.twineSugarcube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passageMod {
  
  trait Passage
    extends StObject
       with PassageBase {
    
    /**
      * Returns the description of the passage (created from either an excerpt of the passage or the
      * Config.passages.descriptions object).
      * @since 2.0.0
      */
    def description(): String
    
    /**
      * The DOM ID of the passage (created from the slugified passage title).
      * @since 2.0.0
      */
    var domId: String
    
    /**
      * Returns the text of the Passage object (similar to <Passage>.text) after applying nobr tag and image passage
      * processing to it.
      * @since 2.0.0
      */
    def processText(): String
  }
  object Passage {
    
    inline def apply(
      description: CallbackTo[String],
      domId: String,
      processText: CallbackTo[String],
      tags: Array[String],
      text: String,
      title: String
    ): Passage = {
      val __obj = js.Dynamic.literal(description = description.toJsFn, domId = domId.asInstanceOf[js.Any], processText = processText.toJsFn, tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passage]
    }
    
    extension [Self <: Passage](x: Self) {
      
      inline def setDescription(value: CallbackTo[String]): Self = StObject.set(x, "description", value.toJsFn)
      
      inline def setDomId(value: String): Self = StObject.set(x, "domId", value.asInstanceOf[js.Any])
      
      inline def setProcessText(value: CallbackTo[String]): Self = StObject.set(x, "processText", value.toJsFn)
    }
  }
  
  trait PassageBase extends StObject {
    
    /**
      * The tags of the passage.
      * @since 2.0.0
      */
    var tags: Array[String]
    
    /**
      * The raw text of the passage.
      * @since 2.0.0
      */
    var text: String
    
    /**
      * The title of the passage.
      * @since 2.0.0
      */
    var title: String
  }
  object PassageBase {
    
    inline def apply(tags: Array[String], text: String, title: String): PassageBase = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassageBase]
    }
    
    extension [Self <: PassageBase](x: Self) {
      
      inline def setTags(value: Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
