package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLevelObjective extends StObject {
  
  /** A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported. */
  var calendarPeriod: js.UndefOr[String] = js.undefined
  
  /** Name used for UI elements listing this SLO. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999. */
  var goal: js.UndefOr[Double] = js.undefined
  
  /** Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME] */
  var name: js.UndefOr[String] = js.undefined
  
  /** A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days. */
  var rollingPeriod: js.UndefOr[String] = js.undefined
  
  /** The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality. */
  var serviceLevelIndicator: js.UndefOr[ServiceLevelIndicator] = js.undefined
  
  /**
    * Labels which have been used to annotate the service-level objective. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores,
    * and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have
    * a semantic value, the empty string may be supplied for the label value.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object ServiceLevelObjective {
  
  inline def apply(): ServiceLevelObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLevelObjective]
  }
  
  extension [Self <: ServiceLevelObjective](x: Self) {
    
    inline def setCalendarPeriod(value: String): Self = StObject.set(x, "calendarPeriod", value.asInstanceOf[js.Any])
    
    inline def setCalendarPeriodUndefined: Self = StObject.set(x, "calendarPeriod", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGoal(value: Double): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRollingPeriod(value: String): Self = StObject.set(x, "rollingPeriod", value.asInstanceOf[js.Any])
    
    inline def setRollingPeriodUndefined: Self = StObject.set(x, "rollingPeriod", js.undefined)
    
    inline def setServiceLevelIndicator(value: ServiceLevelIndicator): Self = StObject.set(x, "serviceLevelIndicator", value.asInstanceOf[js.Any])
    
    inline def setServiceLevelIndicatorUndefined: Self = StObject.set(x, "serviceLevelIndicator", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
