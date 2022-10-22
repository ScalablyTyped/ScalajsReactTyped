package typingsJapgolly.officeJsPreview.global

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import typingsJapgolly.officeJsPreview.OfficeExtension.EmbeddedSession
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
       with typingsJapgolly.officeJsPreview.Visio.Application {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.ColumnType & String] = js.native
    
    /* "Currency" */ val currency: typingsJapgolly.officeJsPreview.Visio.ColumnType.currency & String = js.native
    
    /* "Date" */ val date: typingsJapgolly.officeJsPreview.Visio.ColumnType.date & String = js.native
    
    /* "Number" */ val number: typingsJapgolly.officeJsPreview.Visio.ColumnType.number & String = js.native
    
    /* "String" */ val string: typingsJapgolly.officeJsPreview.Visio.ColumnType.string & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Visio.ColumnType.unknown & String = js.native
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
       with typingsJapgolly.officeJsPreview.Visio.Comment {
    
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
       with typingsJapgolly.officeJsPreview.Visio.CommentCollection {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.ConnectorDirection & String] = js.native
    
    /* "FromTarget" */ val fromTarget: typingsJapgolly.officeJsPreview.Visio.ConnectorDirection.fromTarget & String = js.native
    
    /* "ToTarget" */ val toTarget: typingsJapgolly.officeJsPreview.Visio.ConnectorDirection.toTarget & String = js.native
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
    def apply(value: String): js.UndefOr[
        typingsJapgolly.officeJsPreview.Visio.CrossFunctionalFlowchartOrientation & String
      ] = js.native
    
    /* "Horizontal" */ val horizontal: typingsJapgolly.officeJsPreview.Visio.CrossFunctionalFlowchartOrientation.horizontal & String = js.native
    
    /* "Vertical" */ val vertical: typingsJapgolly.officeJsPreview.Visio.CrossFunctionalFlowchartOrientation.vertical & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.DataSourceType & String] = js.native
    
    /* "Excel" */ val excel: typingsJapgolly.officeJsPreview.Visio.DataSourceType.excel & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Visio.DataSourceType.unknown & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType & String] = js.native
    
    /* "ColumnNotMapped" */ val columnNotMapped: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.columnNotMapped & String = js.native
    
    /* "ConnectorColumnAndConnectorLabelMappedElsewhere" */ val connectorColumnAndConnectorLabelMappedElsewhere: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.connectorColumnAndConnectorLabelMappedElsewhere & String = js.native
    
    /* "ConnectorColumnError" */ val connectorColumnError: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.connectorColumnError & String = js.native
    
    /* "ConnectorColumnMappedElsewhere" */ val connectorColumnMappedElsewhere: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.connectorColumnMappedElsewhere & String = js.native
    
    /* "ConnectorLabelColumnMappedElsewhere" */ val connectorLabelColumnMappedElsewhere: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.connectorLabelColumnMappedElsewhere & String = js.native
    
    /* "DelimiterError" */ val delimiterError: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.delimiterError & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.none & String = js.native
    
    /* "SwimlaneColumnError" */ val swimlaneColumnError: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.swimlaneColumnError & String = js.native
    
    /* "UniqueIdColumnError" */ val uniqueIdColumnError: typingsJapgolly.officeJsPreview.Visio.DataValidationErrorType.uniqueIdColumnError & String = js.native
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
    def apply(value: String): js.UndefOr[
        typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType & String
      ] = js.native
    
    /* "Create" */ val create: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.create & String = js.native
    
    /* "Delete" */ val delete: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.delete & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.unknown & String = js.native
    
    /* "Update" */ val update: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.update & String = js.native
    
    /* "UpdateData" */ val updateData: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.updateData & String = js.native
    
    /* "UpdateMappings" */ val updateMappings: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramOperationType.updateMappings & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramResultType & String] = js.native
    
    /* "ConflictError" */ val conflictError: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramResultType.conflictError & String = js.native
    
    /* "Success" */ val success: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramResultType.success & String = js.native
    
    /* "Unexpected" */ val unexpected: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramResultType.unexpected & String = js.native
    
    /* "ValidationError" */ val validationError: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramResultType.validationError & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType & String] = js.native
    
    /* "Audit" */ val audit: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.audit & String = js.native
    
    /* "BasicFlowchart" */ val basicFlowchart: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.basicFlowchart & String = js.native
    
    /* "CrossFunctionalFlowchart_Horizontal" */ val crossFunctionalFlowchart_Horizontal: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Horizontal & String = js.native
    
    /* "CrossFunctionalFlowchart_Vertical" */ val crossFunctionalFlowchart_Vertical: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Vertical & String = js.native
    
    /* "Network" */ val network: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.network & String = js.native
    
    /* "OrgChart" */ val orgChart: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.orgChart & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Visio.DataVisualizerDiagramType.unknown & String = js.native
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
       with typingsJapgolly.officeJsPreview.Visio.Document {
    
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
       with typingsJapgolly.officeJsPreview.Visio.DocumentView {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.ErrorCodes & String] = js.native
    
    /* "AccessDenied" */ val accessDenied: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.accessDenied & String = js.native
    
    /* "GeneralException" */ val generalException: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.generalException & String = js.native
    
    /* "InvalidArgument" */ val invalidArgument: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.invalidArgument & String = js.native
    
    /* "ItemNotFound" */ val itemNotFound: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.itemNotFound & String = js.native
    
    /* "NotImplemented" */ val notImplemented: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.notImplemented & String = js.native
    
    /* "UnsupportedOperation" */ val unsupportedOperation: typingsJapgolly.officeJsPreview.Visio.ErrorCodes.unsupportedOperation & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.EventType & String] = js.native
    
    /* "DataVisualizerDiagramOperationCompleted" */ val dataVisualizerDiagramOperationCompleted: typingsJapgolly.officeJsPreview.Visio.EventType.dataVisualizerDiagramOperationCompleted & String = js.native
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
       with typingsJapgolly.officeJsPreview.Visio.Hyperlink {
    
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
       with typingsJapgolly.officeJsPreview.Visio.HyperlinkCollection {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.LayoutVariant & String] = js.native
    
    /* "Flowchart_BottomToTop" */ val flowchart_BottomToTop: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.flowchart_BottomToTop & String = js.native
    
    /* "Flowchart_LeftToRight" */ val flowchart_LeftToRight: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.flowchart_LeftToRight & String = js.native
    
    /* "Flowchart_RightToLeft" */ val flowchart_RightToLeft: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.flowchart_RightToLeft & String = js.native
    
    /* "Flowchart_TopToBottom" */ val flowchart_TopToBottom: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.flowchart_TopToBottom & String = js.native
    
    /* "PageDefault" */ val pageDefault: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.pageDefault & String = js.native
    
    /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.unknown & String = js.native
    
    /* "WideTree_DownThenLeft" */ val wideTree_DownThenLeft: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.wideTree_DownThenLeft & String = js.native
    
    /* "WideTree_DownThenRight" */ val wideTree_DownThenRight: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.wideTree_DownThenRight & String = js.native
    
    /* "WideTree_LeftThenDown" */ val wideTree_LeftThenDown: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.wideTree_LeftThenDown & String = js.native
    
    /* "WideTree_RightThenDown" */ val wideTree_RightThenDown: typingsJapgolly.officeJsPreview.Visio.LayoutVariant.wideTree_RightThenDown & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.OverlayHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typingsJapgolly.officeJsPreview.Visio.OverlayHorizontalAlignment.center & String = js.native
    
    /* "Left" */ val left: typingsJapgolly.officeJsPreview.Visio.OverlayHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typingsJapgolly.officeJsPreview.Visio.OverlayHorizontalAlignment.right & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.OverlayType & String] = js.native
    
    /* "Html" */ val html: typingsJapgolly.officeJsPreview.Visio.OverlayType.html & String = js.native
    
    /* "Image" */ val image: typingsJapgolly.officeJsPreview.Visio.OverlayType.image & String = js.native
    
    /* "Text" */ val text: typingsJapgolly.officeJsPreview.Visio.OverlayType.text & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.OverlayVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typingsJapgolly.officeJsPreview.Visio.OverlayVerticalAlignment.bottom & String = js.native
    
    /* "Middle" */ val middle: typingsJapgolly.officeJsPreview.Visio.OverlayVerticalAlignment.middle & String = js.native
    
    /* "Top" */ val top: typingsJapgolly.officeJsPreview.Visio.OverlayVerticalAlignment.top & String = js.native
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
       with typingsJapgolly.officeJsPreview.Visio.Page {
    
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
       with typingsJapgolly.officeJsPreview.Visio.PageCollection {
    
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
       with typingsJapgolly.officeJsPreview.Visio.PageView {
    
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
       with typingsJapgolly.officeJsPreview.Visio.RequestContext {
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
       with typingsJapgolly.officeJsPreview.Visio.Selection {
    
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
       with typingsJapgolly.officeJsPreview.Visio.Shape {
    
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
       with typingsJapgolly.officeJsPreview.Visio.ShapeCollection {
    
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
       with typingsJapgolly.officeJsPreview.Visio.ShapeDataItem {
    
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
       with typingsJapgolly.officeJsPreview.Visio.ShapeDataItemCollection {
    
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
       with typingsJapgolly.officeJsPreview.Visio.ShapeView {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.TaskPaneType & String] = js.native
    
    /* "DataVisualizerOrgChartMappings" */ val dataVisualizerOrgChartMappings: typingsJapgolly.officeJsPreview.Visio.TaskPaneType.dataVisualizerOrgChartMappings & String = js.native
    
    /* "DataVisualizerProcessMappings" */ val dataVisualizerProcessMappings: typingsJapgolly.officeJsPreview.Visio.TaskPaneType.dataVisualizerProcessMappings & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJsPreview.Visio.TaskPaneType.none & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Visio.ToolBarType & String] = js.native
    
    /* "CommandBar" */ val commandBar: typingsJapgolly.officeJsPreview.Visio.ToolBarType.commandBar & String = js.native
    
    /* "PageNavigationBar" */ val pageNavigationBar: typingsJapgolly.officeJsPreview.Visio.ToolBarType.pageNavigationBar & String = js.native
    
    /* "StatusBar" */ val statusBar: typingsJapgolly.officeJsPreview.Visio.ToolBarType.statusBar & String = js.native
  }
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  inline def run[T](
    batch: js.Function1[/* context */ typingsJapgolly.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
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
    batch: js.Function1[/* context */ typingsJapgolly.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(contextObject.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsJapgolly.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsJapgolly.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def run[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typingsJapgolly.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
