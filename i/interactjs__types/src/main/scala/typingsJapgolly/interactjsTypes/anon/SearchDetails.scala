package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDetails extends StObject {
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
  
  var searchDetails: typingsJapgolly.interactjsTypes.coreInteractionFinderMod.SearchDetails
}
object SearchDetails {
  
  inline def apply(
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName],
    searchDetails: typingsJapgolly.interactjsTypes.coreInteractionFinderMod.SearchDetails
  ): SearchDetails = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], searchDetails = searchDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDetails]
  }
  
  extension [Self <: SearchDetails](x: Self) {
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setSearchDetails(value: typingsJapgolly.interactjsTypes.coreInteractionFinderMod.SearchDetails): Self = StObject.set(x, "searchDetails", value.asInstanceOf[js.Any])
  }
}
