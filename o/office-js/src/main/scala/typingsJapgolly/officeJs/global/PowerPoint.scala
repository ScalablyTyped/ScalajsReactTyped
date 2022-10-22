package typingsJapgolly.officeJs.global

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
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
       with typingsJapgolly.officeJs.PowerPoint.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    /* CompleteClass */
    @JSName("context")
    var context_Application: typingsJapgolly.officeJs.PowerPoint.RequestContext = js.native
    
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
    inline def newObject(context: ClientRequestContext): typingsJapgolly.officeJs.PowerPoint.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.officeJs.PowerPoint.Application]
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
       with typingsJapgolly.officeJs.PowerPoint.BulletFormat {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ConnectorType & String] = js.native
    
    /* "Curve" */ val curve: typingsJapgolly.officeJs.PowerPoint.ConnectorType.curve & String = js.native
    
    /* "Elbow" */ val elbow: typingsJapgolly.officeJs.PowerPoint.ConnectorType.elbow & String = js.native
    
    /* "Straight" */ val straight: typingsJapgolly.officeJs.PowerPoint.ConnectorType.straight & String = js.native
  }
  
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ErrorCodes & String] = js.native
    
    /* "GeneralException" */ val generalException: typingsJapgolly.officeJs.PowerPoint.ErrorCodes.generalException & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.GeometricShapeType & String] = js.native
    
    /* "AccentBorderCallout1" */ val accentBorderCallout1: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout1 & String = js.native
    
    /* "AccentBorderCallout2" */ val accentBorderCallout2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout2 & String = js.native
    
    /* "AccentBorderCallout3" */ val accentBorderCallout3: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout3 & String = js.native
    
    /* "AccentCallout1" */ val accentCallout1: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentCallout1 & String = js.native
    
    /* "AccentCallout2" */ val accentCallout2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentCallout2 & String = js.native
    
    /* "AccentCallout3" */ val accentCallout3: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.accentCallout3 & String = js.native
    
    /* "ActionButtonBackPrevious" */ val actionButtonBackPrevious: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonBackPrevious & String = js.native
    
    /* "ActionButtonBeginning" */ val actionButtonBeginning: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonBeginning & String = js.native
    
    /* "ActionButtonBlank" */ val actionButtonBlank: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonBlank & String = js.native
    
    /* "ActionButtonDocument" */ val actionButtonDocument: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonDocument & String = js.native
    
    /* "ActionButtonEnd" */ val actionButtonEnd: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonEnd & String = js.native
    
    /* "ActionButtonForwardNext" */ val actionButtonForwardNext: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonForwardNext & String = js.native
    
    /* "ActionButtonHelp" */ val actionButtonHelp: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonHelp & String = js.native
    
    /* "ActionButtonHome" */ val actionButtonHome: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonHome & String = js.native
    
    /* "ActionButtonInformation" */ val actionButtonInformation: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonInformation & String = js.native
    
    /* "ActionButtonMovie" */ val actionButtonMovie: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonMovie & String = js.native
    
    /* "ActionButtonReturn" */ val actionButtonReturn: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonReturn & String = js.native
    
    /* "ActionButtonSound" */ val actionButtonSound: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.actionButtonSound & String = js.native
    
    /* "Arc" */ val arc: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.arc & String = js.native
    
    /* "BentArrow" */ val bentArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.bentArrow & String = js.native
    
    /* "BentUpArrow" */ val bentUpArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.bentUpArrow & String = js.native
    
    /* "Bevel" */ val bevel: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.bevel & String = js.native
    
    /* "BlockArc" */ val blockArc: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.blockArc & String = js.native
    
    /* "BorderCallout1" */ val borderCallout1: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.borderCallout1 & String = js.native
    
    /* "BorderCallout2" */ val borderCallout2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.borderCallout2 & String = js.native
    
    /* "BorderCallout3" */ val borderCallout3: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.borderCallout3 & String = js.native
    
    /* "BracePair" */ val bracePair: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.bracePair & String = js.native
    
    /* "BracketPair" */ val bracketPair: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.bracketPair & String = js.native
    
    /* "Callout1" */ val callout1: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.callout1 & String = js.native
    
    /* "Callout2" */ val callout2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.callout2 & String = js.native
    
    /* "Callout3" */ val callout3: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.callout3 & String = js.native
    
    /* "Can" */ val can: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.can & String = js.native
    
    /* "ChartPlus" */ val chartPlus: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.chartPlus & String = js.native
    
    /* "ChartStar" */ val chartStar: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.chartStar & String = js.native
    
    /* "ChartX" */ val chartX: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.chartX & String = js.native
    
    /* "Chevron" */ val chevron: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.chevron & String = js.native
    
    /* "Chord" */ val chord: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.chord & String = js.native
    
    /* "CircularArrow" */ val circularArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.circularArrow & String = js.native
    
    /* "Cloud" */ val cloud: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.cloud & String = js.native
    
    /* "CloudCallout" */ val cloudCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.cloudCallout & String = js.native
    
    /* "Corner" */ val corner: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.corner & String = js.native
    
    /* "CornerTabs" */ val cornerTabs: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.cornerTabs & String = js.native
    
    /* "Cube" */ val cube: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.cube & String = js.native
    
    /* "CurvedDownArrow" */ val curvedDownArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.curvedDownArrow & String = js.native
    
    /* "CurvedLeftArrow" */ val curvedLeftArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.curvedLeftArrow & String = js.native
    
    /* "CurvedRightArrow" */ val curvedRightArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.curvedRightArrow & String = js.native
    
    /* "CurvedUpArrow" */ val curvedUpArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.curvedUpArrow & String = js.native
    
    /* "Decagon" */ val decagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.decagon & String = js.native
    
    /* "DiagonalStripe" */ val diagonalStripe: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.diagonalStripe & String = js.native
    
    /* "Diamond" */ val diamond: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.diamond & String = js.native
    
    /* "Dodecagon" */ val dodecagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.dodecagon & String = js.native
    
    /* "Donut" */ val donut: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.donut & String = js.native
    
    /* "DoubleWave" */ val doubleWave: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.doubleWave & String = js.native
    
    /* "DownArrow" */ val downArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.downArrow & String = js.native
    
    /* "DownArrowCallout" */ val downArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.downArrowCallout & String = js.native
    
    /* "Ellipse" */ val ellipse: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.ellipse & String = js.native
    
    /* "EllipseRibbon" */ val ellipseRibbon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.ellipseRibbon & String = js.native
    
    /* "EllipseRibbon2" */ val ellipseRibbon2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.ellipseRibbon2 & String = js.native
    
    /* "FlowChartAlternateProcess" */ val flowChartAlternateProcess: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartAlternateProcess & String = js.native
    
    /* "FlowChartCollate" */ val flowChartCollate: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartCollate & String = js.native
    
    /* "FlowChartConnector" */ val flowChartConnector: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartConnector & String = js.native
    
    /* "FlowChartDecision" */ val flowChartDecision: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartDecision & String = js.native
    
    /* "FlowChartDelay" */ val flowChartDelay: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartDelay & String = js.native
    
    /* "FlowChartDisplay" */ val flowChartDisplay: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartDisplay & String = js.native
    
    /* "FlowChartDocument" */ val flowChartDocument: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartDocument & String = js.native
    
    /* "FlowChartExtract" */ val flowChartExtract: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartExtract & String = js.native
    
    /* "FlowChartInputOutput" */ val flowChartInputOutput: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartInputOutput & String = js.native
    
    /* "FlowChartInternalStorage" */ val flowChartInternalStorage: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartInternalStorage & String = js.native
    
    /* "FlowChartMagneticDisk" */ val flowChartMagneticDisk: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticDisk & String = js.native
    
    /* "FlowChartMagneticDrum" */ val flowChartMagneticDrum: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticDrum & String = js.native
    
    /* "FlowChartMagneticTape" */ val flowChartMagneticTape: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticTape & String = js.native
    
    /* "FlowChartManualInput" */ val flowChartManualInput: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartManualInput & String = js.native
    
    /* "FlowChartManualOperation" */ val flowChartManualOperation: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartManualOperation & String = js.native
    
    /* "FlowChartMerge" */ val flowChartMerge: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartMerge & String = js.native
    
    /* "FlowChartMultidocument" */ val flowChartMultidocument: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartMultidocument & String = js.native
    
    /* "FlowChartOfflineStorage" */ val flowChartOfflineStorage: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartOfflineStorage & String = js.native
    
    /* "FlowChartOffpageConnector" */ val flowChartOffpageConnector: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartOffpageConnector & String = js.native
    
    /* "FlowChartOnlineStorage" */ val flowChartOnlineStorage: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartOnlineStorage & String = js.native
    
    /* "FlowChartOr" */ val flowChartOr: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartOr & String = js.native
    
    /* "FlowChartPredefinedProcess" */ val flowChartPredefinedProcess: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartPredefinedProcess & String = js.native
    
    /* "FlowChartPreparation" */ val flowChartPreparation: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartPreparation & String = js.native
    
    /* "FlowChartProcess" */ val flowChartProcess: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartProcess & String = js.native
    
    /* "FlowChartPunchedCard" */ val flowChartPunchedCard: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartPunchedCard & String = js.native
    
    /* "FlowChartPunchedTape" */ val flowChartPunchedTape: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartPunchedTape & String = js.native
    
    /* "FlowChartSort" */ val flowChartSort: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartSort & String = js.native
    
    /* "FlowChartSummingJunction" */ val flowChartSummingJunction: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartSummingJunction & String = js.native
    
    /* "FlowChartTerminator" */ val flowChartTerminator: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.flowChartTerminator & String = js.native
    
    /* "FoldedCorner" */ val foldedCorner: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.foldedCorner & String = js.native
    
    /* "Frame" */ val frame: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.frame & String = js.native
    
    /* "Funnel" */ val funnel: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.funnel & String = js.native
    
    /* "Gear6" */ val gear6: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.gear6 & String = js.native
    
    /* "Gear9" */ val gear9: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.gear9 & String = js.native
    
    /* "HalfFrame" */ val halfFrame: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.halfFrame & String = js.native
    
    /* "Heart" */ val heart: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.heart & String = js.native
    
    /* "Heptagon" */ val heptagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.heptagon & String = js.native
    
    /* "Hexagon" */ val hexagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.hexagon & String = js.native
    
    /* "HomePlate" */ val homePlate: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.homePlate & String = js.native
    
    /* "HorizontalScroll" */ val horizontalScroll: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.horizontalScroll & String = js.native
    
    /* "IrregularSeal1" */ val irregularSeal1: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.irregularSeal1 & String = js.native
    
    /* "IrregularSeal2" */ val irregularSeal2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.irregularSeal2 & String = js.native
    
    /* "LeftArrow" */ val leftArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftArrow & String = js.native
    
    /* "LeftArrowCallout" */ val leftArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftArrowCallout & String = js.native
    
    /* "LeftBrace" */ val leftBrace: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftBrace & String = js.native
    
    /* "LeftBracket" */ val leftBracket: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftBracket & String = js.native
    
    /* "LeftCircularArrow" */ val leftCircularArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftCircularArrow & String = js.native
    
    /* "LeftRightArrow" */ val leftRightArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftRightArrow & String = js.native
    
    /* "LeftRightArrowCallout" */ val leftRightArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftRightArrowCallout & String = js.native
    
    /* "LeftRightCircularArrow" */ val leftRightCircularArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftRightCircularArrow & String = js.native
    
    /* "LeftRightRibbon" */ val leftRightRibbon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftRightRibbon & String = js.native
    
    /* "LeftRightUpArrow" */ val leftRightUpArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftRightUpArrow & String = js.native
    
    /* "LeftUpArrow" */ val leftUpArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.leftUpArrow & String = js.native
    
    /* "LightningBolt" */ val lightningBolt: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.lightningBolt & String = js.native
    
    /* "LineInverse" */ val lineInverse: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.lineInverse & String = js.native
    
    /* "MathDivide" */ val mathDivide: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathDivide & String = js.native
    
    /* "MathEqual" */ val mathEqual: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathEqual & String = js.native
    
    /* "MathMinus" */ val mathMinus: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathMinus & String = js.native
    
    /* "MathMultiply" */ val mathMultiply: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathMultiply & String = js.native
    
    /* "MathNotEqual" */ val mathNotEqual: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathNotEqual & String = js.native
    
    /* "MathPlus" */ val mathPlus: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.mathPlus & String = js.native
    
    /* "Moon" */ val moon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.moon & String = js.native
    
    /* "NoSmoking" */ val noSmoking: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.noSmoking & String = js.native
    
    /* "NonIsoscelesTrapezoid" */ val nonIsoscelesTrapezoid: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.nonIsoscelesTrapezoid & String = js.native
    
    /* "NotchedRightArrow" */ val notchedRightArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.notchedRightArrow & String = js.native
    
    /* "Octagon" */ val octagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.octagon & String = js.native
    
    /* "Parallelogram" */ val parallelogram: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.parallelogram & String = js.native
    
    /* "Pentagon" */ val pentagon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.pentagon & String = js.native
    
    /* "Pie" */ val pie: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.pie & String = js.native
    
    /* "PieWedge" */ val pieWedge: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.pieWedge & String = js.native
    
    /* "Plaque" */ val plaque: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.plaque & String = js.native
    
    /* "PlaqueTabs" */ val plaqueTabs: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.plaqueTabs & String = js.native
    
    /* "Plus" */ val plus: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.plus & String = js.native
    
    /* "QuadArrow" */ val quadArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.quadArrow & String = js.native
    
    /* "QuadArrowCallout" */ val quadArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.quadArrowCallout & String = js.native
    
    /* "Rectangle" */ val rectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rectangle & String = js.native
    
    /* "Ribbon" */ val ribbon: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.ribbon & String = js.native
    
    /* "Ribbon2" */ val ribbon2: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.ribbon2 & String = js.native
    
    /* "RightArrow" */ val rightArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rightArrow & String = js.native
    
    /* "RightArrowCallout" */ val rightArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rightArrowCallout & String = js.native
    
    /* "RightBrace" */ val rightBrace: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rightBrace & String = js.native
    
    /* "RightBracket" */ val rightBracket: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rightBracket & String = js.native
    
    /* "RightTriangle" */ val rightTriangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.rightTriangle & String = js.native
    
    /* "Round1Rectangle" */ val round1Rectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.round1Rectangle & String = js.native
    
    /* "Round2DiagonalRectangle" */ val round2DiagonalRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.round2DiagonalRectangle & String = js.native
    
    /* "Round2SameRectangle" */ val round2SameRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.round2SameRectangle & String = js.native
    
    /* "RoundRectangle" */ val roundRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.roundRectangle & String = js.native
    
    /* "SmileyFace" */ val smileyFace: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.smileyFace & String = js.native
    
    /* "Snip1Rectangle" */ val snip1Rectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.snip1Rectangle & String = js.native
    
    /* "Snip2DiagonalRectangle" */ val snip2DiagonalRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.snip2DiagonalRectangle & String = js.native
    
    /* "Snip2SameRectangle" */ val snip2SameRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.snip2SameRectangle & String = js.native
    
    /* "SnipRoundRectangle" */ val snipRoundRectangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.snipRoundRectangle & String = js.native
    
    /* "SquareTabs" */ val squareTabs: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.squareTabs & String = js.native
    
    /* "Star10" */ val star10: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star10 & String = js.native
    
    /* "Star12" */ val star12: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star12 & String = js.native
    
    /* "Star16" */ val star16: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star16 & String = js.native
    
    /* "Star24" */ val star24: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star24 & String = js.native
    
    /* "Star32" */ val star32: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star32 & String = js.native
    
    /* "Star4" */ val star4: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star4 & String = js.native
    
    /* "Star5" */ val star5: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star5 & String = js.native
    
    /* "Star6" */ val star6: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star6 & String = js.native
    
    /* "Star7" */ val star7: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star7 & String = js.native
    
    /* "Star8" */ val star8: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.star8 & String = js.native
    
    /* "StripedRightArrow" */ val stripedRightArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.stripedRightArrow & String = js.native
    
    /* "Sun" */ val sun: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.sun & String = js.native
    
    /* "SwooshArrow" */ val swooshArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.swooshArrow & String = js.native
    
    /* "Teardrop" */ val teardrop: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.teardrop & String = js.native
    
    /* "Trapezoid" */ val trapezoid: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.trapezoid & String = js.native
    
    /* "Triangle" */ val triangle: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.triangle & String = js.native
    
    /* "UpArrow" */ val upArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.upArrow & String = js.native
    
    /* "UpArrowCallout" */ val upArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.upArrowCallout & String = js.native
    
    /* "UpDownArrow" */ val upDownArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.upDownArrow & String = js.native
    
    /* "UpDownArrowCallout" */ val upDownArrowCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.upDownArrowCallout & String = js.native
    
    /* "UturnArrow" */ val uturnArrow: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.uturnArrow & String = js.native
    
    /* "VerticalScroll" */ val verticalScroll: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.verticalScroll & String = js.native
    
    /* "Wave" */ val wave: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.wave & String = js.native
    
    /* "WedgeEllipseCallout" */ val wedgeEllipseCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.wedgeEllipseCallout & String = js.native
    
    /* "WedgeRRectCallout" */ val wedgeRRectCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.wedgeRRectCallout & String = js.native
    
    /* "WedgeRectCallout" */ val wedgeRectCallout: typingsJapgolly.officeJs.PowerPoint.GeometricShapeType.wedgeRectCallout & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.InsertSlideFormatting & String] = js.native
    
    /* "KeepSourceFormatting" */ val keepSourceFormatting: typingsJapgolly.officeJs.PowerPoint.InsertSlideFormatting.keepSourceFormatting & String = js.native
    
    /* "UseDestinationTheme" */ val useDestinationTheme: typingsJapgolly.officeJs.PowerPoint.InsertSlideFormatting.useDestinationTheme & String = js.native
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
       with typingsJapgolly.officeJs.PowerPoint.ParagraphFormat {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.center & String = js.native
    
    /* "Distributed" */ val distributed: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.distributed & String = js.native
    
    /* "Justify" */ val justify: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.justify & String = js.native
    
    /* "JustifyLow" */ val justifyLow: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.justifyLow & String = js.native
    
    /* "Left" */ val left: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.right & String = js.native
    
    /* "ThaiDistributed" */ val thaiDistributed: typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment.thaiDistributed & String = js.native
  }
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Presentation")
  @js.native
  open class Presentation ()
    extends StObject
       with typingsJapgolly.officeJs.PowerPoint.Presentation {
    
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
       with typingsJapgolly.officeJs.PowerPoint.RequestContext {
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
       with typingsJapgolly.officeJs.PowerPoint.Shape {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeAutoSize & String] = js.native
    
    /* "AutoSizeMixed" */ val autoSizeMixed: typingsJapgolly.officeJs.PowerPoint.ShapeAutoSize.autoSizeMixed & String = js.native
    
    /* "AutoSizeNone" */ val autoSizeNone: typingsJapgolly.officeJs.PowerPoint.ShapeAutoSize.autoSizeNone & String = js.native
    
    /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typingsJapgolly.officeJs.PowerPoint.ShapeAutoSize.autoSizeShapeToFitText & String = js.native
    
    /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typingsJapgolly.officeJs.PowerPoint.ShapeAutoSize.autoSizeTextToFitShape & String = js.native
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
       with typingsJapgolly.officeJs.PowerPoint.ShapeCollection {
    
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
       with typingsJapgolly.officeJs.PowerPoint.ShapeFill {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeFillType & String] = js.native
    
    /* "Gradient" */ val gradient: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.gradient & String = js.native
    
    /* "NoFill" */ val noFill: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.noFill & String = js.native
    
    /* "Pattern" */ val pattern: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.pattern & String = js.native
    
    /* "PictureAndTexture" */ val pictureAndTexture: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.pictureAndTexture & String = js.native
    
    /* "SlideBackground" */ val slideBackground: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.slideBackground & String = js.native
    
    /* "Solid" */ val solid: typingsJapgolly.officeJs.PowerPoint.ShapeFillType.solid & String = js.native
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
       with typingsJapgolly.officeJs.PowerPoint.ShapeFont {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle & String] = js.native
    
    /* "Dash" */ val dash: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dash & String = js.native
    
    /* "DashHeavy" */ val dashHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashHeavy & String = js.native
    
    /* "DashLong" */ val dashLong: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashLong & String = js.native
    
    /* "DashLongHeavy" */ val dashLongHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashLongHeavy & String = js.native
    
    /* "DotDash" */ val dotDash: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDash & String = js.native
    
    /* "DotDashHeavy" */ val dotDashHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDashHeavy & String = js.native
    
    /* "DotDotDash" */ val dotDotDash: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDotDash & String = js.native
    
    /* "DotDotDashHeavy" */ val dotDotDashHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDotDashHeavy & String = js.native
    
    /* "Dotted" */ val dotted: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotted & String = js.native
    
    /* "DottedHeavy" */ val dottedHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.dottedHeavy & String = js.native
    
    /* "Double" */ val double: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.double & String = js.native
    
    /* "Heavy" */ val heavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.heavy & String = js.native
    
    /* "None" */ val none: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.none & String = js.native
    
    /* "Single" */ val single: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.single & String = js.native
    
    /* "Wavy" */ val wavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavy & String = js.native
    
    /* "WavyDouble" */ val wavyDouble: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavyDouble & String = js.native
    
    /* "WavyHeavy" */ val wavyHeavy: typingsJapgolly.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavyHeavy & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle & String] = js.native
    
    /* "Dash" */ val dash: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.dash & String = js.native
    
    /* "DashDot" */ val dashDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.dashDot & String = js.native
    
    /* "DashDotDot" */ val dashDotDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.dashDotDot & String = js.native
    
    /* "LongDash" */ val longDash: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.longDash & String = js.native
    
    /* "LongDashDot" */ val longDashDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.longDashDot & String = js.native
    
    /* "LongDashDotDot" */ val longDashDotDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.longDashDotDot & String = js.native
    
    /* "RoundDot" */ val roundDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.roundDot & String = js.native
    
    /* "Solid" */ val solid: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.solid & String = js.native
    
    /* "SquareDot" */ val squareDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.squareDot & String = js.native
    
    /* "SystemDash" */ val systemDash: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.systemDash & String = js.native
    
    /* "SystemDashDot" */ val systemDashDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.systemDashDot & String = js.native
    
    /* "SystemDot" */ val systemDot: typingsJapgolly.officeJs.PowerPoint.ShapeLineDashStyle.systemDot & String = js.native
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
       with typingsJapgolly.officeJs.PowerPoint.ShapeLineFormat {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle & String] = js.native
    
    /* "Single" */ val single: typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle.single & String = js.native
    
    /* "ThickBetweenThin" */ val thickBetweenThin: typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle.thickBetweenThin & String = js.native
    
    /* "ThickThin" */ val thickThin: typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle.thickThin & String = js.native
    
    /* "ThinThick" */ val thinThick: typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle.thinThick & String = js.native
    
    /* "ThinThin" */ val thinThin: typingsJapgolly.officeJs.PowerPoint.ShapeLineStyle.thinThin & String = js.native
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.ShapeType & String] = js.native
    
    /* "GeometricShape" */ val geometricShape: typingsJapgolly.officeJs.PowerPoint.ShapeType.geometricShape & String = js.native
    
    /* "Group" */ val group: typingsJapgolly.officeJs.PowerPoint.ShapeType.group & String = js.native
    
    /* "Image" */ val image: typingsJapgolly.officeJs.PowerPoint.ShapeType.image & String = js.native
    
    /* "Line" */ val line: typingsJapgolly.officeJs.PowerPoint.ShapeType.line & String = js.native
    
    /* "Unsupported" */ val unsupported: typingsJapgolly.officeJs.PowerPoint.ShapeType.unsupported & String = js.native
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
       with typingsJapgolly.officeJs.PowerPoint.Slide {
    
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
       with typingsJapgolly.officeJs.PowerPoint.SlideCollection {
    
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
       with typingsJapgolly.officeJs.PowerPoint.SlideLayout {
    
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
       with typingsJapgolly.officeJs.PowerPoint.SlideLayoutCollection {
    
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
       with typingsJapgolly.officeJs.PowerPoint.SlideMaster {
    
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
       with typingsJapgolly.officeJs.PowerPoint.SlideMasterCollection {
    
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
       with typingsJapgolly.officeJs.PowerPoint.Tag {
    
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
       with typingsJapgolly.officeJs.PowerPoint.TagCollection {
    
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
       with typingsJapgolly.officeJs.PowerPoint.TextFrame {
    
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
       with typingsJapgolly.officeJs.PowerPoint.TextRange {
    
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
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.bottom & String = js.native
    
    /* "BottomCentered" */ val bottomCentered: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.bottomCentered & String = js.native
    
    /* "Middle" */ val middle: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.middle & String = js.native
    
    /* "MiddleCentered" */ val middleCentered: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.middleCentered & String = js.native
    
    /* "Top" */ val top: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.top & String = js.native
    
    /* "TopCentered" */ val topCentered: typingsJapgolly.officeJs.PowerPoint.TextVerticalAlignment.topCentered & String = js.native
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
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typingsJapgolly.officeJs.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
