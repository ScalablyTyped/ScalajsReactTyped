package typingsJapgolly.officeJs.global

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import typingsJapgolly.officeJs.OfficeExtension.EmbeddedSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
/////////////////////// End OneNote APIs ///////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////////// Begin Visio APIs ///////////////////////
////////////////////////////////////////////////////////////////
object Visio {
  
  @JSGlobal("Visio")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Represents the Application.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Application")
  @js.native
  open class Application ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the type of column values.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ColumnType")
  @js.native
  object ColumnType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.ColumnType & String] = js.native
    
    /* "Currency" */ val currency: typingsJapgolly.officeJs.Visio.ColumnType.currency & String = js.native
    
    /* "Date" */ val date: typingsJapgolly.officeJs.Visio.ColumnType.date & String = js.native
    
    /* "Number" */ val number: typingsJapgolly.officeJs.Visio.ColumnType.number & String = js.native
    
    /* "String" */ val string: typingsJapgolly.officeJs.Visio.ColumnType.string & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Visio.ColumnType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the Comment.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Comment")
  @js.native
  open class Comment ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Comment {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the CommentCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.CommentCollection")
  @js.native
  open class CommentCollection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.CommentCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Direction of connector in DataVisualizer diagram.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ConnectorDirection")
  @js.native
  object ConnectorDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.ConnectorDirection & String] = js.native
    
    /* "FromTarget" */ val fromTarget: typingsJapgolly.officeJs.Visio.ConnectorDirection.fromTarget & String = js.native
    
    /* "ToTarget" */ val toTarget: typingsJapgolly.officeJs.Visio.ConnectorDirection.toTarget & String = js.native
  }
  
  /**
    *
    * Represents the orientation of the Cross Functional Flowchart diagram.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.CrossFunctionalFlowchartOrientation")
  @js.native
  object CrossFunctionalFlowchartOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.CrossFunctionalFlowchartOrientation & String] = js.native
    
    /* "Horizontal" */ val horizontal: typingsJapgolly.officeJs.Visio.CrossFunctionalFlowchartOrientation.horizontal & String = js.native
    
    /* "Vertical" */ val vertical: typingsJapgolly.officeJs.Visio.CrossFunctionalFlowchartOrientation.vertical & String = js.native
  }
  
  /**
    *
    * Represents the type of source for the data connection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataSourceType")
  @js.native
  object DataSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.DataSourceType & String] = js.native
    
    /* "Excel" */ val excel: typingsJapgolly.officeJs.Visio.DataSourceType.excel & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Visio.DataSourceType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the types of data validation error.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataValidationErrorType")
  @js.native
  object DataValidationErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.DataValidationErrorType & String] = js.native
    
    /* "ColumnNotMapped" */ val columnNotMapped: typingsJapgolly.officeJs.Visio.DataValidationErrorType.columnNotMapped & String = js.native
    
    /* "ConnectorColumnAndConnectorLabelMappedElsewhere" */ val connectorColumnAndConnectorLabelMappedElsewhere: typingsJapgolly.officeJs.Visio.DataValidationErrorType.connectorColumnAndConnectorLabelMappedElsewhere & String = js.native
    
    /* "ConnectorColumnError" */ val connectorColumnError: typingsJapgolly.officeJs.Visio.DataValidationErrorType.connectorColumnError & String = js.native
    
    /* "ConnectorColumnMappedElsewhere" */ val connectorColumnMappedElsewhere: typingsJapgolly.officeJs.Visio.DataValidationErrorType.connectorColumnMappedElsewhere & String = js.native
    
    /* "ConnectorLabelColumnMappedElsewhere" */ val connectorLabelColumnMappedElsewhere: typingsJapgolly.officeJs.Visio.DataValidationErrorType.connectorLabelColumnMappedElsewhere & String = js.native
    
    /* "DelimiterError" */ val delimiterError: typingsJapgolly.officeJs.Visio.DataValidationErrorType.delimiterError & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJs.Visio.DataValidationErrorType.none & String = js.native
    
    /* "SwimlaneColumnError" */ val swimlaneColumnError: typingsJapgolly.officeJs.Visio.DataValidationErrorType.swimlaneColumnError & String = js.native
    
    /* "UniqueIdColumnError" */ val uniqueIdColumnError: typingsJapgolly.officeJs.Visio.DataValidationErrorType.uniqueIdColumnError & String = js.native
  }
  
  /**
    *
    * Type of the Data Visualizer Diagram operation
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramOperationType")
  @js.native
  object DataVisualizerDiagramOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType & String] = js.native
    
    /* "Create" */ val create: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.create & String = js.native
    
    /* "Delete" */ val delete: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.delete & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.unknown & String = js.native
    
    /* "Update" */ val update: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.update & String = js.native
    
    /* "UpdateData" */ val updateData: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.updateData & String = js.native
    
    /* "UpdateMappings" */ val updateMappings: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramOperationType.updateMappings & String = js.native
  }
  
  /**
    *
    * Result of Data Visualizer Diagram operations.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramResultType")
  @js.native
  object DataVisualizerDiagramResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.DataVisualizerDiagramResultType & String] = js.native
    
    /* "ConflictError" */ val conflictError: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramResultType.conflictError & String = js.native
    
    /* "Success" */ val success: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramResultType.success & String = js.native
    
    /* "Unexpected" */ val unexpected: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramResultType.unexpected & String = js.native
    
    /* "ValidationError" */ val validationError: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramResultType.validationError & String = js.native
  }
  
  /**
    *
    * DiagramType for Data Visualizer diagrams
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramType")
  @js.native
  object DataVisualizerDiagramType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType & String] = js.native
    
    /* "Audit" */ val audit: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.audit & String = js.native
    
    /* "BasicFlowchart" */ val basicFlowchart: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.basicFlowchart & String = js.native
    
    /* "CrossFunctionalFlowchart_Horizontal" */ val crossFunctionalFlowchart_Horizontal: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Horizontal & String = js.native
    
    /* "CrossFunctionalFlowchart_Vertical" */ val crossFunctionalFlowchart_Vertical: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Vertical & String = js.native
    
    /* "Network" */ val network: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.network & String = js.native
    
    /* "OrgChart" */ val orgChart: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.orgChart & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Visio.DataVisualizerDiagramType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the Document class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Document")
  @js.native
  open class Document ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Document {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the DocumentView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DocumentView")
  @js.native
  open class DocumentView ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.DocumentView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  @JSGlobal("Visio.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.ErrorCodes & String] = js.native
    
    /* "AccessDenied" */ val accessDenied: typingsJapgolly.officeJs.Visio.ErrorCodes.accessDenied & String = js.native
    
    /* "GeneralException" */ val generalException: typingsJapgolly.officeJs.Visio.ErrorCodes.generalException & String = js.native
    
    /* "InvalidArgument" */ val invalidArgument: typingsJapgolly.officeJs.Visio.ErrorCodes.invalidArgument & String = js.native
    
    /* "ItemNotFound" */ val itemNotFound: typingsJapgolly.officeJs.Visio.ErrorCodes.itemNotFound & String = js.native
    
    /* "NotImplemented" */ val notImplemented: typingsJapgolly.officeJs.Visio.ErrorCodes.notImplemented & String = js.native
    
    /* "UnsupportedOperation" */ val unsupportedOperation: typingsJapgolly.officeJs.Visio.ErrorCodes.unsupportedOperation & String = js.native
  }
  
  /**
    *
    * EventType represents the type of the events Host supports
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.EventType & String] = js.native
    
    /* "DataVisualizerDiagramOperationCompleted" */ val dataVisualizerDiagramOperationCompleted: typingsJapgolly.officeJs.Visio.EventType.dataVisualizerDiagramOperationCompleted & String = js.native
  }
  
  /**
    *
    * Represents the Hyperlink.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Hyperlink")
  @js.native
  open class Hyperlink ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Hyperlink {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Hyperlink Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.HyperlinkCollection")
  @js.native
  open class HyperlinkCollection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.HyperlinkCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the type of layout.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.LayoutVariant")
  @js.native
  object LayoutVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.LayoutVariant & String] = js.native
    
    /* "Flowchart_BottomToTop" */ val flowchart_BottomToTop: typingsJapgolly.officeJs.Visio.LayoutVariant.flowchart_BottomToTop & String = js.native
    
    /* "Flowchart_LeftToRight" */ val flowchart_LeftToRight: typingsJapgolly.officeJs.Visio.LayoutVariant.flowchart_LeftToRight & String = js.native
    
    /* "Flowchart_RightToLeft" */ val flowchart_RightToLeft: typingsJapgolly.officeJs.Visio.LayoutVariant.flowchart_RightToLeft & String = js.native
    
    /* "Flowchart_TopToBottom" */ val flowchart_TopToBottom: typingsJapgolly.officeJs.Visio.LayoutVariant.flowchart_TopToBottom & String = js.native
    
    /* "PageDefault" */ val pageDefault: typingsJapgolly.officeJs.Visio.LayoutVariant.pageDefault & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Visio.LayoutVariant.unknown & String = js.native
    
    /* "WideTree_DownThenLeft" */ val wideTree_DownThenLeft: typingsJapgolly.officeJs.Visio.LayoutVariant.wideTree_DownThenLeft & String = js.native
    
    /* "WideTree_DownThenRight" */ val wideTree_DownThenRight: typingsJapgolly.officeJs.Visio.LayoutVariant.wideTree_DownThenRight & String = js.native
    
    /* "WideTree_LeftThenDown" */ val wideTree_LeftThenDown: typingsJapgolly.officeJs.Visio.LayoutVariant.wideTree_LeftThenDown & String = js.native
    
    /* "WideTree_RightThenDown" */ val wideTree_RightThenDown: typingsJapgolly.officeJs.Visio.LayoutVariant.wideTree_RightThenDown & String = js.native
  }
  
  /**
    *
    * Represents the Horizontal Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayHorizontalAlignment")
  @js.native
  object OverlayHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.OverlayHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typingsJapgolly.officeJs.Visio.OverlayHorizontalAlignment.center & String = js.native
    
    /* "Left" */ val left: typingsJapgolly.officeJs.Visio.OverlayHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typingsJapgolly.officeJs.Visio.OverlayHorizontalAlignment.right & String = js.native
  }
  
  /**
    *
    * Represents the type of the overlay.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.OverlayType & String] = js.native
    
    /* "Html" */ val html: typingsJapgolly.officeJs.Visio.OverlayType.html & String = js.native
    
    /* "Image" */ val image: typingsJapgolly.officeJs.Visio.OverlayType.image & String = js.native
    
    /* "Text" */ val text: typingsJapgolly.officeJs.Visio.OverlayType.text & String = js.native
  }
  
  /**
    *
    * Represents the Vertical Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayVerticalAlignment")
  @js.native
  object OverlayVerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.OverlayVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typingsJapgolly.officeJs.Visio.OverlayVerticalAlignment.bottom & String = js.native
    
    /* "Middle" */ val middle: typingsJapgolly.officeJs.Visio.OverlayVerticalAlignment.middle & String = js.native
    
    /* "Top" */ val top: typingsJapgolly.officeJs.Visio.OverlayVerticalAlignment.top & String = js.native
  }
  
  /**
    *
    * Represents the Page class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Page")
  @js.native
  open class Page ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Page {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents a collection of Page objects that are part of the document.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageCollection")
  @js.native
  open class PageCollection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.PageCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the PageView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageView")
  @js.native
  open class PageView ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.PageView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * The RequestContext object facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  @JSGlobal("Visio.RequestContext")
  @js.native
  open class RequestContext ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.RequestContext {
    def this(url: String) = this()
    def this(url: EmbeddedSession) = this()
  }
  
  /**
    *
    * Represents the Selection in the page.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Selection")
  @js.native
  open class Selection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Selection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Shape class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.Shape {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Shape Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeCollection")
  @js.native
  open class ShapeCollection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.ShapeCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeDataItem.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItem")
  @js.native
  open class ShapeDataItem ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.ShapeDataItem {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeDataItemCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItemCollection")
  @js.native
  open class ShapeDataItemCollection ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.ShapeDataItemCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeView")
  @js.native
  open class ShapeView ()
    extends StObject
       with typingsJapgolly.officeJs.Visio.ShapeView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * TaskPaneType represents the types of the First Party TaskPanes that are supported by Host through APIs. Used in case of Show TaskPane API/ TaskPane State Changed Event etc
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.TaskPaneType")
  @js.native
  object TaskPaneType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.TaskPaneType & String] = js.native
    
    /* "DataVisualizerOrgChartMappings" */ val dataVisualizerOrgChartMappings: typingsJapgolly.officeJs.Visio.TaskPaneType.dataVisualizerOrgChartMappings & String = js.native
    
    /* "DataVisualizerProcessMappings" */ val dataVisualizerProcessMappings: typingsJapgolly.officeJs.Visio.TaskPaneType.dataVisualizerProcessMappings & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJs.Visio.TaskPaneType.none & String = js.native
  }
  
  /**
    *
    * Toolbar IDs of the app
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ToolBarType")
  @js.native
  object ToolBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Visio.ToolBarType & String] = js.native
    
    /* "CommandBar" */ val commandBar: typingsJapgolly.officeJs.Visio.ToolBarType.commandBar & String = js.native
    
    /* "PageNavigationBar" */ val pageNavigationBar: typingsJapgolly.officeJs.Visio.ToolBarType.pageNavigationBar & String = js.native
    
    /* "StatusBar" */ val statusBar: typingsJapgolly.officeJs.Visio.ToolBarType.statusBar & String = js.native
  }
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  inline def run[T](batch: js.Function1[/* context */ typingsJapgolly.officeJs.Visio.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the RequestContext of a previously-created object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param contextObject - A previously-created Visio.RequestContext. This context will get re-used by the batch function (instead of having a new context created). This means that the batch will be able to pick up changes made to existing API objects, if those objects were derived from this same context.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the RequestContext is required to get access to the Visio object model from the add-in.
    * @remarks
    * In addition to this signature, the method also has the following signatures:
    *
    * `run<T>(batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(object: OfficeExtension.ClientObject | OfficeExtension.EmbeddedSession, batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(objects: OfficeExtension.ClientObject[], batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    */
  inline def run[T](
    contextObject: ClientRequestContext,
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(contextObject.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def run[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
