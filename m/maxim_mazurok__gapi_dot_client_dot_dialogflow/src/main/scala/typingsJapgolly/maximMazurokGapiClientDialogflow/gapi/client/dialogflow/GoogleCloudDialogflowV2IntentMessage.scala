package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessage extends StObject {
  
  /** The basic card response for Actions on Google. */
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCard] = js.undefined
  
  /** Browse carousel card for Actions on Google. */
  var browseCarouselCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard] = js.undefined
  
  /** The card response. */
  var card: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCard] = js.undefined
  
  /** The carousel card response for Actions on Google. */
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.undefined
  
  /** The image response. */
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /** The link out suggestion chip for Actions on Google. */
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.undefined
  
  /** The list card response for Actions on Google. */
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageListSelect] = js.undefined
  
  /** The media content card for Actions on Google. */
  var mediaContent: js.UndefOr[GoogleCloudDialogflowV2IntentMessageMediaContent] = js.undefined
  
  /** A custom platform-specific response. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Optional. The platform that this message is intended for. */
  var platform: js.UndefOr[String] = js.undefined
  
  /** The quick replies response. */
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.undefined
  
  /** The voice and text-only responses for Actions on Google. */
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.undefined
  
  /** The suggestion chips for Actions on Google. */
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSuggestions] = js.undefined
  
  /** Table card for Actions on Google. */
  var tableCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageTableCard] = js.undefined
  
  /** The text response. */
  var text: js.UndefOr[GoogleCloudDialogflowV2IntentMessageText] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessage {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessage]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessage](x: Self) {
    
    inline def setBasicCard(value: GoogleCloudDialogflowV2IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    inline def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    inline def setBrowseCarouselCard(value: GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
    
    inline def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
    
    inline def setCard(value: GoogleCloudDialogflowV2IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCarouselSelect(value: GoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    inline def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    inline def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLinkOutSuggestion(value: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    inline def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    inline def setListSelect(value: GoogleCloudDialogflowV2IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    inline def setMediaContent(value: GoogleCloudDialogflowV2IntentMessageMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
    
    inline def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setQuickReplies(value: GoogleCloudDialogflowV2IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    inline def setSimpleResponses(value: GoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSuggestions(value: GoogleCloudDialogflowV2IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setTableCard(value: GoogleCloudDialogflowV2IntentMessageTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    inline def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
    
    inline def setText(value: GoogleCloudDialogflowV2IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
