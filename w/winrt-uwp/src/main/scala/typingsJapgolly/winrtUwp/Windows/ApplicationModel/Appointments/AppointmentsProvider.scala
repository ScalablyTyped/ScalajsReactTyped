package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
object AppointmentsProvider {
  
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  trait AddAppointmentOperation extends StObject {
    
    /** Gets the Appointment info from the activation request. */
    var appointmentInformation: Appointment
    
    /** Dismisses the UI for the operation that adds a new appointment. */
    def dismissUI(): Unit
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /**
      * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
      */
    def reportCompleted(itemId: String): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object AddAppointmentOperation {
    
    inline def apply(
      appointmentInformation: Appointment,
      dismissUI: Callback,
      reportCanceled: Callback,
      reportCompleted: String => Callback,
      reportError: String => Callback,
      sourcePackageFamilyName: String
    ): AddAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = dismissUI.toJsFn, reportCanceled = reportCanceled.toJsFn, reportCompleted = js.Any.fromFunction1((t0: String) => reportCompleted(t0).runNow()), reportError = js.Any.fromFunction1((t0: String) => reportError(t0).runNow()), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddAppointmentOperation]
    }
    
    extension [Self <: AddAppointmentOperation](x: Self) {
      
      inline def setAppointmentInformation(value: Appointment): Self = StObject.set(x, "appointmentInformation", value.asInstanceOf[js.Any])
      
      inline def setDismissUI(value: Callback): Self = StObject.set(x, "dismissUI", value.toJsFn)
      
      inline def setReportCanceled(value: Callback): Self = StObject.set(x, "reportCanceled", value.toJsFn)
      
      inline def setReportCompleted(value: String => Callback): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReportError(value: String => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  trait AppointmentsProviderLaunchActionVerbs extends StObject
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  trait RemoveAppointmentOperation extends StObject {
    
    /** Gets the unique identifier of the appointment to remove. */
    var appointmentId: String
    
    /** Dismisses the UI for the operation that removes an appointment. */
    def dismissUI(): Unit
    
    /** Gets the start date and time of the appointment instance to remove. */
    var instanceStartDate: js.Date
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /** Informs the activating app that the operation was completed successfully. */
    def reportCompleted(): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object RemoveAppointmentOperation {
    
    inline def apply(
      appointmentId: String,
      dismissUI: Callback,
      instanceStartDate: js.Date,
      reportCanceled: Callback,
      reportCompleted: Callback,
      reportError: String => Callback,
      sourcePackageFamilyName: String
    ): RemoveAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], dismissUI = dismissUI.toJsFn, instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = reportCanceled.toJsFn, reportCompleted = reportCompleted.toJsFn, reportError = js.Any.fromFunction1((t0: String) => reportError(t0).runNow()), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAppointmentOperation]
    }
    
    extension [Self <: RemoveAppointmentOperation](x: Self) {
      
      inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
      
      inline def setDismissUI(value: Callback): Self = StObject.set(x, "dismissUI", value.toJsFn)
      
      inline def setInstanceStartDate(value: js.Date): Self = StObject.set(x, "instanceStartDate", value.asInstanceOf[js.Any])
      
      inline def setReportCanceled(value: Callback): Self = StObject.set(x, "reportCanceled", value.toJsFn)
      
      inline def setReportCompleted(value: Callback): Self = StObject.set(x, "reportCompleted", value.toJsFn)
      
      inline def setReportError(value: String => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  trait ReplaceAppointmentOperation extends StObject {
    
    /** Gets the unique identifier of the appointment to replace. */
    var appointmentId: String
    
    /** Gets the Appointment info from the activation request. */
    var appointmentInformation: Appointment
    
    /** Dismisses the UI for the operation that replaces an appointment. */
    def dismissUI(): Unit
    
    /** Gets the start date and time of the appointment instance to replace. */
    var instanceStartDate: js.Date
    
    /** Informs the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /**
      * Informs the activating app that the operation was completed successfully.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
      */
    def reportCompleted(itemId: String): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object ReplaceAppointmentOperation {
    
    inline def apply(
      appointmentId: String,
      appointmentInformation: Appointment,
      dismissUI: Callback,
      instanceStartDate: js.Date,
      reportCanceled: Callback,
      reportCompleted: String => Callback,
      reportError: String => Callback,
      sourcePackageFamilyName: String
    ): ReplaceAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = dismissUI.toJsFn, instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = reportCanceled.toJsFn, reportCompleted = js.Any.fromFunction1((t0: String) => reportCompleted(t0).runNow()), reportError = js.Any.fromFunction1((t0: String) => reportError(t0).runNow()), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceAppointmentOperation]
    }
    
    extension [Self <: ReplaceAppointmentOperation](x: Self) {
      
      inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
      
      inline def setAppointmentInformation(value: Appointment): Self = StObject.set(x, "appointmentInformation", value.asInstanceOf[js.Any])
      
      inline def setDismissUI(value: Callback): Self = StObject.set(x, "dismissUI", value.toJsFn)
      
      inline def setInstanceStartDate(value: js.Date): Self = StObject.set(x, "instanceStartDate", value.asInstanceOf[js.Any])
      
      inline def setReportCanceled(value: Callback): Self = StObject.set(x, "reportCanceled", value.toJsFn)
      
      inline def setReportCompleted(value: String => Callback): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReportError(value: String => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
}
