package typingsJapgolly.draftJs.mod.Draft.Model

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Entity {
  
  /**
    * A "document entity" is an object containing metadata associated with a
    * piece of text in a ContentBlock.
    *
    * For example, a `link` entity might include a `uri` property. When a
    * ContentBlock is rendered in the browser, text that refers to that link
    * entity may be rendered as an anchor, with the `uri` as the href value.
    *
    * In a ContentBlock, every position in the text may correspond to zero
    * or one entities. This correspondence is tracked using a key string,
    * generated via DraftEntity.create() and used to obtain entity metadata
    * via DraftEntity.get().
    */
  trait DraftEntity extends StObject
  
  /**
    * An instance of a document entity, consisting of a `type` and relevant
    * `data`, metadata about the entity.
    *
    * For instance, a "link" entity might provide a URI, and a "mention"
    * entity might provide the mentioned user's ID. These pieces of data
    * may be used when rendering the entity as part of a ContentBlock DOM
    * representation. For a link, the data would be used as an href for
    * the rendered anchor. For a mention, the ID could be used to retrieve
    * a hovercard.
    */
  trait DraftEntityInstance extends StObject {
    
    def getData(): Any
    
    def getMutability(): DraftEntityMutability
    
    def getType(): DraftEntityType
  }
  object DraftEntityInstance {
    
    inline def apply(
      getData: CallbackTo[Any],
      getMutability: CallbackTo[DraftEntityMutability],
      getType: CallbackTo[DraftEntityType]
    ): DraftEntityInstance = {
      val __obj = js.Dynamic.literal(getData = getData.toJsFn, getMutability = getMutability.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[DraftEntityInstance]
    }
    
    extension [Self <: DraftEntityInstance](x: Self) {
      
      inline def setGetData(value: CallbackTo[Any]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setGetMutability(value: CallbackTo[DraftEntityMutability]): Self = StObject.set(x, "getMutability", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[DraftEntityType]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
}
