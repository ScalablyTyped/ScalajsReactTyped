package typingsJapgolly.officeJsPreview.global

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
//////////////////////// End Visio APIs ////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////////// Begin PowerPoint APIs /////////////////////
////////////////////////////////////////////////////////////////
object PowerPoint {
  
  @JSGlobal("PowerPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Application")
  @js.native
  open class Application ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    /* CompleteClass */
    @JSName("context")
    var context_Application: typingsJapgolly.officeJsPreview.PowerPoint.RequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
    
    /**
      * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
      * Whereas the original PowerPoint.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
      */
    /* CompleteClass */
    override def toJSON(): StringDictionary[String] = js.native
  }
  object Application {
    
    @JSGlobal("PowerPoint.Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new instance of PowerPoint.Application object
      */
    /* static member */
    inline def newObject(context: ClientRequestContext): typingsJapgolly.officeJsPreview.PowerPoint.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.officeJsPreview.PowerPoint.Application]
  }
  
  /**
    * Represents the bullet formatting properties of a text that is attached to the {@link PowerPoint.ParagraphFormat}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.BulletFormat")
  @js.native
  open class BulletFormat ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.BulletFormat {
    
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
    * Specifies the connector type for line shapes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ConnectorType")
  @js.native
  object ConnectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ConnectorType & String] = js.native
    
    /* "Curve" */ val curve: typingsJapgolly.officeJsPreview.PowerPoint.ConnectorType.curve & String = js.native
    
    /* "Elbow" */ val elbow: typingsJapgolly.officeJsPreview.PowerPoint.ConnectorType.elbow & String = js.native
    
    /* "Straight" */ val straight: typingsJapgolly.officeJsPreview.PowerPoint.ConnectorType.straight & String = js.native
  }
  
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ErrorCodes & String] = js.native
    
    /* "GeneralException" */ val generalException: typingsJapgolly.officeJsPreview.PowerPoint.ErrorCodes.generalException & String = js.native
  }
  
  /**
    * Specifies the shape type for a `GeometricShape` object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.GeometricShapeType")
  @js.native
  object GeometricShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType & String] = js.native
    
    /* "AccentBorderCallout1" */ val accentBorderCallout1: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout1 & String = js.native
    
    /* "AccentBorderCallout2" */ val accentBorderCallout2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout2 & String = js.native
    
    /* "AccentBorderCallout3" */ val accentBorderCallout3: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout3 & String = js.native
    
    /* "AccentCallout1" */ val accentCallout1: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout1 & String = js.native
    
    /* "AccentCallout2" */ val accentCallout2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout2 & String = js.native
    
    /* "AccentCallout3" */ val accentCallout3: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout3 & String = js.native
    
    /* "ActionButtonBackPrevious" */ val actionButtonBackPrevious: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBackPrevious & String = js.native
    
    /* "ActionButtonBeginning" */ val actionButtonBeginning: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBeginning & String = js.native
    
    /* "ActionButtonBlank" */ val actionButtonBlank: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBlank & String = js.native
    
    /* "ActionButtonDocument" */ val actionButtonDocument: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonDocument & String = js.native
    
    /* "ActionButtonEnd" */ val actionButtonEnd: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonEnd & String = js.native
    
    /* "ActionButtonForwardNext" */ val actionButtonForwardNext: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonForwardNext & String = js.native
    
    /* "ActionButtonHelp" */ val actionButtonHelp: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonHelp & String = js.native
    
    /* "ActionButtonHome" */ val actionButtonHome: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonHome & String = js.native
    
    /* "ActionButtonInformation" */ val actionButtonInformation: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonInformation & String = js.native
    
    /* "ActionButtonMovie" */ val actionButtonMovie: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonMovie & String = js.native
    
    /* "ActionButtonReturn" */ val actionButtonReturn: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonReturn & String = js.native
    
    /* "ActionButtonSound" */ val actionButtonSound: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonSound & String = js.native
    
    /* "Arc" */ val arc: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.arc & String = js.native
    
    /* "BentArrow" */ val bentArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.bentArrow & String = js.native
    
    /* "BentUpArrow" */ val bentUpArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.bentUpArrow & String = js.native
    
    /* "Bevel" */ val bevel: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.bevel & String = js.native
    
    /* "BlockArc" */ val blockArc: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.blockArc & String = js.native
    
    /* "BorderCallout1" */ val borderCallout1: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout1 & String = js.native
    
    /* "BorderCallout2" */ val borderCallout2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout2 & String = js.native
    
    /* "BorderCallout3" */ val borderCallout3: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout3 & String = js.native
    
    /* "BracePair" */ val bracePair: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.bracePair & String = js.native
    
    /* "BracketPair" */ val bracketPair: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.bracketPair & String = js.native
    
    /* "Callout1" */ val callout1: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.callout1 & String = js.native
    
    /* "Callout2" */ val callout2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.callout2 & String = js.native
    
    /* "Callout3" */ val callout3: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.callout3 & String = js.native
    
    /* "Can" */ val can: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.can & String = js.native
    
    /* "ChartPlus" */ val chartPlus: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.chartPlus & String = js.native
    
    /* "ChartStar" */ val chartStar: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.chartStar & String = js.native
    
    /* "ChartX" */ val chartX: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.chartX & String = js.native
    
    /* "Chevron" */ val chevron: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.chevron & String = js.native
    
    /* "Chord" */ val chord: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.chord & String = js.native
    
    /* "CircularArrow" */ val circularArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.circularArrow & String = js.native
    
    /* "Cloud" */ val cloud: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.cloud & String = js.native
    
    /* "CloudCallout" */ val cloudCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.cloudCallout & String = js.native
    
    /* "Corner" */ val corner: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.corner & String = js.native
    
    /* "CornerTabs" */ val cornerTabs: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.cornerTabs & String = js.native
    
    /* "Cube" */ val cube: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.cube & String = js.native
    
    /* "CurvedDownArrow" */ val curvedDownArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.curvedDownArrow & String = js.native
    
    /* "CurvedLeftArrow" */ val curvedLeftArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.curvedLeftArrow & String = js.native
    
    /* "CurvedRightArrow" */ val curvedRightArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.curvedRightArrow & String = js.native
    
    /* "CurvedUpArrow" */ val curvedUpArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.curvedUpArrow & String = js.native
    
    /* "Decagon" */ val decagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.decagon & String = js.native
    
    /* "DiagonalStripe" */ val diagonalStripe: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.diagonalStripe & String = js.native
    
    /* "Diamond" */ val diamond: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.diamond & String = js.native
    
    /* "Dodecagon" */ val dodecagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.dodecagon & String = js.native
    
    /* "Donut" */ val donut: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.donut & String = js.native
    
    /* "DoubleWave" */ val doubleWave: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.doubleWave & String = js.native
    
    /* "DownArrow" */ val downArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.downArrow & String = js.native
    
    /* "DownArrowCallout" */ val downArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.downArrowCallout & String = js.native
    
    /* "Ellipse" */ val ellipse: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.ellipse & String = js.native
    
    /* "EllipseRibbon" */ val ellipseRibbon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.ellipseRibbon & String = js.native
    
    /* "EllipseRibbon2" */ val ellipseRibbon2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.ellipseRibbon2 & String = js.native
    
    /* "FlowChartAlternateProcess" */ val flowChartAlternateProcess: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartAlternateProcess & String = js.native
    
    /* "FlowChartCollate" */ val flowChartCollate: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartCollate & String = js.native
    
    /* "FlowChartConnector" */ val flowChartConnector: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartConnector & String = js.native
    
    /* "FlowChartDecision" */ val flowChartDecision: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDecision & String = js.native
    
    /* "FlowChartDelay" */ val flowChartDelay: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDelay & String = js.native
    
    /* "FlowChartDisplay" */ val flowChartDisplay: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDisplay & String = js.native
    
    /* "FlowChartDocument" */ val flowChartDocument: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDocument & String = js.native
    
    /* "FlowChartExtract" */ val flowChartExtract: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartExtract & String = js.native
    
    /* "FlowChartInputOutput" */ val flowChartInputOutput: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartInputOutput & String = js.native
    
    /* "FlowChartInternalStorage" */ val flowChartInternalStorage: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartInternalStorage & String = js.native
    
    /* "FlowChartMagneticDisk" */ val flowChartMagneticDisk: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticDisk & String = js.native
    
    /* "FlowChartMagneticDrum" */ val flowChartMagneticDrum: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticDrum & String = js.native
    
    /* "FlowChartMagneticTape" */ val flowChartMagneticTape: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticTape & String = js.native
    
    /* "FlowChartManualInput" */ val flowChartManualInput: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartManualInput & String = js.native
    
    /* "FlowChartManualOperation" */ val flowChartManualOperation: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartManualOperation & String = js.native
    
    /* "FlowChartMerge" */ val flowChartMerge: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMerge & String = js.native
    
    /* "FlowChartMultidocument" */ val flowChartMultidocument: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMultidocument & String = js.native
    
    /* "FlowChartOfflineStorage" */ val flowChartOfflineStorage: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOfflineStorage & String = js.native
    
    /* "FlowChartOffpageConnector" */ val flowChartOffpageConnector: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOffpageConnector & String = js.native
    
    /* "FlowChartOnlineStorage" */ val flowChartOnlineStorage: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOnlineStorage & String = js.native
    
    /* "FlowChartOr" */ val flowChartOr: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOr & String = js.native
    
    /* "FlowChartPredefinedProcess" */ val flowChartPredefinedProcess: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPredefinedProcess & String = js.native
    
    /* "FlowChartPreparation" */ val flowChartPreparation: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPreparation & String = js.native
    
    /* "FlowChartProcess" */ val flowChartProcess: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartProcess & String = js.native
    
    /* "FlowChartPunchedCard" */ val flowChartPunchedCard: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPunchedCard & String = js.native
    
    /* "FlowChartPunchedTape" */ val flowChartPunchedTape: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPunchedTape & String = js.native
    
    /* "FlowChartSort" */ val flowChartSort: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartSort & String = js.native
    
    /* "FlowChartSummingJunction" */ val flowChartSummingJunction: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartSummingJunction & String = js.native
    
    /* "FlowChartTerminator" */ val flowChartTerminator: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.flowChartTerminator & String = js.native
    
    /* "FoldedCorner" */ val foldedCorner: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.foldedCorner & String = js.native
    
    /* "Frame" */ val frame: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.frame & String = js.native
    
    /* "Funnel" */ val funnel: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.funnel & String = js.native
    
    /* "Gear6" */ val gear6: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.gear6 & String = js.native
    
    /* "Gear9" */ val gear9: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.gear9 & String = js.native
    
    /* "HalfFrame" */ val halfFrame: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.halfFrame & String = js.native
    
    /* "Heart" */ val heart: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.heart & String = js.native
    
    /* "Heptagon" */ val heptagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.heptagon & String = js.native
    
    /* "Hexagon" */ val hexagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.hexagon & String = js.native
    
    /* "HomePlate" */ val homePlate: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.homePlate & String = js.native
    
    /* "HorizontalScroll" */ val horizontalScroll: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.horizontalScroll & String = js.native
    
    /* "IrregularSeal1" */ val irregularSeal1: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.irregularSeal1 & String = js.native
    
    /* "IrregularSeal2" */ val irregularSeal2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.irregularSeal2 & String = js.native
    
    /* "LeftArrow" */ val leftArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftArrow & String = js.native
    
    /* "LeftArrowCallout" */ val leftArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftArrowCallout & String = js.native
    
    /* "LeftBrace" */ val leftBrace: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftBrace & String = js.native
    
    /* "LeftBracket" */ val leftBracket: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftBracket & String = js.native
    
    /* "LeftCircularArrow" */ val leftCircularArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftCircularArrow & String = js.native
    
    /* "LeftRightArrow" */ val leftRightArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftRightArrow & String = js.native
    
    /* "LeftRightArrowCallout" */ val leftRightArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftRightArrowCallout & String = js.native
    
    /* "LeftRightCircularArrow" */ val leftRightCircularArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftRightCircularArrow & String = js.native
    
    /* "LeftRightRibbon" */ val leftRightRibbon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftRightRibbon & String = js.native
    
    /* "LeftRightUpArrow" */ val leftRightUpArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftRightUpArrow & String = js.native
    
    /* "LeftUpArrow" */ val leftUpArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.leftUpArrow & String = js.native
    
    /* "LightningBolt" */ val lightningBolt: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.lightningBolt & String = js.native
    
    /* "LineInverse" */ val lineInverse: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.lineInverse & String = js.native
    
    /* "MathDivide" */ val mathDivide: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathDivide & String = js.native
    
    /* "MathEqual" */ val mathEqual: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathEqual & String = js.native
    
    /* "MathMinus" */ val mathMinus: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathMinus & String = js.native
    
    /* "MathMultiply" */ val mathMultiply: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathMultiply & String = js.native
    
    /* "MathNotEqual" */ val mathNotEqual: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathNotEqual & String = js.native
    
    /* "MathPlus" */ val mathPlus: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.mathPlus & String = js.native
    
    /* "Moon" */ val moon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.moon & String = js.native
    
    /* "NoSmoking" */ val noSmoking: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.noSmoking & String = js.native
    
    /* "NonIsoscelesTrapezoid" */ val nonIsoscelesTrapezoid: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.nonIsoscelesTrapezoid & String = js.native
    
    /* "NotchedRightArrow" */ val notchedRightArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.notchedRightArrow & String = js.native
    
    /* "Octagon" */ val octagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.octagon & String = js.native
    
    /* "Parallelogram" */ val parallelogram: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.parallelogram & String = js.native
    
    /* "Pentagon" */ val pentagon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.pentagon & String = js.native
    
    /* "Pie" */ val pie: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.pie & String = js.native
    
    /* "PieWedge" */ val pieWedge: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.pieWedge & String = js.native
    
    /* "Plaque" */ val plaque: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.plaque & String = js.native
    
    /* "PlaqueTabs" */ val plaqueTabs: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.plaqueTabs & String = js.native
    
    /* "Plus" */ val plus: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.plus & String = js.native
    
    /* "QuadArrow" */ val quadArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.quadArrow & String = js.native
    
    /* "QuadArrowCallout" */ val quadArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.quadArrowCallout & String = js.native
    
    /* "Rectangle" */ val rectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rectangle & String = js.native
    
    /* "Ribbon" */ val ribbon: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.ribbon & String = js.native
    
    /* "Ribbon2" */ val ribbon2: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.ribbon2 & String = js.native
    
    /* "RightArrow" */ val rightArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rightArrow & String = js.native
    
    /* "RightArrowCallout" */ val rightArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rightArrowCallout & String = js.native
    
    /* "RightBrace" */ val rightBrace: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rightBrace & String = js.native
    
    /* "RightBracket" */ val rightBracket: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rightBracket & String = js.native
    
    /* "RightTriangle" */ val rightTriangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.rightTriangle & String = js.native
    
    /* "Round1Rectangle" */ val round1Rectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.round1Rectangle & String = js.native
    
    /* "Round2DiagonalRectangle" */ val round2DiagonalRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.round2DiagonalRectangle & String = js.native
    
    /* "Round2SameRectangle" */ val round2SameRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.round2SameRectangle & String = js.native
    
    /* "RoundRectangle" */ val roundRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.roundRectangle & String = js.native
    
    /* "SmileyFace" */ val smileyFace: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.smileyFace & String = js.native
    
    /* "Snip1Rectangle" */ val snip1Rectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.snip1Rectangle & String = js.native
    
    /* "Snip2DiagonalRectangle" */ val snip2DiagonalRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.snip2DiagonalRectangle & String = js.native
    
    /* "Snip2SameRectangle" */ val snip2SameRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.snip2SameRectangle & String = js.native
    
    /* "SnipRoundRectangle" */ val snipRoundRectangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.snipRoundRectangle & String = js.native
    
    /* "SquareTabs" */ val squareTabs: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.squareTabs & String = js.native
    
    /* "Star10" */ val star10: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star10 & String = js.native
    
    /* "Star12" */ val star12: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star12 & String = js.native
    
    /* "Star16" */ val star16: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star16 & String = js.native
    
    /* "Star24" */ val star24: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star24 & String = js.native
    
    /* "Star32" */ val star32: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star32 & String = js.native
    
    /* "Star4" */ val star4: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star4 & String = js.native
    
    /* "Star5" */ val star5: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star5 & String = js.native
    
    /* "Star6" */ val star6: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star6 & String = js.native
    
    /* "Star7" */ val star7: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star7 & String = js.native
    
    /* "Star8" */ val star8: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.star8 & String = js.native
    
    /* "StripedRightArrow" */ val stripedRightArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.stripedRightArrow & String = js.native
    
    /* "Sun" */ val sun: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.sun & String = js.native
    
    /* "SwooshArrow" */ val swooshArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.swooshArrow & String = js.native
    
    /* "Teardrop" */ val teardrop: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.teardrop & String = js.native
    
    /* "Trapezoid" */ val trapezoid: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.trapezoid & String = js.native
    
    /* "Triangle" */ val triangle: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.triangle & String = js.native
    
    /* "UpArrow" */ val upArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.upArrow & String = js.native
    
    /* "UpArrowCallout" */ val upArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.upArrowCallout & String = js.native
    
    /* "UpDownArrow" */ val upDownArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.upDownArrow & String = js.native
    
    /* "UpDownArrowCallout" */ val upDownArrowCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.upDownArrowCallout & String = js.native
    
    /* "UturnArrow" */ val uturnArrow: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.uturnArrow & String = js.native
    
    /* "VerticalScroll" */ val verticalScroll: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.verticalScroll & String = js.native
    
    /* "Wave" */ val wave: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.wave & String = js.native
    
    /* "WedgeEllipseCallout" */ val wedgeEllipseCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.wedgeEllipseCallout & String = js.native
    
    /* "WedgeRRectCallout" */ val wedgeRRectCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.wedgeRRectCallout & String = js.native
    
    /* "WedgeRectCallout" */ val wedgeRectCallout: typingsJapgolly.officeJsPreview.PowerPoint.GeometricShapeType.wedgeRectCallout & String = js.native
  }
  
  /**
    * Specifies the formatting options for when slides are inserted.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.InsertSlideFormatting")
  @js.native
  object InsertSlideFormatting extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.InsertSlideFormatting & String] = js.native
    
    /* "KeepSourceFormatting" */ val keepSourceFormatting: typingsJapgolly.officeJsPreview.PowerPoint.InsertSlideFormatting.keepSourceFormatting & String = js.native
    
    /* "UseDestinationTheme" */ val useDestinationTheme: typingsJapgolly.officeJsPreview.PowerPoint.InsertSlideFormatting.useDestinationTheme & String = js.native
  }
  
  /**
    * Represents the paragraph formatting properties of a text that is attached to the {@link PowerPoint.TextRange}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ParagraphFormat")
  @js.native
  open class ParagraphFormat ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ParagraphFormat {
    
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
    * Represents the horizontal alignment of the {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ParagraphHorizontalAlignment")
  @js.native
  object ParagraphHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.center & String = js.native
    
    /* "Distributed" */ val distributed: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.distributed & String = js.native
    
    /* "Justify" */ val justify: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.justify & String = js.native
    
    /* "JustifyLow" */ val justifyLow: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.justifyLow & String = js.native
    
    /* "Left" */ val left: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.right & String = js.native
    
    /* "ThaiDistributed" */ val thaiDistributed: typingsJapgolly.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.thaiDistributed & String = js.native
  }
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Presentation")
  @js.native
  open class Presentation ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.Presentation {
    
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
    * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
    */
  @JSGlobal("PowerPoint.RequestContext")
  @js.native
  open class RequestContext ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.RequestContext {
    def this(url: String) = this()
  }
  
  /**
    * Represents a single shape in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.Shape {
    
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
    * Determines the type of automatic sizing allowed.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeAutoSize")
  @js.native
  object ShapeAutoSize extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize & String] = js.native
    
    /* "AutoSizeMixed" */ val autoSizeMixed: typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeMixed & String = js.native
    
    /* "AutoSizeNone" */ val autoSizeNone: typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeNone & String = js.native
    
    /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeShapeToFitText & String = js.native
    
    /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeTextToFitShape & String = js.native
  }
  
  /**
    * Represents the collection of shapes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.ShapeCollection")
  @js.native
  open class ShapeCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ShapeCollection {
    
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
    * Represents the fill formatting of a shape object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFill")
  @js.native
  open class ShapeFill ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ShapeFill {
    
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
    * Specifies a shape's fill type.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFillType")
  @js.native
  object ShapeFillType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType & String] = js.native
    
    /* "Gradient" */ val gradient: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.gradient & String = js.native
    
    /* "NoFill" */ val noFill: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.noFill & String = js.native
    
    /* "Pattern" */ val pattern: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.pattern & String = js.native
    
    /* "PictureAndTexture" */ val pictureAndTexture: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.pictureAndTexture & String = js.native
    
    /* "SlideBackground" */ val slideBackground: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.slideBackground & String = js.native
    
    /* "Solid" */ val solid: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFillType.solid & String = js.native
  }
  
  /**
    * Represents the font attributes, such as font name, font size, and color, for a shape's TextRange object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFont")
  @js.native
  open class ShapeFont ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ShapeFont {
    
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
    * The type of underline applied to a font.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFontUnderlineStyle")
  @js.native
  object ShapeFontUnderlineStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle & String] = js.native
    
    /* "Dash" */ val dash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dash & String = js.native
    
    /* "DashHeavy" */ val dashHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashHeavy & String = js.native
    
    /* "DashLong" */ val dashLong: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashLong & String = js.native
    
    /* "DashLongHeavy" */ val dashLongHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashLongHeavy & String = js.native
    
    /* "DotDash" */ val dotDash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDash & String = js.native
    
    /* "DotDashHeavy" */ val dotDashHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDashHeavy & String = js.native
    
    /* "DotDotDash" */ val dotDotDash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDotDash & String = js.native
    
    /* "DotDotDashHeavy" */ val dotDotDashHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDotDashHeavy & String = js.native
    
    /* "Dotted" */ val dotted: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotted & String = js.native
    
    /* "DottedHeavy" */ val dottedHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dottedHeavy & String = js.native
    
    /* "Double" */ val double: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.double & String = js.native
    
    /* "Heavy" */ val heavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.heavy & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.none & String = js.native
    
    /* "Single" */ val single: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.single & String = js.native
    
    /* "Wavy" */ val wavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavy & String = js.native
    
    /* "WavyDouble" */ val wavyDouble: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavyDouble & String = js.native
    
    /* "WavyHeavy" */ val wavyHeavy: typingsJapgolly.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavyHeavy & String = js.native
  }
  
  /**
    * Specifies the dash style for a line.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineDashStyle")
  @js.native
  object ShapeLineDashStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle & String] = js.native
    
    /* "Dash" */ val dash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.dash & String = js.native
    
    /* "DashDot" */ val dashDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.dashDot & String = js.native
    
    /* "DashDotDot" */ val dashDotDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.dashDotDot & String = js.native
    
    /* "LongDash" */ val longDash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDash & String = js.native
    
    /* "LongDashDot" */ val longDashDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDashDot & String = js.native
    
    /* "LongDashDotDot" */ val longDashDotDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDashDotDot & String = js.native
    
    /* "RoundDot" */ val roundDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.roundDot & String = js.native
    
    /* "Solid" */ val solid: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.solid & String = js.native
    
    /* "SquareDot" */ val squareDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.squareDot & String = js.native
    
    /* "SystemDash" */ val systemDash: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDash & String = js.native
    
    /* "SystemDashDot" */ val systemDashDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDashDot & String = js.native
    
    /* "SystemDot" */ val systemDot: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDot & String = js.native
  }
  
  /**
    * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineFormat")
  @js.native
  open class ShapeLineFormat ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineFormat {
    
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
    * Specifies the style for a line.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineStyle")
  @js.native
  object ShapeLineStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle & String] = js.native
    
    /* "Single" */ val single: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle.single & String = js.native
    
    /* "ThickBetweenThin" */ val thickBetweenThin: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle.thickBetweenThin & String = js.native
    
    /* "ThickThin" */ val thickThin: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle.thickThin & String = js.native
    
    /* "ThinThick" */ val thinThick: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle.thinThick & String = js.native
    
    /* "ThinThin" */ val thinThin: typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle.thinThin & String = js.native
  }
  
  /**
    * Represents a collection of shapes.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @JSGlobal("PowerPoint.ShapeScopedCollection")
  @js.native
  open class ShapeScopedCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.ShapeScopedCollection {
    
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
    * Specifies the type of a shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.ShapeType & String] = js.native
    
    /* "GeometricShape" */ val geometricShape: typingsJapgolly.officeJsPreview.PowerPoint.ShapeType.geometricShape & String = js.native
    
    /* "Group" */ val group: typingsJapgolly.officeJsPreview.PowerPoint.ShapeType.group & String = js.native
    
    /* "Image" */ val image: typingsJapgolly.officeJsPreview.PowerPoint.ShapeType.image & String = js.native
    
    /* "Line" */ val line: typingsJapgolly.officeJsPreview.PowerPoint.ShapeType.line & String = js.native
    
    /* "Unsupported" */ val unsupported: typingsJapgolly.officeJsPreview.PowerPoint.ShapeType.unsupported & String = js.native
  }
  
  /**
    * Represents a single slide of a presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.Slide")
  @js.native
  open class Slide ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.Slide {
    
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
    * Represents the collection of slides in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.SlideCollection")
  @js.native
  open class SlideCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideCollection {
    
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
    * Represents the layout of a slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideLayout")
  @js.native
  open class SlideLayout ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideLayout {
    
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
    * Represents the collection of layouts provided by the Slide Master for slides.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideLayoutCollection")
  @js.native
  open class SlideLayoutCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideLayoutCollection {
    
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
    * Represents the Slide Master of a slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideMaster")
  @js.native
  open class SlideMaster ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideMaster {
    
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
    * Represents the collection of Slide Masters in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideMasterCollection")
  @js.native
  open class SlideMasterCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideMasterCollection {
    
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
    * Represents a collection of slides in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @JSGlobal("PowerPoint.SlideScopedCollection")
  @js.native
  open class SlideScopedCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.SlideScopedCollection {
    
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
    * Represents a single tag in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.Tag")
  @js.native
  open class Tag ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.Tag {
    
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
    * Represents the collection of tags.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.TagCollection")
  @js.native
  open class TagCollection ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.TagCollection {
    
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
    * Represents the text frame of a shape object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextFrame")
  @js.native
  open class TextFrame ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.TextFrame {
    
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
    * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextRange")
  @js.native
  open class TextRange ()
    extends StObject
       with typingsJapgolly.officeJsPreview.PowerPoint.TextRange {
    
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
    * Represents the vertical alignment of a {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
    If one the centered options are selected, the contents of the `TextFrame` will be centered horizontally within the `Shape` as a group.
    To change the horizontal alignment of a text, see {@link PowerPoint.ParagraphFormat} and {@link PowerPoint.ParagraphHorizontalAlignment }.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextVerticalAlignment")
  @js.native
  object TextVerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.bottom & String = js.native
    
    /* "BottomCentered" */ val bottomCentered: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.bottomCentered & String = js.native
    
    /* "Middle" */ val middle: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.middle & String = js.native
    
    /* "MiddleCentered" */ val middleCentered: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.middleCentered & String = js.native
    
    /* "Top" */ val top: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.top & String = js.native
    
    /* "TopCentered" */ val topCentered: typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment.topCentered & String = js.native
  }
  
  /**
    * Creates and opens a new presentation. Optionally, the presentation can be pre-populated with a base64-encoded .pptx file.
    *
    * [Api set: PowerPointApi 1.1]
    *
    * @param base64File Optional. The base64-encoded .pptx file. The default value is null.
    */
  inline def createPresentation(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")().asInstanceOf[js.Promise[Unit]]
  inline def createPresentation(base64File: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")(base64File.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    batch: js.Function1[
      /* context */ typingsJapgolly.officeJsPreview.PowerPoint.RequestContext, 
      js.Promise[T]
    ]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[
      /* context */ typingsJapgolly.officeJsPreview.PowerPoint.RequestContext, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[
      /* context */ typingsJapgolly.officeJsPreview.PowerPoint.RequestContext, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
