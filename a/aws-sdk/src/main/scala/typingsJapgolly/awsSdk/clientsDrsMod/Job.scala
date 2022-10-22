package typingsJapgolly.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    * The ARN of a Job.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The date and time of when the Job was created.
    */
  var creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The date and time of when the Job ended.
    */
  var endDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * A string representing who initiated the Job.
    */
  var initiatedBy: js.UndefOr[InitiatedBy] = js.undefined
  
  /**
    * The ID of the Job.
    */
  var jobID: JobID
  
  /**
    * A list of servers that the Job is acting upon.
    */
  var participatingServers: js.UndefOr[ParticipatingServers] = js.undefined
  
  /**
    * The status of the Job.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * A list of tags associated with the Job.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of the Job.
    */
  var `type`: js.UndefOr[JobType] = js.undefined
}
object Job {
  
  inline def apply(jobID: JobID): Job = {
    val __obj = js.Dynamic.literal(jobID = jobID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEndDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setInitiatedBy(value: InitiatedBy): Self = StObject.set(x, "initiatedBy", value.asInstanceOf[js.Any])
    
    inline def setInitiatedByUndefined: Self = StObject.set(x, "initiatedBy", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setParticipatingServers(value: ParticipatingServers): Self = StObject.set(x, "participatingServers", value.asInstanceOf[js.Any])
    
    inline def setParticipatingServersUndefined: Self = StObject.set(x, "participatingServers", js.undefined)
    
    inline def setParticipatingServersVarargs(value: ParticipatingServer*): Self = StObject.set(x, "participatingServers", js.Array(value*))
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: JobType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
