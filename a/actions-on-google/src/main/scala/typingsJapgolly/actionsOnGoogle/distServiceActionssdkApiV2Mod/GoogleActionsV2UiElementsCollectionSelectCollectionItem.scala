package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsCollectionSelectCollectionItem extends StObject {
  
  /**
    * Body text of the card.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * See google.actions.v2.OptionInfo
    * for details.
    * Required.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.undefined
  
  /**
    * Title of the collection item. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of collection items.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsCollectionSelectCollectionItem {
  
  inline def apply(): GoogleActionsV2UiElementsCollectionSelectCollectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCollectionSelectCollectionItem]
  }
  
  extension [Self <: GoogleActionsV2UiElementsCollectionSelectCollectionItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOptionInfo(value: GoogleActionsV2OptionInfo): Self = StObject.set(x, "optionInfo", value.asInstanceOf[js.Any])
    
    inline def setOptionInfoUndefined: Self = StObject.set(x, "optionInfo", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
