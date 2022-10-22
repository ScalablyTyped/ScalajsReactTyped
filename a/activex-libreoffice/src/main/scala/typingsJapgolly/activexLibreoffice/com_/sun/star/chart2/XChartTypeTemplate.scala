package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartTypeTemplate
  extends StObject
     with XInterface {
  
  val DataInterpreter: XDataInterpreter
  
  /**
    * Applies a chart-type specific style (e.g. symbols) to all series in the sequence aSeries.
    * @param xSeries a single data series to which a style will be applied
    * @param nChartTypeGroupIndex Denotes in which chart-type group the series lies, such this method can apply different styles for different chart-type groups
    * @param nSeriesIndex The index of the series inside the current chart-type group. nSeriesIndex does not uniquely identify a data series alone, but only t
    * @param nSeriesCount The number of series in the current chart-type group.
    */
  def applyStyle(xSeries: XDataSeries, nChartTypeGroupIndex: Double, nSeriesIndex: Double, nSeriesCount: Double): Unit
  
  /**
    * Analyses the given diagram and reinterprets its {@link DataSeries} and Categories and creates a new diagram based on these series.
    *
    * Note, that if {@link matchesTemplate()} returns `TRUE` for the given {@link XDiagram} , the latter should not be changed.
    * @param xDiagram The diagram given will be modified such that it represents this {@link ChartTypeTemplate} .
    */
  def changeDiagram(xDiagram: XDiagram): Unit
  
  /**
    * Changes the given diagram `xDiagram` by using the new data given in `xDataSource` .
    *
    * Note that the data is interpreted in a way that fits this template, but not necessarily the chart-types of the diagram. This method should only be
    * called if the data-format of the diagram is compatible with the data-format of this template.
    *
    * Ideally a {@link matchesTemplate()} call for the given diagram should return `TRUE` before this method is called.
    * @param xDiagram The diagram to be changed.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    */
  def changeDiagramData(xDiagram: XDiagram, xDataSource: XDataSource, aArguments: SeqEquiv[PropertyValue]): Unit
  
  /**
    * Creates a new diagram based upon the given data .
    * @param xDataSource This data source will be interpreted in a chart-type specific way and appropriate {@link DataSeries} will be created which serve as i
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    * @returns The new diagram which represents this {@link ChartTypeTemplate} .
    */
  def createDiagramByDataSource(xDataSource: XDataSource, aArguments: SeqEquiv[PropertyValue]): XDiagram
  
  /**
    * Provides a chart type object that can be used to create new series.
    * @param aFormerlyUsedChartTypes The list can be used to copy some aspects from old chart types during the creation of a new chart type. The list might be
    */
  def getChartTypeForNewSeries(aFormerlyUsedChartTypes: SeqEquiv[XChartType]): XChartType
  
  def getDataInterpreter(): XDataInterpreter
  
  /**
    * States whether the given diagram could have been created by the template.
    *
    * The template will parse the DataSeriesTree of the diagram to determine if the structure matches the one which would have been created by {@link
    * createDiagramByDataSource()} .
    *
    * For analysis all parts of the diagram may be used, e.g. also properties set at the data series (like symbols)./p>
    * @param xDiagram The diagram to be analyzed.
    * @param bAdaptProperties If `TRUE` the properties of the template are set, such that the template matches more accurately. E.g. for a line-chart with sym
    * @returns `TRUE` if the diagram given is structurally identical to a diagram that was created using {@link createDiagramByDataSource()} or {@link changeDia
    */
  def matchesTemplate(xDiagram: XDiagram, bAdaptProperties: Boolean): Boolean
  
  /**
    * Resets all styles that were changed from the default at any object in the chart and have not been later modified.
    *
    * In {@link createDiagramByDataSource()} or {@link changeDiagram()} a template might e.g. change the page background color or the line style of all data
    * series. This method should reset all objects that still have the changed settings to the default.
    *
    * If for example the template changed the {@link com.sun.star.drawing.LineStyle} of all series to NONE, this method should reset all series with
    * LineStyle NONE back to SOLID. If a series has a style DASH, it must not be changed.
    */
  def resetStyles(xDiagram: XDiagram): Unit
  
  /** @returns `TRUE` if the template does support categories */
  def supportsCategories(): Boolean
}
object XChartTypeTemplate {
  
  inline def apply(
    DataInterpreter: XDataInterpreter,
    acquire: Callback,
    applyStyle: (XDataSeries, Double, Double, Double) => Callback,
    changeDiagram: XDiagram => Callback,
    changeDiagramData: (XDiagram, XDataSource, SeqEquiv[PropertyValue]) => Callback,
    createDiagramByDataSource: (XDataSource, SeqEquiv[PropertyValue]) => XDiagram,
    getChartTypeForNewSeries: SeqEquiv[XChartType] => XChartType,
    getDataInterpreter: CallbackTo[XDataInterpreter],
    matchesTemplate: (XDiagram, Boolean) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    resetStyles: XDiagram => Callback,
    supportsCategories: CallbackTo[Boolean]
  ): XChartTypeTemplate = {
    val __obj = js.Dynamic.literal(DataInterpreter = DataInterpreter.asInstanceOf[js.Any], acquire = acquire.toJsFn, applyStyle = js.Any.fromFunction4((t0: XDataSeries, t1: Double, t2: Double, t3: Double) => (applyStyle(t0, t1, t2, t3)).runNow()), changeDiagram = js.Any.fromFunction1((t0: XDiagram) => changeDiagram(t0).runNow()), changeDiagramData = js.Any.fromFunction3((t0: XDiagram, t1: XDataSource, t2: SeqEquiv[PropertyValue]) => (changeDiagramData(t0, t1, t2)).runNow()), createDiagramByDataSource = js.Any.fromFunction2(createDiagramByDataSource), getChartTypeForNewSeries = js.Any.fromFunction1(getChartTypeForNewSeries), getDataInterpreter = getDataInterpreter.toJsFn, matchesTemplate = js.Any.fromFunction2(matchesTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetStyles = js.Any.fromFunction1((t0: XDiagram) => resetStyles(t0).runNow()), supportsCategories = supportsCategories.toJsFn)
    __obj.asInstanceOf[XChartTypeTemplate]
  }
  
  extension [Self <: XChartTypeTemplate](x: Self) {
    
    inline def setApplyStyle(value: (XDataSeries, Double, Double, Double) => Callback): Self = StObject.set(x, "applyStyle", js.Any.fromFunction4((t0: XDataSeries, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setChangeDiagram(value: XDiagram => Callback): Self = StObject.set(x, "changeDiagram", js.Any.fromFunction1((t0: XDiagram) => value(t0).runNow()))
    
    inline def setChangeDiagramData(value: (XDiagram, XDataSource, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "changeDiagramData", js.Any.fromFunction3((t0: XDiagram, t1: XDataSource, t2: SeqEquiv[PropertyValue]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCreateDiagramByDataSource(value: (XDataSource, SeqEquiv[PropertyValue]) => XDiagram): Self = StObject.set(x, "createDiagramByDataSource", js.Any.fromFunction2(value))
    
    inline def setDataInterpreter(value: XDataInterpreter): Self = StObject.set(x, "DataInterpreter", value.asInstanceOf[js.Any])
    
    inline def setGetChartTypeForNewSeries(value: SeqEquiv[XChartType] => XChartType): Self = StObject.set(x, "getChartTypeForNewSeries", js.Any.fromFunction1(value))
    
    inline def setGetDataInterpreter(value: CallbackTo[XDataInterpreter]): Self = StObject.set(x, "getDataInterpreter", value.toJsFn)
    
    inline def setMatchesTemplate(value: (XDiagram, Boolean) => Boolean): Self = StObject.set(x, "matchesTemplate", js.Any.fromFunction2(value))
    
    inline def setResetStyles(value: XDiagram => Callback): Self = StObject.set(x, "resetStyles", js.Any.fromFunction1((t0: XDiagram) => value(t0).runNow()))
    
    inline def setSupportsCategories(value: CallbackTo[Boolean]): Self = StObject.set(x, "supportsCategories", value.toJsFn)
  }
}
