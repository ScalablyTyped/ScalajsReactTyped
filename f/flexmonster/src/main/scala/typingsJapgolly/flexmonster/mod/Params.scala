package typingsJapgolly.flexmonster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  // events
  var afterchartdraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, Unit]] = js.undefined
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.undefined
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.undefined
  var chartclick: js.UndefOr[js.Function1[/* data */ ChartData, Unit]] = js.undefined
  var componentFolder: js.UndefOr[String] = js.undefined
  // other
  var container: js.UndefOr[String] = js.undefined
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, Unit]] = js.undefined
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.undefined
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  var datafilecancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dataloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var exportcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var exportstart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fieldslistclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fieldslistopen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filterclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filteropen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var global: js.UndefOr[Report] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var licenseKey: js.UndefOr[String] = js.undefined
  var loadingdata: js.UndefOr[js.Function0[Unit]] = js.undefined
  var loadinglocalization: js.UndefOr[js.Function0[Unit]] = js.undefined
  var loadingolapstructure: js.UndefOr[js.Function0[Unit]] = js.undefined
  var loadingreportfile: js.UndefOr[js.Function0[Unit]] = js.undefined
  var localizationerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  var localizationloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var olapstructureerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  var olapstructureloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openingreportfile: js.UndefOr[js.Function0[Unit]] = js.undefined
  var printcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var printstart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var querycomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var queryerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  var report: js.UndefOr[Report | String] = js.undefined
  var reportchange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reportcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reportfilecancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reportfileerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reportfileloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var runningquery: js.UndefOr[js.Function0[Unit]] = js.undefined
  // params
  var toolbar: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    afterchartdraw: js.UndefOr[Callback] = js.undefined,
    aftergriddraw: /* param */ js.Object => Callback = null,
    beforegriddraw: /* param */ js.Object => Callback = null,
    beforetoolbarcreated: /* toolbar */ Toolbar => Callback = null,
    cellclick: /* cell */ CellData => Callback = null,
    celldoubleclick: /* cell */ CellData => Callback = null,
    chartclick: /* data */ ChartData => Callback = null,
    componentFolder: String = null,
    container: String = null,
    customizeCell: (/* cell */ CellBuilder, /* data */ CellData) => Callback = null,
    customizeContextMenu: (/* items */ js.Array[ContextMenuItem], /* data */ CellData | ChartData, /* viewType */ String) => CallbackTo[js.Array[ContextMenuItem]] = null,
    datachanged: /* param */ js.Object => Callback = null,
    dataerror: /* param */ js.Object => Callback = null,
    datafilecancelled: js.UndefOr[Callback] = js.undefined,
    dataloaded: js.UndefOr[Callback] = js.undefined,
    exportcomplete: js.UndefOr[Callback] = js.undefined,
    exportstart: js.UndefOr[Callback] = js.undefined,
    fieldslistclose: js.UndefOr[Callback] = js.undefined,
    fieldslistopen: js.UndefOr[Callback] = js.undefined,
    filterclose: js.UndefOr[Callback] = js.undefined,
    filteropen: js.UndefOr[Callback] = js.undefined,
    global: Report = null,
    height: String | Double = null,
    licenseKey: String = null,
    loadingdata: js.UndefOr[Callback] = js.undefined,
    loadinglocalization: js.UndefOr[Callback] = js.undefined,
    loadingolapstructure: js.UndefOr[Callback] = js.undefined,
    loadingreportfile: js.UndefOr[Callback] = js.undefined,
    localizationerror: js.UndefOr[Callback] = js.undefined,
    localizationloaded: js.UndefOr[Callback] = js.undefined,
    olapstructureerror: js.UndefOr[Callback] = js.undefined,
    olapstructureloaded: js.UndefOr[Callback] = js.undefined,
    openingreportfile: js.UndefOr[Callback] = js.undefined,
    printcomplete: js.UndefOr[Callback] = js.undefined,
    printstart: js.UndefOr[Callback] = js.undefined,
    querycomplete: js.UndefOr[Callback] = js.undefined,
    queryerror: js.UndefOr[Callback] = js.undefined,
    ready: js.UndefOr[Callback] = js.undefined,
    report: Report | String = null,
    reportchange: js.UndefOr[Callback] = js.undefined,
    reportcomplete: js.UndefOr[Callback] = js.undefined,
    reportfilecancelled: js.UndefOr[Callback] = js.undefined,
    reportfileerror: js.UndefOr[Callback] = js.undefined,
    reportfileloaded: js.UndefOr[Callback] = js.undefined,
    runningquery: js.UndefOr[Callback] = js.undefined,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    update: js.UndefOr[Callback] = js.undefined,
    width: String | Double = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    afterchartdraw.foreach(p => __obj.updateDynamic("afterchartdraw")(p.toJsFn))
    if (aftergriddraw != null) __obj.updateDynamic("aftergriddraw")(js.Any.fromFunction1((t0: /* param */ js.Object) => aftergriddraw(t0).runNow()))
    if (beforegriddraw != null) __obj.updateDynamic("beforegriddraw")(js.Any.fromFunction1((t0: /* param */ js.Object) => beforegriddraw(t0).runNow()))
    if (beforetoolbarcreated != null) __obj.updateDynamic("beforetoolbarcreated")(js.Any.fromFunction1((t0: /* toolbar */ typingsJapgolly.flexmonster.mod.Toolbar) => beforetoolbarcreated(t0).runNow()))
    if (cellclick != null) __obj.updateDynamic("cellclick")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.flexmonster.mod.CellData) => cellclick(t0).runNow()))
    if (celldoubleclick != null) __obj.updateDynamic("celldoubleclick")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.flexmonster.mod.CellData) => celldoubleclick(t0).runNow()))
    if (chartclick != null) __obj.updateDynamic("chartclick")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.flexmonster.mod.ChartData) => chartclick(t0).runNow()))
    if (componentFolder != null) __obj.updateDynamic("componentFolder")(componentFolder.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (customizeCell != null) __obj.updateDynamic("customizeCell")(js.Any.fromFunction2((t0: /* cell */ typingsJapgolly.flexmonster.mod.CellBuilder, t1: /* data */ typingsJapgolly.flexmonster.mod.CellData) => customizeCell(t0, t1).runNow()))
    if (customizeContextMenu != null) __obj.updateDynamic("customizeContextMenu")(js.Any.fromFunction3((t0: /* items */ js.Array[typingsJapgolly.flexmonster.mod.ContextMenuItem], t1: /* data */ typingsJapgolly.flexmonster.mod.CellData | typingsJapgolly.flexmonster.mod.ChartData, t2: /* viewType */ java.lang.String) => customizeContextMenu(t0, t1, t2).runNow()))
    if (datachanged != null) __obj.updateDynamic("datachanged")(js.Any.fromFunction1((t0: /* param */ js.Object) => datachanged(t0).runNow()))
    if (dataerror != null) __obj.updateDynamic("dataerror")(js.Any.fromFunction1((t0: /* param */ js.Object) => dataerror(t0).runNow()))
    datafilecancelled.foreach(p => __obj.updateDynamic("datafilecancelled")(p.toJsFn))
    dataloaded.foreach(p => __obj.updateDynamic("dataloaded")(p.toJsFn))
    exportcomplete.foreach(p => __obj.updateDynamic("exportcomplete")(p.toJsFn))
    exportstart.foreach(p => __obj.updateDynamic("exportstart")(p.toJsFn))
    fieldslistclose.foreach(p => __obj.updateDynamic("fieldslistclose")(p.toJsFn))
    fieldslistopen.foreach(p => __obj.updateDynamic("fieldslistopen")(p.toJsFn))
    filterclose.foreach(p => __obj.updateDynamic("filterclose")(p.toJsFn))
    filteropen.foreach(p => __obj.updateDynamic("filteropen")(p.toJsFn))
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
    loadingdata.foreach(p => __obj.updateDynamic("loadingdata")(p.toJsFn))
    loadinglocalization.foreach(p => __obj.updateDynamic("loadinglocalization")(p.toJsFn))
    loadingolapstructure.foreach(p => __obj.updateDynamic("loadingolapstructure")(p.toJsFn))
    loadingreportfile.foreach(p => __obj.updateDynamic("loadingreportfile")(p.toJsFn))
    localizationerror.foreach(p => __obj.updateDynamic("localizationerror")(p.toJsFn))
    localizationloaded.foreach(p => __obj.updateDynamic("localizationloaded")(p.toJsFn))
    olapstructureerror.foreach(p => __obj.updateDynamic("olapstructureerror")(p.toJsFn))
    olapstructureloaded.foreach(p => __obj.updateDynamic("olapstructureloaded")(p.toJsFn))
    openingreportfile.foreach(p => __obj.updateDynamic("openingreportfile")(p.toJsFn))
    printcomplete.foreach(p => __obj.updateDynamic("printcomplete")(p.toJsFn))
    printstart.foreach(p => __obj.updateDynamic("printstart")(p.toJsFn))
    querycomplete.foreach(p => __obj.updateDynamic("querycomplete")(p.toJsFn))
    queryerror.foreach(p => __obj.updateDynamic("queryerror")(p.toJsFn))
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    reportchange.foreach(p => __obj.updateDynamic("reportchange")(p.toJsFn))
    reportcomplete.foreach(p => __obj.updateDynamic("reportcomplete")(p.toJsFn))
    reportfilecancelled.foreach(p => __obj.updateDynamic("reportfilecancelled")(p.toJsFn))
    reportfileerror.foreach(p => __obj.updateDynamic("reportfileerror")(p.toJsFn))
    reportfileloaded.foreach(p => __obj.updateDynamic("reportfileloaded")(p.toJsFn))
    runningquery.foreach(p => __obj.updateDynamic("runningquery")(p.toJsFn))
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    update.foreach(p => __obj.updateDynamic("update")(p.toJsFn))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

