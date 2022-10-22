package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The chart print options storage.
  */
trait ASPxClientChartPrintOptions extends StObject {
  
  /**
    * Gets the custom paper height which will be used to print a chart.
    */
  def GetCustomPaperHeight(): Double
  
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): String
  
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): Double
  
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): Boolean
  
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): Double
  
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): Double
  
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): Double
  
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): Double
  
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): String
  
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): Boolean
  
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): String
  
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: Double): Unit
  
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: String): Unit
  
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: Double): Unit
  
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: Boolean): Unit
  
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: Double): Unit
  
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: Double): Unit
  
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: Double): Unit
  
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: Double): Unit
  
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: String): Unit
  
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: Boolean): Unit
  
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: String): Unit
}
object ASPxClientChartPrintOptions {
  
  inline def apply(
    GetCustomPaperHeight: CallbackTo[Double],
    GetCustomPaperName: CallbackTo[String],
    GetCustomPaperWidth: CallbackTo[Double],
    GetLandscape: CallbackTo[Boolean],
    GetMarginBottom: CallbackTo[Double],
    GetMarginLeft: CallbackTo[Double],
    GetMarginRight: CallbackTo[Double],
    GetMarginTop: CallbackTo[Double],
    GetPaperKind: CallbackTo[String],
    GetPrintCrosshair: CallbackTo[Boolean],
    GetSizeMode: CallbackTo[String],
    SetCustomPaperHeight: Double => Callback,
    SetCustomPaperName: String => Callback,
    SetCustomPaperWidth: Double => Callback,
    SetLandscape: Boolean => Callback,
    SetMarginBottom: Double => Callback,
    SetMarginLeft: Double => Callback,
    SetMarginRight: Double => Callback,
    SetMarginTop: Double => Callback,
    SetPaperKind: String => Callback,
    SetPrintCrosshair: Boolean => Callback,
    SetSizeMode: String => Callback
  ): ASPxClientChartPrintOptions = {
    val __obj = js.Dynamic.literal(GetCustomPaperHeight = GetCustomPaperHeight.toJsFn, GetCustomPaperName = GetCustomPaperName.toJsFn, GetCustomPaperWidth = GetCustomPaperWidth.toJsFn, GetLandscape = GetLandscape.toJsFn, GetMarginBottom = GetMarginBottom.toJsFn, GetMarginLeft = GetMarginLeft.toJsFn, GetMarginRight = GetMarginRight.toJsFn, GetMarginTop = GetMarginTop.toJsFn, GetPaperKind = GetPaperKind.toJsFn, GetPrintCrosshair = GetPrintCrosshair.toJsFn, GetSizeMode = GetSizeMode.toJsFn, SetCustomPaperHeight = js.Any.fromFunction1((t0: Double) => SetCustomPaperHeight(t0).runNow()), SetCustomPaperName = js.Any.fromFunction1((t0: String) => SetCustomPaperName(t0).runNow()), SetCustomPaperWidth = js.Any.fromFunction1((t0: Double) => SetCustomPaperWidth(t0).runNow()), SetLandscape = js.Any.fromFunction1((t0: Boolean) => SetLandscape(t0).runNow()), SetMarginBottom = js.Any.fromFunction1((t0: Double) => SetMarginBottom(t0).runNow()), SetMarginLeft = js.Any.fromFunction1((t0: Double) => SetMarginLeft(t0).runNow()), SetMarginRight = js.Any.fromFunction1((t0: Double) => SetMarginRight(t0).runNow()), SetMarginTop = js.Any.fromFunction1((t0: Double) => SetMarginTop(t0).runNow()), SetPaperKind = js.Any.fromFunction1((t0: String) => SetPaperKind(t0).runNow()), SetPrintCrosshair = js.Any.fromFunction1((t0: Boolean) => SetPrintCrosshair(t0).runNow()), SetSizeMode = js.Any.fromFunction1((t0: String) => SetSizeMode(t0).runNow()))
    __obj.asInstanceOf[ASPxClientChartPrintOptions]
  }
  
  extension [Self <: ASPxClientChartPrintOptions](x: Self) {
    
    inline def setGetCustomPaperHeight(value: CallbackTo[Double]): Self = StObject.set(x, "GetCustomPaperHeight", value.toJsFn)
    
    inline def setGetCustomPaperName(value: CallbackTo[String]): Self = StObject.set(x, "GetCustomPaperName", value.toJsFn)
    
    inline def setGetCustomPaperWidth(value: CallbackTo[Double]): Self = StObject.set(x, "GetCustomPaperWidth", value.toJsFn)
    
    inline def setGetLandscape(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetLandscape", value.toJsFn)
    
    inline def setGetMarginBottom(value: CallbackTo[Double]): Self = StObject.set(x, "GetMarginBottom", value.toJsFn)
    
    inline def setGetMarginLeft(value: CallbackTo[Double]): Self = StObject.set(x, "GetMarginLeft", value.toJsFn)
    
    inline def setGetMarginRight(value: CallbackTo[Double]): Self = StObject.set(x, "GetMarginRight", value.toJsFn)
    
    inline def setGetMarginTop(value: CallbackTo[Double]): Self = StObject.set(x, "GetMarginTop", value.toJsFn)
    
    inline def setGetPaperKind(value: CallbackTo[String]): Self = StObject.set(x, "GetPaperKind", value.toJsFn)
    
    inline def setGetPrintCrosshair(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetPrintCrosshair", value.toJsFn)
    
    inline def setGetSizeMode(value: CallbackTo[String]): Self = StObject.set(x, "GetSizeMode", value.toJsFn)
    
    inline def setSetCustomPaperHeight(value: Double => Callback): Self = StObject.set(x, "SetCustomPaperHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCustomPaperName(value: String => Callback): Self = StObject.set(x, "SetCustomPaperName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetCustomPaperWidth(value: Double => Callback): Self = StObject.set(x, "SetCustomPaperWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLandscape(value: Boolean => Callback): Self = StObject.set(x, "SetLandscape", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMarginBottom(value: Double => Callback): Self = StObject.set(x, "SetMarginBottom", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMarginLeft(value: Double => Callback): Self = StObject.set(x, "SetMarginLeft", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMarginRight(value: Double => Callback): Self = StObject.set(x, "SetMarginRight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMarginTop(value: Double => Callback): Self = StObject.set(x, "SetMarginTop", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPaperKind(value: String => Callback): Self = StObject.set(x, "SetPaperKind", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPrintCrosshair(value: Boolean => Callback): Self = StObject.set(x, "SetPrintCrosshair", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetSizeMode(value: String => Callback): Self = StObject.set(x, "SetSizeMode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
