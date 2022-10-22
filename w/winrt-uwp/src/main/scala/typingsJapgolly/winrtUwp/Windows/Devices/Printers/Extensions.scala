package typingsJapgolly.winrtUwp.Windows.Devices.Printers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.printrequested
import typingsJapgolly.winrtUwp.winrtUwpStrings.saverequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes and interfaces that provide access to the Windows Runtime Components for print task configuration and print notifications. */
object Extensions {
  
  @js.native
  sealed trait Print3DWorkflowDetail extends StObject
  /** Specifies the types of errors that may be encountered by the Print3DWorkflow class. */
  @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowDetail")
  @js.native
  object Print3DWorkflowDetail extends StObject {
    
    /** An invalid printing material has been selected. */
    @js.native
    sealed trait invalidMaterialSelection
      extends StObject
         with Print3DWorkflowDetail
    
    /** The 3D model is not valid. */
    @js.native
    sealed trait invalidModel
      extends StObject
         with Print3DWorkflowDetail
    
    /** The print ticket is not valid. */
    @js.native
    sealed trait invalidPrintTicket
      extends StObject
         with Print3DWorkflowDetail
    
    /** The 3D model exceeds the print bed. */
    @js.native
    sealed trait modelExceedsPrintBed
      extends StObject
         with Print3DWorkflowDetail
    
    /** The 3D model does not have manifold edges. */
    @js.native
    sealed trait modelNotManifold
      extends StObject
         with Print3DWorkflowDetail
    
    /** No known error has been encountered. */
    @js.native
    sealed trait unknown
      extends StObject
         with Print3DWorkflowDetail
    
    /** The upload failed. */
    @js.native
    sealed trait uploadFailed
      extends StObject
         with Print3DWorkflowDetail
  }
  
  @js.native
  sealed trait Print3DWorkflowStatus extends StObject
  /** Specifies the status of the Print3DWorkflow class. */
  @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowStatus")
  @js.native
  object Print3DWorkflowStatus extends StObject {
    
    /** The printing experience has been abandoned. */
    @js.native
    sealed trait abandoned
      extends StObject
         with Print3DWorkflowStatus
    
    /** The printing experience has been canceled. */
    @js.native
    sealed trait canceled
      extends StObject
         with Print3DWorkflowStatus
    
    /** The print request failed. */
    @js.native
    sealed trait failed
      extends StObject
         with Print3DWorkflowStatus
    
    /** The object is undergoing slicing in preparation for printing. */
    @js.native
    sealed trait slicing
      extends StObject
         with Print3DWorkflowStatus
    
    /** The print request has been submitted. */
    @js.native
    sealed trait submitted
      extends StObject
         with Print3DWorkflowStatus
  }
  
  /** Represents a customized printing experience for a 3D printer. */
  @js.native
  trait Print3DWorkflow extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_printrequested(
      `type`: printrequested,
      listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
    ): Unit = js.native
    
    /** Gets the device identifier of the 3D printer. */
    var deviceID: String = js.native
    
    /**
      * Gets the model of the 3D object to be printed.
      * @return The model of the 3D object to be printed.
      */
    def getPrintModelPackage(): Any = js.native
    
    /** Gets or sets a value that indicates the 3D object is ready for printing and no further user interaction is required. */
    var isPrintReady: Boolean = js.native
    
    /** Occurs when the user initiates printing. */
    def onprintrequested(ev: Print3DWorkflowPrintRequestedEventArgs & WinRTEvent[Print3DWorkflow]): Unit = js.native
    /** Occurs when the user initiates printing. */
    @JSName("onprintrequested")
    var onprintrequested_Original: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_printrequested(
      `type`: printrequested,
      listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Provides data about the print request to the app that initiated the request. */
  trait Print3DWorkflowPrintRequestedEventArgs extends StObject {
    
    /**
      * Sets the extended status of the print request.
      * @param value The extended status of the print request.
      */
    def setExtendedStatus(value: Print3DWorkflowDetail): Unit
    
    /**
      * Sets the latest model data, including any updates made by the Print3DWorkflow .
      * @param source The latest model data, including any updates made by the Print3DWorkflow .
      */
    def setSource(source: Any): Unit
    
    /**
      * Indicates if the data model has been updated by the Print3DWorkflow .
      * @param value Returns true if the data model has been updated; otherwise, false.
      */
    def setSourceChanged(value: Boolean): Unit
    
    /** Gets the status of the print request. */
    var status: Print3DWorkflowStatus
  }
  object Print3DWorkflowPrintRequestedEventArgs {
    
    inline def apply(
      setExtendedStatus: Print3DWorkflowDetail => Callback,
      setSource: Any => Callback,
      setSourceChanged: Boolean => Callback,
      status: Print3DWorkflowStatus
    ): Print3DWorkflowPrintRequestedEventArgs = {
      val __obj = js.Dynamic.literal(setExtendedStatus = js.Any.fromFunction1((t0: Print3DWorkflowDetail) => setExtendedStatus(t0).runNow()), setSource = js.Any.fromFunction1((t0: Any) => setSource(t0).runNow()), setSourceChanged = js.Any.fromFunction1((t0: Boolean) => setSourceChanged(t0).runNow()), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Print3DWorkflowPrintRequestedEventArgs]
    }
    
    extension [Self <: Print3DWorkflowPrintRequestedEventArgs](x: Self) {
      
      inline def setSetExtendedStatus(value: Print3DWorkflowDetail => Callback): Self = StObject.set(x, "setExtendedStatus", js.Any.fromFunction1((t0: Print3DWorkflowDetail) => value(t0).runNow()))
      
      inline def setSetSource(value: Any => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetSourceChanged(value: Boolean => Callback): Self = StObject.set(x, "setSourceChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setStatus(value: Print3DWorkflowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides the context for the printer extension object. */
  trait PrintExtensionContext extends StObject
  
  /** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
  trait PrintNotificationEventDetails extends StObject {
    
    /** Gets or sets the event data for a print notification event. */
    var eventData: String
    
    /** Gets the name of the print device associated with the print notification. */
    var printerName: String
  }
  object PrintNotificationEventDetails {
    
    inline def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
      val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintNotificationEventDetails]
    }
    
    extension [Self <: PrintNotificationEventDetails](x: Self) {
      
      inline def setEventData(value: String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
  @js.native
  trait PrintTaskConfiguration extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_saverequested(
      `type`: saverequested,
      listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
    ): Unit = js.native
    
    /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
    def onsaverequested(ev: PrintTaskConfigurationSaveRequestedEventArgs & WinRTEvent[PrintTaskConfiguration]): Unit = js.native
    /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
    @JSName("onsaverequested")
    var onsaverequested_Original: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs] = js.native
    
    /** Gets the context for the print task extension. */
    var printerExtensionContext: Any = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_saverequested(
      `type`: saverequested,
      listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Called when the print dialog for your app raises a SaveRequested event. */
  trait PrintTaskConfigurationSaveRequest extends StObject {
    
    /** Called by the device app to cancel the client's request to save the print task configuration. */
    def cancel(): Unit
    
    /** Gets the date-time object that provides the deadline information for the print task. */
    var deadline: js.Date
    
    /**
      * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
      * @return The object that represents the deferral for the print task configuration save request.
      */
    def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
    
    /**
      * Called by the device app to save the print task configuration.
      * @param printerExtensionContext The object that represents the print task extension context.
      */
    def save(printerExtensionContext: Any): Unit
  }
  object PrintTaskConfigurationSaveRequest {
    
    inline def apply(
      cancel: Callback,
      deadline: js.Date,
      getDeferral: CallbackTo[PrintTaskConfigurationSaveRequestedDeferral],
      save: Any => Callback
    ): PrintTaskConfigurationSaveRequest = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, save = js.Any.fromFunction1((t0: Any) => save(t0).runNow()))
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
    }
    
    extension [Self <: PrintTaskConfigurationSaveRequest](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setGetDeferral(value: CallbackTo[PrintTaskConfigurationSaveRequestedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
      
      inline def setSave(value: Any => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  /** Called by the device app to provide an update of the status of the deferral. */
  trait PrintTaskConfigurationSaveRequestedDeferral extends StObject {
    
    /** Called by the device app when the deferral is completed. */
    def complete(): Unit
  }
  object PrintTaskConfigurationSaveRequestedDeferral {
    
    inline def apply(complete: Callback): PrintTaskConfigurationSaveRequestedDeferral = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn)
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
    }
    
    extension [Self <: PrintTaskConfigurationSaveRequestedDeferral](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    }
  }
  
  /** Called to notify the device app that the print task configuration must be saved. */
  trait PrintTaskConfigurationSaveRequestedEventArgs extends StObject {
    
    /** Gets the information that is required for updating the print task configuration. */
    var request: PrintTaskConfigurationSaveRequest
  }
  object PrintTaskConfigurationSaveRequestedEventArgs {
    
    inline def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
    }
    
    extension [Self <: PrintTaskConfigurationSaveRequestedEventArgs](x: Self) {
      
      inline def setRequest(value: PrintTaskConfigurationSaveRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
