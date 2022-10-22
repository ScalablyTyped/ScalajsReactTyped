package typingsJapgolly.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConferenceData {
  
  /**
    * Enum that defines the types of errors that you can specify in a ConferenceError.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
  @js.native
  object ConferenceErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType & Double
      ] = js.native
    
    /* 0 */ val AUTHENTICATION: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.AUTHENTICATION & Double = js.native
    
    /* 1 */ val CONFERENCE_SOLUTION_FORBIDDEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.CONFERENCE_SOLUTION_FORBIDDEN & Double = js.native
    
    /* 2 */ val PERMANENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMANENT & Double = js.native
    
    /* 3 */ val PERMISSION_DENIED: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMISSION_DENIED & Double = js.native
    
    /* 4 */ val TEMPORARY: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.TEMPORARY & Double = js.native
    
    /* 5 */ val UNKNOWN: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.UNKNOWN & Double = js.native
  }
  
  /**
    * Enum that defines the features of the entry point that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
  @js.native
  object EntryPointFeature extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature & Double
      ] = js.native
    
    /* 1 */ val TOLL: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL & Double = js.native
    
    /* 2 */ val TOLL_FREE: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL_FREE & Double = js.native
    
    /* 0 */ val UNKNOWN_FEATURE: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.UNKNOWN_FEATURE & Double = js.native
  }
  
  /**
    * Enum that defines the types of entry points that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
  @js.native
  object EntryPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType & Double
      ] = js.native
    
    /* 2 */ val MORE: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.MORE & Double = js.native
    
    /* 1 */ val PHONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.PHONE & Double = js.native
    
    /* 3 */ val SIP: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.SIP & Double = js.native
    
    /* 0 */ val VIDEO: typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.VIDEO & Double = js.native
  }
}
