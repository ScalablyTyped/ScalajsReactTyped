package typingsJapgolly.nginstackWebFramework

import typingsJapgolly.nginstackWebFramework.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutColumnMod {
  
  inline def apply(simpleLayout: typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^, name: String): Unit = (^.asInstanceOf[js.Dynamic].apply(simpleLayout.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    simpleLayout: typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^,
    name: String,
    options: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(simpleLayout.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/Column", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Column {
    def this(simpleLayout: typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^, name: String) = this()
    def this(
      simpleLayout: typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^,
      name: String,
      options: Any
    ) = this()
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AngleFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_AngleFormat */ Any
  
  @js.native
  trait Column extends StObject {
    
    /* private */ var _defineLinks: Any = js.native
    
    /* private */ var _getLinkParameters: Any = js.native
    
    /* private */ var _writingTotal: Any = js.native
    
    /* private */ var accumulate: Any = js.native
    
    /* private */ var accumulator: Any = js.native
    
    /* private */ var accumulatorCount: Any = js.native
    
    var breakLine: Boolean = js.native
    
    /* private */ var bufferStartIndexToMerge_ : Any = js.native
    
    /* private */ var canHaveGlobalActions: Any = js.native
    
    def checkIfMerge(values: Content): Boolean = js.native
    
    var classKey: Double = js.native
    
    /* private */ var colspan: Any = js.native
    
    var column: Double = js.native
    
    var columnGroup: typingsJapgolly.nginstackWebFramework.libSimpleLayoutColumnGroupMod.^ = js.native
    
    var columnGroupHeaderClass: String = js.native
    
    /* private */ var createAccumulators: Any = js.native
    
    var css: String = js.native
    
    var cssClass: String = js.native
    
    /* private */ var cssExtractor_ : Any = js.native
    
    var decimalPrecision: Double = js.native
    
    /* private */ var definedCssClasses_ : Any = js.native
    
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null = js.native
    
    /* private */ var gId: Any = js.native
    
    /* private */ var gIndex: Any = js.native
    
    /* private */ var gSeq: Any = js.native
    
    def getAccumulator(index: Double): Any = js.native
    
    /* private */ var getAccumulatorLength: Any = js.native
    
    /* private */ var getCSSClassesFromType_ : Any = js.native
    
    /* private */ var getCSSClasses_ : Any = js.native
    
    /* private */ var getContentToWrite_ : Any = js.native
    
    /* private */ var getCssClassAttribute_ : Any = js.native
    
    def getGlobalActionClassKey(): Double = js.native
    def getGlobalActionClassKey(opt_key: Double): Double = js.native
    
    def getGlobalActionRegisterKey(): Double | Null = js.native
    def getGlobalActionRegisterKey(opt_key: Double): Double | Null = js.native
    
    /* private */ var getHtmlForLinks_ : Any = js.native
    
    /* private */ var group: Any = js.native
    
    /* private */ var hasGlobalActions_ : Any = js.native
    
    /* private */ var hasLinks_ : Any = js.native
    
    /* private */ var hasType: Any = js.native
    
    var height: Double | String | Null = js.native
    
    var hint: String = js.native
    
    var label: String = js.native
    
    var labelCssClass: String = js.native
    
    var lastContent: String | Double | js.Date = js.native
    
    /* private */ var lastGroups_ : Any = js.native
    
    /* private */ var lastValue_ : Any = js.native
    
    var link: Link = js.native
    
    var links: typingsJapgolly.nginstackWebFramework.libAnchorAnchorCollectionMod.^ = js.native
    
    var lookupType: Double = js.native
    
    var mergeDuplicatedValues: Boolean = js.native
    
    /* private */ var mergeRecordCount_ : Any = js.native
    
    var name: String = js.native
    
    var negativeInRed: Boolean = js.native
    
    /* private */ var numberFormatter_ : Any = js.native
    
    var onTotal: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    /* private */ var remainContent: Any = js.native
    
    /* private */ var remainHeaderContent: Any = js.native
    
    /* private */ var resetAccumulator: Any = js.native
    
    /* private */ var resizeAccumulators: Any = js.native
    
    def setCssExtractor(value: typingsJapgolly.nginstackWebFramework.libCssCssExtractorMod.^): Unit = js.native
    
    var showGlobalActions: Boolean = js.native
    
    var showTotal: Boolean = js.native
    
    var showTotalLabel: Boolean = js.native
    
    var simpleLayout: typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^ = js.native
    
    var textAlign: String = js.native
    
    var totalContent: String = js.native
    
    var totalLabel: String = js.native
    
    var `type`: String | Null = js.native
    
    var verticalAlign: String = js.native
    
    var visible: Boolean = js.native
    
    var width: Double | String | Null = js.native
    
    var wordWrap: Boolean = js.native
    
    /* private */ var write: Any = js.native
    
    var writeLinkPerRecord: Boolean = js.native
    
    /* private */ var writeTotal: Any = js.native
    
    var zoomMaxHeight: Double | String = js.native
    
    var zoomMaxWidth: Double | String = js.native
    
    var zoomOnHover: Boolean = js.native
  }
  
  type DateFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateFormat */ Any
  
  type LatitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LatitudeFormat */ Any
  
  type Link = typingsJapgolly.nginstackWebFramework.libAnchorLinkMod.^
  
  type LongitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LongitudeFormat */ Any
  
  type TextAligns = String
  
  type VerticalAligns = String
}
