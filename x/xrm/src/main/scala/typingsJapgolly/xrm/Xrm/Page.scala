package typingsJapgolly.xrm.Xrm

import typingsJapgolly.xrm.Xrm.Controls.ProcessControl
import typingsJapgolly.xrm.Xrm.Controls.QuickFormControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Page context
  * @deprecated Use {@link Xrm.Events.EventContext.getFormContext formContext} instead.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}a
  */
@js.native
trait Page
  extends StObject
     with FormContext {
  
  /**
    * Provides methods to retrieve information specific to an organization, a user, or parameters passed to a page.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var context: GlobalContext = js.native
}
/**
  * Xrm.Page namespace has been deprecated
  * @deprecated Use {@link Xrm.Events.EventContext.getFormContext formContext} instead.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
  */
object Page {
  
  /**
    * @deprecated Use {@link Xrm.Controls.AddControlNotificationOptions} instead.
    */
  type AddControlNotificationOptions = typingsJapgolly.xrm.Xrm.Controls.AddControlNotificationOptions
  
  /**
    * Interface for an Entity attribute.
    * @deprecated Use {@link Xrm.Attributes.Attribute} instead.
    */
  type Attribute = typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any]
  
  /**
    * Attribute formats for Xrm.Page.Attribute.getFormat().
    * @deprecated Use {@link Xrm.Attributes.AttributeFormat} instead.
    */
  type AttributeFormat = typingsJapgolly.xrm.Xrm.Attributes.AttributeFormat
  
  /**
    * Attribute types for Xrm.ui.ProcessMonitor Xrm.Page.Attribute.setDisplayState().
    * @deprecated Use {@link Xrm.Attributes.AttributeType} instead.
    */
  type AttributeType = typingsJapgolly.xrm.Xrm.Attributes.AttributeType
  
  /**
    * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
    * @deprecated Use {@link Xrm.Controls.AutoCompleteCommand} instead.
    */
  type AutoCompleteCommand = typingsJapgolly.xrm.Xrm.Controls.AutoCompleteCommand
  
  /**
    * Interface for Result value of AutoCompleteResultSet
    * @deprecated Use {@link Xrm.Controls.AutoCompleteResult} instead.
    */
  type AutoCompleteResult = typingsJapgolly.xrm.Xrm.Controls.AutoCompleteResult
  
  /**
    * Interface for showAutoComplete argument
    * @deprecated Use {@link Xrm.Controls.AutoCompleteResultSet} instead.
    */
  type AutoCompleteResultSet = typingsJapgolly.xrm.Xrm.Controls.AutoCompleteResultSet
  
  /**
    * Interface for Auto Lookup Control.
    * This is not an Entity Lookup, but a control that supports AutoComplete / KeyPress Events (Text or Number)
    * @remarks This interface is not supported for CRM mobile clients (phones or tablets) and the interactive service hub.  It is only available for Updated entities.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.AutoLookupControl} instead.
    */
  type AutoLookupControl = typingsJapgolly.xrm.Xrm.Controls.AutoLookupControl
  
  /**
    * Interface for a Boolean attribute.
    * @see {@link EnumAttribute}
    * @deprecated Use {@link Xrm.Attributes.BooleanAttribute} instead.
    */
  type BooleanAttribute = typingsJapgolly.xrm.Xrm.Attributes.BooleanAttribute
  
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    * @deprecated Use {@link Xrm.Events.ContextSensitiveHandler} instead.
    */
  type ContextSensitiveHandler = typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
  
  /**
    * Interface for Xrm.Page.ui controls.
    * @see {@link UiElement}
    * @deprecated Use {@link Xrm.Controls.Control} instead.
    */
  type Control = typingsJapgolly.xrm.Xrm.Controls.Control
  
  /**
    * Interface to define the actions on a control notification
    * @deprecated Use {@link Xrm.Controls.ControlNotificationAction} instead.
    */
  type ControlNotificationAction = typingsJapgolly.xrm.Xrm.Controls.ControlNotificationAction
  
  /**
    * Control type for Xrm.Page.ui.QuickForm.getControlType().
    * @deprecated Use {@link Xrm.Controls.ControlQuickFormType} instead.
    *
    */
  type ControlQuickFormType = typingsJapgolly.xrm.Xrm.Controls.ControlQuickFormType
  
  /**
    * Control types for Xrm.Page.Control.getControlType().
    * @deprecated Use {@link Xrm.Controls.ControlType} instead.
    */
  type ControlType = typingsJapgolly.xrm.Xrm.Controls.ControlType
  
  /**
    * Interface for a Date attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.DateAttribute} instead.
    */
  type DateAttribute = typingsJapgolly.xrm.Xrm.Attributes.DateAttribute
  
  /**
    * Date attribute formats for Xrm.Page.Attribute.getFormat(), used by DateAttribute.
    * @deprecated Use {@link Xrm.Attributes.DateAttributeFormat} instead.
    */
  type DateAttributeFormat = typingsJapgolly.xrm.Xrm.Attributes.DateAttributeFormat
  
  /**
    * Interface for a Date control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.DateControl} instead.
    */
  type DateControl = StandardControl
  
  /**
    * Interface for the form's record context, Xrm.Page.data.entity
    * @deprecated Use {@link Xrm.Entity} instead.
    */
  type Entity = typingsJapgolly.xrm.Xrm.Entity
  
  /**
    * Common interface for enumeration attributes (OptionSet and Boolean).
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.EnumAttribute} instead.
    */
  type EnumAttribute = typingsJapgolly.xrm.Xrm.Attributes.EnumAttribute[Double | Boolean]
  
  /**
    * Interface for the event context.
    * @deprecated Use {@link Xrm.Events.EventContext} instead.
    */
  type EventContext = typingsJapgolly.xrm.Xrm.Events.EventContext
  
  /**
    * Interface for an entity's form selector item.
    * @deprecated Use {@link Xrm.Controls.FormItem} instead.
    */
  type FormItem = typingsJapgolly.xrm.Xrm.Controls.FormItem
  
  /**
    * Interface for the form selector API.
    * @deprecated Use {@link Xrm.Controls.FormSelector} instead.
    */
  type FormSelector = typingsJapgolly.xrm.Xrm.Controls.FormSelector
  
  /**
    * Interface for a framed control, which is either a Web Resource or an Iframe.
    * @see {@link Control}
    * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
    *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
    * @deprecated  Use {@link Xrm.Controls.FramedControl} instead.
    */
  type FramedControl = typingsJapgolly.xrm.Xrm.Controls.FramedControl
  
  /**
    * Interface for a CRM grid control.
    *
    * @see {@link Control}
    * @deprecated  Use {@link Xrm.Controls.GridControl} instead.
    */
  type GridControl = typingsJapgolly.xrm.Xrm.Controls.GridControl
  
  /**
    * Interface for an Iframe control.
    * @see {@link FramedControl}
    * @deprecated  Use {@link Xrm.Controls.IframeControl} instead.
    */
  type IframeControl = typingsJapgolly.xrm.Xrm.Controls.IframeControl
  
  /**
    * Integer attribute formats for Xrm.Page.Attribute.getFormat(), used by NumberAttribute.
    * @deprecated Use {@link Xrm.Attributes.IntegerAttributeFormat} instead.
    */
  type IntegerAttributeFormat = typingsJapgolly.xrm.Xrm.Attributes.IntegerAttributeFormat
  
  /**
    * Interface a Lookup attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.LookupAttribute} instead.
    */
  type LookupAttribute = typingsJapgolly.xrm.Xrm.Attributes.LookupAttribute
  
  /**
    * Interface for a Lookup control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.LookupControl} instead.
    */
  type LookupControl = typingsJapgolly.xrm.Xrm.Controls.LookupControl
  
  /**
    * Interface for a Lookup value.
    * @deprecated Use {@link Xrm.LookupValue} instead.
    */
  type LookupValue = typingsJapgolly.xrm.Xrm.LookupValue
  
  /**
    * Interface for Xrm.Page.ui.navigation.
    * @deprecated Use {@link Xrm.Controls.Navigation} instead.
    */
  type Navigation = typingsJapgolly.xrm.Xrm.Controls.Navigation
  
  /**
    * Interface for a navigation item.
    * @see {@link UiElement}
    * @see {@link UiFocusable}
    * @deprecated Use {@link Xrm.Controls.NavigationItem} instead.
    */
  type NavigationItem = typingsJapgolly.xrm.Xrm.Controls.NavigationItem
  
  /**
    * Constants to use with the addNotification method of form controls
    * @deprecated Use {@link Xrm.Controls.NotificationLevel} instead.
    */
  type NotificationLevel = typingsJapgolly.xrm.Xrm.Controls.NotificationLevel
  
  /**
    * Interface for a Number attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.NumberAttribute} instead.
    */
  type NumberAttribute = typingsJapgolly.xrm.Xrm.Attributes.NumberAttribute
  
  /**
    * Interface for a Number control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.NumberControl} instead.
    */
  type NumberControl = AutoLookupControl
  
  /**
    * Interface an OptionSet attribute.
    * @see {@link EnumAttribute}
    * @deprecated Use {@link Xrm.Attributes.OptionSetAttribute} instead.
    */
  type OptionSetAttribute = typingsJapgolly.xrm.Xrm.Attributes.OptionSetAttribute[Double]
  
  /**
    * OptionSet attribute formats for Xrm.Page.Attribute.getFormat(), used by OptionSetAttribute.
    * @deprecated Use {@link Xrm.Attributes.OptiopnSetAttributeFormat} instead.
    */
  type OptionSetAttributeFormat = typingsJapgolly.xrm.Xrm.Attributes.OptionSetAttributeFormat
  
  /**
    * Interface for an OptionSet control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.OptionSetControl} instead.
    */
  type OptionSetControl = typingsJapgolly.xrm.Xrm.Controls.OptionSetControl
  
  /**
    * Interface for an OptionSet value.
    * @deprecated Use {@link Xrm.OptionSetValue} instead.
    */
  type OptionSetValue = typingsJapgolly.xrm.Xrm.OptionSetValue
  
  /**
    * Interface for a privilege.
    * @deprecated Use {@link Xrm.Privilege} instead.
    */
  type Privilege = typingsJapgolly.xrm.Xrm.Privilege
  
  /**
    * Interface for a CRM Business Process Flow instance.
    * @deprecated Use {@link Xrm.ProcessFlow.Process} instead.
    */
  type Process = typingsJapgolly.xrm.Xrm.ProcessFlow.Process
  
  /**
    * Status for Xrm.Page.Process.getStatus().
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessStatus} instead
    */
  type ProcessStatus = typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessStatus
  
  /**
    * Type for a process status change handler.
    * @param status The process status.
    * @deprecated Use {@link Xrm.Events.ProcessStatusChangeHandler} instead.
    */
  type ProcessStatusChangeHandler = typingsJapgolly.xrm.Xrm.Events.ProcessStatusChangeHandler
  
  /**
    * Requirement Level for Xrm.Page.Attribute.getRequiredLevel() and Xrm.Page.Attribute.setRequiredLevel().
    * @deprecated Use {@link Xrm.Attributes.RequirementLevel} instead.
    */
  type RequirementLevel = typingsJapgolly.xrm.Xrm.Attributes.RequirementLevel
  
  /**
    * Interface for save event arguments.
    * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
    */
  type SaveEventArguments = typingsJapgolly.xrm.Xrm.Events.SaveEventContext
  
  /**
    * Interface for a save event context
    * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
    */
  type SaveEventContext = typingsJapgolly.xrm.Xrm.Events.SaveEventContext
  
  /**
    * Save Modes for Xrm.Page.Entity.save().
    * @deprecated Use {@link Xrm.EntitySaveMode} instead.
    */
  type SaveMode = EntitySaveMode
  
  /**
    * Interface for a form section.
    * @see {@link UiElement}
    * @deprecated Use {@link Xrm.Controls.Section} instead.
    */
  type Section = typingsJapgolly.xrm.Xrm.Controls.Section
  
  /**
    * Interface for a Silverlight control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.SilverlightControl} instead.
    */
  type SilverlightControl = typingsJapgolly.xrm.Xrm.Controls.SilverlightControl
  
  /**
    * Interface for CRM Business Process Flow stages.
    * @deprecated Use {@link Xrm.ProcessFlow.Stage} instead.
    */
  type Stage = typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
  
  /**
    * Direction types for a process stage change event
    * @deprecated Use {@link Xrm.ProcessFlow.StageChangeDirection} instead.
    */
  type StageChangeDirection = typingsJapgolly.xrm.Xrm.ProcessFlow.StageChangeDirection
  
  /**
    * Interface for process stage change event arguments.
    * @deprecated Use {@link Xrm.Events.StageChangeEventArguments} instead.
    */
  type StageChangeEventArguments = typingsJapgolly.xrm.Xrm.Events.StageChangeEventArguments
  
  /**
    * Interface for a process stage change event context
    * @deprecated Use {@link Xrm.Events.StageChangeEventContext} instead.
    */
  type StageChangeEventContext = typingsJapgolly.xrm.Xrm.Events.StageChangeEventContext
  
  /**
    * Interface for process stage selected event arguments.
    * @deprecated Use {@link Xrm.Events.StageSelectedEventArguments} instead.
    */
  type StageSelectedEventArguments = typingsJapgolly.xrm.Xrm.Events.StageSelectedEventArguments
  
  /**
    * Interface for a process stage select event context
    * @deprecated  Use {@link Xrm.Events.StageSelectedEventContext} instead.
    */
  type StageSelectedEventContext = typingsJapgolly.xrm.Xrm.Events.StageSelectedEventContext
  
  /**
    * Status for Xrm.Page.Stage.getStatus().
    * @deprecated Use {@link Xrm.ProcessFlow.StageStatus} instead.
    */
  type StageStatus = typingsJapgolly.xrm.Xrm.ProcessFlow.StageStatus
  
  /**
    * Interface for a standard control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.StandardControl} instead.
    */
  type StandardControl = typingsJapgolly.xrm.Xrm.Controls.StandardControl
  
  /**
    * Interface for CRM Business Process Flow steps.
    * @deprecated Use {@link Xrm.ProcessFlow.Step} instead.
    */
  type Step = typingsJapgolly.xrm.Xrm.ProcessFlow.Step
  
  /**
    * Interface for a String attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.StringAttribute} instead.
    */
  type StringAttribute = typingsJapgolly.xrm.Xrm.Attributes.StringAttribute
  
  /**
    * String attribute formats for Xrm.Page.Attribute.getFormat(), used by StringAttribute.
    * @deprecated Use {@link Xrm.Attributes.StringAttributeFormat} instead.
    */
  type StringAttributeFormat = typingsJapgolly.xrm.Xrm.Attributes.StringAttributeFormat
  
  /**
    * Interface for a String control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.StringControl} instead.
    */
  type StringControl = typingsJapgolly.xrm.Xrm.Controls.StringControl
  
  /**
    * Submit Mode for Xrm.Page.Attribute.getSubmitMode() and Xrm.Page.Attribute.setSubmitMode().
    * @deprecated Use {@link Xrm.SubmitMode} instead.
    */
  type SubmitMode = typingsJapgolly.xrm.Xrm.SubmitMode
  
  /**
    * Interface for a form tab.
    * @see {@link UiElement}
    * @see {@link UiFocusable}
    * @deprecated Use {@link Xrm.Controls.Tab} instead.
    */
  type Tab = typingsJapgolly.xrm.Xrm.Controls.Tab
  
  /**
    * Interface for a Timeline control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.TimelineWall} instead.
    */
  type TimelineWall = typingsJapgolly.xrm.Xrm.Controls.TimelineWall
  
  /**
    * Interface for UI elements which can have the visibility value read.
    * @deprecated Use {@link Xrm.Controls.UiCanGetVisibleElement} instead.
    */
  type UiCanGetVisibleElement = typingsJapgolly.xrm.Xrm.Controls.UiCanGetVisibleElement
  
  /**
    * Interface for UI elements which can have the visibility value updated.
    * @deprecated Use {@link Xrm.Controls.UiCanSetVisibleElement} instead.
    */
  type UiCanSetVisibleElement = typingsJapgolly.xrm.Xrm.Controls.UiCanSetVisibleElement
  
  /**
    * Interface for focusable UI elements.
    * @deprecated Use {@link Xrm.Controls.UiFocusable} instead.
    */
  type UiFocusable = typingsJapgolly.xrm.Xrm.Controls.UiFocusable
  
  /**
    * Interface for controls which methods provide immediate feedback or take actions as user types in a control.
    * Contains methods which can be used to perform data validations in a control even before the user commits (saves) the value in a form.
    * @deprecated Use {@link Xrm.Controls.UiKeyPressable} instead.
    */
  type UiKeyPressable = typingsJapgolly.xrm.Xrm.Controls.UiKeyPressable
  
  /**
    * Interface for UI elements with labels.
    * @deprecated Use {@link Xrm.Controls.UiLabelElement} instead.
    */
  type UiLabelElement = typingsJapgolly.xrm.Xrm.Controls.UiLabelElement
  
  /**
    * Base interface for standard UI elements.
    * @deprecated Use {@link Xrm.Controls.UiStandardElement} instead.
    */
  type UiStandardElement = typingsJapgolly.xrm.Xrm.Controls.UiStandardElement
  
  /**
    * Module for the Xrm.Page.data API.
    * @deprecated Use {@link Xrm.Form.data formContext.data} has been deprecated.
    */
  object data {
    
    /**
      * Called when method to get active processes is complete
      * @param status The result of the get active processes operation.
      * @remarks **Returns object with the following key-value pairs**:
      * * CreatedOn
      * * ProcessDefinitionID
      * * ProcessDefinitionName
      * * ProcessInstanceID
      * * ProcessInstanceName
      * * StatusCodeName
      * @deprecated Use {@link Xrm.ProcessFlow.GetProcessInstancesDelegate} instead.
      */
    type GetProcessInstancesDelegate = typingsJapgolly.xrm.Xrm.ProcessFlow.GetProcessInstancesDelegate
    
    /**
      * Called when process change methods have completed.
      * @param status The result of the process change operation.
      * @remarks **Values returned are**:
      * * success        (The operation succeeded.)
      * * crossEntity    (The previous stage is for a different entity.)
      * * beginning      (The active stage is the first stage of the active path.)
      * * invalid        (The operation failed because the selected stage isn’t the same as the active stage.)
      * * unreachable    (The stage exists on a different path.)
      * @deprecated Use {@link Xrm.ProcessFlow.ProcessCallbackDelegate} instead.
      */
    type ProcessCallbackDelegate = typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessCallbackDelegate
    
    /**
      * Represents a key-value pair, where the key is the Process Flow's ID, and the value is the name thereof.
      * @deprecated Use {@link Xrm.ProcessFlow.ProcessDictionary} instead.
      */
    type ProcessDictionary = typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessDictionary
    
    /**
      * Interface for the Xrm.Page.data.process API.
      * @deprecated Use {@link Xrm.ProcessFlow.ProcessManager} instead.
      */
    type ProcessManager = typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessManager
    
    /**
      * Called when process set status method has completed.
      * @param status The new status of the process instance
      * @remarks **Values returned are**:
      * * active
      * * aborted
      * * finished
      * @deprecated Use {@link Xrm.ProcessFlow.ProcessSetStatusDelegate} instead.
      */
    type ProcessSetStatusDelegate = typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessSetStatusDelegate
    
    /**
      * Called when method to set active process is complete
      * @param status The result of the set active process operation.
      * @remarks **Values returned are**:
      * * success        (The operation succeeded.)
      * * invalid        (The processInstanceId isn’t valid or the process isn’t enabled.)
      * @deprecated Use {@link Xrm.ProcessFlow.SetProcessInstanceDelegate} instead.
      */
    type SetProcessInstanceDelegate = typingsJapgolly.xrm.Xrm.ProcessFlow.SetProcessInstanceDelegate
  }
  
  /**
    * Contains properties and methods to retrieve information about the user interface as well as collections for several subcomponents of the form.
    * @deprecated Use {@link Xrm.Form.ui formContext.ui} instead.
    */
  object ui {
    
    /**
      * Display States for Xrm.ui.ProcessMonitor.setDisplayState().
      * @deprecated Use {@link Xrm.DisplayState} instead.
      */
    type DisplayState = typingsJapgolly.xrm.Xrm.DisplayState
    
    /**
      * Form Notification Levels for Xrm.Ui.setFormNotification().
      * @deprecated Use {@link Xrm.FormNotificationLevel} instead.
      */
    type FormNotificationLevel = typingsJapgolly.xrm.Xrm.FormNotificationLevel
    
    /**
      * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
      * GridControl.getGrid method.
      * @deprecated Use {@link Xrm.Controls.Grid} instead.
      */
    type Grid = typingsJapgolly.xrm.Xrm.Controls.Grid
    
    /**
      * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
      * GridEntity is returned by the GridRowData.getEntity method.
      * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.v
      */
    type GridEntity = typingsJapgolly.xrm.Xrm.Controls.Grid.GridEntity
    
    /**
      * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
      * returned by Grid.getRows and Grid.getSelectedRows methods.
      * In V9 - this is essentailly a form context.
      * @deprecated Use {@link Xrm.Controls.Grid.GridRow} instead.
      */
    type GridRow = typingsJapgolly.xrm.Xrm.Controls.Grid.GridRow
    
    /**
      * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
      * returned by the GridRow.getData method.
      * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.
      */
    type GridRowData = typingsJapgolly.xrm.Xrm.Controls.Grid.GridRowData
    
    /**
      * Interface for Xrm.Page.ui.process API
      * @deprecated Use {@link Xrm.Controls.ProcessControl} instead.
      */
    type ProcessManager = ProcessControl
    
    /**
      * Interface for a quick view control instance on a form.
      * @see {@link https://msdn.microsoft.com/en-us/library/mt736908.aspx External Link: Xrm.Page.ui quickForms (client-side reference)}
      * @deprecated Use {@link Xrm.Controls.ViewSelectorItem} instead.
      */
    type QuickForm = QuickFormControl
    
    /**
      * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
      * of the grid control.
      * @deprecated Use {@link Xrm.Controls.ViewSelector} instead.
      */
    type ViewSelector = typingsJapgolly.xrm.Xrm.Controls.ViewSelector
    
    /**
      * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
      * the ViewSelector.setCurrentView method.
      * @deprecated Use {@link Xrm.Controls.ViewSelectorItem} instead.
      */
    type ViewSelectorItem = typingsJapgolly.xrm.Xrm.Controls.ViewSelectorItem
  }
}
