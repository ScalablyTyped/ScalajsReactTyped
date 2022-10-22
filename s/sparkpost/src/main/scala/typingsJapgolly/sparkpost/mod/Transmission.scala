package typingsJapgolly.sparkpost.mod

import typingsJapgolly.sparkpost.anon.Emailrfc822
import typingsJapgolly.sparkpost.anon.Templateid
import typingsJapgolly.sparkpost.sparkpostStrings.Canceled
import typingsJapgolly.sparkpost.sparkpostStrings.Generating
import typingsJapgolly.sparkpost.sparkpostStrings.Success
import typingsJapgolly.sparkpost.sparkpostStrings.submitted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transmission extends StObject {
  
  /** Name of the campaign */
  var campaign_id: String
  
  /** Content that will be used to construct a message */
  var content: InlineContent | Templateid | Emailrfc822
  
  /** Description of the transmission */
  var description: String
  
  /** ID of the transmission */
  var id: String
  
  /** Transmission level metadata containing key/value pairs */
  var metadata: Any
  
  /** Computed total number of failed messages */
  var num_failed_generation: Double
  
  /** Computed total number of messages generated */
  var num_generated: Double
  
  /** Number of recipients that failed input validation */
  var num_invalid_recipients: Double
  
  /** JSON object in which transmission options are defined */
  var options: TransmissionOptions
  
  var rcpt_list_chunk_size: Double
  
  var rcpt_list_total_chunks: Double
  
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled
  
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: Any
}
object Transmission {
  
  inline def apply(
    campaign_id: String,
    content: InlineContent | Templateid | Emailrfc822,
    description: String,
    id: String,
    metadata: Any,
    num_failed_generation: Double,
    num_generated: Double,
    num_invalid_recipients: Double,
    options: TransmissionOptions,
    rcpt_list_chunk_size: Double,
    rcpt_list_total_chunks: Double,
    state: submitted | Generating | Success | Canceled,
    substitution_data: Any
  ): Transmission = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], num_failed_generation = num_failed_generation.asInstanceOf[js.Any], num_generated = num_generated.asInstanceOf[js.Any], num_invalid_recipients = num_invalid_recipients.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rcpt_list_chunk_size = rcpt_list_chunk_size.asInstanceOf[js.Any], rcpt_list_total_chunks = rcpt_list_total_chunks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substitution_data = substitution_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transmission]
  }
  
  extension [Self <: Transmission](x: Self) {
    
    inline def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
    
    inline def setContent(value: InlineContent | Templateid | Emailrfc822): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNum_failed_generation(value: Double): Self = StObject.set(x, "num_failed_generation", value.asInstanceOf[js.Any])
    
    inline def setNum_generated(value: Double): Self = StObject.set(x, "num_generated", value.asInstanceOf[js.Any])
    
    inline def setNum_invalid_recipients(value: Double): Self = StObject.set(x, "num_invalid_recipients", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TransmissionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRcpt_list_chunk_size(value: Double): Self = StObject.set(x, "rcpt_list_chunk_size", value.asInstanceOf[js.Any])
    
    inline def setRcpt_list_total_chunks(value: Double): Self = StObject.set(x, "rcpt_list_total_chunks", value.asInstanceOf[js.Any])
    
    inline def setState(value: submitted | Generating | Success | Canceled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubstitution_data(value: Any): Self = StObject.set(x, "substitution_data", value.asInstanceOf[js.Any])
  }
}
