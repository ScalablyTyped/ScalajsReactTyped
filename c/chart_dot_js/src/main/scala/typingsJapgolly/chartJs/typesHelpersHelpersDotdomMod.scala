package typingsJapgolly.chartJs

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.chartJs.anon.Canvas
import typingsJapgolly.chartJs.anon.Ctx
import typingsJapgolly.chartJs.anon.Height
import typingsJapgolly.chartJs.anon.X
import typingsJapgolly.chartJs.chartJsStrings.height
import typingsJapgolly.chartJs.chartJsStrings.width
import typingsJapgolly.chartJs.mod.ChartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotdomMod {
  
  @JSImport("chart.js/types/helpers/helpers.dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaximumSize(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getRelativePosition(evt: MouseEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(evt: ChartEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readUsedSize(element: HTMLElement, property: width | height): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def retinaScale(chart: Ctx, forceRatio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retinaScale(chart: Ctx, forceRatio: Double, forceStyle: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
