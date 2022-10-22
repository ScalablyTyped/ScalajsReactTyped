package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobScheduling extends StObject {
  
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as
    * thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow
    * template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note:
    * Currently, this restartable job option is not supported in Dataproc workflow template
    * (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
    */
  var maxFailuresTotal: js.UndefOr[Double] = js.undefined
}
object JobScheduling {
  
  inline def apply(): JobScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScheduling]
  }
  
  extension [Self <: JobScheduling](x: Self) {
    
    inline def setMaxFailuresPerHour(value: Double): Self = StObject.set(x, "maxFailuresPerHour", value.asInstanceOf[js.Any])
    
    inline def setMaxFailuresPerHourUndefined: Self = StObject.set(x, "maxFailuresPerHour", js.undefined)
    
    inline def setMaxFailuresTotal(value: Double): Self = StObject.set(x, "maxFailuresTotal", value.asInstanceOf[js.Any])
    
    inline def setMaxFailuresTotalUndefined: Self = StObject.set(x, "maxFailuresTotal", js.undefined)
  }
}
