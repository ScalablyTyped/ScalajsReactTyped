package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackWebFramework.anon.GetRawDataExporter
import typingsJapgolly.nginstackWebFramework.anon.UseRawData
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/Visualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Visualization {
    def this(definition: Any) = this()
    
    /* protected */ /* CompleteClass */
    override def afterCreate_(): Unit = js.native
    
    /* CompleteClass */
    var canExport: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var canExport_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    var dataSource_ : DataSource = js.native
    
    /* protected */ /* CompleteClass */
    var ds_ : DataSet = js.native
    
    /* CompleteClass */
    var extraExportFormats: js.Array[UseRawData] = js.native
    
    /* CompleteClass */
    var filters: VisualizationFilters = js.native
    
    /* CompleteClass */
    var footer: typingsJapgolly.nginstackWebFramework.libSimpleLayoutFooterMod.^ = js.native
    
    /* CompleteClass */
    override def getDataToExport(filterValues: Record[String, Any]): scala.Nothing = js.native
    
    /* CompleteClass */
    override def getExportableData(): js.Array[GetRawDataExporter] = js.native
    
    /* CompleteClass */
    override def hasData(): Boolean = js.native
    
    /* CompleteClass */
    var header: typingsJapgolly.nginstackWebFramework.libSimpleLayoutHeaderMod.^ = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var includes: js.Array[Double | String] = js.native
    
    /* protected */ /* CompleteClass */
    override def initFilters_(): scala.Nothing = js.native
    
    /* CompleteClass */
    var initialized: Boolean = js.native
    
    /* CompleteClass */
    var messageWhenEmpty: String = js.native
    
    /* CompleteClass */
    var mustIncludeCssFiles: Boolean = js.native
    
    /* CompleteClass */
    var onCreate: Event = js.native
    
    /* CompleteClass */
    var path: String | Null = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareFooterFromDefinition_(): Unit = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareHeaderFromDefinition_(): Unit = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareSegmentFromDefinition_(segment: Any, definition: Any, properties: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def queryData(filterValues: Record[String, Any]): scala.Nothing = js.native
    
    /* CompleteClass */
    override def render(outputObj: Any): scala.Nothing = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* private */ /* CompleteClass */
    var viewDefs_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/Visualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataExporter = typingsJapgolly.nginstackWebFramework.libExportDataExporterMod.^
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  
  type DataSource = typingsJapgolly.nginstackDatasource.libDataSourceMod.^
  
  type Event = typingsJapgolly.nginstackEngine.libEventEventMod.^
  
  trait Visualization extends StObject {
    
    /* protected */ def afterCreate_(): Unit
    
    var canExport: Boolean
    
    /* private */ var canExport_ : Any
    
    /* protected */ var dataSource_ : DataSource
    
    /* protected */ var ds_ : DataSet
    
    var extraExportFormats: js.Array[UseRawData]
    
    var filters: VisualizationFilters
    
    var footer: typingsJapgolly.nginstackWebFramework.libSimpleLayoutFooterMod.^
    
    def getDataToExport(filterValues: Record[String, Any]): scala.Nothing
    
    def getExportableData(): js.Array[GetRawDataExporter]
    
    def hasData(): Boolean
    
    var header: typingsJapgolly.nginstackWebFramework.libSimpleLayoutHeaderMod.^
    
    var help: String
    
    var includes: js.Array[Double | String]
    
    /* protected */ def initFilters_(): scala.Nothing
    
    var initialized: Boolean
    
    var messageWhenEmpty: String
    
    var mustIncludeCssFiles: Boolean
    
    var onCreate: Event
    
    var path: String | Null
    
    /* protected */ def prepareFooterFromDefinition_(): Unit
    
    /* protected */ def prepareHeaderFromDefinition_(): Unit
    
    /* protected */ def prepareSegmentFromDefinition_(segment: Any, definition: Any, properties: js.Array[String]): Unit
    
    def queryData(filterValues: Record[String, Any]): scala.Nothing
    
    def render(outputObj: Any): scala.Nothing
    
    var title: String
    
    /* private */ var viewDefs_ : Any
  }
  object Visualization {
    
    inline def apply(
      afterCreate_ : Callback,
      canExport: Boolean,
      canExport_ : Any,
      dataSource_ : DataSource,
      ds_ : DataSet,
      extraExportFormats: js.Array[UseRawData],
      filters: VisualizationFilters,
      footer: typingsJapgolly.nginstackWebFramework.libSimpleLayoutFooterMod.^,
      getDataToExport: Record[String, Any] => scala.Nothing,
      getExportableData: CallbackTo[js.Array[GetRawDataExporter]],
      hasData: CallbackTo[Boolean],
      header: typingsJapgolly.nginstackWebFramework.libSimpleLayoutHeaderMod.^,
      help: String,
      includes: js.Array[Double | String],
      initFilters_ : CallbackTo[scala.Nothing],
      initialized: Boolean,
      messageWhenEmpty: String,
      mustIncludeCssFiles: Boolean,
      onCreate: Event,
      prepareFooterFromDefinition_ : Callback,
      prepareHeaderFromDefinition_ : Callback,
      prepareSegmentFromDefinition_ : (Any, Any, js.Array[String]) => Callback,
      queryData: Record[String, Any] => scala.Nothing,
      render: Any => scala.Nothing,
      title: String,
      viewDefs_ : Any
    ): Visualization = {
      val __obj = js.Dynamic.literal(afterCreate_ = afterCreate_.toJsFn, canExport = canExport.asInstanceOf[js.Any], canExport_ = canExport_.asInstanceOf[js.Any], dataSource_ = dataSource_.asInstanceOf[js.Any], ds_ = ds_.asInstanceOf[js.Any], extraExportFormats = extraExportFormats.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], getDataToExport = js.Any.fromFunction1(getDataToExport), getExportableData = getExportableData.toJsFn, hasData = hasData.toJsFn, header = header.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], initFilters_ = initFilters_.toJsFn, initialized = initialized.asInstanceOf[js.Any], messageWhenEmpty = messageWhenEmpty.asInstanceOf[js.Any], mustIncludeCssFiles = mustIncludeCssFiles.asInstanceOf[js.Any], onCreate = onCreate.asInstanceOf[js.Any], prepareFooterFromDefinition_ = prepareFooterFromDefinition_.toJsFn, prepareHeaderFromDefinition_ = prepareHeaderFromDefinition_.toJsFn, prepareSegmentFromDefinition_ = js.Any.fromFunction3((t0: Any, t1: Any, t2: js.Array[String]) => (prepareSegmentFromDefinition_(t0, t1, t2)).runNow()), queryData = js.Any.fromFunction1(queryData), render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any], viewDefs_ = viewDefs_.asInstanceOf[js.Any], path = null)
      __obj.asInstanceOf[Visualization]
    }
    
    extension [Self <: Visualization](x: Self) {
      
      inline def setAfterCreate_(value: Callback): Self = StObject.set(x, "afterCreate_", value.toJsFn)
      
      inline def setCanExport(value: Boolean): Self = StObject.set(x, "canExport", value.asInstanceOf[js.Any])
      
      inline def setCanExport_(value: Any): Self = StObject.set(x, "canExport_", value.asInstanceOf[js.Any])
      
      inline def setDataSource_(value: DataSource): Self = StObject.set(x, "dataSource_", value.asInstanceOf[js.Any])
      
      inline def setDs_(value: DataSet): Self = StObject.set(x, "ds_", value.asInstanceOf[js.Any])
      
      inline def setExtraExportFormats(value: js.Array[UseRawData]): Self = StObject.set(x, "extraExportFormats", value.asInstanceOf[js.Any])
      
      inline def setExtraExportFormatsVarargs(value: UseRawData*): Self = StObject.set(x, "extraExportFormats", js.Array(value*))
      
      inline def setFilters(value: VisualizationFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: typingsJapgolly.nginstackWebFramework.libSimpleLayoutFooterMod.^): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setGetDataToExport(value: Record[String, Any] => scala.Nothing): Self = StObject.set(x, "getDataToExport", js.Any.fromFunction1(value))
      
      inline def setGetExportableData(value: CallbackTo[js.Array[GetRawDataExporter]]): Self = StObject.set(x, "getExportableData", value.toJsFn)
      
      inline def setHasData(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasData", value.toJsFn)
      
      inline def setHeader(value: typingsJapgolly.nginstackWebFramework.libSimpleLayoutHeaderMod.^): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setIncludes(value: js.Array[Double | String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: (Double | String)*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setInitFilters_(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "initFilters_", value.toJsFn)
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setMessageWhenEmpty(value: String): Self = StObject.set(x, "messageWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setMustIncludeCssFiles(value: Boolean): Self = StObject.set(x, "mustIncludeCssFiles", value.asInstanceOf[js.Any])
      
      inline def setOnCreate(value: Event): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPrepareFooterFromDefinition_(value: Callback): Self = StObject.set(x, "prepareFooterFromDefinition_", value.toJsFn)
      
      inline def setPrepareHeaderFromDefinition_(value: Callback): Self = StObject.set(x, "prepareHeaderFromDefinition_", value.toJsFn)
      
      inline def setPrepareSegmentFromDefinition_(value: (Any, Any, js.Array[String]) => Callback): Self = StObject.set(x, "prepareSegmentFromDefinition_", js.Any.fromFunction3((t0: Any, t1: Any, t2: js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setQueryData(value: Record[String, Any] => scala.Nothing): Self = StObject.set(x, "queryData", js.Any.fromFunction1(value))
      
      inline def setRender(value: Any => scala.Nothing): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setViewDefs_(value: Any): Self = StObject.set(x, "viewDefs_", value.asInstanceOf[js.Any])
    }
  }
  
  type VisualizationFilters = typingsJapgolly.nginstackWebFramework.libDsvVisualizationFiltersMod.^
}
